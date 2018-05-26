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
package org.tura.platform.repository.spa.merge.rules;

import java.util.Map;

import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

import com.rits.cloning.Cloner;

public class UpdateMergeRule implements MergeRule{

	@Override
	public void merge(Map<Object, SpaControl> listOfObjectsPerType, SpaControl preparedObject, SpaControl control)
			throws RepositoryException {
		
		if ( !preparedObject.getLevel().name().equals(OperationLevel.UPDATE.name()) ){
			throw new RepositoryException("Wrong level for SpaControl");
		}
		if ( control.getLevel().name().equals(OperationLevel.INSERT.name()) ){
			throw new RepositoryException("You cannot insert multiple objects with same PK");
		}
		
		if ( control.getLevel().name().equals(OperationLevel.DELETE.name()) ){
			listOfObjectsPerType.remove(preparedObject);
			listOfObjectsPerType.put(control.getKey(), control);
		}
		
		if ( control.getLevel().name().equals(OperationLevel.UPDATE.name()) ){
			Cloner c = new Cloner();
			Object o = c.deepClone(control.getObject());
			preparedObject.setObject(o);
		}
	}

}
