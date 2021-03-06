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

package org.tura.platform.datacontrol.command.base;

import java.io.Serializable;

public class CreateObjectParameters implements Serializable{
	private static final long serialVersionUID = 6645843951955189634L;
	private CallParameter objectType;

	public CallParameter getObjectType() {
		return objectType;
	}

	public void setObjectType(CallParameter objectType) {
		this.objectType = objectType;
	}
	
	
	public void fixParameters(String pattern,String replacement){
		fixParameter(objectType,pattern,replacement);
	}
	
	
	private void fixParameter(CallParameter parameter, String pattern,String replacement){
		String exp = parameter.getExpression();
		if (exp != null && !exp.equals("")) {
			parameter.setExpression(exp.replaceAll(pattern, replacement));
		}			
	}
    
}
