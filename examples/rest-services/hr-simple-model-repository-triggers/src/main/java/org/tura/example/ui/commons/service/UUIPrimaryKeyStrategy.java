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

package org.tura.example.ui.commons.service;

import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.repository.core.PrImaryKeyStrategy;

public class UUIPrimaryKeyStrategy implements PrImaryKeyStrategy{

	private static final long serialVersionUID = -3879984850362695059L;
	public static long id =-100L;

	@Override
	public void generatePk(Object o) {
		try{
			
		Reflection.callTyped(o, "setObjId", Long.class,id);
		Reflection.callTyped(o, "setSerializationid", String.class ,  Long.valueOf(id).toString()+o.getClass().getName());
		
		id= id+1;
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

}
