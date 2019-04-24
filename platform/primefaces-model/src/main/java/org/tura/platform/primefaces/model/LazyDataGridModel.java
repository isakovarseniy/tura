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

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;

public class LazyDataGridModel<T> extends LazyDataModel<T> {

    private static final long serialVersionUID = -3916551980941958271L;
    @SuppressWarnings("rawtypes")
    private DataControl datacontrol;
    private java.util.logging.Logger logger;
    private GridModel gridSingleSelectModel;
    private GridModelMultiSelect gridMultiSelectModel;
    @SuppressWarnings("unused")
    private DataScrollerModel dataScrollerModel;
    private Map<String,SortMeta> sortMeta = new HashMap<>();

    
    public LazyDataGridModel(GridModel gridSingleSelectModel) {
        this.gridSingleSelectModel = gridSingleSelectModel;
    }

    public LazyDataGridModel(GridModelMultiSelect gridMultiSelectModel) {
        this.gridMultiSelectModel = gridMultiSelectModel;
    }
    
    public LazyDataGridModel(DataScrollerModel dataScrollerModel) {
        this.dataScrollerModel = dataScrollerModel;
    }

    
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
    public List load(int first, int pageSize, String sortField,
            SortOrder sortOrder, Map<String, Object> filters) {

        SortMeta sortMeta = new SortMeta();
        sortMeta.setSortField(sortField);
        sortMeta.setSortOrder(sortOrder);
        ArrayList<SortMeta> multiSortMeta = new ArrayList<>();
        multiSortMeta.add(sortMeta);

        return load(first, pageSize, multiSortMeta, filters);
    }

    private boolean initSortMeta(List<SortMeta> sort) {
        if (sort.size() == sortMeta.keySet().size()) {
            if (compareMeta(sort)) {
                return false;
            }else {
                saveMeta(sort);
                return true;
            }
            
        }else {
            saveMeta(sort);
            return true;
        }
    }
    
    
    private void saveMeta(List<SortMeta> sort) {
        sortMeta =  new HashMap<>();
        for (SortMeta meta : sort) {
            sortMeta.put(meta.getSortField(), meta);
        }
    }
    
    private boolean compareMeta(List<SortMeta> sort) {
        sortMeta =  new HashMap<>();
        for (SortMeta meta : sort) {
            SortMeta saved = sortMeta.get(meta.getSortField());
            if (saved == null) {
                return false;
            }else {
                if (!saved.equals(meta)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private List<SortMeta> filterSortMeta(List<SortMeta> sort ){
        List<SortMeta> filtered = new ArrayList<>();
        for (SortMeta meta:sort) {
            if (meta.getSortField() != null) {
                filtered.add(meta);
            }
        }
        return filtered;
    }
     
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List load(int first, int pageSize, List<SortMeta> multiSortMeta,
            Map<String, Object> filters) {
        
        List<SortMeta> filteredMultiSortMeta = filterSortMeta(multiSortMeta);

        
        ArrayList datasource = new ArrayList();
        GridPreQueryTrigger trigger = new GridPreQueryTrigger(filteredMultiSortMeta, filters, datacontrol.getPreQueryTrigger());
        try {
            datacontrol.setPreQueryTrigger(trigger);
            if (initSortMeta(filteredMultiSortMeta)) {
                datacontrol.forceRefresh();
            }
            
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
            
            if (gridSingleSelectModel != null && first == 0 && gridSingleSelectModel.getSelected() == null && datasource.size() != 0) {
                gridSingleSelectModel.setSelected(datasource.get(0));
            }
            if ( gridMultiSelectModel != null &&  datasource.size() != 0 ) {
                GridModelTriggers callback = gridMultiSelectModel.getModelTriggers();
                if ( callback != null) {
                    List<Object> selected = callback.initSelected(datasource);
                    gridMultiSelectModel.setSelected(selected);
                }
            }

            

        } catch (Exception e) {
            logger.log (  Level.SEVERE,   ExceptionUtils.getFullStackTrace( e));
        }finally{
            datacontrol.setPreQueryTrigger(trigger.getTrigger());
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
        }else {
            if (gridSingleSelectModel != null) {
                ObjectControl obj = (ObjectControl) gridSingleSelectModel.getSelected();
                if ( obj .getViewModelId1() .equals(key)) {
                    return (T) obj;
                }
            }
            if (gridMultiSelectModel != null) {
                List<Object> selectedArray = (List<Object>) gridMultiSelectModel.getSelected();
                for (Object obj : selectedArray) {
                    ObjectControl o = (ObjectControl) obj;
                    if ( o .getViewModelId1() .equals(key)) {
                        return (T) obj;
                    }
                }
            }
        }
        return null;
        
    }

    public Object getRowKey(T object) {
        ObjectControl oc = (ObjectControl) object;
        return oc.getViewModelId1();

    }

    class GridPreQueryTrigger implements PreQueryTrigger {
        private List<SortMeta> multiSortMeta;
        private Map<String, Object> filters;
        private PreQueryTrigger trigger;

        public GridPreQueryTrigger(List<SortMeta> multiSortMeta,
                Map<String, Object> filters, PreQueryTrigger trigger) {
            this.filters = filters;
            this.multiSortMeta = multiSortMeta;
            this.trigger = trigger;
        }

        public PreQueryTrigger getTrigger() {
            return trigger;
        }        
        
        @Override
        public void execute(DataControl<?> datacontrol) throws TuraException {

            try {

                List<SearchCriteria> ls = datacontrol.getSearchCriteria();

                for (String key : filters.keySet()) {
                    SearchCriteria criteria = new SearchCriteria();
                    Object value = filters.get(key);
                    criteria.setValue(value);
                    criteria.setComparator(Operator.EQ.name());
                    criteria.setName(key);
                    ls.add(criteria);
                }

                List<OrderCriteria> ord = datacontrol.getOrderCriteria();
                ord.clear();

                for (SortMeta sortField : multiSortMeta) {
                    OrderCriteria criteria = new OrderCriteria();
                    criteria.setName(sortField.getSortField());
                    if (sortField.getSortOrder().equals(SortOrder.ASCENDING))
                        criteria.setOrder(Order.ASC.name()); 
                    else
                        criteria.setOrder(Order.DESC.name()); 
                    
                    ord.add(criteria);
                }
                
                if (trigger != null)
                    trigger.execute(datacontrol);
            
                
            } catch (Exception e) {
                throw new TuraException(e);
            }

        }

    }
    
}