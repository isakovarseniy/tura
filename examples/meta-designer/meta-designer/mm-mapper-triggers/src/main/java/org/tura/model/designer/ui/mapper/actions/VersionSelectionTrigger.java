/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.mapper.actions;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omnifaces.util.Beans;
import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.datacontrol.IBeanFactory;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;

public class VersionSelectionTrigger extends AbstractGridModelTriggers {

	private static final long serialVersionUID = 1L;

	private transient Logger logger = Logger.getLogger(VersionSelectionTrigger.class.getName());

	
	@Override
	public void onSelect(Object obj) {
		try {
			CdiAppExchange ex = Beans.getReference(CdiAppExchange.class);
			IBeanFactory bf = Beans.getReference(IBeanFactory.class);
			ObjectControl oc = (ObjectControl) bf.getVersion().getCurrentObject();
			Map<String, Object> selected = new HashMap<>();
			selected.put("path", oc.getPath());
			selected.put("class", oc.getProxyClazz().getName());
			ex.addObject("selectedObject", selected);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

}
