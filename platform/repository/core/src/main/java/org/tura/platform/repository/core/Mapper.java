package org.tura.platform.repository.core;

import java.util.List;

public interface Mapper {

	Object getPrimaryKey(Object persistenceObject);
	Object copyFromPersistence2Repository(Object persistenceObject, Object repositoryObject);
	Object copyFromRepository2Persistence(Object repositoryObject, Object persistenceObject);
	List<Object> removeObject( Object repositoryObject);
	List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty);
	List<Object> addObject( Object repositoryObject);
	List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject, String detailProperty);
	List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty);
	List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty);
	List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty);
	List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,String detailProperty);
	List<Object> update(RepoKeyPath pk, String property, Object value);
	

}
