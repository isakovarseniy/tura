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
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.salesanalyzer.serialized.db.City;
import org.tura.salesanalyzer.serialized.db.ProductGroupHistory;
import org.tura.salesanalyzer.serialized.db.State;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;

import com.octo.java.sql.exp.Operator;

import sales.analyzer.process.commons.Constants;
import sales.analyzer.user.UserPreferences;

public class JbpmServiceTest {

	private String PROCESS_ID = "sales.analyzer.SalesDropInvestigation";

	private static Logger logger;
	private static Server server;

	private static RepositoryProducer repositoryProducer;

	@AfterClass
	public static void afterClass() throws Exception {
		server.stop();
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		repositoryProducer = new RepositoryProducer();
		server = Server.createTcpServer().start();

		logger = Logger.getLogger("InfoLogging");
		logger.setUseParentHandlers(false);

		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARepository", config.getProperties());
		repositoryProducer.em = emf.createEntityManager();
	}

	@Test
	public void t0000_createCase() {
		try {

			Repository transport = repositoryProducer.getRepository();
			CpaRepository repository = repositoryProducer.getProxyRepository(transport);

			repositoryProducer.pref = new UserPreferences();
			repositoryProducer.pref.setSuperAdmin(true);

			CaseProcess c1 = (CaseProcess) repository.create(CaseProcess.class);
			String caseId = c1.getCaseId();
			c1.setProcessId(PROCESS_ID);
			repository.insert(c1, CaseProcess.class);

			State state = (State) repository.create(State.class);
			repository.insert(state, State.class);

			City city = (City) repository.create(City.class);
			repository.insert(city, City.class);

			ProductGroupHistory h1 = (ProductGroupHistory) repository.create(ProductGroupHistory.class);
			repository.insert(h1, ProductGroupHistory.class);
			h1.setCityId(city.getObjId());
			h1.setStateId(state.getObjId());
			h1.setProduct("Product1");

//			c1.getProductGroupHistory().add(h1);

			repository.getStackProvider().get().commit();;

			ArrayList<SearchCriteria> search = new ArrayList<>();
			SearchCriteria sc = new SearchCriteria();
			sc.setName(Constants.VAR_CASE_ID);
			sc.setComparator(Operator.EQ.name());
			sc.setValue(caseId);
			search.add(sc);
			SearchResult<?> result = repository.find(search, new ArrayList<OrderCriteria>(), 0, 100, CaseProcess.class);
			assertEquals(1, result.getNumberOfRows());

			@SuppressWarnings("unused")
			CaseProcess c1_ = (CaseProcess) result.getSearchResult().get(0);
//			assertEquals(1, c1_.getProductGroupHistory().size());

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
