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

package org.tura.platform.uuiclient.menu;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.tura.platform.uuiclient.rest.DataUpdateRequest;
import org.tura.platform.uuiclient.rest.EventDescription;
import org.tura.platform.uuiclient.rest.UuiElement;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public interface MenuElement extends Serializable  {

	public String getId();

	public void setId(String id);

	public boolean isRendered();

	public UuiElement restoreContext(Map<String, Object> map, DataUpdateRequest request, ResponseState responseState,
			List<EventDescription> eventsToFire) throws Exception;

}
