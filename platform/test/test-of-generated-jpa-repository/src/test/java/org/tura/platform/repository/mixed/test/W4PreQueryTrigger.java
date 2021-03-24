/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.mixed.test;

import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.tura.jpa.test.Q4;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.spa.ExternalConnectionPreQueryTrigger;
import org.tura.platform.repository.spa.test.SearchService;

import com.octo.java.sql.exp.Operator;

public class W4PreQueryTrigger extends ExternalConnectionPreQueryTrigger implements WrapperHook{

	private static final long serialVersionUID = -5500125291597106826L;

	public W4PreQueryTrigger(Registry registry) {
		super(registry);
	}
	
    public Long getParentId(Map<String,Object> hash) {
    	return (Long) hash.get ("parentId");
    	
    }

	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> order)throws Exception {
		
		SearchCriteria sc = new SearchCriteria();
		sc.setName(SearchService.TARGET_CLASS);
		sc.setValue(W4Source.class.getName());
		
		searchCriteria.add(sc);
		
		
		RepositoryHelper helper = new RepositoryHelper(registry);
		sc = helper.checkSearchParam(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,searchCriteria);
		if (sc != null) {
			Q4 q1 = (Q4) sc.getValue();
			SearchCriteria s = new SearchCriteria();
			s.setName("getParentId(hash)");
			s.setComparator(Operator.EQ.name());
			s.setValue(q1.getObjId());
			searchCriteria.add(s);
		}
	}

	@Override
	public void fixParameters(Query query) {
		query.addFunctionHandler(this);
	}	
}

