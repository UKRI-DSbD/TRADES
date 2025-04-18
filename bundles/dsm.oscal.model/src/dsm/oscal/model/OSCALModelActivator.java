/**
 * 
 *  Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 *  This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *      ELTA Ltd - initial API and implementation
 *  
 * 
 */
package dsm.oscal.model;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class OSCALModelActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.oscal.model"; //$NON-NLS-1$

	// The shared instance
	private static OSCALModelActivator plugin;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OSCALModelActivator getDefault() {
		return plugin;
	}

	public void log(IStatus status) {
		if (status != null) {
			getLog().log(status);
		}
	}

	public static void logInfo(String msg) {
		OSCALModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.INFO, PLUGIN_ID, msg));
		} else {
			System.out.println(msg);
		}
	}

	public static void logWarning(String msg) {
		OSCALModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.WARNING, PLUGIN_ID, msg));
		} else {
			System.out.println(msg);
		}
	}

	public static void logError(String msg, Throwable throwable) {
		OSCALModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.ERROR, PLUGIN_ID, msg, throwable));
		} else {
			System.out.println(msg);
		}
	}

	public static void logError(String msg) {
		OSCALModelActivator act = getDefault();
		if (act != null) {
			act.log(new Status(IStatus.ERROR, PLUGIN_ID, msg));
		} else {
			System.out.println(msg);
		}
	}

}
