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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.elsoft.platform.metamodel.general.CreateUIWindowDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIWindow;

public class Window extends UIElement implements ChildrenOwner{

	private String windowName;
	private String uuid = UUID.randomUUID().toString();
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Window(CreateUIWindowDAO command,HashMap<String, Object> context){
		this.setWindowName(command.getWindowName());
		setCss(command.getCss());
		setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
	}
	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUIWindow.save(ch, getParentUuid(), this);		
        super.serialize(ch);  
	}


	public String getWindowName() {
		return windowName;
	}

	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}

	public void addViewPort(ViewPort viewPort) {
		viewPort.setParentUuid(this.uuid);
		this.getChildrens().add(viewPort);
	}
	@Override
	public String getUiElementType() {
		return "Window";
	}
	
	public ArrayList<UIElement> getChildrens() {
		return super.getChildrens();
	}

	public void addChild(UIElement child) {
	}
	
	
}
