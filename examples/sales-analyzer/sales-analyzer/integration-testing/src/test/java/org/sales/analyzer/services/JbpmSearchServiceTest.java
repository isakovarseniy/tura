/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.sales.analyzer.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.sales.analyzer.process.PostDeployer;
import org.sales.analyzer.services.impl.OAuthCredentialsProvider;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.MapperHelper;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.salesanalyzer.serialized.repo.InitSPARepository;

import com.octo.java.sql.query.SelectQuery.Order;

import sales.analyzer.api.model.impl.AssignInfo;
import sales.analyzer.api.model.impl.ETLNodeInstanceLog;
import sales.analyzer.api.model.impl.ETLProcessInstance;
import sales.analyzer.api.model.impl.ETLTaskInstance;
import sales.analyzer.api.model.impl.ExtraClasses;
import sales.analyzer.api.model.impl.JbpmConfiguration;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstancePK;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.UserPreferencesProvider;
import sales.analyzer.service.jbpm.JbpmSearchService;
import sales.analyzer.user.UserPreferences;

public class JbpmSearchServiceTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";
	private static final String ETL_PROCESS_ID = "sales.analyzer.MonthlyFileLoad";
	private static SpaObjectRegistry spaRegistry;
	private static Registry registry;

	@BeforeClass
	public static void initRepository() throws Exception {
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();

		InitSPARepository initSpa = new InitSPARepository(registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();

	}

	private static UserPreferences pref;

	@Test
	public void t0000_searchCase() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);

			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			String caseId = UUID.randomUUID().toString();
			HashMap<String, Object> params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId);

			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			String caseId1 = UUID.randomUUID().toString();
			params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId1);
			Long procesInsatnceId1 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);

			SalesAnalyzerProcessInstancePK pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId);
			pk.setId(procesInsatnceId);
			JbpmSearchService service = new JbpmSearchService(client, provider, spaRegistry,
					"spa-persistence-repository", registry);
			SalesAnalyzerProcessInstance instance = (SalesAnalyzerProcessInstance) service.find(pk,
					SalesAnalyzerProcessInstance.class);
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());

			pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId("NA");
			pk.setId(procesInsatnceId);
			service = new JbpmSearchService(client, provider, spaRegistry, "spa-persistence-repository", registry);
			instance = (SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class);
			assertNull(instance);

			pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId1);
			pk.setId(procesInsatnceId1);
			service = new JbpmSearchService(client, provider, spaRegistry, "spa-persistence-repository", registry);
			instance = (SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class);
			assertEquals(procesInsatnceId1, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());

			pref.setSuperAdmin(false);
			service = new JbpmSearchService(client, provider, spaRegistry, "spa-persistence-repository", registry);
			instance = (SalesAnalyzerProcessInstance) service.find(pk, SalesAnalyzerProcessInstance.class);
			assertNull(instance);

			pref.setSuperAdmin(true);

			service = new JbpmSearchService(client, provider, spaRegistry, "spa-persistence-repository", registry);
			SalesAnalyzerTaskInstance taskInstance = (SalesAnalyzerTaskInstance) service.find(ti.getId(),
					SalesAnalyzerTaskInstance.class);
			assertEquals(taskInstance.getId(), ti.getId());
			SalesAnalyzerProcessInstance pi = taskInstance.getProcess();
			assertEquals(procesInsatnceId1, pi.getId());

			pref.setSuperAdmin(false);
			taskInstance = (SalesAnalyzerTaskInstance) service.find(ti.getId(), SalesAnalyzerTaskInstance.class);
			assertNull(taskInstance);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_searchByCaseId() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);

			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			String caseId = UUID.randomUUID().toString();
			HashMap<String, Object> params = new HashMap<>();
			params.put(Constants.VAR_CITY, 1000);
			params.put(Constants.VAR_STATE, 2000);
			params.put(Constants.VAR_PRODUCT, "Product02");
			params.put(Constants.VAR_CASE_ID, caseId);

			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);

			JbpmSearchService service = new JbpmSearchService(client, provider, spaRegistry,
					"spa-persistence-repository", registry);
			SalesAnalyzerProcessInstancePK pk = new SalesAnalyzerProcessInstancePK();
			pk.setCaseId(caseId);
			pk.setId(procesInsatnceId);
			SalesAnalyzerProcessInstance instance = (SalesAnalyzerProcessInstance) service.find(pk,
					SalesAnalyzerProcessInstance.class);
			assertEquals(procesInsatnceId, instance.getId());
			assertEquals(1, instance.getActiveUserTasks().size());
			assertEquals(caseId, instance.getCaseId());
			SalesAnalyzerTaskInstance ti = instance.getActiveUserTasks().iterator().next();
			assertNotNull(ti.getId());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0001_searchCase() {
		try {
			pref = new UserPreferences();
			pref.setSuperAdmin(true);

			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();

			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);

			HashMap<String, Object> params = new HashMap<>();
			params.put("city", 1500);
			params.put("state", 2500);
			params.put("product", "Product03");
			@SuppressWarnings("unused")
			Long procesInsatnceId = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			params = new HashMap<>();
			params.put("city", 1501);
			params.put("state", 2501);
			params.put("product", "Product04");
			@SuppressWarnings("unused")
			Long procesInsatnceId1 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			params = new HashMap<>();
			params.put("city", 1500);
			params.put("state", 2502);
			params.put("product", "Product05");
			Long procesInsatnceId2 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			params = new HashMap<>();
			params.put("city", 1501);
			params.put("state", 2502);
			params.put("product", "Product05");
			@SuppressWarnings("unused")
			Long procesInsatnceId3 = processClient.startProcess(Constants.CONTAINER_ID, PROCESS_ID, params);

			JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);

			ArrayList<SearchCriteria> searchCriteria = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_CITY);
			sc.setValue(1500);
			searchCriteria.add(sc);

			sc = new SearchCriteria();
			sc.setName(Constants.VAR_STATE);
			sc.setValue(2502);
			searchCriteria.add(sc);

			ArrayList<OrderCriteria> orderCriteria = new ArrayList<>();
			OrderCriteria orc = new OrderCriteria();
			orc.setName("PROC_" + "PROCESSINSTANCEID");
			orc.setOrder(Order.DESC.name());

			JbpmSearchService service = new JbpmSearchService(client, provider, spaRegistry,
					"spa-persistence-repository", registry);
			SearchResult<?> result = service.find(searchCriteria, orderCriteria, 0, 100,
					SalesAnalyzerProcessInstance.class);
			assertNotEquals(0, result.getSearchResult().size());

			for (Object o : result.getSearchResult()) {
				SalesAnalyzerProcessInstance pi = (SalesAnalyzerProcessInstance) o;
				assertEquals(pi.getCity(), Integer.valueOf(1500));
				assertEquals(pi.getStates(), Integer.valueOf(2502));
			}

			result = service.find(searchCriteria, orderCriteria, 0, 100, SalesAnalyzerTaskInstance.class);
			assertNotEquals(0, result.getSearchResult().size());
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getCity(), Integer.valueOf(1500));
				assertEquals(pi.getStates(), Integer.valueOf(2502));
			}

			searchCriteria = new ArrayList<>();
			sc = new SearchCriteria();
			sc.setName(Constants.VAR_PRODUCT);
			sc.setValue("Product05");
			searchCriteria.add(sc);

			result = service.find(searchCriteria, orderCriteria, 0, 100, SalesAnalyzerTaskInstance.class);
			assertNotEquals(0, result.getSearchResult().size());
			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getProduct(), "Product05");
			}
			pref.setSuperAdmin(false);
			result = service.find(searchCriteria, orderCriteria, 0, 100, SalesAnalyzerTaskInstance.class);
			assertEquals(0, result.getSearchResult().size());

			ArrayList<Integer> allowerStates = new ArrayList<>();
			allowerStates.add(2502);

			ArrayList<Integer> allowerCities = new ArrayList<>();
			allowerCities.add(1500);
			pref.setStates(allowerStates);
			pref.setCities(allowerCities);
			result = service.find(searchCriteria, orderCriteria, 0, 100, SalesAnalyzerTaskInstance.class);
			assertEquals(0, result.getSearchResult().size());

			AssignInfo info = new AssignInfo();
			info.setAnalyst("sales-manager");
			processClient.signalProcessInstance(Constants.CONTAINER_ID, procesInsatnceId2, Constants.SIGNAL_ASSIGN,
					info);

			result = service.find(searchCriteria, orderCriteria, 0, 100, SalesAnalyzerTaskInstance.class);
			assertNotEquals(0, result.getSearchResult().size());

			for (Object o : result.getSearchResult()) {
				SalesAnalyzerTaskInstance ti = (SalesAnalyzerTaskInstance) o;
				SalesAnalyzerProcessInstance pi = ti.getProcess();
				assertEquals(pi.getProduct(), "Product05");
				assertEquals(pi.getCity(), Integer.valueOf(1500));
				assertEquals(pi.getStates(), Integer.valueOf(2502));
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_ETLProcessMapper() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);

			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			Map<String, Object> param = new HashMap<>();

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

			param.put(Constants.PARAM_FILE_PROCESSING_DATE, format.parse("2017-11-01"));
			processClient.startProcess(Constants.CONTAINER_ID, ETL_PROCESS_ID, param);

			JbpmSearchService service = new JbpmSearchService(client, provider, spaRegistry,
					"spa-persistence-repository", registry);
			SearchResult<?> result = service.find(new ArrayList<SearchCriteria>(), new ArrayList<OrderCriteria>(), 0,
					100, ETLProcessInstance.class);
			assertNotEquals(0, result.getSearchResult().size());
			ETLProcessInstance ei = (ETLProcessInstance) result.getSearchResult().get(0);
			assertEquals("2017-11-01", ei.getFileProcessingDate());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void t0000_ETLNodeLogMapper() {
		try {
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(PostDeployer.KIE_SERVER_URL, null,
					null);
			config.setCredentialsProvider(new OAuthCredentialsProvider(new PostDeployer().getToken()));
			config.addExtraClasses(ExtraClasses.list);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			UserPeferencesProviderImpl provider = new UserPeferencesProviderImpl();
			JbpmConfiguration.init(client, PostDeployer.JNDI_FOR_JBPM_ACCESS);

			ProcessServicesClient processClient = client.getServicesClient(ProcessServicesClient.class);
			Long processInstance = processClient.startProcess(Constants.CONTAINER_ID, ETL_PROCESS_ID,
					new HashMap<String, Object>());

			ArrayList<SearchCriteria> searchCriteria = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_PROCESS_INSTANCE_ID);
			sc.setValue(processInstance);
			searchCriteria.add(sc);

			JbpmSearchService service = new JbpmSearchService(client, provider, spaRegistry,
					"spa-persistence-repository", registry);
			SearchResult<?> result = service.find(searchCriteria, new ArrayList<OrderCriteria>(), 0, 100,
					ETLNodeInstanceLog.class);
			assertNotEquals(0, result.getSearchResult().size());

			ETLNodeInstanceLog node = (ETLNodeInstanceLog) result.getSearchResult().get(0);
			Long id = node.getId();

			ETLNodeInstanceLog node1 = (ETLNodeInstanceLog) service.find(id, ETLNodeInstanceLog.class);
			assertEquals(id, node1.getId());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	class EtlNodeLogMapper extends MapperHelper implements Mapper {

		private static final long serialVersionUID = 1L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((ETLNodeInstanceLog) persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public void nillPrimaryKey(Object persistenceObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

		@Override
		public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
				throws RepositoryException {
			throw new UnsupportedOperationException();

		}

		@Override
		public void differentiator(Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
				throws RepositoryException {

		}

		@Override
		public void put(Map<Object, Object> context, Object pk, Object type) {

		}

		@Override
		public Object get(Map<Object, Object> context, Object pk, Object type) {
			return null;
		}

		@Override
		public void setProxyFactory(ProxyFactory proxyFactory) {

		}

		@Override
		public RepoKeyPath getPath(Object object) throws Exception {
			return null;
		}

		@Override
		public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
			return null;
		}

	}

	class ProcessMapper extends MapperHelper implements Mapper {

		private static final long serialVersionUID = 1L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((SalesAnalyzerProcessInstance) persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

		@Override
		public void nillPrimaryKey(Object persistenceObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
				throws RepositoryException {

		}

		@Override
		public void differentiator(Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
				throws RepositoryException {

		}

		@Override
		public void put(Map<Object, Object> context, Object pk, Object type) {

		}

		@Override
		public Object get(Map<Object, Object> context, Object pk, Object type) {
			return null;
		}

		@Override
		public void setProxyFactory(ProxyFactory proxyFactory) {

		}

		@Override
		public RepoKeyPath getPath(Object object) throws Exception {
			return null;
		}

		@Override
		public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
			return null;
		}

	}

	class ETLProcessMapper extends MapperHelper implements Mapper {

		private static final long serialVersionUID = 1L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((ETLProcessInstance) persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public void nillPrimaryKey(Object persistenceObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

		@Override
		public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
				throws RepositoryException {
			throw new UnsupportedOperationException();
		}

		@Override
		public void differentiator(Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
				throws RepositoryException {

		}

		@Override
		public void put(Map<Object, Object> context, Object pk, Object type) {

		}

		@Override
		public Object get(Map<Object, Object> context, Object pk, Object type) {
			return null;
		}

		@Override
		public void setProxyFactory(ProxyFactory proxyFactory) {

		}

		@Override
		public RepoKeyPath getPath(Object object) throws Exception {
			return null;
		}

		@Override
		public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
			return null;
		}

	}

	class TaskMapper extends MapperHelper implements Mapper {

		private static final long serialVersionUID = 1L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((SalesAnalyzerTaskInstance) persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public void nillPrimaryKey(Object persistenceObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

		@Override
		public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
				throws RepositoryException {
			throw new UnsupportedOperationException();
		}

		@Override
		public void differentiator(Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
				throws RepositoryException {

		}

		@Override
		public void put(Map<Object, Object> context, Object pk, Object type) {

		}

		@Override
		public Object get(Map<Object, Object> context, Object pk, Object type) {
			return null;
		}

		@Override
		public void setProxyFactory(ProxyFactory proxyFactory) {

		}

		@Override
		public RepoKeyPath getPath(Object object) throws Exception {
			return null;
		}

		@Override
		public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
			return null;
		}

	}

	class ETLTaskMapper extends MapperHelper implements Mapper {

		private static final long serialVersionUID = 3082834789745427761L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((ETLTaskInstance) persistenceObject).getId();
		}

		@Override
		public Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject) {
			return null;
		}

		@Override
		public Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject,
				Map<Object, Object> context) throws RepositoryException {
			return null;
		}

		@Override
		public void nillPrimaryKey(Object persistenceObject) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void copyPKFromPersistence2Repository(Object persistenceObject, Object repositoryObject)
				throws RepositoryException {

		}

		@Override
		public void differentiator(Object persistenceObject, Object repositoryObject, Map<Object, Object> context)
				throws RepositoryException {

		}

		@Override
		public void put(Map<Object, Object> context, Object pk, Object type) {

		}

		@Override
		public Object get(Map<Object, Object> context, Object pk, Object type) {
			return null;
		}

		@Override
		public void setProxyFactory(ProxyFactory proxyFactory) {

		}

		@Override
		public RepoKeyPath getPath(Object object) throws Exception {
			return null;
		}

		@Override
		public RepoObjectKey getRepoObjectKey(Object object) throws Exception {
			return null;
		}

	}

	class UserPeferencesProviderImpl implements UserPreferencesProvider {

		@Override
		public UserPreferences getUserPreferences(String userName) {
			return JbpmSearchServiceTest.pref;
		}

	}

}