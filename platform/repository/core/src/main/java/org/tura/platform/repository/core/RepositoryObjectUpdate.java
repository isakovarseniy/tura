package org.tura.platform.repository.core;

import java.util.List;

import org.tura.platform.repository.RepositoryException;
import org.tura.platform.repository.data.UpdateObjectData;
import org.tura.platform.repository.Repository;

public class RepositoryObjectUpdate extends RepositoryHelper {

	public void update(UpdateObjectData data) throws RepositoryException {
		try {
			String repositoryClassName = data.getPk().getPath().get(data.getPk().getPath().size()-1).getType();

			Repository pr = findProvider(repositoryClassName);
			Mapper mapper = findMapper(repositoryClassName);
			List<Object> commands = mapper.update(data.getPk(), data.getProperty() , data.getValue());
			pr.applyChanges(commands);
			
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}

