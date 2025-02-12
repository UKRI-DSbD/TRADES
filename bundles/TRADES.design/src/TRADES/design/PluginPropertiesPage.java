package TRADES.design;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPropertyPage;

/**
 * Eclipse preference stores preferences per workspace per plug-in, and this page enables the user
 * to edit the TRADES-specific plug-in preferences via the Project context menu > Properties.
 * Note that this is misleading since the preferences are not contextual to the project.
 * */
public class PluginPropertiesPage extends FieldEditorPreferencePage implements IWorkbenchPropertyPage {
	
	private FileFieldEditor prologExportPrefixFileEditor;
	private RadioGroupFieldEditor prologExportPrefixType;
	
	public PluginPropertiesPage() {
		super(FieldEditorPreferencePage.GRID);
	}
	
	/** Called when the page is initialising to set the store */
	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore(); /*Workspace-wide store for this plug-in*/
		PluginProperties.setDefaults(store);
		return store;
	}
	
	@Override
	protected void createFieldEditors() {
		Composite composite = getFieldEditorParent();
		
		Text text = new Text(composite, SWT.READ_ONLY);
		text.setText("Workspace-wide preferences for Prolog exports "); //Tailing space is required due to the negative margin below
		GridData gridData = new GridData();
		gridData.horizontalIndent = -3; //Match the horizontal position of the editors
		text.setLayoutData(gridData);
				//Prolog prefix
		String[][] prologExportPrefixTypeOptions = new String[][] {
			{ "Embedded", PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED },
			{ "External file", PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_VALUE_EXTERNAL }
		};
		prologExportPrefixType = new RadioGroupFieldEditor(PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME, "Prolog export prefix type", 2 /*two columns*/, prologExportPrefixTypeOptions, composite);
		addField(prologExportPrefixType);
		
        prologExportPrefixFileEditor = new FileFieldEditor(PluginProperties.PROLOG_EXPORT_PREFIX_FILE_PREF_NAME, "Prolog export prefix file", composite);
        prologExportPrefixFileEditor.setFileExtensions(new String[] { "*.pl" });
        addField(prologExportPrefixFileEditor);
	}
	
	@Override
	public IAdaptable getElement() {
		return null;
	}

	@Override
	public void setElement(IAdaptable element) {		
	}
}
