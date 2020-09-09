/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.tura.platform.uuiclient.menu;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.DataUpdateRequest;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.UuiElement;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class DefaultSubMenu extends UuiElement implements Submenu, Serializable {

	private static final long serialVersionUID = 4498503375508020979L;
	
	private String id;
    private String style;
    private String styleClass;
    private String icon;
    private String label;
    private List<MenuElement> items;
    private boolean rendered = true;
    private boolean expanded = false;
	private String clazz = DefaultSubMenu.class.getName();

    
    public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public DefaultSubMenu() {
        items = new ArrayList<MenuElement>();
    }

    public DefaultSubMenu(String label) {
        this.label = label;
        items = new ArrayList<MenuElement>();
    }

    public DefaultSubMenu(String label, String icon) {
        this.label = label;
        this.icon = icon;
        items = new ArrayList<MenuElement>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyleClass() {
        return styleClass;
    }

    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<MenuElement> getItems() {
        return items;
    }

    public void setItems(List<MenuElement> elements) {
        this.items = elements;
    }

    public int getElementsCount() {
        return (items == null) ? 0 : items.size();
    }

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public Object getParent() {
        return null;
    }

    public void addItem(MenuElement element) {
        items.add(element);
    }

    public String getClientId() {
        return this.id;
    }

	@Override
	public void initContext(ELResolver elResolver, ResponseState responseState) throws Exception {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request, ResponseState responseState,
			List<EventDescription> eventsToFire) throws Exception {

		List<Object> childrens = (List<Object>) map.get("items");
		for (Object child : childrens) {
			Map<String, Object> chMap = (Map<String, Object>) child;
			
			String className = (String) chMap.get("clazz");
			Class<MenuElement> clazz = (Class<MenuElement>) Class.forName(className);
			MenuElement uie = clazz.getDeclaredConstructor().newInstance();
			uie.restoreContext(chMap, request, responseState, eventsToFire);
			this.items.add(uie);
			
		}
		return this;
	}

	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {
		
	}
}
