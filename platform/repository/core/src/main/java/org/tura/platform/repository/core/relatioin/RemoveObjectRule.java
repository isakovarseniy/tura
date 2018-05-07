package org.tura.platform.repository.core.relatioin;

import org.tura.platform.repository.core.PersistenceProvider;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.Rule;

public class RemoveObjectRule implements Rule{
	
	public RepoKeyPath getPk() {
		return pk;
	}


	public void setPk(RepoKeyPath pk) {
		this.pk = pk;
	}


	public Class<?> getRepositoryClass() {
		return repositoryClass;
	}


	public void setRepositoryClass(Class<?> repositoryClass) {
		this.repositoryClass = repositoryClass;
	}


	RepoKeyPath pk;
	Class<?> repositoryClass ;


	private PersistenceProvider findProvider(String repositoryClass) throws RepositoryException {
		return Registry.getInstance().findProvider(repositoryClass);
	}
	
	
	@Override
	public void execute() throws Exception {
		findProvider(repositoryClass.getName()).remove(pk);
	}

}

