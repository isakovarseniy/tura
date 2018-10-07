package sales.analyzer.ui.businesslogic.admin;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.serialized.keycloak.User;

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
	public void openRolePopup() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");

			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.popupUser}");

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			bf.setUserId(((User) (row[2])).getId());
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void openRoleSelectorPopup() {
		try {
			DataControl dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.user}");
			User user = (User) dc.getCurrentObject();

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			if (user != null) {
				bf.setUserId(user.getId());
			} else {
				bf.setRoleId(null);
			}
			dc = (DataControl) elResolver.getValue("#{beanFactoryAdminAdministration.roleSelector}");
			dc.forceRefresh();

			dc.getCommandStack().savePoint();

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

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");

			User cmp = (User) dc.createObject();

			bf.setUserId(cmp.getId());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
