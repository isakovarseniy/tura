/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.jpa.test;

import org.junit.BeforeClass;

import objects.test.serialazable.jpa.Department1;
import objects.test.serialazable.jpa.Employee1;

public class D1SingleObjectPagingTest extends AbstractSingleObjectPagingTest{

	@BeforeClass
	public static void beforeClass() throws Exception {
		AbstractSingleObjectPagingTest.deparmentClass = Department1.class;
		AbstractSingleObjectPagingTest.employeeClass = Employee1.class;
		AbstractSingleObjectPagingTest.deparmentString = "Department1";
		AbstractSingleObjectPagingTest.employeeString = "Employee1";
		AbstractSingleObjectPagingTest.beforeClass();
	}
	
}
