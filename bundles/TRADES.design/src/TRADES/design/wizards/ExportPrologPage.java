package TRADES.design.wizards;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
	private boolean shouldExecuteCommand;
	
	private Text fileSelectionText;
	
	protected ExportPrologPage(List<IProject> availableProjects, IProject initiallySelectedProject) {
		super("Export models to Prolog");

		setDescription("Select the project and location of the export.");
		
		this.availableProjects = availableProjects;
		this.initiallySelectedProject = initiallySelectedProject;
	}
	
	@Override
	public void createControl(Composite parent) {
		//Layout is a 2 column one, with the project selector having a column span of 2
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		
		PluginProperties pluginProperties = new PluginProperties(Activator.getDefault().getPreferenceStore());
		
		//Project selector
		
		TableViewer projectSelector = new TableViewer(container, SWT.SINGLE | SWT.BORDER);
		GridData projectSelectorLayout = new GridData(GridData.FILL_BOTH);
		projectSelectorLayout.horizontalSpan = 2;
		projectSelector.getControl().setLayoutData(projectSelectorLayout);
		
		projectSelector.setContentProvider(new BaseWorkbenchContentProvider());
		projectSelector.setLabelProvider(new WorkbenchLabelProvider());
		projectSelector.setInput(new AdaptableList(availableProjects));
		projectSelector.addSelectionChangedListener(event -> {
			var untypedSelectionList = projectSelector.getStructuredSelection().toList();
			if(untypedSelectionList.size() == 1) {
				selectedProject = (IProject)untypedSelectionList.get(0);
				setDefaultFilePathForProjectIfNotEmpty(selectedProject);
			} else {
				selectedProject = null;
			}
			
			getContainer().updateButtons();
		});
		
		//Prefix
		
		Text prefixLabel = new Text(container, SWT.READ_ONLY);
		prefixLabel.setText("Prefix source");
		String tooltip = "The file prefix is set in the TRADES project properties";
		prefixLabel.setToolTipText(tooltip);
		prefixLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		Text prefixValue = new Text(container, SWT.READ_ONLY);
		prefixValue.setText(pluginProperties.getIsPrologPrefixEmbedded() ? "Embedded" : pluginProperties.prologExportPrefixFile);
		prefixValue.setToolTipText(tooltip);
		
		//File selector
		
		Button fileBrowseButton = new Button(container, SWT.PUSH);
		fileBrowseButton.setLayoutData(new GridData(GridData.END));
		fileBrowseButton.setText("Output file");
		fileBrowseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		
		fileSelectionText = new Text(container, SWT.BORDER);
		fileSelectionText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		fileSelectionText.setToolTipText("File paths can either be absolute (starting with e.g. 'C:\\') or relative to the project folder");
		fileSelectionText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String value = ((Text)e.widget).getText();
				if(value.length() == 0)
				{
					selectedFile = null;
					return;
				}
				
				selectedFile = Path.of(value);
			}
		});
		
		fileBrowseButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fileDialog = new FileDialog(getShell(), SWT.SAVE);
				fileDialog.setFilterExtensions(new String[] { "*.pl" });
				String fileFullName = fileDialog.open();
				if (fileFullName != null) {
					selectedFile = Path.of(fileFullName);
					fileSelectionText.setText(fileFullName);
				} else {
					selectedFile = null;
					fileSelectionText.setText("");
				}
				getContainer().updateButtons();
			}
		});
		
		//Set initial project and trigger handlers
		if (initiallySelectedProject != null) {
            projectSelector.setSelection(new StructuredSelection(this.initiallySelectedProject));
		}
		
		//Execute command?
		//"Execute exported file (using command set in preferences)"
		Button runCommandCheckbox = new Button(container, SWT.CHECK);
		runCommandCheckbox.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				shouldExecuteCommand = runCommandCheckbox.getSelection();
			}
		});
		boolean shouldEnabledCheckbox = pluginProperties.prologCommand != "";
		runCommandCheckbox.setEnabled(shouldEnabledCheckbox);
		shouldExecuteCommand = shouldEnabledCheckbox && pluginProperties.prologCommandShouldBeRunByDefault;
		runCommandCheckbox.setSelection(shouldExecuteCommand);
		runCommandCheckbox.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		Text runCommandLabel = new Text(container, SWT.READ_ONLY);
		runCommandLabel.setText("Execute exported file (using command set in TRADES project properties)");
		runCommandLabel.setToolTipText("Current command: '" + pluginProperties.prologCommand + "'");
		
		setControl(container);
	}
	
	@Override
	public boolean isPageComplete() {
		return selectedProject != null && getSelectedFile() != null;
	}
	
	public Path getSelectedFile() {
		
		if(selectedFile == null)
			return null;
		
		if(selectedFile.getRoot() == null) {
			//Path is not rooted, so make it relative to the project location
			return selectedProject != null ? Path.of(selectedProject.getLocation().toOSString(), selectedFile.toString()) : null;
		}
		
		return selectedFile;
	}
	
	public IProject getSelectedProject() {
		return selectedProject;
	}
	
	public boolean getShouldExecuteCommand() {
		return shouldExecuteCommand;
	}
	
	private void setDefaultFilePathForProjectIfNotEmpty(IProject project) {
		
		if(fileSelectionText.getText().length() > 0)
			return;
		
		try {
			IPath projectPath = project.getLocation();
			//Remove all chars but a-z, A-Z, 0-9 and _ from the project name
			String safeProjectName = project.getName().replaceAll("\\W+", "");
			Path outputFilePath = Path.of(projectPath.toOSString(), safeProjectName + ".pl");
			fileSelectionText.setText(outputFilePath.toString());
		}
		catch(Exception e) {
			System.err.println("Failed to obtain default export file path: " + e.getLocalizedMessage());
		}
	}
}
