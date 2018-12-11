package sales.analyzer.ui.businesslogic.casemanagment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.MenuItem;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.primefaces.lib.EventAccessor;
import org.tura.platform.primefaces.model.GridModel;
import org.tura.platform.primefaces.model.ViewModel;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.SearchObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.TaskArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.jbpm.Task;
import org.tura.salesanalyzer.serialized.keycloak.User;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;

public class ActionsCaseManagement implements EventAccessor {

	private transient Logger logger = Logger.getLogger(ActionsCaseManagement.class.getName());
	private ActionEvent event;

	@Inject
	ELResolver elResolver;

	@Inject
	@Named("analysis.casemanager")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@Inject
	WorkItemMenuDynamic workItemMenu;

	@Override
	public void setEvent(ActionEvent event) {
		this.event = event;

	}

	public Object resolver(String experssion, ELResolver eLResolver) {
		if (experssion.length() > 2 && "#{".equals(experssion.substring(0, 2))) {
			return eLResolver.getValue(experssion);
		}
		return experssion;
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
	
	
	public void openPopupUserForForAssignAnalyst() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssignAnalyst");

	}
	
	public void openPopupUserForForAssignManager() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssignManager");

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

	public Boolean renderedButtonselectUserForAssignAnalyst() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ("PopupUserForAssignAnalyst".equals(bf.getUserSelectionPopupContext())) {
			return true;
		}
		return false;
	}
	
	public Boolean renderedButtonselectUserForAssignManager() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		if ("PopupUserForAssignManager".equals(bf.getUserSelectionPopupContext())) {
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

	@SuppressWarnings("rawtypes")
	public void selectUserForAssignAnalyst() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSelectUser();
			User user = (User) dc.getCurrentObject();
			CaseProcess process  = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setAnalystActor(user.getUsername());
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void selectUserForAssignManager() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			DataControl dc = (DataControl) bf.getSelectUser();
			User user = (User) dc.getCurrentObject();
			CaseProcess process  = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setManagerActor(user.getUsername());
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	private void assignUsers(String username) {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodel}");
		GridModel model = (GridModel) viewmodel.getModel("tura104d965f_253d_4210_8bfa_0577367e9cec", null, null);
		List<Object[]> list = (List<Object[]>) model.getLazyModel().getWrappedData();
		for (Object[] array : list) {
			Task t = (Task) array[2];
			TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) t);
			if (adapter.getSelected()) {
				t.setActualOwner(username);
			}
		}

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

	@SuppressWarnings("unchecked")
	public void closeWF() {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodel}");
		GridModel model = (GridModel) viewmodel.getModel("tura104d965f_253d_4210_8bfa_0577367e9cec", null, null);
		List<Object[]> list = (List<Object[]>) model.getLazyModel().getWrappedData();
		for (Object[] array : list) {
			Task t = (Task) array[2];
			TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) t);
			if (adapter.getSelected()) {
				t.setCloseProcess("TRUE");
			}
		}

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfWI() {
		HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest());
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String username = p.getName();
		assignUsers(username);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfForAnalyst() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
					.getRequest());
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			CaseProcess process  = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setAnalystActor(username);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfForManager() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			HttpServletRequest request = ((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
					.getRequest());
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			CaseProcess process  = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setManagerActor(username);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
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
			SearchObjectArtifitialFieldsAdapter adapter = new SearchObjectArtifitialFieldsAdapter(
					(ObjectControl) dc.getCurrentObject());
			dc = (DataControl) bf.getTask();

			dc.getDefaultSearchCriteria().clear();

			if (adapter.getStateid() != null && adapter.getStateid() != -1) {
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

			if (adapter.getAssignto() != null && !"".equals(adapter.getAssignto())) {
				SearchCriteria sc = new SearchCriteria();
				sc.setName(Constants.VAR_ACTUAL_OWNER);
				sc.setValue(adapter.getAssignto());
				sc.setComparator(Operator.EQ.name());
				dc.getDefaultSearchCriteria().add(sc);

			}

			dc.forceRefresh();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "rawtypes" })
	public void openCase() {
		try {
			Object[] row = (Object[]) event.getComponent().getAttributes().get("param1");
			TaskArtifitialFieldsAdapter adapter = new TaskArtifitialFieldsAdapter((ObjectControl) row[2]);

			String value = "Case #" + adapter.getCaseId();
			int currentItem = 1;
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");

			for (MenuItem item : workItemMenu.getMenuItemsList()) {
				if (item.getValue().equals(value)) {
					bf.setCurrentOpenedCase(currentItem);
					bf.setCurrentOpenedCaseId(adapter.getCaseId());
					((DataControl) bf.getCaseManager()).forceRefresh();
					bf.setCanvasType("CASE");
					return;
				}
				currentItem++;
			}

			if (workItemMenu.getMenuItemsList().size() == 5) {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "To many open windows"));
				return;
			}

			DefaultMenuItem item = new DefaultMenuItem(value);
			workItemMenu.getMenuItemsList().add(item);
			bf.setCurrentOpenedCase(workItemMenu.getMenuItemsList().size());
			item.setParam("case_id", adapter.getCaseId());
			item.setIncludeViewParams(true);
			item.setUpdate((String) resolver(
					"#{viewmodel.getClientId(turaf279a609_bd23_4610_971f_91f9c788f39e)},#{viewmodel.getClientId(tura16dc93c8_bf33_4cb1_92fa_082f68441f88)}",
					elResolver));
			item.setCommand(
					"#{actionExecutorAnalysisCaseManager.setSource('tura354d416a_83e5_43c9_a83a_37f58dd3e905').eventListener}");

			bf.setCurrentOpenedCaseId(adapter.getCaseId());
			((DataControl) bf.getCaseManager()).forceRefresh();

			bf.setCanvasType("CASE");

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void switchToWorkItem() {
		try {

			String caseId = null;
			MenuActionEvent menuEvent = (MenuActionEvent) event;
			if (menuEvent.getMenuItem().getParams() != null) {
				List array = menuEvent.getMenuItem().getParams().get("case_id");
				caseId = (String) (array.get(0));
			}
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");

			if (caseId == null) {
				bf.setCanvasType("WorkItem");
				bf.setCurrentOpenedCase(0);
			} else {
				String value = "Case #" + caseId;
				int currentItem = 1;
				for (MenuItem item : workItemMenu.getMenuItemsList()) {
					if (item.getValue().equals(value)) {
						bf.setCurrentOpenedCase(currentItem);
						bf.setCurrentOpenedCaseId(caseId);
						((DataControl) bf.getCaseManager()).forceRefresh();
						bf.setCanvasType("CASE");
						return;
					}
					currentItem++;
				}
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

}
