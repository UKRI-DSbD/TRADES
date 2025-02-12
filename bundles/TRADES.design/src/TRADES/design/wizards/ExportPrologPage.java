package TRADES.design.wizards;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.AdaptableList;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import TRADES.design.Activator;
import TRADES.design.PluginProperties;

public class ExportPrologPage extends WizardPage {

	private List<IProject> availableProjects;
	private IProject initiallySelectedProject;
	
	private Path selectedFile;
	private IProject selectedProject;
	
	protected ExportPrologPage(List<IProject> availableProjects, IProject initiallySelectedProject) {
		super("Export models to Prolog");

		setDescription("Select the project and location of the export.");
		
		this.availableProjects = availableProjects;
		this.initiallySelectedProject = initiallySelectedProject;
		selectedProject = null; 
	}
	
	@Override
	public void createControl(Composite parent) {
		//Layout is a 2 column one, with the project selector having a column span of 2
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		
		//Project selector
		
		TableViewer projectSelector = new TableViewer(container, SWT.SINGLE | SWT.BORDER);
		GridData projectSelectorLayout = new GridData(GridData.FILL_BOTH);
		projectSelectorLayout.horizontalSpan = 2;
		projectSelector.getControl().setLayoutData(projectSelectorLayout);
		
		projectSelector.setContentProvider(new BaseWorkbenchContentProvider());
		projectSelector.setLabelProvider(new WorkbenchLabelProvider());
		projectSelector.setInput(new AdaptableList(availableProjects));
		if (initiallySelectedProject != null) {
			this.selectedProject = initiallySelectedProject;
            projectSelector.setSelection(new StructuredSelection(this.initiallySelectedProject));
		}
		projectSelector.addSelectionChangedListener(event -> {
			var untypedSelectionList = projectSelector.getStructuredSelection().toList();
			if(untypedSelectionList.size() == 1) {
				selectedProject = (IProject)untypedSelectionList.get(0);
			} else {
				selectedProject = null;
			}
			
			getContainer().updateButtons();
		});
		
		//Prefix
		
		Text prefixLabel = new Text(container, SWT.READ_ONLY);
		prefixLabel.setText("Prefix source:");
		String tooltip = "The file prefix is set in the TRADES project properties";
		prefixLabel.setToolTipText(tooltip);
		
		Text prefixValue = new Text(container, SWT.READ_ONLY);
		PluginProperties projectProperties = new PluginProperties(Activator.getDefault().getPreferenceStore());
		prefixValue.setText(projectProperties.getIsPrologPrefixEmbedded() ? "Embedded" : projectProperties.prologExportPrefixFile);
		prefixValue.setToolTipText(tooltip);
		
		//File selector
		
		Button fileBrowseButton = new Button(container, SWT.PUSH);
		fileBrowseButton.setLayoutData(new GridData(GridData.END));
		fileBrowseButton.setText("Output file");	
		
		Text fileSelectionLabel = new Text(container, SWT.READ_ONLY | SWT.BORDER);
		fileSelectionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		if(initiallySelectedProject != null) {
			try {
				IPath projectPath = initiallySelectedProject.getLocation();
				//Remove all chars but a-z, A-Z, 0-9 and _ from the project name
				String safeProjectName = initiallySelectedProject.getName().replaceAll("\\W+", "");
				Path outputFilePath = Path.of(projectPath.toOSString(), safeProjectName + ".pl");
				selectedFile = outputFilePath;
				fileSelectionLabel.setText(outputFilePath.toString());
			}
			catch(Exception e) {
				System.err.println("Failed to obtain default export file path: " + e.getLocalizedMessage());
			}
		}
		
		fileBrowseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(getShell(), SWT.SAVE);
				fileDialog.setFilterExtensions(new String[] { "*.pl" });
				String fileFullName = fileDialog.open();
				if (fileFullName != null) {
					selectedFile = Path.of(fileFullName);
					fileSelectionLabel.setText(fileFullName);
				} else {
					selectedFile = null;
					fileSelectionLabel.setText("");
				}
				getContainer().updateButtons();
			}
		});
		
		setControl(container);
	}
	
	@Override
	public boolean isPageComplete() {
		return selectedProject != null && selectedFile != null;
	}
	
	public Path getSelectedFile() {
		return selectedFile;
	}
	
	public IProject getSelectedProject() {
		return selectedProject;
	}
}
