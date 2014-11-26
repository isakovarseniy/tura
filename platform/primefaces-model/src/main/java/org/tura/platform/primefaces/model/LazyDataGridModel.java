package org.tura.platform.primefaces.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

public class LazyDataGridModel<T> extends LazyDataModel<T>{

	private static final long serialVersionUID = -3916551980941958271L;
	

	public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {
        throw new UnsupportedOperationException("Lazy loading is not implemented.");
    }
    
    public List<T> load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String,Object> filters) {
        throw new UnsupportedOperationException("Lazy loading is not implemented.");
    }

    public T getRowData(String rowKey) {
        throw new UnsupportedOperationException("getRowData(String rowKey) must be implemented when basic rowKey algorithm is not used.");
    }

    public Object getRowKey(T object) {
        throw new UnsupportedOperationException("getRowKey(T object) must be implemented when basic rowKey algorithm is not used.");
    }
}
