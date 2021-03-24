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

package org.tura.emulator.cmd;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReturnObjectCommand implements EmulatorCommand{

	private String className;
	private String payload;
	private long dalay;
	

	public ReturnObjectCommand() {
	}
	
	
	public ReturnObjectCommand(String  className, String payload, long dalay) {
		this.className = className;
		this.payload = payload;
		this.dalay = dalay;
	}
	
	public String getClassName() {
		return className;
	}


	public long getDalay() {
		return dalay;
	}


	public void setDalay(long dalay) {
		this.dalay = dalay;
	}


	
	public void setClassName(String className) {
		this.className = className;
	}


	public String getPayload() {
		return payload;
	}


	public void setPayload(String payload) {
		this.payload = payload;
	}


	@Override
	public Object execute() throws Exception {
		if ( this.dalay != 0) {
			Thread.sleep(dalay*1000);
		}

		Class<?> clazz = Class.forName(className);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(payload, clazz);
	}

	@Override
	public String stringPayload() throws Exception {
		if ( this.dalay != 0) {
			Thread.sleep(dalay*1000);
		}
		return payload;
	}

	
	
}
