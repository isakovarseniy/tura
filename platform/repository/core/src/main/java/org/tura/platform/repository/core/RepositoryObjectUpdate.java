package org.tura.platform.repository.core;

import org.tura.platform.repository.data.UpdateObjectData;

public class RepositoryObjectUpdate extends RepositoryHelper {

	public void update(UpdateObjectData data) throws RepositoryException {
		try {
			String repositoryClassName = data.getPk().getPath().get(data.getPk().getPath().size()-1).getType();

			PersistenceProvider pr  = findProvider(repositoryClassName);
			pr.update(data.getPk(), data.getProperty() , data.getValue());
			
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}
