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
import org.elsoft.platform.metamodel.general.CreateUIViewPortDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIViewPort;

public class ViewPort  extends UIElement implements PointerElement{

	private String uuid = UUID.randomUUID().toString();
	private Canvas canvas;
	private String viewPortName;
	private String uncapViewPortName;
	
	public ViewPort(CreateUIViewPortDAO command,HashMap<String, Object> context){
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
		CreateEventUIElement2UIElement.save(ch, this.getUuid(), this);
        super.serialize(ch);  
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	@Override
	public void setReference(UIElement element) {
		canvas = (Canvas) element;
		
	}

	@Override
	public UIElement getReference() {
		return canvas;
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

}
