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
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.CityRefeenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.StateReferenceArtifitialFieldsAdapter;
import org.tura.salesanalyzer.admin.admin.administration.datacontrol.UserSelectionArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.CityRefeence;
import org.tura.salesanalyzer.serialized.db.CityRefeenceProxy;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.db.StateReference;
import org.tura.salesanalyzer.serialized.db.StateReferenceProxy;
import org.tura.salesanalyzer.serialized.keycloak.User;

public class ActionsLocation implements EventAccessor {

	private transient Logger logger = Logger.getLogger(Actions.class.getName());
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

	public void modifyUsers() {
		IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
		if( bf.getUserSwitch().equals(STATE) ) {
			modifyStateUsers();
		}else {
			modifyCityUsers();
		}
	}	
	
	
	@SuppressWarnings({ "rawtypes" })
	public void modifyStateUsers() {
		try {
			IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			User p = (User) bf.getUserSelection().getCurrentObject();
			Boolean isSelected = new UserSelectionArtifitialFieldsAdapter((ObjectControl) p).getSelected();
			State state = (State) bf.getState().getCurrentObject();
			if (isSelected != null && isSelected) {
				DataControl dcRef = (DataControl) bf.getStateReference();
				
				StateReferenceProxy stateRef = (StateReferenceProxy) dcRef.createObject();
				p.getStateReference().add(stateRef);
				stateRef.setStateId(state.getObjId());
				StateReferenceArtifitialFieldsAdapter af = new StateReferenceArtifitialFieldsAdapter(stateRef);
				af.setFirstName(p.getFirstName());
				af.setLastName(p.getLastName());
				af.setUserName(p.getUsername());
				
				stateRef.notifyListner();
				
			}else {
				DataControl dc = (DataControl) bf.getStateReferenceForSelection();
				int i = 0;
				boolean found = false;
				for (Object obj : dc.getScroller()) {
					StateReference stateRef = (StateReference) obj;
					if (stateRef.getStateId().equals(state.getObjId()) ) {
						found = true;
						break;

					}
				}
				if (found) {
					dc.setCurrentPosition(i);
					dc.removeObject();
				}
			}
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes" })
	public void modifyCityUsers() {
		try {
			IBeanFactory bf  = (IBeanFactory) elResolver.getValue("#{beanFactoryAdminAdministration}");
			User p = (User) bf.getUserSelection().getCurrentObject();
			Boolean isSelected = new UserSelectionArtifitialFieldsAdapter((ObjectControl) p).getSelected();
			City city = (City) bf.getCity().getCurrentObject();
			if (isSelected != null && isSelected) {
				DataControl dcRef = (DataControl) bf.getCityRefeence();
				
				CityRefeenceProxy cityRef = (CityRefeenceProxy) dcRef.createObject();
				
				p.getCityRefeence().add(cityRef);
				cityRef.setCityId(city.getObjId());
				CityRefeenceArtifitialFieldsAdapter af = new CityRefeenceArtifitialFieldsAdapter(cityRef);
				af.setFirstName(p.getFirstName());
				af.setLastName(p.getLastName());
				af.setUserName(p.getUsername());
				
				cityRef.notifyListner();
				
			}else {
				DataControl dc = (DataControl) bf.getCityRefeenceForSelection();
				int i = 0;
				boolean found = false;
				for (Object obj : dc.getScroller()) {
					CityRefeence cityRef = (CityRefeence) obj;
					if (cityRef.getCityId().equals(city.getObjId()) ) {
						found = true;
						break;

					}
				}
				if (found) {
					dc.setCurrentPosition(i);
					dc.removeObject();
				}
			}
			
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
