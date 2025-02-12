package TRADES.design;

import org.eclipse.jface.preference.IPreferenceStore;

public class PluginProperties {
	//Store field names
	
	public static final String PROLOG_EXPORT_PREFIX_FILE_PREF_NAME = "PrologExportPrefixFile";
	public static final String PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME = "PrologExportPrefixType";
	
	//Value constants
	
	public static final String PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED = "embedded";
	public static final String PROLOG_EXPORT_PREFIX_TYPE_VALUE_EXTERNAL = "external";
	
	//Properties with default values
	
	public String prologExportPrefixType = PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED; 
	public String prologExportPrefixFile = "";
	
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
	}
	
	public boolean getIsPrologPrefixEmbedded() {
		return prologExportPrefixType == PROLOG_EXPORT_PREFIX_TYPE_VALUE_EMBEDDED;
	}
	
	public static void setDefaults(IPreferenceStore store) {
		PluginProperties defaultInstance = new PluginProperties();
		store.setDefault(PROLOG_EXPORT_PREFIX_TYPE_PREF_NAME, defaultInstance.prologExportPrefixType);
		store.setDefault(PROLOG_EXPORT_PREFIX_FILE_PREF_NAME, defaultInstance.prologExportPrefixFile);
	}	
}
