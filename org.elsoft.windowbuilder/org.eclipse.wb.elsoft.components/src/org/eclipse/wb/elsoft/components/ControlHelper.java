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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ControlHelper {

	public static String DATACONTROL_FILE_NAME = "form.jad";
	public static String ID_FILE_NAME = "id.jad";
	public static String ARTIFICIAL_FIELD_FILE_NAME = "artificialfield.jad";

	public void addDataControl(String name, String businessObject,
			String propertiesFileName) {

		Properties properties = load(propertiesFileName);
		properties.put(name, businessObject);
		save(properties, propertiesFileName);

	}

	public boolean isExists(String name, String propertiesFileName) {
		Properties properties = load(propertiesFileName);
		if (properties.get(name) != null)
			return true;
		else
			return false;
	}

	public void removeDataControl(String name, String businessObject,
			String propertiesFileName) {

		try {
			Properties properties = load(propertiesFileName);
			properties.remove(name);
			save(properties, propertiesFileName);

		} catch (Exception e) {
		}
	}

	public Properties load(String propertiesFileName) {
		Properties properties = new Properties();
		try {

			IWorkbench iworkbench = PlatformUI.getWorkbench();
			IWorkbenchWindow iworkbenchwindow = iworkbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
			IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
			IFileEditorInput input = (IFileEditorInput) ieditorpart
					.getEditorInput();
			IFile file = input.getFile();
			IProject project = file.getProject();
			String filename = "/src/" + propertiesFileName;
			file = project.getFile(filename);

			properties.load(file.getContents());
		} catch (Exception e) {
		}
		return properties;
	}

	private void save(Properties properties, String propertiesFileName) {

		try {

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			properties.store(out, null);

			ByteArrayInputStream in = new ByteArrayInputStream(
					out.toByteArray());

			IWorkbench iworkbench = PlatformUI.getWorkbench();
			IWorkbenchWindow iworkbenchwindow = iworkbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage iworkbenchpage = iworkbenchwindow.getActivePage();
			IEditorPart ieditorpart = iworkbenchpage.getActiveEditor();
			IFileEditorInput input = (IFileEditorInput) ieditorpart
					.getEditorInput();
			IFile file = input.getFile();
			IProject project = file.getProject();

			IFolder srcFolder = project.getFolder("src");
			if (srcFolder.exists()) {
				// create a new file
				IFile newLogo = srcFolder.getFile(propertiesFileName);
				if (!newLogo.exists())
					newLogo.create(in, true, null);
				else {
					newLogo.setContents(in, IFile.KEEP_HISTORY, null);
				}

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
