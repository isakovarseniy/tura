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

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.jpa.operation.ExternalQueryProcessor;

public class DefaultQueryProcessor<T>  extends ExternalQueryProcessor<T> {

	@SuppressWarnings("unchecked")
	@Override
	public SearchResult<T> process(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
			Integer startIndex, Integer endIndex, Class<T> objectClass) throws Exception {

		List<T> searchResult = (List<T>) findObjectsQuery(searchCriteria, orderCriteria, startIndex, endIndex,
				objectClass);
		long numberOfRows = findNumberOfRowsQuery(searchCriteria, orderCriteria, objectClass);

		return new SearchResult<T>(searchResult, numberOfRows);
	}

}