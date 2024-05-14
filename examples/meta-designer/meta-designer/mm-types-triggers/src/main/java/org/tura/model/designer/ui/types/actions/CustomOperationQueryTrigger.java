/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.types.actions;

import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.ui.types.mmdesigner.types.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.Pager;
import org.tura.platform.datacontrol.annotations.CustomQuery;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.QueryTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.repository.proxy.access.ArrayListWithSearch;

@Alternative
@Priority(10)
@Selector("mmdesigner.types") 
@CustomQuery("operation")
public class CustomOperationQueryTrigger  implements QueryTrigger{

	private static final long serialVersionUID = 1L;
	
	@Inject
	IBeanFactory bf;
	

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> execute(CpaRepository repository, Pager<T> pager) throws TuraException {
		Object obj = bf.getTypeElement().getCurrentObject();
		if ( obj instanceof Type) {
			return  (List<T>) ((Type)obj).getOperations();
		}
		return new ArrayListWithSearch<T>();
	}

}
