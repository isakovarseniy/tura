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
import java.util.Map;
import java.util.logging.Level;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.repository.core.ObjectControl;

public class LazyDataScrollerModel<T>  extends LazyDataModel<T> {

    private static final long serialVersionUID = -3916551980941958271L;
    @SuppressWarnings("rawtypes")
    private DataControl datacontrol;
    private java.util.logging.Logger logger;
    
    public int getRowCount() {
        return datacontrol.getScroller().size();
    }

    @SuppressWarnings("rawtypes")
    public DataControl getDatacontrol() {
        return datacontrol;
    }

    @SuppressWarnings("rawtypes")
    public void setDatacontrol(DataControl datacontrol) {
        this.datacontrol = datacontrol;
    }

    public java.util.logging.Logger getLogger() {
        return logger;
    }

    public void setLogger(java.util.logging.Logger logger) {
        this.logger = logger;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {

        SortMeta sortMeta = new SortMeta();
        sortMeta.setSortField(sortField);
        sortMeta.setSortOrder(sortOrder);
        ArrayList<SortMeta> multiSortMeta = new ArrayList<>();
        multiSortMeta.add(sortMeta);

        return load(first, pageSize, multiSortMeta, filters);
    }

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List load(int first, int pageSize, List<SortMeta> multiSortMeta,Map<String, Object> filters) {
        ArrayList datasource = new ArrayList();
        try {
            
            datacontrol.getCurrentObject();
            List<?> scroler = datacontrol.getScroller();
            int j = first + pageSize;
            if ( j >= scroler.size())
                j = scroler.size();

            for (int i = first ; i < j; i++) {
                if (scroler.get(i) != null) {
                    //Element could be null in case random delete
                    // Size of scroller will be adjusted only after 
                    //scroler.get(i) operation
                    ObjectControl oc = (ObjectControl) scroler.get(i);
                    oc.setViewModelId1(i);
                    datasource.add(oc);
                }
            }
        } catch (Exception e) {
            logger.log (  Level.SEVERE,   ExceptionUtils.getFullStackTrace( e));
        }
        
        return datasource;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public T getRowData(String rowKey) {
        Integer key = new Integer(rowKey);
        List data = this.getWrappedData();
        if ( data == null || data.size() == 0) {
            return null;
        }
        int minIndex = (int) (( ObjectControl)data.get(0)).getViewModelId1();
        int maxIndex = (int) (( ObjectControl)data.get(data.size()-1 )).getViewModelId1();
        
        if (  key >=  minIndex && key<=maxIndex) {
            int index  = (key % getPageSize());
            ObjectControl    obj = (ObjectControl) (((List)this.getWrappedData()).get(index));
            if ( obj .getViewModelId1() .equals(key)) {
                return (T) obj;
            }
            throw new RuntimeException("Wrong object");
        }
        return null;
        
    }

    public Object getRowKey(T object) {
        ObjectControl oc = (ObjectControl) object;
        return oc.getViewModelId1();

    }


    }
    
