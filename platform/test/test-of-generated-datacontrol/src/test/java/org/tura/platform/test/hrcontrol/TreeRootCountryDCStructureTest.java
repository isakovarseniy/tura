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

package org.tura.platform.test.hrcontrol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDependency;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.CountryDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.TreeRootCountryDC;

public class TreeRootCountryDCStructureTest {

	
	@Test
	public void checkTreeRootCountryDCStructure(){
		assertEquals(2, TreeRootCountryDC.class.getDeclaredMethods().length);

		assertTrue(findMethod( TreeRootCountryDC.class,"setRoot" , new Class[]{CountryDC.class}));
		
		assertTrue(findMethod( TreeRootCountryDC.class,"setDependency" , new Class[]{List.class}));
		Method m = getMethod( TreeRootCountryDC.class,"setDependency" , new Class[]{List.class});
		ArrayList<String> ls = new ArrayList<>();
		ls.add("#{beanFactoryHrManagerHRController.department}");
		checkDependency(m,ls);
		
		
	}

	
}
