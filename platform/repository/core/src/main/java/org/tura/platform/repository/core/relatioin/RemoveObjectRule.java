package org.tura.platform.repository.core.relatioin;

import java.util.List;

import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.Rule;

public class RemoveObjectRule implements Rule{
	
	List<Object> changes;
	Repository provider;
	
	

	@Override
	public void execute() throws Exception {
		provider.applyChanges(changes);
	}



	public List<Object> getChanges() {
		return changes;
	}



	public void setChanges(List<Object> changes) {
		this.changes = changes;
	}



	public Repository getProvider() {
		return provider;
	}



	public void setProvider(Repository provider) {
		this.provider = provider;
	}

}

