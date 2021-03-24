/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.preferences;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * A preference page for a simple HTML editor.
 */
public class TuraPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	StringFieldEditor license;
	BooleanFieldEditor debugging;
	BooleanFieldEditor logPreprocessedTemplate;
	BooleanFieldEditor enableValidation;

	public TuraPreferencePage() {
		super(FieldEditorPreferencePage.GRID);

		// Set the preference store for the preference page.
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
	}

	/**
	 * @see org.eclipse.jface.preference.
	 *      FieldEditorPreferencePage#createFieldEditors()
	 */
	protected void createFieldEditors() {

		// Initialize all field editors.
		enableValidation = new BooleanFieldEditor(IPreferenceConstants.ENABLE_VALIDATION,
				"&Enable validation before generation", getFieldEditorParent());
		addField(enableValidation);

		logPreprocessedTemplate = new BooleanFieldEditor(IPreferenceConstants.LOG_TEMPLATES,
				"&Log preprocessed templates", getFieldEditorParent());
		addField(logPreprocessedTemplate);

		debugging = new BooleanFieldEditor(IPreferenceConstants.DEBUGING, "&Debugging", getFieldEditorParent());
		addField(debugging);

		license = new StringFieldEditor(IPreferenceConstants.LICENSE, "&License", getFieldEditorParent());

		addField(license);

	}

	/**
	 * @see IWorkbenchPreferencePage#init
	 */
	public void init(IWorkbench workbench) {

	}

	@Override
	public boolean performOk() {
		if (super.performOk()) {
			String path = System.getProperty("user.home") + "/.tura/licensefile";
			 try {
				Files.writeString(Paths.get((path)), license.getStringValue());
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
			 Properties props = new Properties();
			 props.put(IPreferenceConstants.DEBUGING, Boolean.valueOf(debugging.getBooleanValue()).toString());
			 props.put(IPreferenceConstants.LOG_TEMPLATES, Boolean.valueOf(logPreprocessedTemplate.getBooleanValue()).toString());
			 
			path = System.getProperty("user.home") + "/.tura/generation.properties";
			try {
				FileOutputStream out = new FileOutputStream(path);
				props.store(out, "");
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			 
			 
			 return true;
		} else {
			return false;
		}
	}

}
