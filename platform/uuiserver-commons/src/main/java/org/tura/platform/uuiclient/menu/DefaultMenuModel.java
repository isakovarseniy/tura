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

public class DefaultMenuModel extends UuiElement implements MenuModel, Serializable {

	private static final long serialVersionUID = -7932907679645013193L;

	public final static String ID_SEPARATOR = "_";

    private List<MenuElement> items;
	private String clazz = DefaultMenuModel.class.getName();
    
    
    
    public String getClazz() {
		return clazz;
	}


	public void setClazz(String clazz) {
		this.clazz = clazz;
	}


	public DefaultMenuModel() {
        items = new ArrayList<MenuElement>();
    }
	

    public void addItem(MenuElement element) {
        items.add(element);
    }

    public List<MenuElement> getItems() {
        return items;
    }


	@Override
    public void generateUniqueIds() {
        this.generateUniqueIds(getItems(), null);
    }

    private void generateUniqueIds(List<MenuElement> elements, String seed) {
        if (elements == null || elements.isEmpty()) {
            return;
        }

        int counter = 0;

        for (MenuElement element : elements) {
            String id = (seed == null) ? String.valueOf(counter++) : seed + ID_SEPARATOR + counter++;
            element.setId(id);

            if (element instanceof MenuGroup) {
                generateUniqueIds(((MenuGroup) element).getItems(), id);
            }
        }
    }
	
    
	@SuppressWarnings("unchecked")
	@Override
	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request,ResponseState responseState,
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
	public void initContext(ELResolver elResolver, ResponseState responseState) throws Exception {
		
	}


	@Override
	public void applyContext(ELResolver elResolver,ResponseState responseState) throws Exception {
		
	}
    
	
}
