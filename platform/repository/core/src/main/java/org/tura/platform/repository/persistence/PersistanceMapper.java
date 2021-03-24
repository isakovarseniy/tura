/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.persistence;

import java.util.Map;

import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;

public interface PersistanceMapper {

  	Object getPKey(RepoObjectKey objKey) throws RepositoryException;
	Object copyFromRepository2Persistence(Object repositoryObject) throws RepositoryException;
	Object copyFromRepository2Persistence(Object repositoryObject, Map<Object, Object> context) throws RepositoryException;
  	Object getPrimaryKeyFromRepositoryObject(Object repositoryObject) throws RepositoryException;

	
}
