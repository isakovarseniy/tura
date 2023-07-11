/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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



public class DefaultMenuItem extends UuiElement implements MenuElement,   Serializable {

	private static final long serialVersionUID = 3331702159629836992L;
	
	private String id;
    private String icon;
    private String iconPos;
    private String label;
    private boolean disabled;
    private String style;
    private String styleClass;
    private String url;
    private boolean rendered = true;
    private String containerStyle;
    private String containerStyleClass;
	private String clazz = DefaultMenuItem.class.getName();
    
    public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	private List<EventDescription> events = new ArrayList<EventDescription>();

    public List<EventDescription> getEvents() {
		return events;
	}

	public void setEvents(List<EventDescription> events) {
		this.events = events;
	}

	public DefaultMenuItem() {
    }

    public DefaultMenuItem(String label) {
    	this.setLabel(label);
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public String getIconPos() {
        return iconPos;
    }

    public void setIconPos(String iconPos) {
        this.iconPos = iconPos;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
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

    public String getHref() {
        return url;
    }

    public void setHref(String href) {
        this.url = href;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean shouldRenderChildren() {
        return false;
    }

    public boolean isDynamic() {
        return true;
    }

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public String getContainerStyle() {
        return containerStyle;
    }

    public void setContainerStyle(String containerStyle) {
        this.containerStyle = containerStyle;
    }

    public String getContainerStyleClass() {
        return containerStyleClass;
    }

    public void setContainerStyleClass(String containerStyleClass) {
        this.containerStyleClass = containerStyleClass;
    }

    public String getClientId() {
        return this.id;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void initContext(ELResolver elResolver, ResponseState responseState) throws Exception {
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request,ResponseState responseState,
			List<EventDescription> eventsToFire) throws Exception {
		
	       List<Object> events = (List<Object>) map.get("events");
	       for ( Object child : events) {
	    	   Map <String, Object> chMap = (Map<String, Object>) child;
	    	   EventDescription event = new EventDescription();
	    	   getEvents().add((EventDescription)event.restoreContext(chMap,request,responseState,eventsToFire));
	       }

		return this;
	}

	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {
		
	}


}