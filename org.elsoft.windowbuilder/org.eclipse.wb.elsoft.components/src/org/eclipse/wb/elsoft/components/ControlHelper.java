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

	public void addDataControl(String name, String businessObject) {

		try {
			Properties properties = load();
			properties.put(name, businessObject);
			save(properties);

		} catch (Exception e) {
		}
	}

	public void removeDataControl(String name, String businessObject) {

		try {
			Properties properties = load();
			properties.remove(name);
			save(properties);

		} catch (Exception e) {
		}
	}

	public Properties load() {
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
			String filename = "/src/" + DATACONTROL_FILE_NAME;
			file = project.getFile(filename);

			properties.load(file.getContents());
		} catch (Exception e) {
		}
		return properties;
	}

	private void save(Properties properties) {

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
				IFile newLogo = srcFolder.getFile(DATACONTROL_FILE_NAME);
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