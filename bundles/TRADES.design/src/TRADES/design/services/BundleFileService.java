package TRADES.design.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;


/**
 * Provides runtime access to bundle content. For example, the Prolog export prefix is a plain file in the source code, but at
 * runtime it is bundled up inside a .jar file. This allows easy access to the contents of that file at runtime.
 * 
 * Additionally, this class handles conversion of line endings to the running system's format.
 * */
public class BundleFileService extends Plugin {

	/** 
	 * Obtain the contents of the bundled file as a string (with line endings matching the running system)
	 * @param filePath The bundled file path, e.g. "src/Resources/PrologExportPrefix.pl" for a file in this project's src/Resources directory
	 * */
	public String getResourceFileText(String filePath) {
		try(InputStream stream = FileLocator.openStream(this.getBundle(), new Path(filePath), false);
				InputStreamReader inputStreamReader = new InputStreamReader(stream);
				BufferedReader reader = new BufferedReader(inputStreamReader)) {
				return reader.lines().collect(Collectors.joining(System.lineSeparator()));
		} catch(Exception ex) {
			//Handle errors here, since exceptions would be the fault of the developer, not the user
			//Unhandled exceptions are possible, e.g. null pointer if the resource is not found, so catch all
			System.err.println("Failed to locate resource file: " + filePath);
			return "";
		}
	}
}
