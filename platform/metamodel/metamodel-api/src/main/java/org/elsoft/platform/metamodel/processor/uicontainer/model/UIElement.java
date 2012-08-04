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
import java.util.Iterator;
import java.util.UUID;

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.processor.CommandHandler;

public abstract class UIElement extends PersistentInterface {

	private String css;
	private String cssClass;
	private ArrayList<UIElement> childrens = new ArrayList<UIElement>();
	private String uuid = UUID.randomUUID().toString();
	private HashMap<String,String> propertiesExtender = new HashMap<String,String>();

	public abstract String getUiElementType();
	
	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	protected ArrayList<UIElement> getChildrens() {
		return childrens;
	}

	protected void addChild(UIElement child) {
		this.childrens.add(child);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {

		Iterator<UIElement> itr = childrens.iterator();
		while (itr.hasNext()){
			UIElement element = itr.next();
			element.serialize(ch);
		}
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public HashMap<String,String> getPropertiesExtender() {
		return propertiesExtender;
	}

	public void setPropertiesExtender(HashMap<String,String> propertiesExtender) {
		this.propertiesExtender = propertiesExtender;
	}

	
}
