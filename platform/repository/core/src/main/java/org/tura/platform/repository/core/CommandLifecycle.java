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

package org.tura.platform.repository.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandLifecycle implements Serializable{
	
	private static final long serialVersionUID = 5126110376540915386L;
	Registry registry;
	Exception exception;
	Map<String, Object> context = new HashMap<>();
	
	public CommandLifecycle(Registry registry) {
	  this.registry = registry;	
	}

	public LifecycleReturn preprocess(Object change) throws RepositoryException {
		return LifecycleReturn.Continue;
	}

	public LifecycleReturn postprocess(Object change) throws RepositoryException{
		return LifecycleReturn.Continue;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	@SuppressWarnings("rawtypes")
	public List preprocessChangeSequence(List changes) {
		return changes;
	}
	
	public void beforeCommit() {
		
	}

	public void afterCommit() {
		
	}

	public void beforeRollback() {
		
	}

	public void afterRollback() {
		
	}

	public void beforeTransaction() {
		
	}

	public enum LifecycleReturn {
		Continue,
		Skip,
		Break,
		Error;
	}


}

