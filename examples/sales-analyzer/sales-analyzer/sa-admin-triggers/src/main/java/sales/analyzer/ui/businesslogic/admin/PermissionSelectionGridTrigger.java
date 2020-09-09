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

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridModelTriggers;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.PermissionReferencesArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.PermissionReferencesProxy;
import org.tura.salesanalyzer.serialized.keycloak.Role;

import com.octo.java.sql.exp.Operator;

public class PermissionSelectionGridTrigger implements GridModelTriggers, Serializable {

	private static final long serialVersionUID = -2076752896144809889L;


	public static String QUERY_PERMISSION = "SELECT * FROM org.tura.salesanalyzer.serialized.db.PermissionReferences WHERE permission.objId = :objId";

	
    private ELResolver elResolver;
    private transient Logger logger = Logger.getLogger(PermissionSelectionGridTrigger.class.getName());

    public PermissionSelectionGridTrigger(ELResolver elResolver) {
        this.elResolver = elResolver;
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void onSelect(Object obj) {
        try {

            Permission p = (Permission) obj;

            DataControl dcRef = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permissionReferences}");

            List<Object> list = new ArrayList<>();
			list.addAll(dcRef.getScroller());
			Query query = new Query();
			query.parse(QUERY_PERMISSION);
			query.setVariable("objId", p.getObjId());
			QueryResults result = query.execute(list);

			if ( result.getResults() != null && result.getResults().size() == 0) {
	            PermissionReferencesProxy pf = (PermissionReferencesProxy) dcRef.createObject();
	            pf.notifyListner();
	
	            pf.setPermission(p);
	            pf.notifyListner();
	
	            PermissionReferencesArtifitialFieldsAdapter ad = new PermissionReferencesArtifitialFieldsAdapter(
	                    (ObjectControl) pf);
	            ad.setPermissionDescription(p.getDescription());
	            ad.setPermissionName(p.getName());

			}
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    @SuppressWarnings("rawtypes")
    @Override
    public void onUnselect(Object obj) {
        try {

            Permission p = (Permission) obj;

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dcHelper = (DataControl) bf.getRoleHelper();
            DataControl dc = (DataControl) bf.getRole();
            Role role = (Role) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("id");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(role.getId());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();

            dcHelper.getCurrentObject();
            DataControl peermRefHelper = (DataControl) bf.getPermissionReferencesHelper();
            peermRefHelper.getCurrentObject();
            int i = 0;
            boolean found = false;
            for (Object o : peermRefHelper.getScroller()) {
                PermissionReferences permRef = (PermissionReferences) o;
                if (permRef.getPermission().equals(p)) {
                    found = true;
                    break;
                }
                i++;
            }
            if (found) {
                peermRefHelper.setCurrentPosition(i);
                peermRefHelper.removeObject();
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

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dcHelper = (DataControl) bf.getRoleHelper();
            DataControl dc = (DataControl) bf.getRole();
            Role role = (Role) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("id");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(role.getId());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();
            dcHelper.getCurrentObject();
            DataControl peermRefHelper = (DataControl) bf.getPermissionReferencesHelper();
            peermRefHelper.getCurrentObject();

            for (Object o : peermRefHelper.getScroller()) {
                PermissionReferences permRef = (PermissionReferences) o;
                if (permRef.getPermission() != null) {
                    ObjectControl oc = (ObjectControl) permRef.getPermission();
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