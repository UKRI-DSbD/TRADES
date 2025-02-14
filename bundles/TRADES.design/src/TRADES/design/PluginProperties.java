package TRADES.design;

import org.eclipse.jface.preference.IPreferenceStore;

public class PluginProperties {
	//Store field names
	
	public static final String PROLOG_EXPORT_PREFIX_FILE_PREF_NAME = "PrologExportPrefixFile";
	public static final String PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME = "PrologExportPrefixType";
	public static final String PROLOG_COMMAND_PREF_NAME = "PrologCommand";
	public static final String PROLOG_COMMAND_SHOULD_BE_RUN_BY_DEFAULT_PREF_NAME = "PrologCommandShouldBeRun";
	
	//Value constants
	
	public static final String PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED = "embedded";
	public static final String PROLOG_EXPORT_PREFIX_TYPE_VALUE_EXTERNAL = "external";
	
	//Properties with default values
	
	public String prologExportPrefixType = PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED; 
	public String prologExportPrefixFile = "";
	public String prologCommand = "";
	public boolean prologCommandShouldBeRunByDefault = false;
	
	//Methods
	
	/** Creates an instance leaving the default values */
	protected PluginProperties() {
	}
	
	/** Creates an instance, starting with default values and filling any non-default values from the store */
	public PluginProperties(IPreferenceStore store) {
		String fromStore = store.getString(PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME);
		if(fromStore != "")
			prologExportPrefixType = fromStore;
		fromStore = store.getString(PROLOG_EXPORT_PREFIX_FILE_PREF_NAME);
		if(fromStore != "")
			prologExportPrefixFile = fromStore;
		fromStore = store.getString(PROLOG_COMMAND_PREF_NAME);
		if(fromStore != "")
			prologCommand = fromStore;
		boolean fromStoreBoolean = store.getBoolean(PROLOG_COMMAND_SHOULD_BE_RUN_BY_DEFAULT_PREF_NAME);
		prologCommandShouldBeRunByDefault = fromStoreBoolean;
	}
	
	public boolean getIsPrologPrefixEmbedded() {
		return prologExportPrefixType == PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED;
	}
	
	public static void setDefaults(IPreferenceStore store) {
		PluginProperties defaultInstance = new PluginProperties();
		store.setDefault(PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME, defaultInstance.prologExportPrefixType);
		store.setDefault(PROLOG_EXPORT_PREFIX_FILE_PREF_NAME, defaultInstance.prologExportPrefixFile);
		store.setDefault(PROLOG_COMMAND_PREF_NAME, defaultInstance.prologCommand);
		store.setDefault(PROLOG_COMMAND_SHOULD_BE_RUN_BY_DEFAULT_PREF_NAME, defaultInstance.prologCommandShouldBeRunByDefault);
	}	
}
