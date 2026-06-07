/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.tree.adapters;

import java.util.Map;

import jakarta.inject.Inject;

import org.tura.model.designer.repository.serialized.artifact.ModelQuery;
import org.tura.model.designer.repository.serialized.recipe.Query;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class QueryTriggers implements OnChangeArtificialFieldTrigger{

	private static final long serialVersionUID = 1L;

	@Inject
	ELResolver elResolver;
	
	@Inject
	ResponseState responseState;	

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return false;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		Query query = (Query) obj;
		ModelQuery mq =  query.getQueryRef();
		String name = null;
		if ( mq != null) {
			name = mq.getName();
		}
		return new Object[] {name};

	}


}
