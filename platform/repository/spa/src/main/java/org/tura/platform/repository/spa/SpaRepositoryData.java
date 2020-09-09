/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpaRepositoryData {

	private Map<String, Map<Object, SpaControl>> cache = new HashMap<>();
	private List<SpaControl> nomergeRules = new ArrayList<>();
	private int sequence;
	
	public Map<String, Map<Object, SpaControl>> getCache() {
		return cache;
	}
	public void setCache(Map<String, Map<Object, SpaControl>> cache) {
		this.cache = cache;
	}
	public List<SpaControl> getNomergeRules() {
		return nomergeRules;
	}
	public void setNomergeRules(List<SpaControl> nomergeRules) {
		this.nomergeRules = nomergeRules;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	
}
