/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2018, Arseniy Isakov
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
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.CityDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.DepartmentDC;
import org.tura.platform.datacontrol.CommandStack;
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

public class CityDCStructureTest {

	@Test
	public void checkCityDCStructure(){
		assertEquals(18, CityDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( CityDC.class,"init" ));
		
		assertTrue(findMethod( CityDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( CityDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( CityDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( CityDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		checkArtificialProperties(m,map);

		assertTrue(findMethod( CityDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		assertTrue(findMethod( CityDC.class,"setCommandStack",new Class[]{CommandStack.class} ));
		m = getMethod( CityDC.class,"setCommandStack",new Class[]{CommandStack.class} );
		checkCommandStack(m,"hrmanager.hrcontroller");
		
		assertTrue(findMethod( CityDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class}));
		m = getMethod( CityDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkCreateTrigger(m,"city");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.City", Object.class));
		checkCreateTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( CityDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class}));
		m = getMethod( CityDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkSearchTrigger(m,"city");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryHrManagerHRController.treeRootCountry.controls['*******'].endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.City", Object.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( CityDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( CityDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreQueryTrigger(m,"city");
		
		
		assertTrue(findMethod( CityDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( CityDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostQueryTrigger(m,"city");
		
		
		assertTrue(findMethod( CityDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( CityDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostCreateTrigger(m,"city");

		
		assertTrue(findMethod( CityDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( CityDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreDeleteTrigger(m,"city");

		
		assertTrue(findMethod( CityDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( CityDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreInsertTrigger(m,"city");

		
		assertTrue(findMethod( CityDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( CityDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreUpdateTrigger(m,"city");

		
		assertTrue(findMethod( CityDC.class,"getCity2Street" ,new Class[]{}));
		m = getMethod( CityDC.class,"getCity2Street" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"city2street",links);
		
		
		assertTrue(findMethod( CityDC.class,"createChild" ,new Class[]{String.class}));


		assertTrue(findMethod( CityDC.class,"setDefaultSearchCriteria",new Class[]{List.class} ));
		m = getMethod( CityDC.class,"setDefaultSearchCriteria",new Class[]{List.class} );
		ArrayList<SearchCriteria> search = new ArrayList<>();
		checkDefaultSearchCriteria(m,search);

		
		assertTrue(findMethod( CityDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class}));
		m = getMethod( CityDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class});
		ArrayList<OrderCriteria> order = new ArrayList<>();
		order.add(new OrderCriteria("objId",SelectQuery.Order.ASC.name()));
		checkDefaultOrderCriteria(m,order);
	
		assertTrue(findMethod( DepartmentDC.class,"setAutoCreateObjectRule" ,new Class[]{DCRule.class}));

		
	}

	
	
}
