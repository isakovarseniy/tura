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
package org.tura.platform.repository.spa.test;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.triggers.PreQueryTrigger;

import com.octo.java.sql.exp.Operator;

public class QueryTrigger implements PreQueryTrigger{

	@Override
	public void preQueryTrigger(List<SearchCriteria> search, List<OrderCriteria> order) throws Exception {
		
		RepositoryHelper helper = new RepositoryHelper();
		
		helper.extractAndRemove(RepositoryObjectLoader.PARENT_PERSISTANCE_OBJECT,search);
		SearchCriteria parentrRepositoryObject =   helper.extractAndRemove(RepositoryObjectLoader.PARENT_REPOSITORY_OBJECT,search);
		helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION,search);
		helper.extractAndRemove(RepositoryObjectLoader.PARENT_CHIELD_RELATION_TYPE,search);

		if (parentrRepositoryObject != null && parentrRepositoryObject.getValue() != null){
			Object value = Reflection.call(parentrRepositoryObject.getValue(), "getObjId");
			SearchCriteria sc = new SearchCriteria();
			sc.setName("parentId");
			sc.setComparator(Operator.EQ.name());
			sc.setValue(value);
			search.add(sc);
		}
	}
}
