package TRADES.design.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.NotSerializableException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.common.io.Files;

import TRADES.design.PluginProperties;
import dsm.TRADES.Analysis;
import dsm.TRADES.Component;
import dsm.TRADES.ComponentType;
import dsm.TRADES.Control;
import dsm.TRADES.NamedElement;
import dsm.TRADES.Rule;
import dsm.TRADES.Vulnerability;
import dsm.TRADES.VulnerabilityTypeENUM;
import dsm.cwe.model.CWECatalog.Weakness;
import dsm.cwe.model.CWECatalog.WeaknessCatalog;
import dsm.trades.rcp.utils.CatalogUtils;

/**
 * Exports TRADES models to a Prolog file
 * 
 * Some items are put into the file in difference sections, e.g. from the TRADES model and the catalogues, so we call discontiguous for them.
 * But discontiguous also covers off the case where there are no items of a given type, meaning that the content in the prefix does not fail since the predicate is still defined.
 * */
public class PrologExportService {

	private String prefix;

	public PrologExportService(PluginProperties projectProperties) {
		if (projectProperties.getIsPrologPrefixEmbedded()) {
			BundleFileService fileService = new BundleFileService();
			String defaultPrefix = fileService.getResourceFileText("src/Resources/PrologExportPrefix.pl");
			setPrefixContent(defaultPrefix);
		} 
		else {
			File file = new File(projectProperties.prologExportPrefixFile);
			try (BufferedReader reader = Files.newReader(file, Charset.defaultCharset())) {
				String prefix = reader.lines().collect(Collectors.joining(System.lineSeparator()));
				setPrefixContent(prefix);
			} catch (Exception e) {
				setPrefixContent("Error reading prefix file '" + file.toString() + "' set in project preferences. " + System.lineSeparator());
			}
		}
	}

	public PrologExportService(String prefix) {
		setPrefixContent(prefix);
	}

	public void Export(IProject project, File file) throws NotSerializableException, IOException {
		StringBuilder builder = new StringBuilder();

		builder.append(prefix);
		builder.append(System.lineSeparator()); // Don't allow any trailing whitespace in the final line to make the below look odd

		builder.append("%%%SPECIFIC SYSTEM MODEL%%%");
		builder.append(System.lineSeparator());

		try {
			String projectContent = SerialiseProject(project);
			builder.append(projectContent);
		} catch (CoreException ex) {
			throw new NotSerializableException("Error generating Prolog for project: " + project.getName());
		}

		try {
			String prolog = builder.toString();
			Files.write(prolog.getBytes(), file);
		} catch (IOException e) {
			throw new IOException("Error exporting Prolog to file: " + file.toString());
		}
	}

	public void setPrefixContent(String prefix) {
		this.prefix = prefix;
	}

	private String SerialiseProject(IProject project) throws CoreException {
		ArrayList<String> textLines = new ArrayList<String>();
		textLines.add("");

		ResourceSet resourceSet = new ResourceSetImpl();

		for (IResource resource : project.members()) {
			String resourceFileExtension = resource.getFileExtension();
			if (!"trades".equalsIgnoreCase(resourceFileExtension)) {
				continue;
			}

			IPath path = resource.getFullPath();

			textLines.add("% TRADES file: " + path);
			textLines.add("");

			Resource tradesResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
			Analysis analysis = (Analysis) ((Resource) tradesResource).getContents().get(0);

			addComponents(textLines, analysis);
			List<VulnerabilityWrapper> wrappedVulnerabilities = VulnerabilityWrapper.CreateFromEListOfVulnerabilities(analysis.getVulnerabilityOwner().getVulnerabilities());
			addVulnerabilities(textLines, wrappedVulnerabilities);
			addSecurityControls(textLines, analysis);
			addSecurityRules(textLines, analysis);
			addComponentTypeVulnerabilities(textLines, analysis);
			addComponentSecurityControls(textLines, analysis);
			addVulnerabilityHierachy(textLines, wrappedVulnerabilities);
		}

		IFolder catalogFolder = project.getFolder(CatalogUtils.CATALOGS_FOLDER);
		if (catalogFolder.exists()) {
			for (IResource resource : catalogFolder.members()) {

				if ("cwe".equalsIgnoreCase(resource.getFileExtension())) {

					IPath path = resource.getFullPath();

					textLines.add("% CWE file: " + path);
					textLines.add("");

					Resource cweResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
					WeaknessCatalog catalog = (WeaknessCatalog) ((Resource) cweResource).getContents().get(0);

					List<VulnerabilityWrapper> wrappedWeaknesses = VulnerabilityWrapper.CreateFromEListOfWeaknesses(catalog.getWeaknesses().getWeaknesses());
					addVulnerabilities(textLines, wrappedWeaknesses);
					addVulnerabilityHierachy(textLines, wrappedWeaknesses);
					continue;
				}

				if (new File(resource.getFullPath().toOSString()).getName().contains("CVE")) {
					IPath path = resource.getFullPath();

					textLines.add("% CVE file: " + path);
					textLines.add("");

					Resource cweResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
					EList<EObject> contentsAsEObjects = ((Resource) cweResource).getContents();
					List<VulnerabilityWrapper> wrappedVulnerabilities = VulnerabilityWrapper.CreateFromEListOfEObjects(contentsAsEObjects);
					addVulnerabilities(textLines, wrappedVulnerabilities);
					addVulnerabilityHierachy(textLines, wrappedVulnerabilities);

					continue;
				}
			}
		}

		return String.join(System.lineSeparator(), textLines);
	}

	private void addComponents(ArrayList<String> textLines, Analysis analysis) {
		textLines.add("% Define components (C)");
		textLines.add(":- discontiguous(component/1).");

		ArrayList<String> componentTypeTextLines = new ArrayList<String>();
		AddSubComponents(textLines, componentTypeTextLines, analysis.getComponents());

		textLines.add("");
		textLines.add("% Define component types (T) - Map components to multiple types");
		textLines.add(":- discontiguous(component_type/2).");
		textLines.addAll(componentTypeTextLines);
		textLines.add("");
	}

	private void AddSubComponents(ArrayList<String> textLines, ArrayList<String> componentTypeTextLines,
			EList<Component> components) {
		for (Component component : components) {
			textLines.add("component('" + escapeStringForSingleQuotes(component.getName()) + "').");

			if (!component.getComponentTypes().isEmpty()) {
				// Note that skipping this entry for components with no types means that
				// querying their type yields false rather than an empty list
				String componentTypeNamesAsArray = getNamesAsPrologStringArray(component.getComponentTypes());
				componentTypeTextLines.add("component_type('" + escapeStringForSingleQuotes(component.getName()) + "', " + componentTypeNamesAsArray + ").");
			}

			AddSubComponents(textLines, componentTypeTextLines, component.getComponents());
		}
	}

	private void addVulnerabilities(ArrayList<String> textLines, List<VulnerabilityWrapper> vulnerabilities) {
		textLines.add("% Define vulnerabilities (V)");
		textLines.add(":- discontiguous(vulnerability/3).");

		for (VulnerabilityWrapper wrapper : vulnerabilities) {
			VulnerabilityTypeENUM vulnerabilityType = wrapper.getSource().getVulnerabilityType();
			textLines.add("vulnerability('" + escapeStringForSingleQuotes(wrapper.idLikeName) + "', '"
					+ escapeStringForSingleQuotes(vulnerabilityType.getName()) + "', '"
					+ escapeStringForSingleQuotes(wrapper.getDescriptiveName()) + "').");
		}

		textLines.add("");
	}

	private void addSecurityControls(ArrayList<String> textLines, Analysis analysis) {
		textLines.add("% Define security controls (S)");
		textLines.add(":- discontiguous(control/1).");
		
		for (Control control : analysis.getAllControls()) {
			textLines.add("control('" + escapeStringForSingleQuotes(control.getName()) + "').");
		}

		textLines.add("");
	}

	private void addSecurityRules(ArrayList<String> textLines, Analysis analysis) {
		textLines.add("% Define security rules (R)");
		textLines.add(":- discontiguous(rule/4).");

		for (Rule rule : analysis.getRuleOwner().getRules()) {
			String vulnerabilitiesNamesAsArray = getNamesAsPrologStringArray(VulnerabilityWrapper.CreateFromEListOfVulnerabilities(rule.getVulnerabilities()));
			String componentTypeNamesAsArray = getNamesAsPrologStringArray(rule.getComponentTypesAffected());
			String controlNamesAsArray = getNamesAsPrologStringArray(rule.getControls());
			textLines.add("rule('" + escapeStringForSingleQuotes(rule.getName()) + "', " + vulnerabilitiesNamesAsArray + ", " + componentTypeNamesAsArray + ", " + controlNamesAsArray + ").");
		}

		textLines.add("");
	}

	private void addComponentTypeVulnerabilities(ArrayList<String> textLines, Analysis analysis) {
		textLines.add("% VULNS: Component type to vulnerabilities");
		textLines.add(":- discontiguous(vulns/4).");

		for (ComponentType componentType : analysis.getComponentTypeOwner().getComponentTypes()) {
			List<VulnerabilityWrapper> vulnerabilities = VulnerabilityWrapper.CreateFromEListOfVulnerabilities(componentType.getAffectedBy());
			String affectByNamesAsArray = getNamesAsPrologStringArray(vulnerabilities);
			textLines.add("vulns('" + escapeStringForSingleQuotes(componentType.getName()) + "', " + affectByNamesAsArray + ").");
		}

		textLines.add("");
	}

	private void addComponentSecurityControls(ArrayList<String> textLines, Analysis analysis) {
		textLines.add("% CONTROLS: Component to controls");
		textLines.add(":- discontiguous(controls/2).");

		AddSubComponentsSecurityControls(textLines, analysis.getComponents());

		textLines.add("");
	}

	private void AddSubComponentsSecurityControls(ArrayList<String> textLines, EList<Component> components) {
		for (Component component : components) {
			EList<Control> controls = component.getAssociatedControls();
			if (!controls.isEmpty()) {
				// Note that skipping this entry for components with no controls means that
				// querying their controls yields false rather than an empty list
				String mitigatedByAsArray = getNamesAsPrologStringArray(controls);
				textLines.add("controls('" + escapeStringForSingleQuotes(component.getName()) + "', " + mitigatedByAsArray + ").");
			}

			AddSubComponentsSecurityControls(textLines, component.getComponents());
		}
	}

	private void addVulnerabilityHierachy(ArrayList<String> textLines, List<VulnerabilityWrapper> vulnerabilities) {
		textLines.add("% AVULNS: Vulnerability to higher-level vulnerabilities");
		textLines.add(":- discontiguous(avulns/2).");
		
		for (VulnerabilityWrapper wrapper : vulnerabilities) {
			String manifestsNamesAsArray =getNamesAsPrologStringArray(VulnerabilityWrapper.CreateFromEListOfVulnerabilities(wrapper.getSource().getManifests()));
			textLines.add("avulns('" + escapeStringForSingleQuotes(wrapper.getIdLikeName()) + "', "	+ manifestsNamesAsArray + ").");
		}

		textLines.add("");
	}

	private static String escapeStringForSingleQuotes(String text) {
		return text.replace("\\", "\\\\") // First escape items that look like escapes
				.replace("'", "\\'"); // Then escape single quotes
	}

	private static <T extends NamedElement> String getNamesAsPrologStringArray(EList<T> eList) {
		if(eList.stream().anyMatch(o -> o instanceof Vulnerability))
			throw new IllegalArgumentException("getNamesAsPrologStringArray cannot be called for Vulernabilities due to differences between base and child class behaviours, use VulnerabilityWrapper instead.");
		
		return formatAsPrologArray(eList.stream().map(o -> o.getName()).collect(Collectors.toList()));
	};
	
	private static <T extends NamedElement> String getNamesAsPrologStringArray(List<VulnerabilityWrapper> eList) {
		return formatAsPrologArray(eList.stream().map(o -> o.getIdLikeName()).collect(Collectors.toList()));
	};
	
	private static <T extends NamedElement> String formatAsPrologArray(List<String> items) {
		ArrayList<String> escapedQuottedItems = new ArrayList<String>();
		for (String item : items) {
			escapedQuottedItems.add("'" + escapeStringForSingleQuotes(item) + "'");
		}

		return "[" + String.join(", ", escapedQuottedItems) + "]";
	}
	
	/**
	 * Vulnerabilities currently have a getName property containing e.g. CVE-2018-1000500 and 
	 * Weaknesses (which are effectively a sub-type) have a getID property containing e.g. "1004" from CWE-1004 
	 * and a getName property containing e.g. Sensitive Cookie Without 'HttpOnly' Flag.
	 * This class smoothes out these differences.
	 * */
	public static class VulnerabilityWrapper {
		
		private String descriptiveName;
		
		private String idLikeName;
		
		private Vulnerability source;
		
		public VulnerabilityWrapper(Vulnerability vulnerability) {
			source = vulnerability;
			
			//Don't use overloading of this method to get different code since method overloading for parameters that are sub-types is not guaranteed 
			if(vulnerability instanceof Weakness weakness) {
				idLikeName = "CWE-" + weakness.getID();
				descriptiveName = weakness.getName();
			} else {
				idLikeName = vulnerability.getName();
				descriptiveName = "";
			}
		}
		
		public String getDescriptiveName() {
			return descriptiveName;
		}
		
		public String getIdLikeName() {
			return idLikeName;
		}
		
		public Vulnerability getSource() {
			return source;
		}
		
		public static List<VulnerabilityWrapper> CreateFromEListOfEObjects(EList<EObject> eObjects)
		{
			return eObjects.stream()
					.filter(o -> o instanceof Vulnerability)
					.map(o -> new VulnerabilityWrapper((Vulnerability)o))
					.collect(Collectors.toList());
		}
		
		public static List<VulnerabilityWrapper> CreateFromEListOfVulnerabilities(EList<Vulnerability> vulnerabilities)
		{
			return vulnerabilities.stream().map(v -> new VulnerabilityWrapper(v)).collect(Collectors.toList());
		}
		
		public static List<VulnerabilityWrapper> CreateFromEListOfWeaknesses(EList<Weakness> weaknesses)
		{
			return weaknesses.stream().map(w -> new VulnerabilityWrapper(w)).collect(Collectors.toList());
		}
	}
}
