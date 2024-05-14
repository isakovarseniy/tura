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

package org.tura.model.designer.ui.tree.adapters;

import java.util.Map;

import org.tura.model.designer.repository.serialized.artifact.Option;
import org.tura.model.designer.repository.serialized.artifact.TechLeafProxy;
import org.tura.model.designer.repository.serialized.artifact.Technology;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

public class MappingTecnologiyTriggers implements OnChangeArtificialFieldTrigger {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return false;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		MappingTecnologiy dt = (MappingTecnologiy) obj;
		if ("TECHNOLOGYVALUE".equals(field)) {
			Option option = dt.getValueRef();
			String technologyValue = null;
			if (option != null) {
				TechLeafProxy l1 = (TechLeafProxy) option.getValue();
				technologyValue = CommonFunctions.TechLeaf2String(l1);
			}
			return new Object[] { technologyValue };
		}
		if ("OPTIONNAME".equals(field)) {
			Technology technology = dt.getTechRef();
			String optionName = null;
			if (technology != null) {
				optionName = technology.getName();
			}
			return new Object[] { optionName };
		}
		return null;
	}

}
