/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;

public class ViewModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private  Logger logger = Logger.getLogger(ViewModel.class.getName());
    private HashMap<String, Object> modelHolder = new HashMap<>();
    private CallbackProducer  callbackProducer;

    
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
    
    public void setCallBackProducer( CallbackProducer  callbackProducer ) {
    	this.callbackProducer = callbackProducer;
    }
    

    @SuppressWarnings({ "rawtypes" })
    public Object getModel(String modelId, String modelType, Object obj) {

        Object model = modelHolder.get(modelId);
        if (model != null) {
            return model;
        }
        Object callback = null;
        if ( callbackProducer != null ) {
        	callback = callbackProducer.getCallBackObject(modelId);
        }

        if ("gridSingleSelect".equals(modelType)) {
            model = getGridModelSingleSelect((DataControl) obj, logger,callback);
        }

        if ("gridMultiSelect".equals(modelType)) {
            model = getGridModelMultiSelect((DataControl) obj, logger,callback);
        }
        
        
        if ("tree".equals(modelType)) {
            model = getTreeModel((TreeDataControl) obj,callback);
        }
        
        if ("options".equals(modelType)) {
            model = getOptionsModel((DataControl) obj,callback);
        }

        if ("dataScroller".equals(modelType)) {
            model = getDataScrollerModel((DataControl) obj,callback);
        }
        
        if ("multiSelectOptions".equals(modelType)) {
            model = getMultiSelectOptionsModel((DataControl) obj,callback);
        }
        
        modelHolder.put(modelId, model);
        return model;

    }

	private Object getMultiSelectOptionsModel(DataControl dc, Object callback) {
        return new MultiSelectOptionsModel(dc, logger,callback);
	}

	@SuppressWarnings("rawtypes")
    private Object getDataScrollerModel(DataControl dc, Object callback) {
        return new DataScrollerModel(dc, logger,callback);
	}

	@SuppressWarnings("rawtypes")
    private GridModel getGridModelSingleSelect(DataControl dc, Logger logger,Object callback) {
        return new GridModel(dc, logger,callback);
    }
    
    @SuppressWarnings("rawtypes")
    private GridModelMultiSelect getGridModelMultiSelect(DataControl dc, Logger logger,Object callback) {
        return new GridModelMultiSelect(dc, logger,callback);
    }
    

    private TreeModel getTreeModel(TreeDataControl dc,Object callback) {
        return new TreeModel(dc, logger,callback);
    }

    private OptionsModel getOptionsModel(DataControl<?> dc,Object callback) {
        return new OptionsModel( dc, logger,callback );
    }

    
    
    public boolean checkIfModelExists(String modelId) {
        return modelHolder.containsKey(modelId);
    }
    
}