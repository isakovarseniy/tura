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

package org.tura.platform.repository.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.tura.platform.repository.jpa.test.BusinessObjectTest;
import org.tura.platform.repository.jpa.test.CommandValidationOne2ManyTest;
import org.tura.platform.repository.jpa.test.CommandValidationOne2OneTest;
import org.tura.platform.repository.jpa.test.D1SingleObjectPagingTest;
import org.tura.platform.repository.jpa.test.D2SingleObjectPagingTest;
import org.tura.platform.repository.jpa.test.JPARepositoryTest;
import org.tura.platform.repository.jpa.test.JPATest;
import org.tura.platform.repository.jpa.test.Many2ManyNoContainmentTest;
import org.tura.platform.repository.jpa.test.Many2ManyTest;
import org.tura.platform.repository.jpa.test.One2ManyContainmentTest;
import org.tura.platform.repository.jpa.test.One2ManyNoContaintmantTest;
import org.tura.platform.repository.jpa.test.One2ManyTest;
import org.tura.platform.repository.jpa.test.One2OneDirectContaintmentTest;
import org.tura.platform.repository.jpa.test.One2OneNoContainmentTest;
import org.tura.platform.repository.jpa.test.One2OneOpositContaintmentTest;
import org.tura.platform.repository.jpa.test.One2OneTest;
import org.tura.platform.repository.mixed.test.AdapterTest;
import org.tura.platform.repository.mixed.test.DiffOne2ManyTest;
import org.tura.platform.repository.mixed.test.DiffOne2OneTest;
import org.tura.platform.repository.mixed.test.MixedRepositoryTest;
import org.tura.platform.repository.mixed.test.ObjectsLinkTest;
import org.tura.platform.repository.mixed.test.TriggersValidationTest;
import org.tura.platform.repository.spa.test.MultipleSpaObjectsTest;
import org.tura.platform.repository.spa.test.SpaRepositoryInternalRelationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 

	JPATest.class,
	DiffOne2ManyTest.class,
	AdapterTest.class,
	DiffOne2OneTest.class,
	MixedRepositoryTest.class,
	TriggersValidationTest.class,
	ObjectsLinkTest.class,
	
	CommandValidationOne2OneTest.class,
	CommandValidationOne2ManyTest.class,
	
	One2OneNoContainmentTest.class,
	One2ManyTest.class,
	One2ManyContainmentTest.class,
	One2OneTest.class,
	Many2ManyTest.class,
	One2ManyNoContaintmantTest.class,
	JPARepositoryTest.class,
	One2OneOpositContaintmentTest.class,
	BusinessObjectTest.class,
	Many2ManyNoContainmentTest.class,
	One2OneDirectContaintmentTest.class,
	
	SpaRepositoryInternalRelationTest.class,
	MultipleSpaObjectsTest.class,

	D1SingleObjectPagingTest.class,
	D2SingleObjectPagingTest.class,
	
}
)
public class RepositoryTestSuite {
	
	public static boolean lazyObjectRepository = false;
	
	
	public static boolean isLazyObjectRepository() {
		return lazyObjectRepository;
	}
	
}
