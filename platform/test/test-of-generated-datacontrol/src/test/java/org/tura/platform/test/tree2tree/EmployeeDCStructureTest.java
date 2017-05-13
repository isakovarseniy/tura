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
package org.tura.platform.test.tree2tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkArtificialProperties;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCommandStack;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkConnection;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultOrderCriteria;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultSearchCriteria;
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
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.EmployeeDC;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.object.TuraObject;

import com.octo.java.sql.query.SelectQuery;

public class EmployeeDCStructureTest {

	@Test
	public void checkEmployeeDCStructure(){
		assertEquals(17, EmployeeDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( EmployeeDC.class,"init" ));

		assertTrue(findMethod( EmployeeDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( EmployeeDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( EmployeeDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( EmployeeDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		map.put("nameArtf",String.class);
		checkArtificialProperties(m,map);

		assertTrue(findMethod( EmployeeDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		assertTrue(findMethod( EmployeeDC.class,"setCommandStack",new Class[]{CommandStack.class} ));
		m = getMethod( EmployeeDC.class,"setCommandStack",new Class[]{CommandStack.class} );
		checkCommandStack(m,"hrmanager.tree2tree");
		
		assertTrue(findMethod( EmployeeDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class}));
		m = getMethod( EmployeeDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkCreateTrigger(m,"employee");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.Employee", TuraObject.class));
		checkCreateTriggerParameters(m,prms);
		
		assertTrue(findMethod( EmployeeDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class}));
		m = getMethod( EmployeeDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkSearchTrigger(m,"employee");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.Employee", TuraObject.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( EmployeeDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreQueryTrigger(m,"employee");
		
		
		assertTrue(findMethod( EmployeeDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPostQueryTrigger(m,"employee");
		
		
		assertTrue(findMethod( EmployeeDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPostCreateTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreDeleteTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( EmployeeDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"hrmanager.tree2tree");
		checkPreInsertTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( EmployeeDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreUpdateTrigger(m,"employee");

		
		assertTrue(findMethod( EmployeeDC.class,"getEmployee2File" ,new Class[]{}));
		m = getMethod( EmployeeDC.class,"getEmployee2File" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"employee2file",links);
		
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
