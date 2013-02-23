/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipse.wb.elsoft.components;

import java.io.InputStream;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.wb.internal.core.BundleResourceProvider;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.wb.elsoft.components"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	
	  ////////////////////////////////////////////////////////////////////////////
	  //
	  // Resources
	  //
	  ////////////////////////////////////////////////////////////////////////////
	  private static final BundleResourceProvider m_resourceProvider =
	      BundleResourceProvider.get(PLUGIN_ID);

	  /**
	   * @return the {@link InputStream} for file from plugin directory.
	   */
	  public static InputStream getFile(String path) {
	    return m_resourceProvider.getFile(path);
	  }

	  /**
	   * @return the {@link Image} from "icons" directory, with caching.
	   */
	  public static Image getImage(String path) {
	    return m_resourceProvider.getImage("icons/" + path);
	  }

	  /**
	   * @return the {@link ImageDescriptor} from "icons" directory.
	   */
	  public static ImageDescriptor getImageDescriptor(String path) {
	    return m_resourceProvider.getImageDescriptor("icons/" + path);
	  }
	
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
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

}
