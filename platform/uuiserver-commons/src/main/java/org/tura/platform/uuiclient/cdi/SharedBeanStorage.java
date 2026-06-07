/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.cdi;

import jakarta.enterprise.context.spi.Contextual;

public class SharedBeanStorage extends BeanStorage {

	private static final long serialVersionUID = 1L;
	
	private static String suffix = ".war";

	public SharedBeanStorage(int initialCapacity) {
		super(initialCapacity);
	}

	@Override
	protected String getBeanId(Contextual<?> type) {
		String id = super.getBeanId(type);
		int index = id.indexOf(suffix);
		if ( index != -1) {
			id = id.substring(index+suffix.length());
		}
		return id;
	}

}
