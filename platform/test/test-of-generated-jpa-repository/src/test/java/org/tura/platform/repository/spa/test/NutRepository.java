package org.tura.platform.repository.spa.test;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;

public class NutRepository implements Repository{

	@Override
	public Object create(String objectClass) throws RepositoryException {
		return null;
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		return new SearchResult(new ArrayList<>(), 0);
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void applyChanges(@SuppressWarnings("rawtypes") List changes) throws RepositoryException {
		
	}

}
