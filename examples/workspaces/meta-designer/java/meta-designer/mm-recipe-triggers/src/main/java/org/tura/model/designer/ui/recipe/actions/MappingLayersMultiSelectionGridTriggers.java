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

package org.tura.model.designer.ui.recipe.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.model.designer.actions.LayerHelper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.ViewModel;

public class MappingLayersMultiSelectionGridTriggers extends AbstractGridModelTriggers {

	private static final long serialVersionUID = 1L;

	private ELResolver elResolver;

	private transient Logger logger = Logger.getLogger(MappingLayersMultiSelectionGridTriggers.class.getName());

	public MappingLayersMultiSelectionGridTriggers(ELResolver elResolver) {
		this.elResolver = elResolver;
	}

	@Override
	public void onSelect(Object obj) {
		try {

			List<MappingLayer> list = getLayers();
			MappingLayer p = ((MappingLayer) obj);

			for (MappingLayer ml : list) {
				if (ml.equals(p)) {
					return;
				}
			}

			list.add(p);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public void onUnselect(Object obj) {
		try {

			List<MappingLayer> list = getLayers();
			MappingLayer p = ((MappingLayer) obj);

			int i = 0;
			boolean found = false;
			for (MappingLayer ml : list) {
				if (ml.equals(p)) {
					found = true;
					break;
				}
				i++;
			}

			if (found) {
				list.remove(i);
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public List<Object> initSelected(List<Object> ls) {
		Map<String, Object> map = new HashMap<>();
		for (Object obj : ls) {
			ObjectControl oc = (ObjectControl) obj;
			map.put(oc.getKey(), obj);
		}

		List<Object> selected = new ArrayList<>();
		try {
			List<MappingLayer> list = getLayers();

			for (MappingLayer ml : list) {
				ObjectControl oc = (ObjectControl) ml;
				if (oc != null && !oc.isRemoved()) {
					oc = (ObjectControl) map.get(oc.getKey());
					if (oc != null) {
						selected.add(oc);
					}
				}
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

		return selected;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void toggleSelect(boolean selected) {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelRecipe}");
		GridModel model = (GridModel) viewmodel.getModel(IBeanFactory.MAPPINGLAYERSMULTISELECTOR, null, null);
		if (selected) {
			List<Object> list = (List<Object>) model.getSelected();
			for (Object obj : list) {
				onSelect(obj);
			}
		} else {
			List<Object> list = (List<Object>) model.load();
			for (Object obj : list) {
				onUnselect(obj);
			}
		}
	}

	private List<MappingLayer> getLayers() throws TuraException {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerRecipe}");
		Ingredient inredient = (Ingredient) bf.getTreeRootRecipes().getCurrentObject();

		List<MappingLayer> list = null;
		if (PreFormTrigger.VIEWLAYERS_SELECTOR_CONSTANT.equals(bf.getMappingLayerSelector())) {
			list = inredient.getVewLayer();
		}
		if (PreFormTrigger.MODELLAYERS_SELECTOR_CONSTANT.equals(bf.getMappingLayerSelector())) {
			list = inredient.getModelLayer();
		}

		return list;
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
