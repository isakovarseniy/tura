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

import org.tura.model.designer.repository.serialized.application.ApplicationMapper;
import org.tura.model.designer.repository.serialized.mapper.Mappers;
import  org.tura.model.designer.repository.serialized.recipe.UsingMappers;
import org.tura.model.designer.ui.recipe.mmdesigner.recipe.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.AbstractGridModelTriggers;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.ViewModel;

public class MapperSelectionGridTriggers extends AbstractGridModelTriggers{

	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private ELResolver elResolver;
	
	
	private transient Logger logger = Logger.getLogger(MapperSelectionGridTriggers.class.getName());
	
	public MapperSelectionGridTriggers (ELResolver elResolver){
		this.elResolver = elResolver;
	}
	
	
    @Override
    public void onSelect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerRecipe}");
			UsingMappers usingMappers = (UsingMappers) bf.getTreeRootRecipes().getCurrentObject();
			Mappers p = ((ApplicationMapper) obj).getMapper();

			for ( Mappers mp  :  usingMappers.getMappers()) {
				if (mp.equals(p)) {
					return;
				}
			}

			usingMappers.getMappers().add(p);
			
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @Override
    public void onUnselect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerRecipe}");
			UsingMappers usingMappers = (UsingMappers) bf.getTreeRootRecipes().getCurrentObject();
			Mappers p = ((ApplicationMapper) obj).getMapper();

			int i = 0;
			boolean found = false;
			for ( Mappers pr  :  usingMappers.getMappers()) {
				if (pr.equals(p)) {
					found = true;
					break;
				}
				i++;
			}
        	
			if (found) {
				usingMappers.getMappers().remove(i);
			}
			

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @Override
    public List<Object> initSelected(List<Object> ls) {
        Map<String, Object> map = new HashMap<>();
        for (Object obj : ls) {
            ApplicationMapper am = (ApplicationMapper) obj;
            ObjectControl oc = (ObjectControl) am.getMapper();
            map.put(oc.getKey(), obj);
        }

        List<Object> selected = new ArrayList<>();
        try {
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryMmdesignerRecipe}");
			UsingMappers usingMappers = (UsingMappers) bf.getTreeRootRecipes().getCurrentObject();
            
            for (  Mappers  pr  :  usingMappers.getMappers()) {
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
        ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelRecipe}");
        GridModel model = (GridModel) viewmodel.getModel(IBeanFactory.MAPPERMULTISELECTOR, null, null);
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


}
