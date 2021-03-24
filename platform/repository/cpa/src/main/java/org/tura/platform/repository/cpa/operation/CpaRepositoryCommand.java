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

package org.tura.platform.repository.cpa.operation;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.PathHelper;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;

public abstract  class CpaRepositoryCommand  implements Serializable{

	private static final long serialVersionUID = -5887329296328845214L;

	protected Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
	}
	
	
	public boolean beckwardProperty(Object persistanceDetailObject, String detailProperty) {
		return new RepositoryHelper().beckwardProperty(persistanceDetailObject, detailProperty);
	}
	
	
	@SuppressWarnings("unchecked")
	public  String getPrimaryKey( RepoObjectKey pk) throws Exception {
		
		String proxyType = pk.getType()+"Proxy";
		Class<?> proxyClass = Class.forName(proxyType); 
		Method method = proxyClass.getMethod("getPrimaryKeyFields");
		ArrayList<FieldValue> fields = (ArrayList<FieldValue>) method.invoke(null);
		
	    StringBuffer key = new StringBuffer();

		for ( FieldValue f : fields ) {
			key.append(findField( pk, f.getName()).getValue());
		}
		key.append(pk.getType());
		return key.toString();
	}
	
	
    public RepoObjectKey findRepoObjectKey(Object object) throws Exception {
    	return new RepositoryHelper().findRepoObjectKey(object);
    }
	
	private FieldValue findField(RepoObjectKey pk , String fieldName) {
		for (  FieldValue f  : pk.getKey()) {
			if (f.getName().equals(fieldName)) {
				return f;
			}
		}
		throw new RuntimeException("Field not found");
	}
	
	
	public abstract boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException;

	public abstract void prepare() throws RepositoryException;
	
	
}
