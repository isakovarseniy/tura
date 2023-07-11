/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.preferences;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.tura.metamodel.commons.preferences"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

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
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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

	protected void initializeDefaultPreferences(IPreferenceStore store) {
//		String path = System.getProperty("user.home") + "/.tura/licensefile";
//		store.setDefault(IPreferenceConstants.LICENSE, "");
//		try {
//			String license = Files.readString(Paths.get((path)));
//			store.setDefault(IPreferenceConstants.LICENSE, license);
//		} catch (Exception e) {
//		}

		String  path = System.getProperty("user.home") + "/.tura/generation.properties";
		Properties prop = new Properties();
		ByteArrayInputStream in = null;
		try {
			in = new ByteArrayInputStream(Files.readAllBytes(Paths.get(path)));
			prop.load(in);
		} catch (Exception e) {
		}

		String s = (String) prop.get(IPreferenceConstants.LOG_TEMPLATES);
		if (s != null) {
			store.setDefault(IPreferenceConstants.LOG_TEMPLATES, s);
		} else {
			store.setDefault(IPreferenceConstants.LOG_TEMPLATES, false);
		}

		s = (String) prop.get(IPreferenceConstants.DEBUGING);
		if (s != null) {
			store.setDefault(IPreferenceConstants.DEBUGING, s);
		} else {
			store.setDefault(IPreferenceConstants.DEBUGING, false);

		}
	}

}
