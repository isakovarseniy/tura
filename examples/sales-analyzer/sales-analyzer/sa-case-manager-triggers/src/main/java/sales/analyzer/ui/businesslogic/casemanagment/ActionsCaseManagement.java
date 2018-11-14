package sales.analyzer.ui.businesslogic.casemanagment;

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
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.SearchObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.keycloak.User;

import sales.analyzer.commons.CachedUserPreferences;

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

	@SuppressWarnings("rawtypes")
	public void selectUser() {
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
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

}
