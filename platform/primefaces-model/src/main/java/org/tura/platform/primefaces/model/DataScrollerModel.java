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

import java.util.logging.Logger;

import org.tura.platform.datacontrol.DataControl;

public class DataScrollerModel {

    private LazyDataGridModel<?> lazyModel;
    @SuppressWarnings("unused")
    private Logger logger;
    
    
    @SuppressWarnings("rawtypes")
    public DataScrollerModel(DataControl dc, Logger logger, Object callback) {
        this.logger = logger;

        lazyModel = new LazyDataGridModel(this);
        lazyModel.setDatacontrol(dc);
        lazyModel.setLogger(logger);

    }

    
    public LazyDataGridModel<?> getLazyModel() {
        return lazyModel;
    }
    
    
    
}