/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDependency;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.FileDC;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.TreeRootFileDC;

public class TreeRootFileDCStructureTest {

	
	@Test
	public void checkTreeRootFileDCStructure(){
		assertEquals(2, TreeRootFileDC.class.getDeclaredMethods().length);

		assertTrue(findMethod( TreeRootFileDC.class,"setRoot" , new Class[]{FileDC.class}));
		
		assertTrue(findMethod( TreeRootFileDC.class,"setDependency" , new Class[]{List.class}));
		Method m = getMethod( TreeRootFileDC.class,"setDependency" , new Class[]{List.class});
		ArrayList<String> ls = new ArrayList<>();
		checkDependency(m,ls);
		
		
	}

	
}
