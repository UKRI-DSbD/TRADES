package TRADES.design;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
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
	
	private FileFieldEditor prologExportPrefixFile;
	private RadioGroupFieldEditor prologExportPrefixType;
	private StringFieldEditor prologCommand;
	private BooleanFieldEditor prologCommandShouldBeRunByDefault;
	
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
		gridData.horizontalIndent = -4; //Match the horizontal position of the editors
		gridData.horizontalSpan = 3; //Use all columns
		text.setLayoutData(gridData);
		
		Text gap = new Text(composite, SWT.READ_ONLY);
				//Prolog prefix
		String[][] prologExportPrefixTypeOptions = new String[][] {
			{ "Embedded", PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED },
			{ "External file", PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_VALUE_EXTERNAL }
		};
		prologExportPrefixType = new RadioGroupFieldEditor(PluginProperties.PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME, "Prolog export prefix type", 2 /*two columns*/, prologExportPrefixTypeOptions, composite);
		addField(prologExportPrefixType);
		
        prologExportPrefixFile = new FileFieldEditor(PluginProperties.PROLOG_EXPORT_PREFIX_FILE_PREF_NAME, "Prolog export prefix file", composite);
        prologExportPrefixFile.setFileExtensions(new String[] { "*.pl" });
        addField(prologExportPrefixFile);
        
        Text gap2 = new Text(composite, SWT.READ_ONLY);
        
        //Prolog command
        
        Text commandHelp = new Text(composite, SWT.READ_ONLY);
        commandHelp.setText("Enter a command below, e.g. \"<path>\\<program>\" \\f \"%s\", where the %s will be replaced with the exported file name. "); //Tailing space is required due to the negative margin below
		GridData commandHelpGridData = new GridData();
		commandHelpGridData.horizontalIndent = -4; //Match the horizontal position of the editors
		commandHelpGridData.horizontalSpan = 3; //Use all columns
		commandHelp.setLayoutData(commandHelpGridData);
        
        prologCommand = new StringFieldEditor(PluginProperties.PROLOG_COMMAND_PREF_NAME, "Prolog exection command", composite);
        addField(prologCommand);
        
        prologCommandShouldBeRunByDefault = new BooleanFieldEditor(PluginProperties.PROLOG_COMMAND_SHOULD_BE_RUN_BY_DEFAULT_PREF_NAME, "Run command by default", composite);
        addField(prologCommandShouldBeRunByDefault);
	}
	
	@Override
	public IAdaptable getElement() {
		return null;
	}

	@Override
	public void setElement(IAdaptable element) {		
	}
}
