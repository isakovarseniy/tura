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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
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

import sales.analyzer.api.model.impl.FileEntity;
import sales.analyzer.process.commons.Constants;
import sales.analyzer.service.file.FileSearchService;

public class FileSearchServiceTest {

	private static SpaObjectRegistry spaRegistry ;
	private static Registry registry;

	
	@BeforeClass
	public static void initRepository() throws Exception {
		registry = new Registry();
		spaRegistry = new SpaObjectRegistry();
		
		InitSPARepository initSpa = new InitSPARepository( registry, spaRegistry);
		initSpa.initClassMapping();
		initSpa.initCommandProducer();
		initSpa.initProvider();
		
		new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/").mkdirs();
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-02-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-04-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-05-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-06-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-07-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-08-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-09-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-10-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_after_rules.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_before_rules.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_extract.csv"));
		FileUtils.touch(new File(System.getProperty("user.home")+ "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_process_run_errors.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_processed.csv"));
		FileUtils.touch(new File(System.getProperty("user.home") + "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_validated.csv"));
		FileUtils.touch(new File(System.getProperty("user.home")+ "/.tura/resources/sa/jobs/MonthlyData_2017-11-01_24_validation_error.csv"));		
		
	}
	
	
	
	@Test
	public void search_test0() {
		try {
			FileSearchService service = new FileSearchService(System.getProperty("user.home") + "/.tura/resources/sa/jobs", spaRegistry, "spa-persistence-repository", registry);
			FileEntity entry = (FileEntity) service.find("MonthlyData_2017-08-01.csv", FileEntity.class);
			assertNotNull(entry);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void search_test1() {
		try {
			FileSearchService service = new FileSearchService(System.getProperty("user.home") + "/.tura/resources/sa/jobs", spaRegistry, "spa-persistence-repository", registry);

			ArrayList<SearchCriteria> array = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();

			sc.setName(Constants.PARAMETER_FILE_TEMPLATE);
			sc.setValue("**/MonthlyData_2017-11-01*.csv");
			array.add(sc);

			SearchResult<FileEntity> result = service.find(array, new ArrayList<OrderCriteria>(), 0, 100,
					FileEntity.class);
			assertTrue ( result.getSearchResult().size() >= 1);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	class FileEntityMapper extends MapperHelper implements Mapper{
		private static final long serialVersionUID = -3810259556092104987L;

		@Override
		public Object getPrimaryKey(Object persistenceObject) throws RepositoryException {
			return ((FileEntity) persistenceObject).getFullPath();
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

}
