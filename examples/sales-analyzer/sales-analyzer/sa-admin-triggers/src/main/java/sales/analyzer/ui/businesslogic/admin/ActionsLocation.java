package sales.analyzer.ui.businesslogic.admin;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.RoleSelectorArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReferenceProxy;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class ActionsLocation implements EventAccessor {

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
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.forceRefresh();

			dc.getCommandStack().savePoint();
			dc.islolate();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
	
	@SuppressWarnings("rawtypes")
	public void applyUserModification (){
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.flush();
		} catch (TuraException e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public void rallbackUserModification() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.getCommandStack().rallbackSavePoint();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public void modifyUsers() {
		try {
			IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			User p = (User) bf.getUserSelection().getCurrentObject();
			Boolean isSelected = new RoleSelectorArtifitialFieldsAdapter((ObjectControl) p).getSelected();
			State state = (State) bf.getState().getCurrentObject();
			if (isSelected != null && isSelected) {
				DataControl dcRef = (DataControl) bf.getStateReference();
				
				StateReferenceProxy stateRef = (StateReferenceProxy) dcRef.createObject();
				p.getStateReference().add(stateRef);
				stateRef.setStateId(state.getObjId());
				stateRef.notifyListner();
				
			}else {
				
			}
			
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	
	
	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
