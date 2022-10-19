/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.cpa.storage;

import java.util.List;
import java.util.Map;

import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;

public interface CpaMapper extends Mapper{
	void collectCpaIds( Object obj, Map<Object, String> keyMap);
	void replaceCpaIds( Object obj, Map<Object, String> keyMap);
	Boolean getAttached(Object obj);
	void flattenObject(Object obj, List<Object> loadedObjects);
	void buildRepPathTree(org.tura.platform.repository.core.RepoKeyPath topCpaPath, Object persistenceObject,
			Map<String, RepoKeyPath> keyMap, String relation, List<String> register) throws RepositoryException;	
	boolean isComplex();
}
