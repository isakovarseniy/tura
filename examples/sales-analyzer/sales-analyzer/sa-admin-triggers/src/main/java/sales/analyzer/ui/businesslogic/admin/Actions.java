package sales.analyzer.ui.businesslogic.admin;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.EditableValueHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.visit.VisitContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.EditableValueHoldersVisitCallback;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.Role;

public class Actions {

	private transient Logger logger = Logger.getLogger(Actions.class.getName());

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("admin.administration")
	CommandStack commandStack;

	@Inject
	Repository repository;

	
	
	@SuppressWarnings("rawtypes")
	public void createRolePopup() {
		try {

			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryAdminAdministration.popupRole}");

			dc.getCommandStack().savePoint();
			dc.islolate();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");

			Role cmp = (Role) dc.createObject();

			bf.setRoleId(cmp.getId());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void applyChanges() {
		DataControl dc = (DataControl) elResolver
				.getValue("#{beanFactoryAdminAdministration.popupRole}");
		try {
			dc.flush();
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	
	@SuppressWarnings("rawtypes")
	public void rallbackChanges() {

		try {
			DataControl dc = (DataControl) elResolver
					.getValue("#{beanFactoryAdminAdministration.popupRole}");
			dc.getCommandStack().rallbackSavePoint();

			UIComponent target = ViewModel.findComponent(IBeanFactory.POPUPROLE);

			EditableValueHoldersVisitCallback visitCallback = new EditableValueHoldersVisitCallback();
			target.visitTree(VisitContext.createVisitContext(FacesContext.getCurrentInstance()), visitCallback);

			// iterate over found sub-components and reset their values
			List<EditableValueHolder> editableValueHolders = visitCallback.getEditableValueHolders();
			for (EditableValueHolder editableValueHolder : editableValueHolders) {
				editableValueHolder.resetValue();
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	
	
}
