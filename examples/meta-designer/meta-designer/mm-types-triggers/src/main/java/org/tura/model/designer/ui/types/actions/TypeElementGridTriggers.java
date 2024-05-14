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

package org.tura.model.designer.ui.types.actions;

import java.util.HashMap;
import java.util.Map;

import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.type.Enumerator;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.repository.serialized.type.TypeReference;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.model.designer.ui.types.mmdesigner.types.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;
import org.tura.platform.uuiclient.rest.client.commands.CallFormApiCommand;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class TypeElementGridTriggers extends AbstractGridModelTriggers {

	private static final long serialVersionUID = 1L;

	private ELResolver elResolver;

	public TypeElementGridTriggers(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@Override
	public void onSelect(Object obj) {
		try {
			IViewPortHolder vh = (IViewPortHolder) elResolver.getValue("#{viewPortHolderMmdesignerTypes}");

			if (obj instanceof Type) {
				vh.setDetailPort(IViewPortHolder.DETAILPORT_TYPEDETAILS);

			}
			if (obj instanceof Enumerator) {
				vh.setDetailPort(IViewPortHolder.DETAILPORT_ENUMDETAILS);

			}

			if (obj instanceof TypeReference) {
				vh.setDetailPort(IViewPortHolder.DETAILPORT_TYPEREFDETAILS);
			}

			ResponseState responseState = CommonFunctions.getResponseState();

			CallFormApiCommand cmd = new CallFormApiCommand();
			cmd.setTrgPlugin("mmdesigner.properties");
			cmd.setTarget(org.tura.model.designer.Constants.PROPERTIES_MAIN_WINDOW);
			responseState.addCommand(cmd);

			CdiAppExchange ex = CommonFunctions.getCdiAppExchange();

			Map<String, Object> selected = new HashMap<>();
			ObjectControl oc = (ObjectControl) obj;
			;
			selected.put("path", oc.getPath());
			selected.put("class", oc.getProxyClazz().getName());
			ex.addObject("objectForProperty", selected);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
