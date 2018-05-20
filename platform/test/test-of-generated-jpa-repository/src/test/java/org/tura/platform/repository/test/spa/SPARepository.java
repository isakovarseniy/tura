package org.tura.platform.repository.test.spa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.triggers.PostCreateTrigger;

public class SPARepository implements Repository{

	public static Map<String,Object> objectBase = new HashMap<>();
	
	private PostCreateTrigger findPostCreateTrigger(String repositoryClass) throws RepositoryException {
		return null;
	}

	
	@Override
	public Object create(String objectClass) throws RepositoryException {
		try {
			Object obj = Class.forName(objectClass).newInstance();
			PostCreateTrigger trigger = findPostCreateTrigger(objectClass);
			if (trigger != null){
				trigger.postCreate(obj);
			}
			return obj;
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

	@Override
	public SearchResult find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria, Integer startIndex,
			Integer endIndex, String objectClass) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Object obj, String objectClass) throws RepositoryException {
		throw new UnsupportedOperationException();
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void applyChanges(List changes) throws RepositoryException {
		try{
			for (Object change : changes){
				
				if (change instanceof AddObjectData){
					new AddObjectOperation().execute((AddObjectData) change);
					continue;
				}
				
				if (change instanceof RemoveObjectData){
					new RemoveObjectOperation().execute((RemoveObjectData) change);
					continue;
				}
				
			}
		
		}catch(Exception e){
			throw new RepositoryException(e);
		}
	}
}
