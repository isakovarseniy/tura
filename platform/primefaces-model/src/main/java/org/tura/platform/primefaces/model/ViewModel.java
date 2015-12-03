/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.primefaces.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;

@ViewScoped
@Named("viewmodel")
public class ViewModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private transient Logger logger;
	private HashMap<String, Object> modelHolder = new HashMap<>();

	
	public static UIComponent findComponent(final String id) {

	    FacesContext context = FacesContext.getCurrentInstance(); 
	    UIViewRoot root = context.getViewRoot();
	    final UIComponent[] found = new UIComponent[1];

	    root.visitTree( VisitContext.createVisitContext(context), new VisitCallback() {     
	        @Override
	        public VisitResult visit(VisitContext context, UIComponent component) {
	            if(component.getId().equals(id)){
	                found[0] = component;
	                return VisitResult.COMPLETE;
	            }
	            return VisitResult.ACCEPT;              
	        }
	    });

	    return found[0];

	}
	
	
	
	public String getClientId(Object obj) {
		if (obj != null) {
			UIComponent uc = (UIComponent) obj;
			String path = uc.getId();
			if (uc.getClientId() != null)
				path = uc.getClientId();

			while (uc.getClientId() == null) {
				uc = uc.getParent();
				String id = uc.getId();
				if (uc.getClientId() != null)
					id = uc.getClientId();
				path = id + ":" + path;
			}

			return ":" + path;
		} else
			return "";
	}

	@SuppressWarnings({ "rawtypes" })
	public Object getModel(String modelId, String modelType, Object obj) {

		Object model = modelHolder.get(modelId);
		if (model != null)
			return model;

		if ("grid".equals(modelType))
			model = getGridModel((DataControl) obj, logger);

		if ("tree".equals(modelType))
			model = getTreeModel((TreeDataControl) obj);
		
		if ("options".equals(modelType)) {
			model = getOptionsModel((DataControl) obj);
		}

		modelHolder.put(modelId, model);
		return model;

	}

	@SuppressWarnings("rawtypes")
	private GridModel getGridModel(DataControl dc, Logger logger) {
		return new GridModel(dc, logger);
	}

	private TreeModel getTreeModel(TreeDataControl dc) {
		return new TreeModel(dc, logger);
	}

	private OptionsModel getOptionsModel(DataControl<?> dc) {
		return new OptionsModel( dc, logger );
	}

}
