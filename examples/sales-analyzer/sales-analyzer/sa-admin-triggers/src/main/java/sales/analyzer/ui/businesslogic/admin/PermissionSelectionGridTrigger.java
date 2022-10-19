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
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridModelTriggers;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.keycloak.Role;

public class PermissionSelectionGridTrigger implements GridModelTriggers, Serializable {

	private static final long serialVersionUID = -2076752896144809889L;


	public static String QUERY_PERMISSION = "SELECT * FROM org.tura.salesanalyzer.serialized.db.PermissionReferences WHERE permission.objId = :objId";

	
    private ELResolver elResolver;
    private transient Logger logger = Logger.getLogger(PermissionSelectionGridTrigger.class.getName());

    public PermissionSelectionGridTrigger(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Override
    @SuppressWarnings({ "rawtypes"})
    public void onSelect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dcRole = (DataControl) bf.getRole();
			CpaRepository repository = dcRole.getPager().getRepository();

			Permission p = (Permission) obj;
			Role role = (Role) dcRole.getCurrentObject();

			for ( PermissionReferences pr :  role.getPermissionReferences()) {
				if (pr.getPermission().equals(p)) {
					return;
				}
			}
			
			PermissionReferences permRef = repository.create(PermissionReferences.class);
			role.getPermissionReferences().add(permRef);
			permRef.setPermission(p);
			
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public void onUnselect(Object obj) {
        try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			Role role = (Role)  bf.getRole().getCurrentObject();
			Permission p = (Permission) obj;

			int i = 0;
			boolean found = false;
			for ( PermissionReferences pr :  role.getPermissionReferences()) {
				if (pr.getPermission().equals(p)) {
					found = true;
					break;
				}
				i++;
			}
        	
			if (found) {
				role.getPermissionReferences().remove(i);
			}
			DataControl dc =    (DataControl) bf.getRoleReference();
			dc.forceRefresh();

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
            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dc = (DataControl) bf.getRole();
            Role role = (Role) dc.getCurrentObject();
            for (  PermissionReferences  pr  :  role.getPermissionReferences()) {
            	ObjectControl  oc = (ObjectControl) pr.getPermission();
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
        ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelAdministration}");
        GridModel model = (GridModel) viewmodel.getModel(AdminCallBackProducer.PERMISSION_SELECTION_TABLE, null, null);
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

}