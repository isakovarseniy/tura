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
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.EditableValueHoldersVisitCallback;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.PermissionArtifitialFieldsAdapter;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.PermissionReferencesArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.Permission;
import org.tura.salesanalyzer.serialized.db.PermissionReferences;
import org.tura.salesanalyzer.serialized.db.PermissionReferencesProxy;
import org.tura.salesanalyzer.serialized.keycloak.Role;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import com.octo.java.sql.exp.Operator;

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

	@SuppressWarnings("rawtypes")
	public void openRolePopup() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(((Role) (row[2])).getId());
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

	@SuppressWarnings({ "rawtypes" })
	public void modifyPermissions() {
		try {
			DataControl dcPermission = (DataControl) elResolver
					.getValue("#{beanFactoryAdminAdministration.permission}");
			Permission p = (Permission) dcPermission.getCurrentObject();

			Boolean isSelected = new PermissionArtifitialFieldsAdapter((ObjectControl) p).getSelected();
			if (isSelected != null && isSelected) {
				DataControl dcRef = (DataControl) elResolver
						.getValue("#{beanFactoryAdminAdministration.permissionReferences}");

				PermissionReferencesProxy pf = (PermissionReferencesProxy) dcRef.createObject();
				pf.notifyListner();

				pf.setPermission(p);
				pf.notifyListner();

				PermissionReferencesArtifitialFieldsAdapter ad = new PermissionReferencesArtifitialFieldsAdapter(
						(ObjectControl) pf);
				ad.setPermissionDescription(p.getDescription());
				ad.setPermissionName(p.getName());

			}
			if (isSelected != null && !isSelected) {
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
				for ( Object o : peermRefHelper.getScroller()) {
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

			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

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
			Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupRole}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setRoleId(((Role) (row[2])).getId());
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
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void rallbackApplication() {
		try {
			commandStack.rallbackCommand();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}


	
	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	
}
