package TRADES.design.wizards;

import static java.util.stream.Collectors.toList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import TRADES.design.Activator;
import TRADES.design.PluginProperties;
import TRADES.design.services.ExternalAppExecutionService;
import TRADES.design.services.PrologExportService;

/**
 * Wizard used to export to Prolog
 * See plugin.xml for how it is referenced from the UI
 */
public class ExportPrologWizard extends Wizard implements IExportWizard {

	private ExportPrologPage page;
	private IStructuredSelection selection;
	
	@Override
	public void addPages() {
		super.addPages();
		List<IProject> modelingProjects = Stream.of(ResourcesPlugin.getWorkspace().getRoot().getProjects())
				.filter(p -> ModelingProject.asModelingProject(p).some()).collect(toList());
		this.page = new ExportPrologPage(modelingProjects, getSelectedProject(selection));
		addPage(this.page);
	}
	
	@Override
    public String getWindowTitle() {
        return "Export to Prolog";
    }
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	@Override
	public boolean performFinish() {
		Path prologFilePath = page.getSelectedFile();
		
		File prologFile = prologFilePath.toFile();
		
		if (prologFile.exists()) {
			if (!MessageDialog.openConfirm(getShell(), "Overwrite file?", "The file '" + prologFilePath + "' already exists. Do you want to overwrite it?")) {
				return false;
			}
			
			prologFile.delete();
		}
		
		IProject project = page.getSelectedProject();
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		PluginProperties pluginProperties = new PluginProperties(preferenceStore);
		PrologExportService exportService = new PrologExportService(pluginProperties);
		
		try {
			exportService.Export(project, prologFile);
			System.out.println("Successfully exported Prolog for project " + project.getName() + " to file " + prologFilePath);
			MessageDialog.openInformation(getShell(), "Prolog export complete", "The export of project " + project.getName() + " to file " + prologFilePath + " completed.");
		} catch (Exception e) {
			System.out.println("Error exporting Prolog for project " + project.getName() + " to file " + prologFilePath);
			MessageDialog.openError(getShell(), "Prolog export failed", "The export of project " + project.getName() + " to file " + prologFilePath + " failed.");
			e.printStackTrace();	
			return false;
		}
		
		ExternalAppExecutionService externalAppService = new ExternalAppExecutionService();
		
		if(page.getShouldExecuteCommand()) {
			try {
				String command = pluginProperties.prologCommand.formatted(prologFile.toString());
				externalAppService.ExecuteAsync(command, "Prolog execution (" + prologFile.toString() + ")");
			} catch (Exception e) {
				MessageDialog.openError(getShell(), "Prolog exection failed", "The execution of prolog for " + project.getName() + " failed.");
				e.printStackTrace();	
				return false;
			}
		}
		
		return true;
	}
	
	//TODO - This is repeated, could it be shared?
	private IProject getSelectedProject(IStructuredSelection selection) {
		for (Object o : selection.toArray()) {
			if (o instanceof IProject) {
				Option<ModelingProject> opt = ModelingProject.asModelingProject((IProject) o);
				if (opt.some()) {
					return (IProject) o;
				}

			}
		}

		return null;
	}
}
