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

package org.tura.platform.test;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.triggers.PreQueryTrigger;

public class DepartmentTriggers implements PreQueryTrigger{


	private static final long serialVersionUID = -7130282887358866211L;

	@Override
	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria){
		for (SearchCriteria sc : searchCriteria){
			if (sc.getName().equals("parentId") ){
				sc.setName("PARENT_ID");
			}
			
		}
		
	}
	
	
}
