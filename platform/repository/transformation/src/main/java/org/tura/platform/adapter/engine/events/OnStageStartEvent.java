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

package org.tura.platform.adapter.engine.events;

import org.tura.platform.adapter.engine.api.Event;

public class OnStageStartEvent extends Event{
	
	private String fromStage;
	private String toStage;
	
	public OnStageStartEvent ( String fromStage, String toStage) {
		this.fromStage = fromStage;
		this.toStage = toStage;
	}
	public String getFromStage() {
		return fromStage;
	}
	public void setFromStage(String fromStage) {
		this.fromStage = fromStage;
	}
	public String getToStage() {
		return toStage;
	}
	public void setToStage(String toStage) {
		this.toStage = toStage;
	}
	
	@Override
	public String getKey() {
		return OnStageStartEvent.class.getName()+"-"+fromStage+"-"+toStage;
	} 	
	
	public static String buildKey(String fromStage,String toStage) {
		return OnStageStartEvent.class.getName()+"-"+fromStage+"-"+toStage;
	}

}
