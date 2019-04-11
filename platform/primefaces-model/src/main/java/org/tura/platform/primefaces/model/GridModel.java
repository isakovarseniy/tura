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

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.repository.core.ObjectControl;

public class GridModel {
    private LazyDataGridModel<?> lazyModel;
    @SuppressWarnings("rawtypes")
    private DataControl dc;
    private Logger logger;
    private Object selected;
    private Object callback;

    @SuppressWarnings("rawtypes")
    public GridModel(DataControl dc, Logger logger , Object callback) {
        this.dc = dc;
        this.logger = logger;
        this.callback = callback;

        lazyModel = new LazyDataGridModel(this);
        lazyModel.setDatacontrol(dc);
        lazyModel.setLogger(logger);

        dc.addEventLiteners(new RecordListener());

    }

    public LazyDataGridModel<?> getLazyModel() {
        return lazyModel;
    }

    public Object getSelected() {
        return selected;
    }

    public void setSelected(Object selected) {
        this.selected = selected;
    }

    public void ajaxSelected(org.primefaces.event.SelectEvent event) {

        ObjectControl oc = (ObjectControl) event.getObject();
        try {
            if (!dc.getCurrentPosition().equals(oc.getViewModelId1())) {
                dc.setCurrentPosition(oc.getViewModelId1());
            }
        } catch (TuraException e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }
    }

    class RecordListener implements EventListener {

        @SuppressWarnings("rawtypes")
        @Override
        public void handleEventListener(Event event) throws TuraException {
            if (event instanceof ControlRallbackEvent || event instanceof ControlRefreshedEvent) {

                DataControl dc = (DataControl) event.getSource();
                ObjectControl obj = (ObjectControl) selected;
                int index  = 0; 
                if (obj !=  null &&  obj.getViewModelId1() != null) {
                    index = (int) obj.getViewModelId1();
                    int max = ((DataControl) event.getSource()).getScroller().size();
                    if (index == max) {
                        index = max - 1;
                    }
                }
                dc.setCurrentPosition(index);
                selected = event.getSource().getCurrentObject();
                obj = (ObjectControl) selected;
                obj.setViewModelId1( index);

            }

            if (event instanceof MasterRowChangedEvent) {
                selected = event.getSource().getCurrentObject();
            }
            if (event instanceof RowCreatedEvent) {
                selected = event.getSource().getCurrentObject();
            }
            if (event instanceof RowRemovedEvent) {
                selected = event.getSource().getCurrentObject();
            }
        }
    }


}