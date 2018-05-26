package org.tura.platform.repository.spa.merge.rules;

import java.util.Map;

import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.SpaControl;

public interface MergeRule {

	void merge( Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control ) throws RepositoryException;

	
}
