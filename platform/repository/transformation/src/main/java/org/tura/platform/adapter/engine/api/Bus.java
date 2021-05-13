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

package org.tura.platform.adapter.engine.api;

public class Bus {

	protected TransformRepository repository;

	public void setRepository(TransformRepository repository) {
		this.repository = repository;
	}

	public void sendEvent(Event event) throws Exception {
		notifyListners(event);

	}

	private void notifyListners(Event event) throws Exception {
		if (repository != null) {
			OperationListner processor = repository.findListener(event.getKey());
			if (processor != null) {
				processor.process(event);
			}
		}
	}
}
