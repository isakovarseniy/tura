package org.tura.platform.repository.core;

public interface Mapper {
	
	Object getPrimaryKey(Object persistenceObject);
	
	Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject);

	Object copyFromRepository2Persistence(Object repositoryObject, Object persistenceObject);
	
	
}
