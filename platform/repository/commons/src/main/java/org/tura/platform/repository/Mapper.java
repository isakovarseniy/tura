package org.tura.platform.repository;

public interface Mapper {

	Object getPrimaryKey(Object persistenceObject);
	Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject);

}

