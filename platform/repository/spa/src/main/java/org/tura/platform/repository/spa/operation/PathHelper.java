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
package org.tura.platform.repository.spa.operation;

import java.lang.reflect.Constructor;

import org.apache.commons.jxpath.JXPathContext;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;

public class PathHelper {

	public static Object getPathValue(RepoKeyPath pk, int startIndex,Object obj) throws Exception{
		JXPathContext context = JXPathContext.newContext(obj);
		
		String path="";
		int id = 0;
		
		for(int i = startIndex; i<pk.getPath().size(); i++){
			  RepoObjectKey key =  pk.getPath().get(i);
			  path=path+key.getRelation()+"[";
			  boolean first = true;
			  for (FieldValue v : key.getKey()){
				  if (!first){
					  path = path+" and ";
				  }
				  Class<?> clazz = Class.forName( v.getType());
				  Constructor<?> c =  clazz.getConstructor(String.class);
				  context.getVariables().declareVariable("param"+id, c.newInstance(v.getValue()))  ;
				  path=path+ v.getName()+"="+"$param"+id;
				  first = false;
			  }
			  path=path+"]/";
		}
		return context.getValue(path);
	}
}
