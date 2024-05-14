/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.model.designer.ui.artifacts.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.tura.model.designer.ui.artifacts.mmdesigner.artifacts.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.artifacts.mmdesigner.artifacts.viewmodel.IViewPortHolder;
import org.tura.model.designer.ui.tree.actions.CommonFunctions;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class ArtifactsViewActions extends CommonFunctions{


	@Inject
	ResponseState responseState;

	@Inject
	IViewPortHolder viewPortHolder;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;
	
	@Inject
	IBeanFactory bf;

	private transient Logger logger = Logger.getLogger(ArtifactsViewActions.class.getName());
	
	
	
	public void switchToMainProperties(){
		viewPortHolder.setArtifactDetails(IViewPortHolder.ARTIFACTDETAILS_MAIN);
		bf.setCurrentActiveId(0);
	}

	public void switchToTechnologiesProperties() {
		viewPortHolder.setArtifactDetails(IViewPortHolder.ARTIFACTDETAILS_TECHNOLOGIES);
		bf.setCurrentActiveId(1);
	}

	public void  switchToHintsProperties() {
		viewPortHolder.setArtifactDetails(IViewPortHolder.ARTIFACTDETAILS_HINTS);
		bf.setCurrentActiveId(2);
	}
	
	public void switchToVarProperties(){
		viewPortHolder.setArtifactDetails(IViewPortHolder.ARTIFACTDETAILS_VARIABLES);
		bf.setCurrentActiveId(3);
	}
	
	public void switchToHashProperties(){
		viewPortHolder.setArtifactDetails(IViewPortHolder.ARTIFACTDETAILS_HASH);
		bf.setCurrentActiveId(4);
	}
	
	

	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
			addInfomessage(responseState, "DATA_PERSISTED",elResolver,IBeanFactory.MESSAGES);
		} catch (Exception e) {
			addInfomessage(responseState, "ERROR_DURING_PERSISTING",elResolver,IBeanFactory.MESSAGES);
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	public void createArtifact(){
		try {
			bf.getArtifact().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	
	public void createQuery(){
		try {
			bf.getModelQuery().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
	public void createParameter(){
		try {
			bf.getQueryParameter().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	
}
