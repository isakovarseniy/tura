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
package org.elsoft.platform.form;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.layers.uicontainer.UiContainerHandler;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.ui.UIContainerDAO;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.windowbuilder.CanvasParser;
import org.elsoft.windowbuilder.reader.Reader;

public class LoadDropDownForm {
	public void execute(RepositoryFactory rf, HashMap<String, Object> context)
			throws Exception {

		ArrayList<CommandDAO> program = new ArrayList<CommandDAO>();
		String userDir = System.getenv("TURA_SOURCE_HOME");

		Reader root = new CanvasParser()
				.XWTModelbuilder(
						new File(
								userDir +"/testcases/testform/DropDownForm/src/DataDefinition.xwt"),
						null);
		root.buildAll(context, rf, root, program);

		String frmUUID = Reader.idMAP.get("DropDownForm");

		root = new CanvasParser()
				.XWTModelbuilder(
						new File(
								userDir +"/testcases/testform/DropDownForm/src/Canvas.xwt"),
						frmUUID);
		root.buildAll(context, rf, root, program);

		root = new CanvasParser()
				.XWTModelbuilder(
						new File(
								userDir +"/testcases/testform/DropDownForm/src/Window.xwt"),
						frmUUID);
		root.buildAll(context, rf, root, program);

		Iterator<CommandDAO> itr = program.iterator();
		HashMap<String, Object> ctx = new Processor().executor(rf, itr);
		Form frm = (Form) ctx.get("DropDownForm");

		UiContainerHandler uch = rf.getRoot().cleanSearch()
				.searchString("domainName", "Manufacturing").seek()
				.getFunctionalDomain().cleanSearch()
				.searchString("functionalDomainName", "BackOffice").seek()
				.getApplicationHandler().cleanSearch()
				.searchString("applicationName", "HR").seek().getUILayer();

		UIContainerDAO uicontainer = uch.addUIContainer("DropDownForm");

		uch.saveUIContainer(uicontainer, frm);
		Reader.idMAP=null;

	}

}
