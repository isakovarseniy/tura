/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.epsilon.command;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelNotFoundException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.tools.EolSystem;


public class EolCommand implements Command{
	
	protected ChangeDescription changeDescription;
	private Resource resource;
	private IEolModule module;
	private String uri;
	private HashMap<String,Object> variables;

	protected IEolModule createModule() throws Exception{
		return new EolModule();
	}
	
	
	public EolCommand(Resource resource,String uri){
		this.resource = resource;
		this.uri = uri;
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public boolean canUndo() {
		return false;
	}

	
	private void parseModule() throws Exception {
		module = createModule();
		module.parse(URI.create(uri));
		
		if (module.getParseProblems().size() > 0) {
			for (ParseProblem problem : module.getParseProblems()) {
				LogUtil.logInfo(problem);
			}
			throw new Exception("Parsing problem for "+uri);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void configureModule() throws EolModelNotFoundException,  EolModelLoadingException {
		
		EolSystem system = new EolSystem();
		system.setContext(module.getContext());
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("System", system));
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("null", null));
		module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		addVariables(module.getContext(), variables);
		
	}
	
	
	@Override
	public void execute() {
		
		InMemoryEmfModel model = new InMemoryEmfModel(resource){
			//Take Global registry 
			//Override original method to avoid exception  "Unavailable type"
			protected Registry getPackageRegistry() {
				if (registry == null) {
						registry = EPackage.Registry.INSTANCE;
				}
				return registry;
			}
		};
		ChangeRecorder recorder = new ChangeRecorder(model.getResource());
		try{
			parseModule();
			configureModule();
			module.getContext().getModelRepository().addModel(model);
			module.execute();
			
		}catch(Exception e){
			LogUtil.log(e);
		}finally{
			changeDescription = recorder.endRecording();
		}
		
	}


	@Override
	public void undo() {
		if (changeDescription != null) {
			changeDescription.applyAndReverse();
		}
	}

	@Override
	public void redo() {
		if (changeDescription != null) {
			changeDescription.applyAndReverse();
		}
	}

	@Override
	public Collection<?> getResult() {
		return null;
	}

	@Override
	public Collection<?> getAffectedObjects() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public String getLabel() {
		return "Epsilon EOL execution";
	}

	@Override
	public String getDescription() {
		return getLabel();
	}

	@Override
	public void dispose() {
		changeDescription = null;
	}

	@Override
	public Command chain(Command command) {
		return null;
	}


	public HashMap<String,Object> getVariables() {
		return variables;
	}


	public void setVariables(HashMap<String,Object> variables) {
		this.variables = variables;
	}

	@SuppressWarnings("unchecked")
	private void addVariables(IEolContext context, Map<String, ?>... variableMaps) {
		for (Map<String, ?> variableMap : variableMaps) {
			for (String key : variableMap.keySet()) {
				module.getContext().getFrameStack().put(Variable.createReadOnlyVariable(key, variableMap.get(key)));				
			}
		}
	}
	
}
