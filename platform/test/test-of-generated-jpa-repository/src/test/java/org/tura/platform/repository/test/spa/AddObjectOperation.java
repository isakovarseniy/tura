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
package org.tura.platform.repository.test.spa;

import org.tura.platform.datacontrol.commons.Reflection;

import com.rits.cloning.Cloner;

public class AddObjectOperation {
	
	public void execute(AddObjectData data) throws Exception{
		Cloner c = new Cloner();
		Object object = c.deepClone(data.getObject());
		Long pk = (Long) Reflection.call(object, "getObjId");
		if (pk == null){
			throw new Exception("PK is null");
		}
		String toStrPk=pk.toString()+object.getClass().getName();
		if ( SPARepository.objectBase.get(toStrPk) != null ){
			throw new Exception("Object already exiest");
		}
		SPARepository.objectBase.put(toStrPk, object);
	}

}
