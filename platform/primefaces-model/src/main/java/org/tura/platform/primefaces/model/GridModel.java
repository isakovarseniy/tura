/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;

public class GridModel {
	private LazyDataGridModel<?> lazyModel;
	@SuppressWarnings("rawtypes")
	private DataControl dc;
	private Logger logger;
	private Boolean resetCurentPosition = false;
	private Object[] array = new Object[] { 0, 0, null };

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl dc, Logger logger) {
		this.dc = dc;
		this.logger = logger;

		lazyModel = new LazyDataGridModel();
		lazyModel.setDatacontrol(dc);
		lazyModel.setLogger(logger);

		dc.addEventLiteners(new RecordListener());

	}

	public LazyDataGridModel<?> getLazyModel() {
		return lazyModel;
	}

	public Object getSelected() {
		return array;
	}

	public void setSelected(Object value) {
	}

	public void ajaxSelected(org.primefaces.event.SelectEvent event) {

		array = (Object[]) event.getObject();
		try {
			if (!dc.getCurrentPosition().equals(array[0])
					|| resetCurentPosition) {
				resetCurentPosition = false;
				dc.setCurrentPosition(array[0]);
			}
		} catch (TuraException e) {
			logger.info(e.getMessage());
		}
	}

	class RecordListener implements EventListener {

		@SuppressWarnings("rawtypes")
		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent
					|| event instanceof ControlRallbackEvent) {
				lazyModel = new LazyDataGridModel();
				array = new Object[] { 0, 0, null };
				lazyModel.setDatacontrol((DataControl) event.getSource());
				lazyModel.setLogger(logger);
			}
			if (event instanceof RowCreatedEvent) {
				resetCurentPosition = true;
			}
			if (event instanceof RowRemovedEvent) {
				resetCurentPosition = true;
				int max = ((DataControl) event.getSource()).getScroller()
						.size();
				if ((int) (array[0]) == max && max != 0)
					array[0] = (int) (array[0]) - 1;
			}
		}
	}

}
