package sales.analyzer.ui.businesslogic.casemanagment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.GridModel;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.SearchObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.TaskArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.jbpm.Task;
import org.tura.salesanalyzer.serialized.keycloak.User;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;

public class ActionsCaseManagement implements EventAccessor {

	private transient Logger logger = Logger.getLogger(ActionsCaseManagement.class.getName());
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	public String searchIcon() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if (bf.getShowSearchPanelForWI() == null || !bf.getShowSearchPanelForWI()) {
			return "search-button";
		} else {
			return "hide-search-button";

		}

	}

	public void showhidesearch() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setShowSearchPanelForWI(!bf.getShowSearchPanelForWI());

	}

	@SuppressWarnings("rawtypes")
	public void applyCitySelection() {
		try {

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());
			DataControl citydc = (DataControl) bf.getSelectCity();
			City city = (City) citydc.getCurrentObject();
			adapter.setCityId(city.getObjId());
			adapter.setCityName(city.getName());

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("rawtypes")
	public void cleanOnChange() throws TuraException {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		DataControl dc = (DataControl) bf.getSearchObject();
		SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
				(ObjectControl) dc.getCurrentObject());
		adapter.setCityId(null);
		adapter.setCityName(null);
	}

	@SuppressWarnings("rawtypes")
	public void popupCitySelection() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());
			bf.setStateId(adapter.getStateid());
			dc = (DataControl) bf.getSelectCity();
			dc.forceRefresh();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openPopupUserForFilter() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForFilter");
	}
	
	public void openPopupUserForAssign() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssign");
		
	}

	public Boolean renderedButtonselectUserForFilter() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ("PopupUserForFilter".equals(bf.getUserSelectionPopupContext())) {
			return true;
		}
		return false;
		
	}

	public Boolean renderedButtonselectUserForAssign() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ("PopupUserForAssign".equals(bf.getUserSelectionPopupContext())) {
			return true;
		}
		return false;
	}
	
	
	@SuppressWarnings("rawtypes")
	public void selectUserForAssign() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSelectUser();
			User user = (User) dc.getCurrentObject();
			assignUsers(user.getUsername());
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private void assignUsers(String username) {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodel}");
		GridModel model = (GridModel) viewmodel.getModel("tura104d965f_253d_4210_8bfa_0577367e9cec", null, null);
		List <Object[]> list =  (List<Object[]>) model.getLazyModel().getWrappedData();
		for ( Object[] array : list ) {
			Task t = (Task) array[2];
			TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) t);
			if (adapter.getSelected() ) {
				t.setActualOwner(username);
			}
		}
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfWI() {
		HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest());
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String username = p.getName();
		assignUsers(username);
	}
	
	
	@SuppressWarnings("rawtypes")
	public void selectUserForFilter() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());
			dc = (DataControl) bf.getSelectUser();
			User user = (User) dc.getCurrentObject();
			adapter.setAssignto(user.getUsername());
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void assignMyself() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());

			HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
					.getRequest());
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			adapter.setAssignto(username);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void cleanSearch() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());
			adapter.setStateid(null);
			adapter.setCityId(null);
			adapter.setCityName(null);
			adapter.setAssignto(null);
			adapter.setCaseId(null);
			adapter.setProduct(null);
			
			dc = (DataControl) bf.getTask();
			dc.getDefaultSearchCriteria().clear();
			
			dc.forceRefresh();
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void selectWorkItem() {
		
	}
	
	
	@SuppressWarnings("rawtypes")
	public void search() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSearchObject();
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter((ObjectControl) dc.getCurrentObject());
			dc = (DataControl) bf.getTask();
			
			dc.getDefaultSearchCriteria().clear();
			
			if (adapter.getStateid() != null  && adapter.getStateid() != -1) {
				SearchCriteria sc = new SearchCriteria();
				sc.setName(Constants.VAR_STATE);
				sc.setValue(adapter.getStateid());
				sc.setComparator(Operator.EQ.name());
				dc.getDefaultSearchCriteria().add(sc);
				
			}
			
			if (adapter.getCityId() != null) {
				SearchCriteria sc = new SearchCriteria();
				sc.setName(Constants.VAR_CITY);
				sc.setValue(adapter.getCityId());
				sc.setComparator(Operator.EQ.name());
				dc.getDefaultSearchCriteria().add(sc);

			}
			
			if (adapter.getCaseId() != null && !"".equals(adapter.getCaseId())) {
				SearchCriteria sc = new SearchCriteria();
				sc.setName(Constants.VAR_CASE_ID);
				sc.setValue(adapter.getCaseId());
				sc.setComparator(Operator.EQ.name());
				dc.getDefaultSearchCriteria().add(sc);

			}

			if (adapter.getProduct() != null && !"".equals(adapter.getProduct())) {
				SearchCriteria sc = new SearchCriteria();
				sc.setName(Constants.VAR_PRODUCT);
				sc.setValue(adapter.getProduct());
				sc.setComparator(Operator.EQ.name());
				dc.getDefaultSearchCriteria().add(sc);

			}
			
			dc.forceRefresh();
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}
	
}
