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

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.tura.emulator.cmd.EmulatorCommand;
import org.tura.emulator.cmd.PersistedCommand;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmulatorStorage {

	private String basePath;
	private String serviceName;
	private String methodName;
	
	public EmulatorStorage(String serviceName, String methodName) throws Exception {
		basePath = System.getProperty(Constants.BASE_PATH_PARAMETER);
		if (basePath == null) {
			throw new Exception(EmulatorError.EML00001.getMessage());
		}

		if (serviceName == null) {
			throw new Exception(EmulatorError.EML00002.getMessage());
		}
		
		if (methodName == null) {
			throw new Exception(EmulatorError.EML00003.getMessage());
		}
		
		this.serviceName = serviceName;
		this.methodName = methodName;
		
	}
	
	public void initSession( String sessionType) throws Exception {
		FileUtils.deleteDirectory(Paths.get(basePath, serviceName,methodName).toFile());
		FileUtils.forceMkdir(Paths.get(basePath, serviceName,methodName).toFile());
		saveSessionToFile( new Session(sessionType));
	}

	protected void createCommand(String executorType, String payload, Integer sequence) throws Exception {
		PersistedCommand cmd  = new PersistedCommand(sequence, executorType, payload);
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(cmd);
		saveComandToFile( Integer.valueOf(sequence), str );
	}

	protected Session  loadSessionFromFile(  ) throws Exception {
		File file = Paths.get(basePath, serviceName,methodName , Constants.SESSION_FILE).toFile();
		String str = FileUtils.readFileToString( file,  Charset.defaultCharset());

		ObjectMapper mapper = new ObjectMapper();
		Session session = mapper.readValue(str,Session.class);
		return session;
	}

	protected void saveSessionToFile( Session session) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(session);

		File file = Paths.get(basePath, serviceName,methodName , Constants.SESSION_FILE).toFile();
		FileUtils.writeStringToFile( file, str, Charset.defaultCharset(), false);
	}

	
	
	public EmulatorCommand loadCommand( Integer sequence) throws Exception {
		String str = loadComandFromFile(sequence);
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));

		PersistedCommand  cmd =  mapper.readValue(str, PersistedCommand.class);
		
		@SuppressWarnings("unchecked")
		Class<EmulatorCommand> cmdClass = (Class<EmulatorCommand>) Class.forName(cmd.getExecutor());
		
		EmulatorCommand  emlCmd =  mapper.readValue(cmd.getPayload(), cmdClass);
		return emlCmd;
	}

    public void saveCommand( Integer sequence, EmulatorCommand cmd ) throws Exception {
    	
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
		String payload = mapper.writeValueAsString(cmd);
		
		String str = mapper.writeValueAsString(new PersistedCommand(sequence, cmd.getClass().getName(), payload));
		saveComandToFile(sequence,str);
    }
    
	
	private void saveComandToFile( Integer sequence, String payload) throws Exception {

		File file = Paths.get(basePath, serviceName, methodName ,sequence.toString() ).toFile();
		FileUtils.writeStringToFile( file, payload, Charset.defaultCharset(), false);

	}
	
	private String loadComandFromFile(Integer sequence) throws Exception {

		File file = Paths.get(basePath, serviceName, methodName ,sequence.toString() ).toFile();
		return FileUtils.readFileToString( file,Charset.defaultCharset());

	}
	
}
