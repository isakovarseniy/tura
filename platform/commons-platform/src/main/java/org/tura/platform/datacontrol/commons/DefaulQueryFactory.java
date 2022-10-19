/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
		return builder(searchCriteria,orderCriteria, baseClass.getCanonicalName());
	}	
	
	public static SelectQuery builder(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, String  baseClass ) throws TuraException {

		try{
			SelectQuery query = select(c("x")).from(baseClass).as("x");
	
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
        try {
            Constructor<?> c = clazz.getConstructor(String.class);
            return c.newInstance(criteria.getValue());
          } catch (NoSuchMethodException e) {
            return org.tura.platform.datacontrol.commons.Parser.parse(criteria.getValue(), clazz);
          }
	}
	
	
}
