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

package org.tura.platform.test.tree2tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkArtificialProperties;
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
import org.tura.example.ui.datacontroldisconnectedmodel.tree2tree.datacontrol.DepartmentDC;
import org.tura.example.ui.datacontroldisconnectedmodel.tree2tree.datacontrol.FileDC;
import org.tura.platform.datacontrol.DCRule;
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

import com.octo.java.sql.query.SelectQuery;

public class FileDSStructureTest {

	@Test
	public void checkFileDCStructure(){
		assertEquals(19, FileDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( FileDC.class,"init" ));

		assertTrue(findMethod( FileDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( FileDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( FileDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( FileDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		map.put("nameArtf",String.class);
		checkArtificialProperties(m,map);

		assertTrue(findMethod( FileDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		
		assertTrue(findMethod( FileDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class}));
		m = getMethod( FileDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkCreateTrigger(m,"file");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.File", Object.class));
		checkCreateTriggerParameters(m,prms);
		
		assertTrue(findMethod( FileDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class}));
		m = getMethod( FileDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkSearchTrigger(m,"file");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryDatacontrolDisconnectedModelTree2Tree.treeRootDepartment.controls['*******'].searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryDatacontrolDisconnectedModelTree2Tree.treeRootDepartment.controls['*******'].orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryDatacontrolDisconnectedModelTree2Tree.treeRootDepartment.controls['*******'].startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryDatacontrolDisconnectedModelTree2Tree.treeRootDepartment.controls['*******'].endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.File", Object.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( FileDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( FileDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPreQueryTrigger(m,"file");
		
		
		assertTrue(findMethod( FileDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( FileDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPostQueryTrigger(m,"file");
		
		
		assertTrue(findMethod( FileDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( FileDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPostCreateTrigger(m,"file");

		
		assertTrue(findMethod( FileDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( FileDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPreDeleteTrigger(m,"file");

		
		assertTrue(findMethod( FileDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( FileDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPreInsertTrigger(m,"file");

		
		assertTrue(findMethod( FileDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( FileDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"datacontroldisconnectedmodel.tree2tree");
		checkPreUpdateTrigger(m,"file");

		
		assertTrue(findMethod( FileDC.class,"getFile2File" ,new Class[]{}));
		m = getMethod( FileDC.class,"getFile2File" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"file2file",links);
		
		assertTrue(findMethod( FileDC.class,"createChild" ,new Class[]{String.class}));


		assertTrue(findMethod( FileDC.class,"setDefaultSearchCriteria",new Class[]{List.class} ));
		m = getMethod( FileDC.class,"setDefaultSearchCriteria",new Class[]{List.class} );
		ArrayList<SearchCriteria> search = new ArrayList<>();
		checkDefaultSearchCriteria(m,search);

		
		assertTrue(findMethod( FileDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class}));
		m = getMethod( FileDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class});
		ArrayList<OrderCriteria> order = new ArrayList<>();
		order.add(new OrderCriteria("objId",SelectQuery.Order.ASC.name()));
		checkDefaultOrderCriteria(m,order);
	
		assertTrue(findMethod( DepartmentDC.class,"setAutoCreateObjectRule" ,new Class[]{DCRule.class}));

	}

	
	
}