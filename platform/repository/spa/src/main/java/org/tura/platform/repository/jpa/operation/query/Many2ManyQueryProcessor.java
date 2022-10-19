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

package org.tura.platform.repository.jpa.operation.query;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;

public class Many2ManyQueryProcessor<T> extends ExternalQueryProcessor<T>{

	@SuppressWarnings("unchecked")
	@Override
	public SearchResult<T> process(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws Exception {

		RepositoryHelper helper = new RepositoryHelper(getSearchService().getRegistry());
		SearchCriteria sc = helper
				.extractAndRemove(Constants.JPA_QUERY_MANY2MANY_TYPE, searchCriteria);
		Class<?> many2manyHelperClass = helper.findPersistanceClass((String) sc.getValue());
		
		sc = helper
				.extractAndRemove(Constants.JPA_QUERY_MANY2MANY_METHOD, searchCriteria);
		String many2manyHelperProperty =  (String) sc.getValue();
		
		 List<?> ls = this.findObjectsQuery(searchCriteria, orderCriteria, 0, 100, many2manyHelperClass);
		 
		 if ( ls ==null ||  ls.size() == 0) {
			 return new SearchResult<T>( new ArrayList<T>(), 0);
		 }
		 Object many2manyObject = ls.get(0);
		 List<T> cursor = (List<T>) helper.findChildren(many2manyObject, "Many2Many", many2manyHelperProperty);
		 List<T> array = new ArrayList<>();
		 for ( int i = startIndex ; i <  endIndex; i++) {
			 try {
				 array.add(cursor.get(i));
			 }catch( Throwable e) {
				 break;
			 }
		 }
		
		 return new SearchResult<T>( array, cursor.size());
	}

}
