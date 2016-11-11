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
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDependency;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.DepartmentDC;
import org.tura.example.ui.hrmanager.tree2tree.datacontrol.TreeRootDepartmentDC;
import org.tura.platform.datacontrol.IDataControl;

public class TreeRootDepartmentDCStructureTest {

	
	@Test
	public void checkTreeRootFileDCStructure(){
		assertEquals(3, TreeRootDepartmentDC.class.getDeclaredMethods().length);

		assertTrue(findMethod( TreeRootDepartmentDC.class,"handleChangeRecord" , new Class[]{IDataControl.class,Object.class}));

		assertTrue(findMethod( TreeRootDepartmentDC.class,"setRoot" , new Class[]{DepartmentDC.class}));
		
		assertTrue(findMethod( TreeRootDepartmentDC.class,"setDependency" , new Class[]{List.class}));
		Method m = getMethod( TreeRootDepartmentDC.class,"setDependency" , new Class[]{List.class});
		ArrayList<String> ls = new ArrayList<>();
		checkDependency(m,ls);
		
		
	}

	
}
