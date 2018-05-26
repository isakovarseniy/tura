package org.tura.platform.repository.spa;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public interface SearchProvider {
	
	SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,Integer endIndex) throws RepositoryException ;
	Object find(Object pk);


}
