/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridModelTriggers;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.RoleReferenceProxy;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

public class RoleSelectionGridTriggers implements GridModelTriggers, Serializable {

	private static final long serialVersionUID = -284822349692512133L;
	private ELResolver elResolver;
    private transient Logger logger = Logger.getLogger(RoleSelectionGridTriggers.class.getName());

    public RoleSelectionGridTriggers(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void onSelect(Object obj) {
        try {
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");

            Role p = (Role) obj;
            
            DataControl dcRef = (DataControl) bf.getRoleReference();
            User user = (User) bf.getUser().getCurrentObject();

            for ( Object r : dcRef.getScroller() ) {
            	RoleReference ref = (RoleReference) r;
            	if ( ref.getRole() != null && ref.getRole().getName() != null && ref.getRole().getName().equals(p.getName()) ) {
            		return;
            	}
            	
            }
            
            dcRef.setPostCreateTrigger(new RoleRefPostCreateTrigger(user.getUsername() + "-" + p.getName()));
            RoleReferenceProxy pf = (RoleReferenceProxy) dcRef.createObject();
            pf.notifyListner();

            pf.setRole(p);
            pf.notifyListner();

            RoleReferenceArtifitialFieldsAdapter ad = new RoleReferenceArtifitialFieldsAdapter((ObjectControl) pf);
            ad.setRoleName(p.getName());

            dcRef.setPostCreateTrigger(null);
            
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public void onUnselect(Object obj) {
        try {
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            Role p = (Role) obj;

            DataControl dcHelper = (DataControl) bf.getUserHelper();
            DataControl dc = (DataControl) bf.getUser();
            User user = (User) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("username");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(user.getUsername());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();

            dcHelper.getCurrentObject();
            DataControl roleRefHelper = (DataControl) bf.getRoleReferenceHelper();
            roleRefHelper.getCurrentObject();
            int i = 0;
            boolean found = false;
            for (Object o : roleRefHelper.getScroller()) {
                RoleReference roleRef = (RoleReference) o;
                if (roleRef.getRole().equals(p)) {
                    found = true;
                    break;
                }
                i++;
            }
            if (found) {
                roleRefHelper.setCurrentPosition(i);
                roleRefHelper.removeObject();
            }

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public List<Object> initSelected( List<Object> ls ) {
        
        Map<String, Object > map =   new HashMap<>();
        for ( Object obj : ls  ) {
           ObjectControl oc = (ObjectControl) obj;    
           map.put(oc.getKey(), obj);
        }
        
        List<Object> selected = new ArrayList<>();
        try {

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");

            DataControl dcHelper = (DataControl) bf.getUserHelper();
            DataControl dc = (DataControl) bf.getUser();
            User user = (User) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("username");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(user.getUsername());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();

            dcHelper.getCurrentObject();
            DataControl roleRefHelper = (DataControl) bf.getRoleReferenceHelper();

            for (Object o : roleRefHelper.getScroller()) {
                RoleReference roleRef = (RoleReference) o;
                if (roleRef.getRole() != null) {
                    ObjectControl oc = (ObjectControl) roleRef.getRole();
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
        ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelAdministration}");
        GridModel model = (GridModel) viewmodel.getModel(AdminCallBackProducer.ROLE_SELECTION_TABLE, null, null);
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

    public class RoleRefPostCreateTrigger implements PostCreateTrigger {
        
		private static final long serialVersionUID = -1430081056037212758L;
		private String id;
        
        public RoleRefPostCreateTrigger(String id) {
            this.id=id;
        }

        @Override
        public void execute(DataControl<?> datacontrol, Object obj, Map<String, Object> attributes)
                throws TuraException {
            RoleReference ref = (RoleReference) obj;
            ref.setId(id);
        }
        
    }

	@Override
	public void customizeObject(Object source, Object target) {
		
	}
    
}