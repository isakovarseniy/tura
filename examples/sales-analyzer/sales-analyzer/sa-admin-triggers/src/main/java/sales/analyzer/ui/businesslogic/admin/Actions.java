package sales.analyzer.ui.businesslogic.admin;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.visit.VisitContext;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.EditableValueHoldersVisitCallback;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;
import sales.analyzer.commons.CachedUserPreferences;

public class Actions implements EventAccessor {

	private transient Logger logger = Logger.getLogger(Actions.class.getName());
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("admin.administration")
	CommandStack commandStack;

	@Inject
	Repository repository;
	
	@Inject
	CachedUserPreferences  userPref;

	
	
	public void clearAllUserPreferences() {
		userPref.clearAll();
	}
	
	@SuppressWarnings("rawtypes")
	public void openRolePopup() {
		try {
			Role role = (Role) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(role.getId());
			dc.forceRefresh();

			dc.getCommandStack().savePoint();
			dc.islolate();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void openPermissionPopup() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.role}");
			Role role = (Role) dc.getCurrentObject();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			if (role != null) {
				bf.setRoleId(role.getId());
			} else {
				bf.setRoleId(null);
			}
			dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permission}");
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

//	@SuppressWarnings({ "rawtypes" })
//	public void modifyPermissions() {
//		try {
//			DataControl dcPermission = (DataControl) elResolver
//					.getValue("#{beanFactoryAdminAdministration.permission}");
//			Permission p = (Permission) dcPermission.getCurrentObject();
//
//			Boolean isSelected = new PermissionArtifitialFieldsAdapter((ObjectControl) p).getSelected();
//			if (isSelected != null && isSelected) {
//				DataControl dcRef = (DataControl) elResolver
//						.getValue("#{beanFactoryAdminAdministration.permissionReferences}");
//
//				PermissionReferencesProxy pf = (PermissionReferencesProxy) dcRef.createObject();
//				pf.notifyListner();
//
//				pf.setPermission(p);
//				pf.notifyListner();
//
//				PermissionReferencesArtifitialFieldsAdapter ad = new PermissionReferencesArtifitialFieldsAdapter(
//						(ObjectControl) pf);
//				ad.setPermissionDescription(p.getDescription());
//				ad.setPermissionName(p.getName());
//
//			}
//			if (isSelected != null && !isSelected) {
//				IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
//				DataControl dcHelper = (DataControl) bf.getRoleHelper();
//				DataControl dc = (DataControl) bf.getRole();
//				Role role = (Role) dc.getCurrentObject();
//
//				dcHelper.getDefaultSearchCriteria().clear();
//
//				SearchCriteria sc = new SearchCriteria();
//				sc.setName("id");
//				sc.setComparator(Operator.EQ.name());
//				sc.setValue(role.getId());
//				dcHelper.getDefaultSearchCriteria().add(sc);
//
//				dcHelper.forceRefresh();
//
//				dcHelper.getCurrentObject();
//				DataControl peermRefHelper = (DataControl) bf.getPermissionReferencesHelper();
//				peermRefHelper.getCurrentObject();
//				int i = 0;
//				boolean found = false;
//				for ( Object o : peermRefHelper.getScroller()) {
//					PermissionReferences permRef = (PermissionReferences) o;
//					if (permRef.getPermission().equals(p)) {
//						found = true;
//						break;
//					}
//					i++;
//				}
//				if (found) {
//					peermRefHelper.setCurrentPosition(i);
//					peermRefHelper.removeObject();
//				}
//
//			}
//
//		} catch (Exception e) {
//			logger.log(Level.INFO, e.getMessage(), e);
//		}
//
//	}

	public void applyPermissionsModification() {
		UIComponent target = ViewModel.findComponent(IBeanFactory.PERMITIONSTABLE);
		cleanup(target);
	}

	@SuppressWarnings("rawtypes")
	public void rallbackPermissionsModification() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.permission}");
			dc.getCommandStack().rallbackSavePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

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
	public void deleteRole() {
		try {
			Role role = (Role) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(role.getId());
			dc.forceRefresh();
			dc.removeObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void createRolePopup() {
		try {

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			dc.getCommandStack().savePoint();
			dc.islolate();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId("UNDEFINED");

			@SuppressWarnings("unused")
			Role cmp = (Role) dc.createObject();


		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");
		try {
			dc.flush();
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");
			dc.getCommandStack().rallbackSavePoint();

			UIComponent target = ViewModel.findComponent(IBeanFactory.POPUPROLE);
			cleanup(target);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void saveApplication() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);
			
			@SuppressWarnings("unchecked")
			HashMap<String, DataControl<?>> h  = (HashMap<String, DataControl<?>>) commandStack.getListOfCommand()[1];

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();
			
			DataControl<?> dc = (DataControl<?>) bf.getRoleHelper();
			
			if (h.containsKey(dc.getId())) {
				dc =  (DataControl<?>) bf.getRole();
				dc.forceRefresh();
			}
			
			addmessage(FacesMessage.SEVERITY_INFO,"SAVE_DATA_MESSAGE" );
			
		} catch (Exception e) {
			addmessage(FacesMessage.SEVERITY_ERROR,"ERROR_MESSAGE" );
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
			addmessage(FacesMessage.SEVERITY_INFO,"ROLLBACK_MESSAGE" );
		} catch (Exception e) {
			addmessage(FacesMessage.SEVERITY_ERROR,"ERROR_MESSAGE" );
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	
	
	private void addmessage( Severity severity , String key ) {
		String message = getMessage(key);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, "Info", message));
	}
	
	private String getMessage( String key) {
        return (String) elResolver.getValue("#{Admin['" +key + "']}");
	}
	
	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	public void logout() {
		try {
			ExternalContext externalContext  = FacesContext.getCurrentInstance().getExternalContext();
			HttpServletRequest request = ((HttpServletRequest) externalContext.getRequest());
			request.logout();
			externalContext.redirect("/sa-admin/admin/administration/adminWindow.xhtml");
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

}
