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
package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;

public class CreateUICanvas {
	public static String CREATEUICANVAS = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateUICanvasDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateUICanvasDAO command = (CreateUICanvasDAO) cmd;
		Form frm = (Form) context.get(command.getParentUUID());
		frm.addCanvas(new Canvas(command, context));

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID, Canvas canvas) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEUICANVAS);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateUICanvasDAO obj = (CreateUICanvasDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setCanvasName(canvas.getCanvasName());
		obj.setCanvasType(canvas.getCanvasType());
		obj.setCss(canvas.getCss());
		obj.setUUID(canvas.getUuid());
		obj.setCssClass(canvas.getCssClass());
		obj.setCommandExecutor(CreateUICanvas.class.getName());
	}

}
