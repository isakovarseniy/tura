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

package org.tura.model.designer.ui.mapper.actions;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.model.designer.actions.LayerHelper;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridModelTriggers;
import org.tura.platform.uuiclient.model.ViewModel;

public class LayersSelectionGridTrigger implements GridModelTriggers, Serializable {

	private static final long serialVersionUID = -2076752896144809889L;


    private ELResolver elResolver;
    private transient Logger logger = Logger.getLogger(LayersSelectionGridTrigger.class.getName());

    public LayersSelectionGridTrigger(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Override
    @SuppressWarnings({ "rawtypes"})
    public void onSelect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMapper}");
            DataControl dcMapper = (DataControl) bf.getMapper();

			MappingLayer p = (MappingLayer) obj;
			Mapper mapper = (Mapper) dcMapper.getCurrentObject();

			for ( MappingLayer pr :  mapper.getLayers()) {
				if (pr.equals(p)) {
					return;
				}
			}

			mapper.getLayers().add(p);
			
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @Override
    public void onUnselect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMapper}");
			Mapper mapper = (Mapper)  bf.getMapper().getCurrentObject();
			MappingLayer p = (MappingLayer) obj;

			int i = 0;
			boolean found = false;
			for ( MappingLayer pr :  mapper.getLayers()) {
				if (pr.equals(p)) {
					found = true;
					break;
				}
				i++;
			}
        	
			if (found) {
				mapper.getLayers().remove(i);
			}
			

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<Object> initSelected(List<Object> ls) {
        Map<String, Object> map = new HashMap<>();
        for (Object obj : ls) {
            ObjectControl oc = (ObjectControl) obj;
            map.put(oc.getKey(), obj);
        }

        List<Object> selected = new ArrayList<>();
        try {
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerMapper}");
            DataControl dc = (DataControl) bf.getMapper();
            Mapper mapper = (Mapper) dc.getCurrentObject();
            
            for (  MappingLayer  pr  :  mapper.getLayers()) {
            	ObjectControl  oc = (ObjectControl) pr;
				if (oc != null && !oc.isRemoved()) {
					oc = (ObjectControl) map.get(oc.getKey());
                    if ( oc != null) {
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
        ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelMapper}");
        GridModel model = (GridModel) viewmodel.getModel(IBeanFactory.MAPPINGLAYESSELECTION, null, null);
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

	@Override
	public void customizeObject(Object source, Object target) {
		
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