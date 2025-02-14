package TRADES.design.services;

import java.io.IOException;

import javax.naming.OperationNotSupportedException;

/** Runs an external program */
public class ExternalAppExecutionService {

	public void ExecuteAsync(String command, String windowTitle) throws OperationNotSupportedException, IOException {
		boolean isWindows = System.getProperty("os.name").startsWith("Windows");
		
		if(!isWindows) {
			throw new OperationNotSupportedException("External execution is not supported on non-Windows operating systems");
		}
		
		//Spawn the process in a visible window, even if it is a console app (Windows-specific)
		windowTitle = windowTitle.replace("\"", "");
		System.out.println("Executing command: " + command);
		Process process = Runtime.getRuntime().exec("cmd /k start \"" + windowTitle + "\" " + command);
		
		process.onExit().thenRunAsync(() -> {
			System.out.println(command + " ended with exit code " + process.exitValue());
		});
	}
}
