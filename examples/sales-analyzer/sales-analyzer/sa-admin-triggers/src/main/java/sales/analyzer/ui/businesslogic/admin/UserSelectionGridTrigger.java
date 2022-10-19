/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package sales.analyzer.ui.businesslogic.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridModelTriggers;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.CityRefeenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.StateReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CityRefeenceProxy;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.db.StateReferenceProxy;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class UserSelectionGridTrigger  implements GridModelTriggers, Serializable{

	private static final long serialVersionUID = -3786120605039295723L;
	private ELResolver elResolver;
    private transient Logger logger = Logger.getLogger(UserSelectionGridTrigger.class.getName());

    
    public UserSelectionGridTrigger(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Override
    public void onSelect(Object obj) {
        IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
        if( bf.getUserSwitch().equals(ActionsLocation.STATE) ) {
            onSelectStateUsers(obj);
        }else {
            onSelectCityUsers(obj);
        }
    }


    @Override
    public void onUnselect(Object obj) {
        IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
        if( bf.getUserSwitch().equals(ActionsLocation.STATE) ) {
            onUnSelectStateUsers(obj);
        }else {
            onUnSelectCityUsers(obj);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void toggleSelect(boolean selected) {
        ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelAdministration}");
        GridModel model = (GridModel) viewmodel.getModel(AdminCallBackProducer.USER_SELECTION_TABLE, null, null);
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

    
    @SuppressWarnings("rawtypes")
    private void onSelectCityUsers(Object obj) {
        try {
            
            IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            User p = (User) obj;
            
            DataControl  dc  =  (DataControl) bf.getCity();
            City city = (City) dc.getCurrentObject();
			CpaRepository repository = dc.getPager().getRepository();
            
            CityRefeenceProxy cityRef = (CityRefeenceProxy) repository.create(CityRefeence.class);
            
            p.getCityRefeence().add(cityRef);
            cityRef.setCityId(city.getObjId());
            CityRefeenceArtifitialFieldsAdapter af = new CityRefeenceArtifitialFieldsAdapter(cityRef);
            af.setFirstName(p.getFirstName());
            af.setLastName(p.getLastName());
            af.setUserName(p.getUsername());
            
            dc = (DataControl) bf.getCityRefeence();
            dc.forceRefresh();
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    @SuppressWarnings("rawtypes")
    private void onSelectStateUsers(Object obj) {
        try {
            IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            User p = (User) obj;
            DataControl  dc  =  (DataControl) bf.getState();
            
            State state = (State) dc.getCurrentObject();
			CpaRepository repository = dc.getPager().getRepository();

            StateReferenceProxy stateRef = (StateReferenceProxy) repository.create(StateReference.class);
            
            p.getStateReference().add(stateRef);
            stateRef.setStateId(state.getObjId());
            StateReferenceArtifitialFieldsAdapter af = new StateReferenceArtifitialFieldsAdapter(stateRef);
            af.setFirstName(p.getFirstName());
            af.setLastName(p.getLastName());
            af.setUserName(p.getUsername());
            
            dc = (DataControl) bf.getStateReference();
            dc.forceRefresh();
            
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }
    
    
    @SuppressWarnings("rawtypes")
	private void onUnSelectCityUsers(Object o) {
        try {
            IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            User user = (User) o;
            
            int i = 0;
            boolean found = false;
            for (Object obj : user.getCityRefeence()) {
                CityRefeence cityRef = (CityRefeence) obj;
                if (cityRef.getUser() != null &&  cityRef.getUser().getId().equals(user.getId()))  {
                    found = true;
                    break;
                }
            }
            if (found) {
            	user.getCityRefeence().remove(i);
            	DataControl dc = (DataControl) bf.getCityRefeence();
                dc.forceRefresh();
            	
            }
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    @SuppressWarnings("rawtypes")
	private void onUnSelectStateUsers(Object o) {
        try {
            IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            User user = (User) o;
            
            int i = 0;
            boolean found = false;
            for (Object obj : user.getStateReference()) {
                StateReference stateRef = (StateReference) obj;
                if (stateRef.getUser() != null && stateRef.getUser().getId().equals(user.getId()))  {
                    found = true;
                    break;

                }
            }
            if (found) {
            	 user.getStateReference().remove(i);
            	 DataControl dc = (DataControl) bf.getStateReference();
                 dc.forceRefresh();
            }
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    @Override
    public List<Object> initSelected(List<Object> ls) {
        Map<String, Object > map =   new HashMap<>();
        for ( Object obj : ls  ) {
           ObjectControl oc = (ObjectControl) obj;    
           map.put(oc.getKey(), obj);
        }
        List<Object> selected = new ArrayList<>();
        try {
            IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            if( bf.getUserSwitch() != null && bf.getUserSwitch().equals(ActionsLocation.STATE) ) {
                initSelectedStateUsers(bf,map,selected);
            }else {
                initSelectedCityUsers(bf,map,selected);
            }
        
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
        return selected;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initSelectedStateUsers(IBeanFactory bf,Map<String, Object > map,List<Object> selected   ) throws TuraException {
        DataControl dcRef = (DataControl) bf.getStateReference();
        List<Object > ls =   dcRef.getScroller();
        for (Object o : ls) {
            StateReference ref = (StateReference) o;
            if (ref.getUser() !=null ) {
                ObjectControl oc = (ObjectControl) ref.getUser();
                oc = (ObjectControl) map.get(oc.getKey());
                if ( oc != null) {
                    selected.add(oc);
                }
                
                
            }
        }
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void initSelectedCityUsers(IBeanFactory bf,Map<String, Object > map,List<Object> selected ) throws TuraException {
        DataControl dcRef = (DataControl) bf.getCityRefeence();
        List<Object > ls =   dcRef.getScroller();
        for (Object o : ls) {
            CityRefeence ref = (CityRefeence) o;
            if (ref.getUser() !=null ) {
                ObjectControl oc = (ObjectControl) ref.getUser();
                oc = (ObjectControl) map.get(oc.getKey());
                if ( oc != null) {
                    selected.add(oc);
                }
            }
        }
        
    }

	@Override
	public void customizeObject(Object source, Object target) {
		
	}
    
    
    
}