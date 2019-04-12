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

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.repository.core.ObjectControl;

public class GridModelMultiSelect {

    private LazyDataGridModel<?> lazyModel;
    @SuppressWarnings({ "rawtypes", "unused" })
    private DataControl dc;
    @SuppressWarnings("unused")
    private Logger logger;
    private List<Object> selected = new ArrayList<>();
    private GridModelTriggers callback;

    @SuppressWarnings("rawtypes")
    public GridModelMultiSelect(DataControl dc, Logger logger, Object callback) {
        this.dc = dc;
        this.logger = logger;
        this.callback=(GridModelTriggers) callback;

        lazyModel = new LazyDataGridModel(this);
        lazyModel.setDatacontrol(dc);
        lazyModel.setLogger(logger);

    }

    public LazyDataGridModel<?> getLazyModel() {
        return lazyModel;
    }

    public List<Object> getSelected() {
        return selected;
    }

    public void setSelected(List<Object> selected) {
        this.selected =  selected;
    }

    
    public GridModelTriggers getModelTriggers() {
        return callback;
    }
    
    public void ajaxSelected(org.primefaces.event.SelectEvent event) {
        try {
            if (callback != null) {
                ObjectControl oc = (ObjectControl) event.getObject();
                callback.onSelect(oc);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }


    public void ajaxUnSelected(org.primefaces.event.UnselectEvent event) {
        try {
            if (callback != null) {
                ObjectControl oc = (ObjectControl) event.getObject();
                callback.onUnselect(oc);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
        }

    }

    
    
}