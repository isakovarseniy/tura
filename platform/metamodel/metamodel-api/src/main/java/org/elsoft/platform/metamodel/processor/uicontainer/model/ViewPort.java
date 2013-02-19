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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.HashMap;
import java.util.UUID;

import org.apache.commons.lang.WordUtils;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventViewPort2ControllerDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventViewPort2Controller;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;

public class ViewPort extends UIElement implements PointerElement {

	private String uuid = UUID.randomUUID().toString();
	private Canvas canvas;
	private String viewPortName;
	private String uncapViewPortName;
	private EventDAO canvasPointer;
	private RemoteMethod rmi;
	private CreateEventViewPort2ControllerDAO vewPortController;
	

	public ViewPort(CreateUIViewPortDAO command, HashMap<String, Object> context) {
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		setViewPortName(command.getViewPortName());
		setUncapViewPortName(WordUtils.uncapitalize(getViewPortName()));
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUIViewPort.save(ch, getParentUuid(), this);
		CreateEventUIElement2UIElement.save(ch, this.getUuid(), canvasPointer );
		if (rmi != null){
			CreateEventViewPort2Controller.save(ch, this);
		}
		super.serialize(ch);
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public void addReference(EventDAO element, HashMap<String, Object> context) {
		if (element.getEventType().equals(
				MetamodelTriggerEventsType.CreateEventUIElement2UIElement
						.name())) {
			
			setCanvas((Canvas) context.get(element.getDstUUID()));
			canvasPointer = element;
		}
	}

	public String getViewPortName() {
		return viewPortName;
	}

	public void setViewPortName(String viewPortName) {
		this.viewPortName = viewPortName;
	}

	@Override
	public String getUiElementType() {
		return "ViewPort";
	}

	public String getUncapViewPortName() {
		return uncapViewPortName;
	}

	public void setUncapViewPortName(String uncapViewPortName) {
		this.uncapViewPortName = uncapViewPortName;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public RemoteMethod getRmi() {
		return rmi;
	}

	public void setRmi(RemoteMethod rmi) {
		this.rmi = rmi;
	}

	public CreateEventViewPort2ControllerDAO getVewPortController() {
		return vewPortController;
	}

	public void setVewPortController(CreateEventViewPort2ControllerDAO vewPortController) {
		this.vewPortController = vewPortController;
	}


}
