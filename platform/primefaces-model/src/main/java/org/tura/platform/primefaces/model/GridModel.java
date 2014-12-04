package org.tura.platform.primefaces.model;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public abstract class GridModel {
	private  LazyDataGridModel<?> lazyModel ;
	public abstract DataControl<?> getDataControl();
	public abstract Logger getLogger();

	
	public LazyDataGridModel<?> getLazyModel() {
		return lazyModel;
	}
	
	public void setSelected(Object obj) {
		Object[] array = (Object[]) obj;
		try {
			getDataControl().setCurrentPosition(array[0]);
		} catch (TuraException e) {
			getLogger().fine(e.getMessage());
		}
    }	
	
    @SuppressWarnings("rawtypes")
	@PostConstruct
    public void init() {
        lazyModel = new LazyDataGridModel();
        lazyModel.setDatacontrol(getDataControl());
        lazyModel.setLogger(getLogger());
    }
}
