/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.example.ui.hrcontroller.triggers;

import java.util.Map;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.hr.objects.serialization.Department;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.operation.AddLinkOperation;

@Alternative
@Priority(10)
@Selector("hrmanager.hrcontroller")
@PostCreate("department")
public class DepartmentsPostCreateTrigger implements PostCreateTrigger {

	private static final long serialVersionUID = -3020409673170833584L;
	@Inject
	IBeanFactory beanFactory;
	
	@Override
	public void execute(DataControl<?> datacontrol, Object obj,Map<String,Object> attributes)
			throws TuraException {
		try{
		Object t =  (Object) beanFactory.getTreeRootCountry().getCurrentObject();
		Long l = (Long) Reflection.call(t, "getObjId");
		((Department) obj).setParentId(l);
		
		AddLinkOperation lo = new AddLinkOperation();
		lo.setMaster((ObjectControl) t);
		lo.addLink("objId", "parentId");
		attributes.put(Constants.LINK_OPERATION,lo);
		
		}catch (Exception e){
			throw new TuraException(e);
		}

	}

}