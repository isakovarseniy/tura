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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;

public class MultiSelectOptionsModel extends Options<MultiSelectOptionsModel> implements Serializable{

	private static final long serialVersionUID = -7211058337292159449L;
	private List<Object> selected = null;
	private transient Logger logger = Logger.getLogger(MultiSelectOptionsModel.class.getName());
	private String modelId;


	public MultiSelectOptionsModel() {
		super ();
	}

	
	public MultiSelectOptionsModel(DataControl<?> datacontrol,  Object callback,String modelId) {
		super (datacontrol,callback);
		this.setModelId(modelId);
		datacontrol.addEventLiteners(new RecordListener());
	}


	public List<Object> getSelected() {
    	if ( selected == null) {
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
            	selected = triggres.initSelected(getOptions());
            }
    	}
        return selected;
    }

    public void setSelected(List<Object> selected) {
        this.selected =  selected;
    }
	
	
	
    public void ajaxSelected(EventDescription  event) {
        try {
    		EventParameter param = event.findParameter("selected");
    		Object obj = param.getValue();
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
                triggres.onSelect(obj);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }


    public void ajaxUnSelected(EventDescription event) {
        try {
    		EventParameter param = event.findParameter("selected");
    		Object obj = param.getValue();
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
                triggres.onUnselect(obj);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }

    public void ajaxToggleSelect(EventDescription event) {
        try {
    		EventParameter param = event.findParameter("isSelected");
    		Boolean obj = (Boolean) param.getValue();
        	
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
            	triggres.toggleSelect(obj);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }
    }
	
    
	public String getModelId() {
		return modelId;
	}


	public void setModelId(String modelId) {
		this.modelId = modelId;
	}


	class RecordListener implements EventListener , Serializable{

		private static final long serialVersionUID = 6995441434351826485L;

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof RowRemovedEvent) {
				options = null;
				selected = null;
			}
		}
	}
	
}
