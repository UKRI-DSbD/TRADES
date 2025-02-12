package TRADES.design.services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;


/**
 * Provides runtime access to bundle content
 * */
public class BundleFileService extends Plugin {

	/** Handles conversion of line endings the system's format */
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
