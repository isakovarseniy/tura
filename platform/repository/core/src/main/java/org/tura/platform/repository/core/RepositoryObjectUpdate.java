/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.repository.core;

import java.util.List;

import org.tura.platform.repository.data.UpdateObjectData;

public class RepositoryObjectUpdate extends RepositoryHelper {

	public void update(UpdateObjectData data) throws RepositoryException {
		try {
			String repositoryClassName = data.getPk().getPath().get(data.getPk().getPath().size()-1).getType();

			Repository pr = findProvider(repositoryClassName);
			CommandProducer cmp = findCommandProducer(repositoryClassName);
			
			List<Object> commands = cmp.update(data.getPk(), data.getProperty() , data.getValue());
			pr.applyChanges(commands);
			
		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}

