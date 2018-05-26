package org.tura.platform.repository.spa;

public interface RepositoryEventsListener {

	void notify(RepositoryEvent event) throws Exception;

}
