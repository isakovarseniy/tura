/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2019, Arseniy Isakov
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
package org.tura.platform.datacontrol.commons;

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.select;

import java.lang.reflect.Constructor;
import java.util.List;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;
import com.octo.java.sql.query.SelectQuery.Order;

public class DefaulQueryFactory {

	public static SelectQuery builder(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Class<?> baseClass ) throws TuraException {

		try{
			SelectQuery query = select(c("x")).from(baseClass.getCanonicalName()).as("x");
	
			String condition = "WHERE";
	
			for (SearchCriteria criteria : searchCriteria) {
	
				ConditionConverter.valueOf(condition).getRestriction(query, c(criteria.getName()));
				query.op(Operator.valueOf(criteria.getComparator()), converParameter(criteria));
	
				condition = "AND";
			}
	
			for (OrderCriteria order : orderCriteria) {
	
				query.orderBy(order.getName());
	
				if (order.getOrder().equals(Order.ASC.name()))
					query.asc();
				else
					query.desc();
			}
			return query;
		}catch(Exception e){
			throw new TuraException(e);
		}
	}

	
	public static Object converParameter( SearchCriteria criteria) throws Exception {
		if (criteria.getValue( ) == null) {
			return null;
		}
		
		if ( criteria.getClassName() == null || criteria.getClassName().equals(String.class.getName())) {
			return criteria.getValue();
		}
		if ( criteria.getClassName().equals(criteria.getValue().getClass().getName()) ) {
			return criteria.getValue();
		}
		
		Class<?> clazz  = Class.forName(criteria.getClassName());
		Constructor<?>  contructor = clazz.getConstructor(criteria.getValue().getClass());
		return contructor.newInstance(criteria.getValue()); 
		
	}
	
	
}
