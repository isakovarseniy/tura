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
import org.tura.platform.datacontrol.D1MasterDetailDataControlPoolTest;
import org.tura.platform.datacontrol.D1MasterDetailTest;
import org.tura.platform.datacontrol.D1SingleDataControlPoolTest;
import org.tura.platform.datacontrol.D1SingleDataControlTest;
import org.tura.platform.datacontrol.D2MasterDetailDataControlPoolTest;
import org.tura.platform.datacontrol.D2MasterDetailTest;
import org.tura.platform.datacontrol.D2SingleDataControlPoolTest;
import org.tura.platform.datacontrol.D2SingleDataControlTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 

	D1SingleDataControlTest.class,
	D2SingleDataControlTest.class,
	D1SingleDataControlPoolTest.class,
	D2SingleDataControlPoolTest.class,
	D1MasterDetailTest.class,
	D2MasterDetailTest.class,
	D1MasterDetailDataControlPoolTest.class,
	D2MasterDetailDataControlPoolTest.class
}
)
public class DataControlTestSuite {
	
	public static boolean lazyObjectRepository = false;
	
	
	public static boolean isLazyObjectRepository() {
		return lazyObjectRepository;
	}
	
}
