/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
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
package org.tura.platform.test.hrcontrol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkArtificialProperties;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCommandStack;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkConnection;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultOrderCriteria;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultSearchCriteria;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDeleteTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDeleteTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkInsertTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkInsertTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkKeys;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPostCreateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPostQueryTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreDeleteTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreInsertTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreQueryTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreUpdateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSearchTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSearchTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSelector;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkUpdateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkUpdateTriggerParameters;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.EmployeeDC;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CreateCommandBase;
import org.tura.platform.datacontrol.command.base.DeleteCommandBase;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchCommandBase;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.object.TuraObject;

import com.octo.java.sql.query.SelectQuery;

public class EmployeeDCStructureTest {

	@Test
	public void checkEmployeeDCStructure(){
		assertEquals(20, EmployeeDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( EmployeeDC.class,"init" ));

		assertTrue(findMethod( EmployeeDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( EmployeeDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( EmployeeDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( EmployeeDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		checkArtificialProperties(m,map);

		assertTrue(findMethod( EmployeeDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		assertTrue(findMethod( EmployeeDC.class,"setCommandStack",new Class[]{CommandStack.class} ));
		m = getMethod( EmployeeDC.class,"setCommandStack",new Class[]{CommandStack.class} );
		checkCommandStack(m,"hrmanager.hrcontroller");
		
		assertTrue(findMethod( EmployeeDC.class,"setCreateCommand" ,new Class[]{CreateCommandBase.class}));
		m = getMethod( EmployeeDC.class,"setCreateCommand" ,new Class[]{CreateCommandBase.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkCreateTrigger(m,"employee");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.elsoft.platform.hr.objects.EmployeesDAO", TuraObject.class));
		checkCreateTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( EmployeeDC.class,"setInsertCommand" ,new Class[]{InsertCommandBase.class}));
		m = getMethod( EmployeeDC.class,"setInsertCommand" ,new Class[]{InsertCommandBase.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkInsertTrigger(m,"employee");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerHRController.employee.currentObject}", TuraObject.class));
		checkInsertTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( EmployeeDC.class,"setUpdateCommand" ,new Class[]{UpdateCommandBase.class}));
		m = getMethod( EmployeeDC.class,"setUpdateCommand" ,new Class[]{UpdateCommandBase.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkUpdateTrigger(m,"employee");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerHRController.employee.currentObject}", TuraObject.class));
		checkUpdateTriggerParameters(m,prms);

		
		assertTrue(findMethod( EmployeeDC.class,"setDeleteCommand" ,new Class[]{DeleteCommandBase.class}));
		m = getMethod( EmployeeDC.class,"setDeleteCommand" ,new Class[]{DeleteCommandBase.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkDeleteTrigger(m,"employee");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerHRController.employee.currentObject}", TuraObject.class));
		checkDeleteTriggerParameters(m,prms);

		
		assertTrue(findMethod( EmployeeDC.class,"setSearchCommand" ,new Class[]{SearchCommandBase.class}));
		m = getMethod( EmployeeDC.class,"setSearchCommand" ,new Class[]{SearchCommandBase.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkSearchTrigger(m,"employee");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryHrManagerHRController.employee.searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryHrManagerHRController.employee.orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryHrManagerHRController.employee.startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryHrManagerHRController.employee.endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.elsoft.platform.hr.objects.EmployeesDAO", TuraObject.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( EmployeeDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreQueryTrigger(m,"employee");
		
		
		assertTrue(findMethod( EmployeeDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostQueryTrigger(m,"employee");
		
		
		assertTrue(findMethod( EmployeeDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostCreateTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreDeleteTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( EmployeeDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreInsertTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreUpdateTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"getEmployee2Files" ,new Class[]{}));
		m = getMethod( EmployeeDC.class,"getEmployee2Files" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"employee2files",links);
		
		assertTrue(findMethod( EmployeeDC.class,"createChild" ,new Class[]{String.class}));


		assertTrue(findMethod( EmployeeDC.class,"setDefaultSearchCriteria",new Class[]{List.class} ));
		m = getMethod( EmployeeDC.class,"setDefaultSearchCriteria",new Class[]{List.class} );
		ArrayList<SearchCriteria> search = new ArrayList<>();
		checkDefaultSearchCriteria(m,search);

		
		assertTrue(findMethod( EmployeeDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class}));
		m = getMethod( EmployeeDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class});
		ArrayList<OrderCriteria> order = new ArrayList<>();
		order.add(new OrderCriteria("objId",SelectQuery.Order.ASC.name()));
		checkDefaultOrderCriteria(m,order);
		
	}

	
	
}
