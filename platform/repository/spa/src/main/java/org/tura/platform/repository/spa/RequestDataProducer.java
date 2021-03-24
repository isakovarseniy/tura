/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.List;
import java.util.Map;

public abstract class RequestDataProducer {
	
	public abstract SpaRepositoryData getTheadData();

	
	public List<Object> getCommandStack() {
		SpaRepositoryData data = getTheadData();
		return data.getCommandStack();
	}

	
	public Map<String, Map<Object, SpaControl>> getCache() {
		SpaRepositoryData data = getTheadData();
		return data.getCache();

	}

	public List<SpaControl> getNomergeRules() {
		SpaRepositoryData data = getTheadData();
		return data.getNomergeRules();
	}

	public int getSequence() {
		SpaRepositoryData data = getTheadData();
		int i = data.getSequence();
		data.setSequence(i + 1);
		return i;
	}
	
	public void setSequence(int i) {
		SpaRepositoryData data = getTheadData();
		data.setSequence(i);
	}
	
	
	public Map<String, Map<Object, Object>> getKeyMapper() {
		SpaRepositoryData data = getTheadData();
		return data.getKeyMaper();
	}

	
}
