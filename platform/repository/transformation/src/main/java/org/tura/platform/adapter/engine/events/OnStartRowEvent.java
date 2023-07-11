/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.adapter.engine.events;

import org.tura.platform.adapter.engine.api.Cursor;
import org.tura.platform.adapter.engine.api.Event;

public class OnStartRowEvent extends Event{

	private Cursor<?> cursor;
	
	public OnStartRowEvent(Cursor<?> cursor) {
		this.cursor = cursor;
	}

	public Cursor<?> getCursor() {
		return cursor;
	}

	public void setCursor(Cursor<?> cursor) {
		this.cursor = cursor;
	} 
	
	@Override
	public String getKey() {
		return OnStartRowEvent.class.getName()+"-"+cursor.getClass().getName();
	} 
	
	public static String buildKey(String cursorName) {
		return OnStartRowEvent.class.getName()+"-"+cursorName;
	}	
	
	
}
