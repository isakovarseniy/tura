package sales.analyzer.ui.businesslogic.admin;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.visit.VisitContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.EditableValueHoldersVisitCallback;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.RoleReference;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

public class ActionsUser implements EventAccessor {

    private transient Logger logger = Logger.getLogger(Actions.class.getName());
    private ActionEvent event;

    @Inject
    ELResolver elResolver;

    @Inject
    @Named("admin.administration")
    CommandStack commandStack;

    @Inject
    Repository repository;

    @SuppressWarnings("rawtypes")
    public void openUserPopup() {
        try {
        	User user = (User) event.getComponent().getAttributes().get("param1");

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            bf.setUserId(user.getUsername());
            dc.forceRefresh();

            dc.getCommandStack().savePoint();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }
    
    @SuppressWarnings("rawtypes")
    public void openUserSelectorPopup() {
        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.user}");
            User user = (User) dc.getCurrentObject();

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            if (user != null) {
                bf.setUserId(user.getUsername());
            } else {
                bf.setUserId(null);
            }
            dc = (DataControl) bf.getPopupUser();
            dc.forceRefresh();

            dc.getCommandStack().savePoint();
            dc.islolate();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
        
    }

    @SuppressWarnings("rawtypes")
    public void createUserPopup() {
        try {

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

            dc.getCommandStack().savePoint();
            dc.islolate();

            dc.createObject();


        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }
    
    @SuppressWarnings("rawtypes")
    public void applyUserChanges() {
        DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");
        try {
            dc.flush();
        } catch (TuraException e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }

    @SuppressWarnings("rawtypes")
    public void rallbackUserChanges() {

        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");
            dc.getCommandStack().rallbackSavePoint();

            UIComponent target = ViewModel.findComponent(IBeanFactory.POPUPUSER);
            cleanup(target);

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    
    public void applyRolesModification() {
        UIComponent target = ViewModel.findComponent(IBeanFactory.POPUPASSIGNROLETABLE);
        cleanup(target);
    }

    @SuppressWarnings("rawtypes")
    public void rallbackRolessModification() {
        try {
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleReference}");
            dc.getCommandStack().rallbackSavePoint();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }

    }

    
    
    @SuppressWarnings("rawtypes")
    public void deleteUser() {
        try {
            User  user= (User) event.getComponent().getAttributes().get("param1");

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

            IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            bf.setUserId(user.getUsername());
            dc.forceRefresh();
            dc.removeObject();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }


    @Override
    public void setEvent(ActionEvent event) {
        this.event = event;

    }
    
    private void cleanup(UIComponent target) {
        EditableValueHoldersVisitCallback visitCallback = new EditableValueHoldersVisitCallback();
        target.visitTree(VisitContext.createVisitContext(FacesContext.getCurrentInstance()), visitCallback);

        // iterate over found sub-components and reset their values
        List<EditableValueHolder> editableValueHolders = visitCallback.getEditableValueHolders();
        for (EditableValueHolder editableValueHolder : editableValueHolders) {
            editableValueHolder.resetValue();
        }

    }

    
    @SuppressWarnings("rawtypes")
    public void openRoleSelectorPopup() {
        try {

            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleSelector}");
            dc.forceRefresh();

            dc.getCommandStack().savePoint();

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage(), e);
        }
    }
    
    @SuppressWarnings("rawtypes")
    public void deleteRoleRef() {
        try {
            RoleReference p = (RoleReference) event.getComponent().getAttributes().get("param1"); ;
            
            IBeanFactory bfHelper = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
            DataControl dcHelper = (DataControl) bfHelper.getUserHelper();
            DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.user}");
            User user = (User) dc.getCurrentObject();

            dcHelper.getDefaultSearchCriteria().clear();

            SearchCriteria sc = new SearchCriteria();
            sc.setName("username");
            sc.setComparator(Operator.EQ.name());
            sc.setValue(user.getUsername());
            dcHelper.getDefaultSearchCriteria().add(sc);

            dcHelper.forceRefresh();

            dcHelper.getCurrentObject();
            DataControl roleRefHelper = (DataControl) bfHelper.getRoleReferenceHelper();
            roleRefHelper.getCurrentObject();
            int i = 0;
            boolean found = false;
            for ( Object o : roleRefHelper.getScroller()) {
                RoleReference roleRef = (RoleReference) o;
                if (roleRef.equals(p)) {
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

    
}