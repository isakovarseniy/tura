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
import org.tura.platform.datacontrol.event.Event;
import org.tura.platform.datacontrol.event.MasterRowChangedEvent;
import org.tura.platform.datacontrol.event.RowRemovedEvent;

public class OptionsModel  extends Options<OptionsModel> {


	public OptionsModel(DataControl<?> datacontrol, Logger logger, Object callback) {
		super(datacontrol,logger,callback);
		datacontrol.addEventLiteners(new RecordListener());
	}

	public OptionsModel setSelectOption(String expression) {
		Object value = datacontrol.getElResolver().getValue("#{" + expression + "}");
		try {
			for (int i = 0; i < options.size(); i++) {
				Object[] row = options.get(i);
				if (row[1].equals(value)) {
					datacontrol.setCurrentPosition(i);
					break;
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}
		return this;
	}

	public OptionsModel setAction(String expression) {
		datacontrol.getElResolver().getValue("#{" + expression + "}");
		return this;
	}

	public void changeValueListener() {
	}

	class RecordListener implements EventListener {

		@Override
		public void handleEventListener(Event event) throws TuraException {
			if (event instanceof MasterRowChangedEvent || event instanceof RowRemovedEvent) {
				options = null;
			}
		}
	}

}