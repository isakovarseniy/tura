/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.datacontrol.command.turaservice;

import java.util.List;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.SearchCommandBase;
import org.tura.platform.datacontrol.commons.DefaulQueryFactory;
import org.tura.platform.datacontrol.commons.LazyList;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.pool.JOSQLExpressionBuilder;

import com.octo.java.sql.query.SelectQuery;

public class NestedSearchCommand extends SearchCommandBase {

	public NestedSearchCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}

	public NestedSearchCommand() {
	}

	/*
	 * 
	 * parameter 0 -- -- parent object 
	 * parameter 1 -- -- name of method to get list of dependent objects 
	 * parameter 2 -- -- search criteria 
	 * parameter 3 -- -- order by criteria 
	 * parameter 4 -- -- object type
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object execute() throws Exception {
		super.execute();
		this.prepareParameters();

		if (parameters.get(0).getObj() == null) {
			setObj(this.getDatacontrol().getParent().getMasterCurrentObject());
		}

		List array = (List) Reflection.call(getObj(),(String) (parameters.get(1).getObj()));
		List<SearchCriteria> searchCriteria = (List<SearchCriteria>) parameters.get(2).getObj();
		List<OrderCriteria> orderCriteria = (List<OrderCriteria>) parameters.get(3).getObj();
		Class<?> baseClass =   Class.forName( (String) parameters.get(4).getObj());

		
		if (array == null)
			return new LazyList<>();

		SelectQuery selectQuery = DefaulQueryFactory.builder(searchCriteria, orderCriteria, baseClass);
		
		Query query = new Query();
		query.parse(selectQuery.toSql(new JOSQLExpressionBuilder()));

		for (String param : selectQuery.getParams().keySet()) {
			query.setVariable(param, selectQuery.getParams().get(param));
		}

		QueryResults result = query.execute(array);
		List<?> ls = result.getResults();
		LazyList lazyList = new LazyList<>(ls,ls.size(),0);
		
		return lazyList;

	}

}
