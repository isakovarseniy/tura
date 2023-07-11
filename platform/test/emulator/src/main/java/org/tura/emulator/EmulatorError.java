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

package org.tura.emulator;

public enum EmulatorError {
	EML00001("00001", "Base path is empty"),
	EML00002("00002", "Service name cannot be empty"),
	EML00003("00003", "Method name cannot be empty");
	
	
	private String code;
	private String template;
	
	EmulatorError( String code, String template) {
	  this.code = code;
	  this.template = template;
	}
	
	
	public String getMessage(Object... parameters){
		return String.format(this.code + " -- "+ this.template, parameters);
	}
	
	public String getMessage(){
		return this.code + " -- "+ this.template;
	}
	
}
