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
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.DepartmentDC;
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

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

public class DepartmentDCStructureTest {

	@Test
	public void checkDepartmentDCStructure(){
		assertEquals(21, DepartmentDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( DepartmentDC.class,"init" ));

		assertTrue(findMethod( DepartmentDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( DepartmentDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( DepartmentDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( DepartmentDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		map.put("nameArtf",String.class);
		checkArtificialProperties(m,map);

		assertTrue(findMethod( DepartmentDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		assertTrue(findMethod( DepartmentDC.class,"setCommandStack",new Class[]{CommandStack.class} ));
		m = getMethod( DepartmentDC.class,"setCommandStack",new Class[]{CommandStack.class} );
		checkCommandStack(m,"hrmanager.tree2tree");
		
		assertTrue(findMethod( DepartmentDC.class,"setCreateCommand" ,new Class[]{CreateCommandBase.class}));
		m = getMethod( DepartmentDC.class,"setCreateCommand" ,new Class[]{CreateCommandBase.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkCreateTrigger(m,"department");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.elsoft.platform.hr.objects.DepartmentsDAO", TuraObject.class));
		checkCreateTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( DepartmentDC.class,"setInsertCommand" ,new Class[]{InsertCommandBase.class}));
		m = getMethod( DepartmentDC.class,"setInsertCommand" ,new Class[]{InsertCommandBase.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkInsertTrigger(m,"department");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", TuraObject.class));
		checkInsertTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( DepartmentDC.class,"setUpdateCommand" ,new Class[]{UpdateCommandBase.class}));
		m = getMethod( DepartmentDC.class,"setUpdateCommand" ,new Class[]{UpdateCommandBase.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkUpdateTrigger(m,"department");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", TuraObject.class));
		checkUpdateTriggerParameters(m,prms);

		
		assertTrue(findMethod( DepartmentDC.class,"setDeleteCommand" ,new Class[]{DeleteCommandBase.class}));
		m = getMethod( DepartmentDC.class,"setDeleteCommand" ,new Class[]{DeleteCommandBase.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkDeleteTrigger(m,"department");
		prms = new ArrayList<>();
		prms.add(new CallParameter("object", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].currentObject}", TuraObject.class));
		checkDeleteTriggerParameters(m,prms);

		
		assertTrue(findMethod( DepartmentDC.class,"setSearchCommand" ,new Class[]{SearchCommandBase.class}));
		m = getMethod( DepartmentDC.class,"setSearchCommand" ,new Class[]{SearchCommandBase.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkSearchTrigger(m,"department");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryHrManagerTree2tree.treeRootDepartment.controls['*******'].endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.elsoft.platform.hr.objects.DepartmentsDAO", TuraObject.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( DepartmentDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreQueryTrigger(m,"department");
		
		
		assertTrue(findMethod( DepartmentDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPostQueryTrigger(m,"department");
		
		
		assertTrue(findMethod( DepartmentDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPostCreateTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreDeleteTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( DepartmentDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"hrmanager.tree2tree");
		checkPreInsertTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"hrmanager.tree2tree");
		checkPreUpdateTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"getDepartment2Employee" ,new Class[]{}));
		m = getMethod( DepartmentDC.class,"getDepartment2Employee" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"department2employee",links);
		
		assertTrue(findMethod( DepartmentDC.class,"getDepartment2Vehicle" ,new Class[]{}));
		m = getMethod( DepartmentDC.class,"getDepartment2Vehicle" ,new Class[]{});
		links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"department2vehicle",links);

		
		assertTrue(findMethod( DepartmentDC.class,"createChild" ,new Class[]{String.class}));


		assertTrue(findMethod( DepartmentDC.class,"setDefaultSearchCriteria",new Class[]{List.class} ));
		m = getMethod( DepartmentDC.class,"setDefaultSearchCriteria",new Class[]{List.class} );
		ArrayList<SearchCriteria> search = new ArrayList<>();
		search.add(new SearchCriteria("parentId",Operator.EQ.name(),"#{beanFactoryHrManagerTree2tree.treeRootCompany.currentObject.objId}",Long.class.getName()));
		checkDefaultSearchCriteria(m,search);

		
		assertTrue(findMethod( DepartmentDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class}));
		m = getMethod( DepartmentDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class});
		ArrayList<OrderCriteria> order = new ArrayList<>();
		order.add(new OrderCriteria("objId",SelectQuery.Order.ASC.name()));
		checkDefaultOrderCriteria(m,order);
		
	}

	
	
}
