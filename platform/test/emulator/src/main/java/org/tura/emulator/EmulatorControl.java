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

package org.tura.emulator;

import org.tura.emulator.cmd.EmulatorCommand;
import org.tura.emulator.cmd.ExceptionObjectCommand;
import org.tura.emulator.cmd.ReturnObjectCommand;
import org.tura.emulator.lyfecycle.SessionType;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmulatorControl extends EmulatorStorage {

	public EmulatorControl(String serviceName, String methodName) throws Exception {
		super(serviceName, methodName);
	}

	
	public void createReturnObjectCommand(Integer sequence, String type , String payload) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(new ReturnObjectCommand(type, payload,0L));
		
		this.createCommand(ReturnObjectCommand.class.getName(), str,sequence);
	}

	
	public void createReturnObjectCommand(Integer sequence, String type , String payload, long dalay) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(new ReturnObjectCommand(type, payload,dalay));
		
		this.createCommand(ReturnObjectCommand.class.getName(), str,sequence);
	}

	public void createExceptionObjectCommand(Integer sequence,String code, String message) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(new ExceptionObjectCommand(code, message));

		this.createCommand(ExceptionObjectCommand.class.getName(), str,sequence);
	}

	public Object getResponse() throws Exception {
		Session session = this.loadSessionFromFile();

		EmulatorCommand cmd = this.loadCommand(session.getCurrentStep());
		session = SessionType.valueOf(session.getSessionType()).updateSession(session, this);
		this.saveSessionToFile(session);

		return cmd.execute();

	}
	
	
	public String getResponseAsString() throws Exception {
		Session session = this.loadSessionFromFile();

		EmulatorCommand cmd = this.loadCommand(session.getCurrentStep());
		session = SessionType.valueOf(session.getSessionType()).updateSession(session, this);
		this.saveSessionToFile(session);

		return cmd.stringPayload();

	}	
	
	public void resetSessin() throws Exception{
		Session session = this.loadSessionFromFile();
		session.setCurrentStep(1);
		this.saveSessionToFile(session);
	}

}
