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

package org.tura.model.designer.ui.recipe.actions;

import java.util.ArrayList;
import java.util.List;

import org.tura.model.designer.actions.LayerHelper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;

public class MappingLayersSingleSelectionGridTriggers extends AbstractGridModelTriggers {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private ELResolver elResolver;


	public MappingLayersSingleSelectionGridTriggers(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@Override
	public List<Object> postProcessLoaded(List<Object> list) {
		List<MappingLayer> array = new ArrayList<MappingLayer>();
		for (Object obj : list) {
			array.add((MappingLayer) obj);
		}
		LayerHelper.sort(array);
		List<Object> objects = new ArrayList<Object>();
		objects.addAll(array);
		return objects;
	}
	
	
}
