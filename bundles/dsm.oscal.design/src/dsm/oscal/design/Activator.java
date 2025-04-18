/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */

package dsm.oscal.design;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.ide.ui.internal.preferences.EEFPreferences;
import org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager.ConflictResolutionMode;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "dsm.oscal.design";

	public static String OSCAL_VIEWPOINT_NAME = "OscalViewPoint";

	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/oscal.odesign"));
		
		/*
		 * Temporary hack to handle MarkupLine and MarkupMultiline on EEF property view
		 * <p> The current text area widget tries to resolve conflit on value by before
		 * disposing checking the the value of the text is equal to the current value.
		 * However the current implementation of the MarkupMultiline.toMarkdown() some
		 * time adds a trailing \n making the input string and the given string not
		 * equals. At some point we will need to create a custom widget for those data
		 * type. The implementation should take care of this limitation and then remove
		 * this preference. </p>
		 * 
		 * @see org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager.
		 * resolveEditionConflict(Shell, String, String, String)
		 */
		EEFPreferences.setTextConflictResolutionMode(ConflictResolutionMode.USE_LOCAL_VERSION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void doLogInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}

	private void doLogError(String message) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
	}

	public static void logError(String message) {
		if (plugin != null) {
			plugin.doLogError(message);
		} else {
			System.err.println(message);
		}
	}

	public static void logInfo(String message) {
		if (plugin != null) {
			plugin.doLogInfo(message);
		} else {
			System.out.println(message);
		}
	}

	/**
	 * Tries to log and error (either in the eclipse logging system if the plugin is
	 * started or in System.err)
	 * 
	 * @param message the message
	 * @param e       an exception
	 */
	public static void logError(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogError(message, e);
		} else {
			System.err.println(message);
			e.printStackTrace();
		}
	}

	private void doLogError(String string, Throwable e) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, string, e));
	}

	public Image getImage(String path) {
		Image img = getImageRegistry().get(path);
		if (img == null) {

			URL url = FileLocator.find(getBundle(), new org.eclipse.core.runtime.Path(path), null);
			if (url != null) {
				getImageRegistry().put(path, ImageDescriptor.createFromURL(url));
				img = getImageRegistry().get(path);
			}
		}
		return img;
	}

	public ImageDescriptor getImageDescriptor(String path) {
		ImageDescriptor img = getImageRegistry().getDescriptor(path);
		if (img == null) {

			URL url = FileLocator.find(getBundle(), new org.eclipse.core.runtime.Path(path), null);
			if (url != null) {
				getImageRegistry().put(path, ImageDescriptor.createFromURL(url));
				img = getImageRegistry().getDescriptor(path);
			}
		}
		return img;
	}
}
