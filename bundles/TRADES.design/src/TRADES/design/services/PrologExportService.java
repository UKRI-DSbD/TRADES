package TRADES.design.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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
import dsm.cwe.model.CWECatalog.WeaknessCatalog;
import dsm.trades.rcp.utils.CatalogUtils;

/**
 * Exports TRADES models to a Prolog file
 * */
public class PrologExportService {

	private String prefix;
	
	public PrologExportService(PluginProperties projectProperties) {
		if(projectProperties.getIsPrologPrefixEmbedded()) {
			BundleFileService fileService = new BundleFileService();
			String defaultPrefix = fileService.getResourceFileText("src/Resources/PrologExportPrefix.pl");
			setPrefixContent(defaultPrefix);
		}
		else {
			File file = new File(projectProperties.prologExportPrefixFile);
			try(BufferedReader reader = Files.newReader(file, Charset.defaultCharset())) {
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
		builder.append(System.lineSeparator()); //Don't allow any trailing whitespace in the final line to make the below look odd
		
		builder.append("%%%SPECIFIC SYSTEM MODEL%%%");
		builder.append(System.lineSeparator());
		
		try {
			String projectContent = SerialiseProject(project);
			builder.append(projectContent);
		} catch(CoreException ex) {
			throw new NotSerializableException("Error generating Prolog for project: " + project.getName());
		}
		
		try {
			String prolog = builder.toString();
			Files.write(prolog.getBytes(), file);
		} catch (IOException e) {
			throw new IOException("Error exporting Prolog to file: " + file.toString());
		}
	}
	
	public void setPrefixContent(String prefix)
	{
		this.prefix = prefix;
	}
	
	private String SerialiseProject(IProject project) throws CoreException {
		ArrayList<String> textLines = new ArrayList<String>();
		textLines.add("");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		for(IResource resource : project.members()) {
			String resourceFileExtension = resource.getFileExtension();
			if(!"trades".equalsIgnoreCase(resourceFileExtension)) {
				continue;
			}
			
			IPath path = resource.getFullPath();
			
			textLines.add("% TRADES file: " + path);
			textLines.add("");
			
			Resource tradesResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
			Analysis analysis = (Analysis)((Resource)tradesResource).getContents().get(0);
			
			AddComponents(textLines, analysis);
			AddVulnerabilities(textLines, analysis.getVulnerabilityOwner().getVulnerabilities(), (v) -> v.getName(), null);
			AddSecurityControls(textLines, analysis);
			AddSecurityRules(textLines, analysis);
			AddComponentTypeVulnerabilities(textLines, analysis);
			AddComponentSecurityControls(textLines,analysis);
			addVulnerabilityHierachy(textLines, analysis);
		}
		
		IFolder catalogFolder = project.getFolder(CatalogUtils.CATALOGS_FOLDER);
		if (catalogFolder.exists()) {
			for(IResource resource : catalogFolder.members()) {
				
				if("cwe".equalsIgnoreCase(resource.getFileExtension())) {
				
					IPath path = resource.getFullPath();
						
					textLines.add("% CWE file: " + path);
					textLines.add("");
				
					Resource cweResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
					WeaknessCatalog catalog = (WeaknessCatalog)((Resource)cweResource).getContents().get(0);
				
					AddVulnerabilities(textLines, catalog.getWeaknesses().getWeaknesses(), v -> "CWE-"+v.getID(), v -> v.getName());
					continue;
				}
				
				if(new File(resource.getFullPath().toOSString()).getName().contains("CVE")) {
					IPath path = resource.getFullPath();
					
					textLines.add("% CVE file: " + path);
					textLines.add("");
					
					Resource cweResource = resourceSet.getResource(URI.createPlatformResourceURI(path.toString()), true);
					EList<EObject> contentsAsEObjects = ((Resource)cweResource).getContents();
					List<Vulnerability> vulnerabilities = contentsAsEObjects.stream().filter(o -> o instanceof Vulnerability).map(o -> (Vulnerability)o).collect(Collectors.toList());
					
					AddVulnerabilities(textLines, vulnerabilities, v -> v.getName(), null);
					
					continue;
				}
			}
		}
		
		return String.join(System.lineSeparator(), textLines);
	}
	
	private void AddComponents(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% Define components (C)");
		
		ArrayList<String> componentTypeTextLines = new ArrayList<String>();
		AddSubComponents(textLines, componentTypeTextLines, analysis.getComponents());
		
		textLines.add("");
		textLines.add("% Define component types (T) - Map components to multiple types");
		textLines.addAll(componentTypeTextLines);
		textLines.add("");
	}
	
	private void AddSubComponents(ArrayList<String> textLines, ArrayList<String> componentTypeTextLines, EList<Component> components)
	{
		for(Component component : components) {
			textLines.add("component('" + escapeStringForSingleQuotes(component.getName()) + "').");
			
			if(!component.getComponentTypes().isEmpty()) {
				//Note that skipping this entry for components with no types means that querying their type yields false rather than an empty list
				String componentTypeNamesAsArray = getNamesAsPrologStringArray(component.getComponentTypes());
				componentTypeTextLines.add("component_type('" + escapeStringForSingleQuotes(component.getName()) + "', " + componentTypeNamesAsArray + ").");
			}
			
			AddSubComponents(textLines, componentTypeTextLines, component.getComponents());
		}
	}
	
	private <TVulnerability extends Vulnerability> void AddVulnerabilities(
			ArrayList<String> textLines, 
			List<TVulnerability> vulnerabilities, 
			Function<TVulnerability, String> idFunc,
			Function<TVulnerability, String> nameFunc)
	{
		textLines.add("% Define vulnerabilities (V)");
		textLines.add(":- discontiguous(vulnerability/2).");
		
		for(TVulnerability vulnerability : vulnerabilities) {
			VulnerabilityTypeENUM vulnerabilityType = vulnerability.getVulnerabilityType();
			String nameAdditionalString = nameFunc == null ? "" : ", '" + escapeStringForSingleQuotes(nameFunc.apply(vulnerability)) + "'";
			textLines.add("vulnerability('" + escapeStringForSingleQuotes(idFunc.apply(vulnerability)) + "', '" + escapeStringForSingleQuotes(vulnerabilityType.getName()) + "'" + nameAdditionalString + ").");
		}
		
		textLines.add("");
	}
	
	private void AddSecurityControls(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% Define security controls (S)");
		
		for(Control control : analysis.getAllControls()) {
			textLines.add("control('" + escapeStringForSingleQuotes(control.getName()) + "').");
		}
		
		textLines.add("");
	}
	
	private void AddSecurityRules(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% Define security rules (R)");
		
		for(Rule rule : analysis.getRuleOwner().getRules()) {
			String vulnerabilitiesNamesAsArray = getNamesAsPrologStringArray(rule.getVulnerabilities());
			String componentTypeNamesAsArray = getNamesAsPrologStringArray(rule.getComponentTypesAffected());
			String controlNamesAsArray = getNamesAsPrologStringArray(rule.getControls());
			textLines.add("rule('" + escapeStringForSingleQuotes(rule.getName()) + "', " + vulnerabilitiesNamesAsArray + ", " + componentTypeNamesAsArray + ", " + controlNamesAsArray + ").");
		}
		
		textLines.add("");
	}
	
	private void AddComponentTypeVulnerabilities(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% VULNS: Component type to vulnerabilities");
				
		for(ComponentType componentType : analysis.getComponentTypeOwner().getComponentTypes()) {
			EList<Vulnerability> eList = componentType.getAffectedBy();
			for(Vulnerability vulnerability : (Vulnerability[])eList.toArray() /*Make a copy of the list since it will be appended to in the loop*/) {
				followManifestsAndAddToList(eList, vulnerability);
			}
			String affectByNamesAsArray = getNamesAsPrologStringArray(componentType.getAffectedBy());
			textLines.add("vulns('" + escapeStringForSingleQuotes(componentType.getName()) + "', " + affectByNamesAsArray + ").");
		}
		
		textLines.add("");
	}
	
	private void AddComponentSecurityControls(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% CONTROLS: Component to controls");
		
		AddSubComponentsSecurityControls(textLines, analysis.getComponents());
		
		textLines.add("");
	}
	
	private void AddSubComponentsSecurityControls(ArrayList<String> textLines, EList<Component> components) {
		for(Component component : components) {
			EList<Control> controls = component.getAssociatedControls();
			if(!controls.isEmpty()) {
				//Note that skipping this entry for components with no controls means that querying their controls yields false rather than an empty list
				String mitigatedByAsArray = getNamesAsPrologStringArray(controls);
				textLines.add("controls('" + escapeStringForSingleQuotes(component.getName()) + "', " + mitigatedByAsArray + ").");
			}
			
			AddSubComponentsSecurityControls(textLines, component.getComponents());
		}
	}
	
	private void addVulnerabilityHierachy(ArrayList<String> textLines, Analysis analysis)
	{
		textLines.add("% AVULNS: Vulnerability to higher-level vulnerabilities");
		
		for(Vulnerability vulnerability : analysis.getVulnerabilityOwner().getVulnerabilities()) {
			String manifestsNamesAsArray = getNamesAsPrologStringArray(vulnerability.getManifests()); 
			textLines.add("avulns('" + escapeStringForSingleQuotes(vulnerability.getName()) + "', " + manifestsNamesAsArray + ").");
		}
		
		textLines.add("");
	}
	
	private static String escapeStringForSingleQuotes(String text) {
		return text.replace("\\","\\\\") //First escape items that look like escapes
				.replace("'", "\\'"); //Then escape single quotes
	}
	
	private static void followManifestsAndAddToList(EList<Vulnerability> elist, Vulnerability vulnerability) {
		for(Vulnerability manifested : vulnerability.getManifests()) {
			if(elist.contains(manifested)) {
				continue;
			}
			
			elist.add(manifested);
			followManifestsAndAddToList(elist, manifested);
		}
	}
	
	private static <T extends NamedElement> String getNamesAsPrologStringArray(EList<T> eList) {
		ArrayList<String> names = new ArrayList<String>();
		for (T item : eList) {
			names.add("'" + escapeStringForSingleQuotes(item.getName()) + "'");
		}
		
		return "[" + String.join(", ", names)+ "]";
	}
}
