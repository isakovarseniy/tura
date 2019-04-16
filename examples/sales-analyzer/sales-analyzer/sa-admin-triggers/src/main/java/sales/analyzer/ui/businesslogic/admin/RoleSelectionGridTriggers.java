package sales.analyzer.ui.businesslogic.admin;

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
import org.tura.platform.primefaces.model.GridModelMultiSelect;
import org.tura.platform.primefaces.model.GridModelTriggers;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.RoleReferenceProxy;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

public class RoleSelectionGridTriggers implements GridModelTriggers {

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
        GridModelMultiSelect model = (GridModelMultiSelect) viewmodel.getModel(AdminCallBackProducer.ROLE_SELECTION_TABLE, null, null);
        if (selected) {
            List<Object> list = model.getSelected();
            for (Object obj : list) {
                onSelect(obj);
            }
        } else {
            List<Object> list = (List<Object>) model.getLazyModel().getWrappedData();
            for (Object obj : list) {
                onUnselect(obj);
            }
        }
    }

    public class RoleRefPostCreateTrigger implements PostCreateTrigger {
        
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
    
}