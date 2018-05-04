package org.tura.platform.repository.core.relatioin;

import org.tura.platform.repository.core.PersistenceProvider;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.Rule;

public class RemoveObjectRule implements Rule{
	
	Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	private PersistenceProvider findProvider(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findProvider(repositoryClass);
	}
	
	
	@Override
	public void execute() throws Exception {
		findProvider(object.getClass().getName()).remove(object);
	}

}

