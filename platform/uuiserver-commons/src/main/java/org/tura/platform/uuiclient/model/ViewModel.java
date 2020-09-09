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

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.util.HashMap;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.TreeDataControl;

public class ViewModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashMap<String, Object> modelHolder = new HashMap<>();
    private CallbackProducer  callbackProducer;

    
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
            model = getGridModelSingleSelect((DataControl) obj,callback,modelId);
        }

        if ("gridMultiSelect".equals(modelType)) {
            model = getGridModelMultiSelect((DataControl) obj, callback,modelId);
        }
        
        
        if ("tree".equals(modelType)) {
            model = getTreeModel((TreeDataControl) obj,callback,modelId);
        }
        
        if ("options".equals(modelType)) {
            model = getOptionsModel((DataControl) obj,callback,modelId);
        }

        if ("dataScroller".equals(modelType)) {
            model = getDataScrollerModel((DataControl) obj,callback,modelId);
        }
        
        if ("multiSelectOptions".equals(modelType)) {
            model = getMultiSelectOptionsModel((DataControl) obj,callback,modelId);
        }
        
        modelHolder.put(modelId, model);
        return model;

    }

	@SuppressWarnings("rawtypes")
	private Object getMultiSelectOptionsModel(DataControl dc, Object callback,String modelId) {
        return new MultiSelectOptionsModel(dc, callback,modelId);
	}

	@SuppressWarnings("rawtypes")
    private Object getDataScrollerModel(DataControl dc, Object callback,String modelId) {
        return new GridModel(dc, callback,GridType.NoSelection,modelId);
	}

	@SuppressWarnings("rawtypes")
    private GridModel getGridModelSingleSelect(DataControl dc, Object callback,String modelId) {
        return new GridModel(dc, callback,GridType.SingleSelect,modelId);
    }
    
    @SuppressWarnings("rawtypes")
    private GridModel getGridModelMultiSelect(DataControl dc,Object callback,String modelId) {
        return new GridModel(dc, callback,GridType.MultiSelect,modelId);
    }
    

    private TreeModel getTreeModel(TreeDataControl dc,Object callback,String modelId) {
        return new TreeModel(dc, callback,modelId);
    }

    private OptionsModel getOptionsModel(DataControl<?> dc,Object callback,String modelId) {
        return new OptionsModel( dc, callback ,modelId);
    }

    
    
    public boolean checkIfModelExists(String modelId) {
        return modelHolder.containsKey(modelId);
    }
    
}