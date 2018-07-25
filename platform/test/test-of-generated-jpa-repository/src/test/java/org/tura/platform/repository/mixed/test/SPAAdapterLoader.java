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
package org.tura.platform.repository.mixed.test;

import org.tura.jpa.test.W1;
import org.tura.jpa.test.W2;
import org.tura.jpa.test.W3;
import org.tura.platform.repository.core.AdapterLoader;


public class SPAAdapterLoader  implements AdapterLoader{

	@Override
	public Object newAdapter(Class<?> clazz) {
		if (W1.class.equals(clazz)){
			return new W1Adapter(new W1Source());
		}
		
		if (W2.class.equals(clazz)){
			return new W2Adapter(new W2Source());
		}
		if (W3.class.equals(clazz)){
			return new W3Adapter(new W3Source());
		}
		throw new RuntimeException("Unsupportable class "+clazz );
	}

	@Override
	public Object wrapObject(Object obj) {
		if (obj instanceof W1Source){
			return new W1Adapter(obj);
		}else{
			throw new RuntimeException("Unsupportable class "+obj.getClass().getName() );
		}
	}

	@Override
	public Object unWrapObject(Object obj) {
		if (obj instanceof W1Adapter){
			return  ((W1Adapter) obj).getObj();
		}else{
			throw new RuntimeException("Unsupportable class "+obj.getClass().getName() );
		}
	}

}
