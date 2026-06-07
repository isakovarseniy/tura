/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.inject.Inject;

import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.artifact.Artifact;
import org.tura.model.designer.repository.serialized.artifact.ConfigHash;
import org.tura.model.designer.repository.serialized.artifact.ConfigHashWithNickName;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariable;
import org.tura.model.designer.repository.serialized.artifact.ConfigVariableWithNickName;
import org.tura.model.designer.repository.serialized.artifact.GenerationHint;
import org.tura.model.designer.repository.serialized.artifact.GenerationHintWithNickName;
import org.tura.model.designer.repository.serialized.artifact.Option;
import org.tura.model.designer.repository.serialized.artifact.TechLeaf;
import org.tura.model.designer.repository.serialized.artifact.Technology;
import org.tura.model.designer.ui.artifacts.mmdesigner.artifacts.datacontrol.IBeanFactory;
import org.tura.model.designer.ui.artifacts.mmdesigner.artifacts.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.client.commands.HidePopup;
import org.tura.platform.uuiclient.rest.client.commands.OpenPopup;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class TechnologyPropertyActions {

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

	@Inject
	CdiAppExchange exchange;
	
	
	private static String OPTIONS_SELECTION = "OPTIONS_SELECTION";
	private static String GENERATION_HINT_SELECTION = "GENERATION_HINT_SELECTION";
	private static String CONFIG_VAR_SELECTION = "CONFIG_VAR_SELECTION";
	private static String CONFIG_HASH_SELECTION = "CONFIG_HASH_SELECTION";
	
	

	private transient Logger logger = Logger.getLogger(TechnologyPropertyActions.class.getName());

	public void openPopupForOptionSelection() {
		try {
			bf.setTechSelection(OPTIONS_SELECTION);
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public boolean renderOptionSelectionButtons() {
	    return OPTIONS_SELECTION.equals(bf.getTechSelection());
	}
	
	public void openPopupForGenHntSelection() {
		try {
			bf.setTechSelection(GENERATION_HINT_SELECTION);
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}
	
	public boolean renderGenHntSelectionButtons() {
	    return GENERATION_HINT_SELECTION.equals(bf.getTechSelection());
	}
	
	
	public void  openPopupForConfVarSelection()	 throws Exception{
		try {
			bf.setTechSelection(CONFIG_VAR_SELECTION);
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}
	
	public boolean renderConfVarSelectionButtons() {
	    return CONFIG_VAR_SELECTION.equals(bf.getTechSelection());
	}
	
	
	
	public void  openPopupForConfHashSelection()	 throws Exception{
		try {
			bf.setTechSelection(CONFIG_HASH_SELECTION);
			OpenPopup cmd1 = new OpenPopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}		
	}		
	
	
	public boolean renderConfHashSelectionButtons() {
	    return CONFIG_HASH_SELECTION.equals(bf.getTechSelection());
	}
	
	
	public void acceptSelectedTechnologies() {
		try {
			
			if (OPTIONS_SELECTION.equals(bf.getTechSelection())) {
				acceptSelectedTechnologiesForOptions();
			}
			if (GENERATION_HINT_SELECTION.equals(bf.getTechSelection())) {
				acceptSelectedTechnologiesForGenerationHint();
			}
			if (CONFIG_VAR_SELECTION.equals(bf.getTechSelection())) {
				acceptSelectedTechnologiesForConfigVar();
			}
			if (CONFIG_HASH_SELECTION.equals(bf.getTechSelection())) {
				acceptSelectedTechnologiesForConfigHash();
			}
			
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}
	

	@SuppressWarnings({ "unchecked" })
	public void acceptSelectedTechnologiesForOptions() throws Exception{
			Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

			if (selected != null) {
				String className = (String) selected.get("class");
				RepoKeyPath path = (RepoKeyPath) selected.get("path");
				if (className != null && path != null && TechLeaf.class.getName().equals(className)) {
					Technology tech = (Technology) bf.getTechnology().getCurrentObject();
					TechLeaf leaf = (TechLeaf) repository.find(path, TechLeaf.class);
					Option option = repository.create(Option.class);
					tech.getOptions().add(option);
					option.setValue(leaf);
				}
			}
	}
	
	@SuppressWarnings("unchecked")
	public void acceptSelectedTechnologiesForGenerationHint() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && GenerationHint.class.getName().equals(className)) {
				Artifact artifact = (Artifact) bf.getArtifact().getCurrentObject();
				GenerationHint hint = (GenerationHint) repository.find(path, GenerationHint.class);
				GenerationHintWithNickName ghnn = repository.create(GenerationHintWithNickName.class);
				artifact.getHints().add(ghnn);
				ghnn.setHint(hint);
				ghnn.setName(hint.getName());
			}
		}		
	}
	
	@SuppressWarnings("unchecked")
	public void acceptSelectedTechnologiesForConfigVar() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && ConfigVariable.class.getName().equals(className)) {
				Artifact artifact = (Artifact) bf.getArtifact().getCurrentObject();
				ConfigVariable cv = (ConfigVariable) repository.find(path, ConfigVariable.class);
				ConfigVariableWithNickName cvnn = repository.create(ConfigVariableWithNickName.class);
				artifact.getConfigVariables().add(cvnn);
				cvnn.setVarRef(cv);
				cvnn.setName(cv.getName());
			}
		}		
	}	
	
	@SuppressWarnings("unchecked")
	public void acceptSelectedTechnologiesForConfigHash() throws Exception {
		Map<String, Object> selected = (Map<String, Object>) exchange.getObject("selectedTechnologies");

		if (selected != null) {
			String className = (String) selected.get("class");
			RepoKeyPath path = (RepoKeyPath) selected.get("path");
			if (className != null && path != null && ConfigHash.class.getName().equals(className)) {
				Artifact artifact = (Artifact) bf.getArtifact().getCurrentObject();
				ConfigHash ch = (ConfigHash) repository.find(path, ConfigHash.class);
				ConfigHashWithNickName chnn = repository.create(ConfigHashWithNickName.class);
				artifact.getConfigHashes().add(chnn);
				chnn.setHash(ch);
				chnn.setName(ch.getName());
			}
		}		

	}	

	public void rejectSelectedTechnologies() {
		try {
			HidePopup cmd1 = new HidePopup();
			cmd1.setTarget("c432bcfa-5051-4d96-815f-c9950e107ec5");
			responseState.addCommand(cmd1);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

}
