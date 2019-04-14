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
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;

public class ActionsLocation implements EventAccessor {

	private transient Logger logger = Logger.getLogger(Actions.class.getName());
	@SuppressWarnings("unused")
	private ActionEvent event;

	public static String STATE ="State";
	public static String CITY ="City";
	
	@Inject
	ELResolver elResolver;

	@Inject
	@Named("admin.administration")
	CommandStack commandStack;

	@Inject
	Repository repository;
	
	
	@SuppressWarnings("rawtypes")
	public void openUserStatePopup() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
             bf.setUserSwitch(STATE);
			DataControl dc = (DataControl) bf.getUserSelection();
			dc.forceRefresh();

			dc.getCommandStack().savePoint();
			dc.islolate();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public void openUserCityPopup() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
             bf.setUserSwitch(CITY);
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


	
	
	public void setAdmin(){
		
	}
	
	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

}
