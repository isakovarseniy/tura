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

package org.tura.model.designer.exchange;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.tura.platform.uuiclient.annotations.SharedClientScoped;

@SharedClientScoped
public class CdiAppExchange implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> exchange = new HashMap<String, Object>();
	
	public void addObject(String key , Object obj) {
		exchange.put(key, obj);
	}

	public void removeObject(String key) {
		exchange.remove(key);
	}
	
	public Object getObject(String key) {
		return exchange.get(key);
	}
	
}
