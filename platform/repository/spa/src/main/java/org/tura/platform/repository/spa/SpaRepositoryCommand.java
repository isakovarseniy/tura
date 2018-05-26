package org.tura.platform.repository.spa;

import java.util.List;

public interface SpaRepositoryCommand {

	List<String> getListOfKnownObjects();

	List<SpaControl> prepare();

	void addSearchProvider(String className, SearchProvider provider);

}
