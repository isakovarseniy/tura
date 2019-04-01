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

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.EventListener;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.event.ControlRallbackEvent;
import org.tura.platform.datacontrol.event.ControlRefreshedEvent;
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowCreatedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;
import org.tura.platform.repository.core.ObjectControl;

public class GridModel {
	private LazyDataGridModel<?> lazyModel;
	@SuppressWarnings("rawtypes")
	private DataControl dc;
	private Logger logger;
	private Boolean resetCurentPosition = false;
	private Object selected;
	private int position;

	@SuppressWarnings("rawtypes")
	public GridModel(DataControl dc, Logger logger) {
		this.dc = dc;
		this.logger = logger;

		lazyModel = new LazyDataGridModel(this);
		lazyModel.setDatacontrol(dc);
		lazyModel.setLogger(logger);

		dc.addEventLiteners(new RecordListener());

	}

	public LazyDataGridModel<?> getLazyModel() {
		return lazyModel;
	}

	public Object getSelected() {
		return selected;
	}

	public void setSelected(Object selected) {
		 this.selected = selected;
	}

	public void ajaxSelected(org.primefaces.event.SelectEvent event) {

		ObjectControl oc  = (ObjectControl) event.getObject();
		position = (int) oc.getViewModelId1();
		try {
			if (!dc.getCurrentPosition().equals(oc.getViewModelId1()) || resetCurentPosition) {
				resetCurentPosition = false;
				dc.setCurrentPosition(oc.getViewModelId1());
			}
		} catch (TuraException e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}
	}

	class RecordListener implements EventListener {

		@SuppressWarnings("rawtypes")
		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof ControlRallbackEvent ||  event instanceof ControlRefreshedEvent) {
				position = 0;
//				lazyModel = new LazyDataGridModel();
//				lazyModel.setDatacontrol((DataControl) event.getSource());
//				lazyModel.setLogger(logger);
			}
			if (event instanceof RowCreatedEvent) {
				resetCurentPosition = true;
			}
			if (event instanceof RowRemovedEvent) {
				resetCurentPosition = true;
				int max = ((DataControl) event.getSource()).getScroller().size();
				lazyModel.setRowCount(max);
				if (position == max && max != 0) {
					position = position - 1;
				}
			}
		}
	}

}
