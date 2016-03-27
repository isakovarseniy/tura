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
package org.tura.platform.datacontrol.command.nested;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

import com.octo.java.sql.query.SelectQuery;
import com.rits.cloning.Cloner;

public class SearchCommandNestedArray extends Command{
	
	private static String PARAMETER_QUERY ="query";
	private static String PARAMETER_PARENT_OBJECT ="parentObject";
	private static String PARAMETER_LIST_HOLDER ="listProperty";
	

	@Override
	public Object execute() throws Exception {

		if (getDatacontrol().getPreQueryTrigger() != null)
			getDatacontrol().getPreQueryTrigger().execute(getDatacontrol());
		
		this.prepareParameters();

		if (getDatacontrol().getPreQueryTrigger() != null)
			getDatacontrol().getPreQueryTrigger().execute(getDatacontrol());
		
		
		CallParameter queryParameter = null;
		CallParameter parentObjectParameter = null;
		CallParameter listHolder = null;
		for (   CallParameter parameter :  this.getParameters()){
			if (parameter.getName().equals(PARAMETER_QUERY))
				queryParameter = parameter;
			
			if (parameter.getName().equals(PARAMETER_PARENT_OBJECT))
				parentObjectParameter = parameter;
			
			if (parameter.getName().equals(PARAMETER_LIST_HOLDER))
				listHolder = parameter;
			
		}
		
		if (queryParameter == null || parentObjectParameter == null || listHolder == null)
			throw new TuraException("Parameter cannot be null");
		
		  String method = "get"+StringUtils.capitalize((String) listHolder.getObj());
		  Collection<?> array = (Collection<?>) Reflection.call(parentObjectParameter.getObj(), method);
		  
		  Query query = new Query();
		  SelectQuery selectQuery = (SelectQuery)(queryParameter.getObj());
		  query.parse(selectQuery.toSql());

			for (String param : selectQuery.getParams().keySet()) {
				query.setVariable(param, selectQuery.getParams().get(param));
			}
			QueryResults result = query.execute(array);

			ArrayList<Object> collection = new ArrayList<>();
			Cloner cloner = new Cloner();
			
			for (Object el : result.getResults()) {
				Object o = cloner.deepClone(el);
				collection.add(o);
			}
			
		return  collection;
	}

	@Override
	public void delayedExecution() throws Exception {
		
	}

}
