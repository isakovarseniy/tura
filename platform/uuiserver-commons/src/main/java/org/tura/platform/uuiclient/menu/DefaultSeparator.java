/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.rest.DataUpdateRequest;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.UuiElement;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;


public class DefaultSeparator extends UuiElement implements Separator, Serializable {

	private static final long serialVersionUID = -6501082807931526223L;
	
	private String id;
    private String title;
    private String style;
    private String styleClass;
    private boolean rendered = true;
	private boolean separator = true;
	private String clazz = DefaultSeparator.class.getName();

    
    public String getId() {
        return id;
    }

	public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public boolean isSeparator() {
		return separator;
	}

	public void setSeparator(boolean separator) {
		this.separator = separator;
	}
    
    
	@Override
	public void initContext(ELResolver elResolver, ResponseState responseState) throws Exception {
		
	}

	@Override
	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request, ResponseState responseState,
			List<EventDescription> eventsToFire) throws Exception {
		return this;
	}

	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {
		
	}
}
