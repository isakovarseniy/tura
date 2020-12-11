/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sales.analyzer.ui.businesslogic.casemanagment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CommandStackProvider;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.uuiclient.cdi.BeansLocal;
import org.tura.platform.uuiclient.menu.DefaultMenuItem;
import org.tura.platform.uuiclient.menu.MenuElement;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.EventParameter;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.SwitchWindow;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;
import org.tura.platform.uuiclient.rest.events.EventAware;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.CaseManagerArtifitialFieldsAdapter;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.IBeanFactory;
import org.tura.salesanalyzer.casemanagment.analysis.casemanager.datacontrol.SearchObjectArtifitialFieldsAdapter;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.WriteupOutcome;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;
import org.tura.salesanalyzer.serialized.jbpm.Task;
import org.tura.salesanalyzer.serialized.keycloak.User;
import org.tura.salesanalyzer.serialized.proxy.ProxyRepository;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.commons.CDIUserPeferencesProviderImpl;
import sales.analyzer.commons.PrefConstants;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.jbpm.commands.AssignActorCommand;
import sales.analyzer.user.UserPreferences;

public class ActionsCaseManagement implements EventAware {

	private EventDescription event;
	private transient Logger logger = Logger.getLogger(ActionsCaseManagement.class.getName());
	private String pattern = "Case #";

	@Inject
	ResponseState responseState;

	
	private static String CASE_TABLE =  "tura"+"104d965f_253d_4210_8bfa_0577367e9cec";
	
	
	@Inject
	ELResolver elResolver;

	@Inject
	@Named("analysis.casemanager")
	CommandStack commandStack;

	@Inject
	Repository repository;

	@Inject
	WorkItemMenuDynamic workItemMenu;


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

			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("48d7014d-1877-4010-8b22-d1734ae8e72e");
			responseState.addCommand(cmd1);

			
			
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
			
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("48d7014d-1877-4010-8b22-d1734ae8e72e");
			responseState.addCommand(cmd1);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void openPopupUserForFilter() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForFilter");
		
		OpenPopup cmd1 = new OpenPopup();
		cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
		responseState.addCommand(cmd1);

	}

	public void openPopupUserForAssign() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssign");
		
		OpenPopup cmd1 = new OpenPopup();
		cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
		responseState.addCommand(cmd1);


	}

	public void openPopupUserForForAssignAnalyst() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssignAnalyst");
		
		OpenPopup cmd1 = new OpenPopup();
		cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
		responseState.addCommand(cmd1);
		
		bf.setIsAssigned(true);


	}

	public void openPopupUserForForAssignManager() {
		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		bf.setUserSelectionPopupContext("PopupUserForAssignManager");
		
		OpenPopup cmd1 = new OpenPopup();
		cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
		responseState.addCommand(cmd1);

		bf.setIsAssigned(true);

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
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
			responseState.addCommand(cmd1);

			
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
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setAnalystActor(user.getUsername());
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
			responseState.addCommand(cmd1);
			
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
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setManagerActor(user.getUsername());
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
			responseState.addCommand(cmd1);
	
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	private void assignUsers(String username) {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelCaseManager}");
		GridModel model = (GridModel) viewmodel.getModel(CASE_TABLE, null, null);
		List<Object> list = (List<Object>) model.getSelected();
		for (Object  obj : list) {
			Task t = (Task) obj;
			t.setActualOwner(username);
		}

		try {
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();

			model.setSelected(new ArrayList<Object>());
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("unchecked")
	public void closeWF() {
		ViewModel viewmodel = (ViewModel) elResolver.getValue("#{viewmodelCaseManager}");
		GridModel model = (GridModel) viewmodel.getModel(CASE_TABLE, null, null);
		List<Object> list = (List<Object>) model.getSelected();
		for (Object  obj : list) {
			Task t = (Task) obj;
			t.setCloseProcess("TRUE");
		}

		try {
			CommandStackProvider sp = new CommandStackProvider();
			sp.setCommandStack(commandStack);

			ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

			proxyRepository.applyChanges(null);
			commandStack.commitSavePoint();
			
			model.setSelected(new ArrayList<Object>());


		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfWI() {
		HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String username = p.getName();
		assignUsers(username);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfForAnalyst() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setAnalystActor(username);
			
			bf.setIsAssigned(true);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void assignMyselfForManager() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			process.setManagerActor(username);
			
			bf.setIsAssigned(true);
			
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
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("a1b353dd-a8ad-44e2-b2cf-950cd3cc999d");
			responseState.addCommand(cmd1);
			
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

			HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
			KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
			String username = p.getName();
			adapter.setAssignto(username);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void saveCase() {
		try {
			saveCaseOperation();
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			((DataControl) bf.getCaseManager()).forceRefresh();
			bf.setIsAssigned(false);
			addInfomessage("SAVE_DATA_MESSAGE" );

		} catch (Exception e) {
			addErrormessage("ERROR_MESSAGE" );
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	private void saveCaseOperation() throws Exception {
		CommandStackProvider sp = new CommandStackProvider();
		sp.setCommandStack(commandStack);

		ProxyRepository proxyRepository = new ProxyRepository(repository, sp);

		proxyRepository.applyChanges(null);
		commandStack.commitSavePoint();
	}

	public void closeCase() {
		try {
			closeProcessAndWindow(true);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	private void closeProcessAndWindow(boolean isclose) throws Exception {

		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
		CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
		if (isclose) {
			process.setCloseProcess("TRUE");
			saveCaseOperation();
		}

		closeWindow(process);
	}

	@SuppressWarnings("rawtypes")
	private void closeWindow(CaseProcess process) throws Exception {

		IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");

		String value = pattern + process.getCaseId();
		int currentItem = 1;

		for (MenuElement it : workItemMenu.getMenuItemsList()) {
			DefaultMenuItem item  = (DefaultMenuItem) it;
			if (item.getLabel().equals(value)) {
				break;
			}
			currentItem++;
		}
		workItemMenu.getMenuItemsList().remove(currentItem - 1);
		currentItem--;
		if (currentItem == 0) {
			bf.setCanvasType("WorkItem");
			bf.setCurrentOpenedCase(0);
			((DataControl) bf.getTask()).forceRefresh();

		} else {
			bf.setCurrentOpenedCase(currentItem);
			DefaultMenuItem item = (DefaultMenuItem) workItemMenu.getMenuItemsList().get(currentItem - 1);
			value =  item.getLabel();
			String caseId = value.substring(pattern.length());
			bf.setCurrentOpenedCaseId(caseId);
			((DataControl) bf.getCaseManager()).forceRefresh();
			bf.setCanvasType("CASE");
			return;
		}

	}

	public void closeWindow() {
		try {
			closeProcessAndWindow(false);

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
			
			EventParameter param = event.findParameter("rowkey");
			String caseId = (String) param.getValue();

			String value = pattern + caseId;
			int currentItem = 1;
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");

			for (MenuElement it : workItemMenu.getMenuItemsList()) {
				DefaultMenuItem item = (DefaultMenuItem) it;
				if (item.getLabel().equals(value)) {
					bf.setCurrentOpenedCase(currentItem);
					bf.setCurrentOpenedCaseId(caseId);
					((DataControl) bf.getCaseManager()).forceRefresh();
					bf.setCanvasType("CASE");
					return;
				}
				currentItem++;
			}

			if (workItemMenu.getMenuItemsList().size() == 5) {
				addErrormessage("ERROR_MSG_TOO_MANY_WINDOWS");
				return;
			}

			DefaultMenuItem item = new DefaultMenuItem(value);
			workItemMenu.getMenuItemsList().add(item);
			item.setLabel(value);
			bf.setCurrentOpenedCase(workItemMenu.getMenuItemsList().size());
			
			String uuid = "354d416a-83e5-43c9-a83a-37f58dd3e905";
	        EventDescription event =
	                new EventDescription( UUID.randomUUID().toString(),
	                    "server",
	                    "#{actionExecutorAnalysisCaseManager.setSource('tura"+uuid.replaceAll("\\-","_")+"').action}",
	                    "react.onClick", null,
	                    "f279a609-bd23-4610-971f-91f9c788f39e,16dc93c8-bf33-4cb1-92fa-082f68441f88");
	        item.getEvents().add(event);
	        event.addParameters(UUID.randomUUID().toString(), "rowkey", caseId, 0);
			
			

			bf.setCurrentOpenedCaseId(caseId);
			((DataControl) bf.getCaseManager()).forceRefresh();

			bf.setCanvasType("CASE");

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	@SuppressWarnings("rawtypes")
	public void switchToWorkItem() {
		try {
			EventParameter param = event.findParameter("rowkey");
			String caseId = null;
			if (param != null ) {
				caseId = (String) param.getValue();
			}

			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");

			if (caseId == null) {
				bf.setCanvasType("WorkItem");
				bf.setCurrentOpenedCase(0);
			} else {
				String value = pattern + caseId;
				int currentItem = 1;
				for (MenuElement it : workItemMenu.getMenuItemsList()) {
					DefaultMenuItem item = (DefaultMenuItem) it;
					
					if (item.getLabel().equals(value)) {
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

	@SuppressWarnings("rawtypes")
	public void completeTask() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			WriteupOutcome outcome = (WriteupOutcome) bf.getWriteupOutcome().getCurrentObject();
			CaseManagerArtifitialFieldsAdapter adapter = new CaseManagerArtifitialFieldsAdapter(
					(ObjectControl) process);
			if (AssignActorCommand.TASK1_NAME.equals(adapter.getStatus())) {
				if (outcome.getCaseResolution() == null) {
					addErrormessage("ERROR_RESOLUTION_STATUS_IS_UNDEFINED");
					return;
				}
				process.setCompleteTask(0);
				saveCaseOperation();
				((DataControl) bf.getCaseManager()).forceRefresh();
				addInfomessage("SAVE_DATA_MESSAGE" );
				
			} else {
				String approveStatus = outcome.getApprovedStatus();
				if (approveStatus == null) {
					addErrormessage("ERROR_APPROVE_STATUS_IS_UNDEFINED");
				} else {
					if (approveStatus.equals("4")) {
						process.setCompleteTask(0);
						saveCaseOperation();
						closeWindow(process);
					} else {
						process.setCompleteTask(1);
						saveCaseOperation();
						((DataControl) bf.getCaseManager()).forceRefresh();
					}
				}
			}

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public boolean checkUser() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			CaseProcess process = (CaseProcess) bf.getCaseManager().getCurrentObject();
			CaseManagerArtifitialFieldsAdapter adapter = new CaseManagerArtifitialFieldsAdapter(
					(ObjectControl) process);
			String username = getUser();
			if (username.equals(adapter.getAssignTo())) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}

	public boolean allowAssign() {
		UserPreferences pref = getUserPreferences();
		if (pref.getPermissions().contains(PrefConstants.AA) && pref.getPermissions().contains(PrefConstants.AR)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean allowAssignAnalyst() {
		UserPreferences pref = getUserPreferences();
		if (pref.getPermissions().contains(PrefConstants.AA)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean allowCompleteTask() {
		try {
			IBeanFactory bf = (IBeanFactory) elResolver.getValue("#{beanFactoryAnalysisCaseManager}");
			if ( bf.getIsAssigned()) {
				return false;
			}
			
			UserPreferences pref = getUserPreferences();
			if (!checkUser()) {
				return false;
			}
			if (pref.getPermissions().contains(PrefConstants.SCR) && pref.getPermissions().contains(PrefConstants.AC)) {
				return true;
			} else {
				return false;
			}			
			
		}catch(Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
		return false;
	}

	public boolean allowSubmitForReview() {
		UserPreferences pref = getUserPreferences();
		if (!checkUser()) {
			return false;
		}
		if (pref.getPermissions().contains(PrefConstants.SCR)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean allowApproveCase() {
		UserPreferences pref = getUserPreferences();
		if (!checkUser()) {
			return false;
		}
		if (pref.getPermissions().contains(PrefConstants.AC)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean allowAssignManager() {
		UserPreferences pref = getUserPreferences();
		if (pref.getPermissions().contains(PrefConstants.AR)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean allowCloseCase() {
		UserPreferences pref = getUserPreferences();
		if (pref.getPermissions().contains(PrefConstants.CC)) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private UserPreferences getUserPreferences() {
		HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		String username = p.getName();
		return new CDIUserPeferencesProviderImpl().getUserPreferences(username);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private String getUser() {
		HttpServletRequest request = BeansLocal.getReference(BeansLocal.getManager(), HttpServletRequest.class);
		KeycloakPrincipal p = (KeycloakPrincipal<KeycloakSecurityContext>) request.getUserPrincipal();
		return p.getName();

	}

	public void logout() {
       SwitchWindow cmd = new SwitchWindow();
       cmd.setTarget("http://kc:8080/auth/realms/sales-analyzer/protocol/openid-connect/logout?redirect_uri=http://wf:8081/sa-case-manager-react-client/analysis/casemanager/workItemWindow");
	   responseState.addCommand(cmd);
       
	}

	private void addInfomessage( String key ) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("info");
		cmd.setMessage("Info");
		cmd.setDetails((String) elResolver.getValue("#{CaseManagement['"+key+"']}"));
		responseState.addCommand(cmd);
	}

	
	private void addErrormessage( String key ) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(IBeanFactory.MESSAGES.replaceAll("tura", "").replaceAll("_", "\\-"));
		cmd.setSeverity("error");
		cmd.setMessage("Erroe");
		cmd.setDetails((String) elResolver.getValue("#{CaseManagement['"+key+"']}"));
		responseState.addCommand(cmd);
	}
	
	
	
	@Override
	public void setEvent(EventDescription event) {
		this.event = event;
		
	}

}
