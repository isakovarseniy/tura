/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.mixed.test;

import java.util.List;

import org.josql.Query;
import org.tura.jpa.test.Q1;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.spa.ExternalConnectionPreQueryTrigger;
import org.tura.platform.repository.spa.test.SearchService;

import com.octo.java.sql.exp.Operator;

public class W1PreQueryTrigger extends ExternalConnectionPreQueryTrigger implements WrapperHook{

	public W1PreQueryTrigger(Registry registry) {
		super(registry);
	}

	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> order)throws Exception {
		
		SearchCriteria sc = new SearchCriteria();
		sc.setName(SearchService.TARGET_CLASS);
		sc.setValue(W1Source.class.getName());
		
		searchCriteria.add(sc);
		
		
		RepositoryHelper helper = new RepositoryHelper(registry);
		sc = helper.checkSearchParam(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,searchCriteria);
		if (sc != null) {
			Q1 q1 = (Q1) sc.getValue();
			SearchCriteria s = new SearchCriteria();
			s.setName("parentId");
			s.setComparator(Operator.EQ.name());
			s.setValue(q1.getObjId());
			searchCriteria.add(s);
		}
	}

	@Override
	public void fixParameters(Query query) {
	}	
}

