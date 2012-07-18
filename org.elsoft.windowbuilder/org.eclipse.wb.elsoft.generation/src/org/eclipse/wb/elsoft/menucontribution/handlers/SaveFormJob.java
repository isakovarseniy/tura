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
package org.eclipse.wb.elsoft.menucontribution.handlers;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.wb.elsoft.propertyeditor.Activator;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.UiContainerDAO;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.windowbuilder.CanvasParser;
import org.elsoft.windowbuilder.reader.Reader;

public class SaveFormJob implements Runnable {
	public static String CONSOLE_NAME = "Metamodel output";
	private Object obj;

	@Override
	public void run() {
		Object[] result = (Object[]) obj;

		MessageConsole myConsole = findConsole(CONSOLE_NAME);
		MessageConsoleStream out = myConsole.newMessageStream();

		final PrintStream oldOut = System.out;
		final PrintStream olderr = System.err;

		System.setOut(new PrintStream(out));
		System.setErr(new PrintStream(out));


		try {

			for (Object obj : result) {
				IProject project = (IProject) obj;
				System.out.println("<================= " + project.getName()
						+ " =================>");

				String filename = "/src/" + "DataDefinition.xwt";
				IFile file = project.getFile(filename);

				HashMap<String, Object> context = new HashMap<String, Object>();
				ArrayList<CommandDAO> program = new ArrayList<CommandDAO>();

				Reader root = new CanvasParser().XWTModelbuilder(file
						.getLocation().toFile(), null);
				root.buildAll(context, Activator.rf, root, program);

				String frmUUID = Reader.formid;
				IFolder folder = project.getFolder("/src/");

				for (IResource resource : folder.members()) {
					if ((resource.getFileExtension() != null)
							&& (resource.getFileExtension().equals("xwt"))
							&& (resource.getName()
									.indexOf("DataDefinition.xwt") == -1)) {

						System.out.println(resource.getName());
						root = new CanvasParser().XWTModelbuilder(resource
								.getLocation().toFile().getCanonicalFile(),
								frmUUID);
						root.buildAll(context, Activator.rf, root, program);

					}
				}
				Iterator<CommandDAO> itr = program.iterator();
				HashMap<String, Object> ctx = new Processor().executor(
						Activator.rf, itr);
				Form frm = (Form) ctx.get(Reader.formid);

				Reader.formid = null;
				Reader.idMAP = null;
				UiContainerHandler uiContHand = Activator.rf.getRoot().clean()
						.searchString("domainName", frm.getDomain()).seek()
						.getFunctionalDomain().clean()
						.searchString("functionalDomainName", frm.getFunctionalDomain()).seek()
						.getApplicationHandler().clean()
						.searchString("applicationName", frm.getApplication()).seek().getUILayer()
						.clean().searchString("uiContainerName", frm.getName()).seek();
				UiContainerDAO uic = uiContHand.getObject();
				if (uic == null){
					System.out.println("!!!!!!!!!!!!   -> No form header -----> !!!");
				}else{
					uiContHand.getCommandHandler().removeAll();
					Activator.rf.saveModel();
					uiContHand.getCommandHandler().removeAll();
					Activator.rf.saveModel();

					uiContHand.saveUIContainer(uic, frm);
					Activator.rf.saveModel();
				}
			}

			System.out.println("Done -> !!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.setOut(oldOut);
			System.setErr(olderr);
		}

	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();

		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

}
