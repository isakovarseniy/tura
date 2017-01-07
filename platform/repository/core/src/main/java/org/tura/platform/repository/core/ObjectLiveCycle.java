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
package org.tura.platform.repository.core;

import java.util.HashMap;

public abstract class ObjectLiveCycle {

	public abstract Object load(Object obj,
	        HashMap<String, Object> context, HashMap<String, Rule> rules) throws Exception;
	public abstract void save(Object obj,HashMap<String, Rule> rules) throws Exception;
	
	private DataProvider provider;
	
	
	public DataProvider getProvider() {
		return provider;
	}
	public void setProvider(DataProvider provider) {
		this.provider = provider;
	}
	

	
}
