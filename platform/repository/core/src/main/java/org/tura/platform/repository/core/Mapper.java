package org.tura.platform.repository.core;

public interface Mapper {
	
	Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject);

}
