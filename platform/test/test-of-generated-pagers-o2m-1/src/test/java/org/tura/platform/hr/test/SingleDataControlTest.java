/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.hr.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.hr.init.FactoryDC;
import org.tura.platform.repository.spa.test.SearchService;
import org.tura.platform.test.SingleDataControl;
import org.tura.platform.uuiclient.model.GridModel;
import org.tura.platform.uuiclient.model.GridType;

import objects.test.serialazable.jpa.IndepObject1;
import objects.test.serialazable.jpa.SPAObject1;

public class SingleDataControlTest extends SingleDataControl {

	
	
	@SuppressWarnings("unchecked")
	@Test
	public void pagingForSpa1() {
		try {
			DataControl<IndepObject1> dc = ((FactoryDC) factory).initSPAObject1("");
			dc.getElResolver().setValue("spaobject", dc);
			SearchService.MAX = 10000;

			GridModel model = new GridModel(dc, null, GridType.MultiSelect, "1");

//			first=0  pageSize=10
			model.setFirst(0);
			model.setPageSize(10);
			List<Object> ls = model.load();
			SPAObject1 spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());

//			first=10  pageSize=10
			model.setFirst(10);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(10L, (long)spa.getSpaObj1());

//			first=20  pageSize=10
			model.setFirst(20);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(20L, (long)spa.getSpaObj1());

//			first=30  pageSize=10
			model.setFirst(30);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(30L, (long)spa.getSpaObj1());

//			first=40  pageSize=10
			model.setFirst(40);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(40L, (long)spa.getSpaObj1());

//			first=50  pageSize=10			
			model.setFirst(50);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(50L, (long)spa.getSpaObj1());

//			first=60  pageSize=10			
			model.setFirst(60);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(60L, (long)spa.getSpaObj1());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void pagingForSpa2() {
		try {
			DataControl<IndepObject1> dc = ((FactoryDC) factory).initSPAObject1("");
			dc.getElResolver().setValue("spaobject", dc);

			GridModel model = new GridModel(dc, null, GridType.MultiSelect, "1");
			SearchService.MAX = 30;

//			first=0  pageSize=10
			model.setFirst(0);
			model.setPageSize(10);
			List<Object> ls = model.load();
			SPAObject1 spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());

//			first=10  pageSize=10
			model.setFirst(10);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(10L, (long)spa.getSpaObj1());

//			first=20  pageSize=10
			model.setFirst(20);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(20L, (long)spa.getSpaObj1());

//			first=30  pageSize=10
			model.setFirst(30);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(20L, (long)spa.getSpaObj1());


		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
	
	@Test
	@SuppressWarnings("unchecked")
	public void pagingForSpa3() {
		try {
			DataControl<IndepObject1> dc = ((FactoryDC) factory).initSPAObject1("");
			dc.getElResolver().setValue("spaobject", dc);

			GridModel model = new GridModel(dc, null, GridType.MultiSelect, "1");
			SearchService.MAX = 10;

//			first=0  pageSize=10
			model.setFirst(0);
			model.setPageSize(10);
			List<Object> ls = model.load();
			SPAObject1 spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());

//			first=10  pageSize=10
			model.setFirst(10);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());



		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void pagingForSpa4() {
		try {
			SearchService.MAX = 10000;
	
			DataControl<IndepObject1> dc = ((FactoryDC) factory).initSPAObject1("");
			dc.getElResolver().setValue("spaobject", dc);

			GridModel model = new GridModel(dc, null, GridType.MultiSelect, "1");

//			first=0  pageSize=10
			model.setFirst(0);
			model.setPageSize(10);
			List<Object> ls = model.load();
			SPAObject1 spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());

//			first=10  pageSize=10
			model.setFirst(10);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(10L, (long)spa.getSpaObj1());

//			first=20  pageSize=10
			model.setFirst(20);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(20L, (long)spa.getSpaObj1());

//			first=30  pageSize=10
			model.setFirst(30);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(30L, (long)spa.getSpaObj1());

//			first=40  pageSize=10
			model.setFirst(40);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(40L, (long)spa.getSpaObj1());

//			first=50  pageSize=10			
			model.setFirst(50);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(50L, (long)spa.getSpaObj1());

//			first=60  pageSize=10			
			model.setFirst(60);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(60L, (long)spa.getSpaObj1());

			
//			first=70  pageSize=10			
			model.setFirst(70);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(70L, (long)spa.getSpaObj1());
			
//			first=80  pageSize=10			
			model.setFirst(80);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(80L, (long)spa.getSpaObj1());
			
			
//			first=90  pageSize=10			
			model.setFirst(90);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(90L, (long)spa.getSpaObj1());

//			first=100  pageSize=10			
			model.setFirst(100);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(100L, (long)spa.getSpaObj1());
						

//			first=110  pageSize=10			
			model.setFirst(110);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(110L, (long)spa.getSpaObj1());
			
//			first=100  pageSize=10			
			model.setFirst(100);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(100L, (long)spa.getSpaObj1());

//			first=90  pageSize=10			
			model.setFirst(90);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(90L, (long)spa.getSpaObj1());
			
//			first=80  pageSize=10			
			model.setFirst(80);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(80L, (long)spa.getSpaObj1());
			
//			first=70  pageSize=10			
			model.setFirst(70);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(70L, (long)spa.getSpaObj1());
			
			
//			first=60  pageSize=10			
			model.setFirst(60);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(60L, (long)spa.getSpaObj1());
			
			
//			first=50  pageSize=10			
			model.setFirst(50);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(50L, (long)spa.getSpaObj1());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void pagingForSpa5() {
		try {
			SearchService.MAX = 10000;
	
			DataControl<IndepObject1> dc = ((FactoryDC) factory).initSPAObject1("");
			dc.getElResolver().setValue("spaobject", dc);

			GridModel model = new GridModel(dc, null, GridType.MultiSelect, "1");

//			first=0  pageSize=10
			model.setFirst(0);
			model.setPageSize(10);
			List<Object> ls = model.load();
			SPAObject1 spa = (SPAObject1) ls.get(0);
			assertEquals(0L, (long)spa.getSpaObj1());

//			first=10  pageSize=10
			model.setFirst(10);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(10L, (long)spa.getSpaObj1());

//			first=20  pageSize=10
			model.setFirst(20);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(20L, (long)spa.getSpaObj1());

//			first=30  pageSize=10
			model.setFirst(30);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(30L, (long)spa.getSpaObj1());

//			first=40  pageSize=10
			model.setFirst(40);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(40L, (long)spa.getSpaObj1());


			
//			first=30  pageSize=10
			model.setFirst(30);
			model.setPageSize(10);
			ls = model.load();
			spa = (SPAObject1) ls.get(0);
			assertEquals(30L, (long)spa.getSpaObj1());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}	
	
	
	
	
}
