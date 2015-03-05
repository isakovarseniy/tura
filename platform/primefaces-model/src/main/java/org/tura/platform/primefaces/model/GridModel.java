package org.tura.platform.primefaces.model;

import java.util.logging.Logger;

import org.tura.platform.datacontrol.ChangeRecordListener;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.TuraException;

public class GridModel {
	private LazyDataGridModel<?> lazyModel;
	@SuppressWarnings("rawtypes")
	private DataControl dc;
	private Logger logger;

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl dc, Logger logger) {
		this.dc = dc;
		this.logger = logger;
		dc.addMusterCurrentRecordChageLiteners(new RecordListener());

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

	class RecordListener implements ChangeRecordListener {

		@Override
		@SuppressWarnings("rawtypes")
		public void handleChangeRecord(IDataControl dc, Object newCurrentObject)
				throws TuraException {
			lazyModel = new LazyDataGridModel();
			lazyModel.setDatacontrol((DataControl) dc);
			lazyModel.setLogger(logger);
		}

	}

}
