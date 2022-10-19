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

package org.tura.platform.uuiclient.rest.client.commands;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.tura.platform.uuiclient.rest.DataUpdateResponse;

@RequestScoped
public class ResponseState {

	@Inject
	private LifeCycleRegistry lifeCycleRegistry;

	private DataUpdateResponse response = new DataUpdateResponse();
	private boolean validationError;
	private boolean applicationError;
	private boolean rollBack;

	public Validator findValidatorByType(Class<?> clazz) {
		return lifeCycleRegistry.findValidatorByType(clazz);
	}

	public Validator findValidatorByIdElement(String id) {
		return lifeCycleRegistry.findValidatorByIdElement(id);
	}

	public Converter findConverterByType(Class<?> clazz) {
		return lifeCycleRegistry.findConverterByType(clazz);
	}

	public Converter findConverterByIdElement(String id) {
		return lifeCycleRegistry.findConverterByIdElement(id);
	}
	
	public KeyConverter findKeyConverterById( String id) {
		return lifeCycleRegistry.findKeyConverterById(id);
	}

	public ContextRef findContextRef(String form) {
		return lifeCycleRegistry.findContextRef(form);
	}

	
	public void addFatalValidationError(Exception e) {
		ProgramSource programSource = lifeCycleRegistry.getFatalValidationErrorProcessor();
		if (programSource != null) {
			List<ClientCommand> program = programSource.generateProgram(e);
			if (program != null && program.size() != 0) {
				response.getFatalClientErrors().addAll(program);
			}
		}
	}

	public void addFatalError(Object ...args) {
		ProgramSource programSource = lifeCycleRegistry.getFatalErrorProcessor();
		if (programSource != null) {
			List<ClientCommand> program = programSource.generateProgram(args);
			if (program != null && program.size() != 0) {
				response.getFatalClientErrors().addAll(program);
			}
		}
	}

	public void addValidationError(List<ClientCommand> program) {
		validationError = true;
		if (program != null && program.size() != 0) {
			response.getExecuteClientActions().addAll(program);
		}
	}

	public void addApplicationError(List<ClientCommand> program) {
		applicationError = true;
		if (program != null && program.size() != 0) {
			response.getExecuteClientActions().addAll(program);
		}
	}

	public void addCommand(ClientCommand cmd) {
		if (cmd != null) {
			response.getExecuteClientActions().add(cmd);
		}
	}

	public boolean isValidationError() {
		return validationError;
	}

	public boolean isApplicationError() {
		return applicationError;
	}

	public boolean isRollBack() {
		return rollBack;
	}

	public void setRollBack(boolean rollBack) {
		this.rollBack = rollBack;
	}

	public DataUpdateResponse getResponse() {
		return this.response;
	}

}
