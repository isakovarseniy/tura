package org.tura.platform.primefaces.model;

import java.util.logging.Logger;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class GridModel {
	private LazyDataGridModel<?> lazyModel;
	private DataControl<?> dc;
	private Logger logger;

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl<?> dc, Logger logger) {
		this.dc = dc;
		this.logger = logger;
		lazyModel = new LazyDataGridModel();
		lazyModel.setDatacontrol(dc);
		lazyModel.setLogger(logger);
	}

	public LazyDataGridModel<?> getLazyModel() {
		return lazyModel;
	}

	public void setSelected(org.primefaces.event.SelectEvent event) {
		
		Object[] array = (Object[]) event.getObject();
		try {
			dc.setCurrentPosition(array[0]);
		} catch (TuraException e) {
			logger.fine(e.getMessage());
		}
	}
}
