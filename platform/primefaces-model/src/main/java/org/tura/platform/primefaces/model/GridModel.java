package org.tura.platform.primefaces.model;

import java.util.logging.Logger;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;

public class GridModel {
	private LazyDataGridModel<?> lazyModel;
	@SuppressWarnings("rawtypes")
	private DataControl dc;
	private Logger logger;

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl dc, Logger logger) {
		this.dc = dc;
		this.logger = logger;
		dc.addEventLiteners(new RecordListener());

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
			if (!dc.getCurrentPosition().equals(array[0]))
				dc.setCurrentPosition(array[0]);
		} catch (TuraException e) {
			logger.fine(e.getMessage());
		}
	}

	class RecordListener implements EventListener {

		@SuppressWarnings("rawtypes")
		@Override
		public void handleEventListenr(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof RowRemovedEvent) {
				lazyModel = new LazyDataGridModel();
				lazyModel.setDatacontrol((DataControl) event.getSource());
				lazyModel.setLogger(logger);
			}
		}

	}

}
