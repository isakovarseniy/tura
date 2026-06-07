/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.profiles;

import java.lang.reflect.Method;

import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.platform.repository.core.AllowEverythingProfile;

public class JavaScriptMapperGraphProfile extends AllowEverythingProfile{

	private static final long serialVersionUID = 1L;
	
	public boolean skipRelation(Object repositoryObject, Method method) {
		if ( repositoryObject instanceof Type) {
			if ( method.getName().equals("getAttributes")  ) {
				return true;
			}
			if ( method.getName().equals("getOperations")  ) {
				return true;
			}
			if ( method.getName().equals("getClassifiers")  ) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean acceptRelation(Object repositoryObject, Method method) {
		
		if ( repositoryObject instanceof JavaScriptMapper) {
			if ( method.getName().equals("getTypeRef")  ) {
				return true;
			}
			if ( method.getName().equals("getVersionRef")  ) {
				return true;
			}
			
			if ( method.getName().equals("getLayers")  ) {
				return true;
			}
		}
		if ( repositoryObject instanceof Type) {
			if ( method.getName().equals("getOpTypesTypeGroup")  ) {
				return true;
			}
		}
		return false;
	}
	

}
