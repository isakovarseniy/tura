/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;

public class TimeLineModel implements Serializable {

	private static final long serialVersionUID = 8675365206345508652L;
	private transient Logger logger = Logger.getLogger(OptionsModel.class.getName());
	private String modelId;
	private DataControl<?> datacontrol;
	private TimeLineTriggers callback;
	

	public TimeLineModel() {
	}

	public TimeLineModel(DataControl<?> datacontrol, Object callback, String modelId) {
		this.setModelId(modelId);
		this.datacontrol = datacontrol;
		this.callback = (TimeLineTriggers) callback;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public List<Object> load() {
		List<Object> options = new ArrayList<>();
		try {
			datacontrol.getCurrentObject();
			List<?> scroler = datacontrol.getScroller();

			Iterator<?> itr = scroler.iterator();
			while (itr.hasNext()) {
				Object obj = itr.next();
				if ( callback != null) {
					if ( callback.accept(obj)) {
						options.add(obj);
					}
				}else {
					options.add(obj);
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}
		return options;
	}

}
