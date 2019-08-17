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

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.primefaces.event.ToggleSelectEvent;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.repository.core.ObjectControl;

public class MultiSelectOptionsModel extends Options<MultiSelectOptionsModel>{

    private List<String> selected = null;

	public MultiSelectOptionsModel(DataControl<?> datacontrol, Logger logger, Object callback) {
		super (datacontrol,logger,callback);
		datacontrol.addEventLiteners(new RecordListener());
	}


    public List<String> getSelected() {
    	if ( selected == null) {
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
            	triggres.initSelected(getOptions());
            }
    	}
        return selected;
    }

    public void setSelected(List<String> selected) {
        this.selected =  selected;
    }
	
	
	
    public void ajaxSelected(org.primefaces.event.SelectEvent event) {
        try {
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
                ObjectControl oc = (ObjectControl) event.getObject();
                triggres.onSelect(oc);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }


    public void ajaxUnSelected(org.primefaces.event.UnselectEvent event) {
        try {
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
                ObjectControl oc = (ObjectControl) event.getObject();
                triggres.onUnselect(oc);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }

    public void ajaxToggleSelect(ToggleSelectEvent event) {
        try {
            if (callback != null) {
            	OptionsModelTrigger triggres = (OptionsModelTrigger) callback;
            	triggres.toggleSelect(event.isSelected());
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }
    }
	
	class RecordListener implements EventListener {

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof RowRemovedEvent) {
				options = null;
				selected = null;
			}
		}
	}
	
}
