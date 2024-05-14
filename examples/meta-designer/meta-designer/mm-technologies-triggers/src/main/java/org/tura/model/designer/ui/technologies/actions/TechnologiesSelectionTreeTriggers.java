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

package org.tura.model.designer.ui.technologies.actions;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.omnifaces.util.Beans;
import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.ui.technologies.mmdesigner.technologies.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.uuiclient.model.TreeModelTriggers;
import org.tura.platform.uuiclient.model.tree.TreeNode;

public class TechnologiesSelectionTreeTriggers implements TreeModelTriggers, Serializable{

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private ELResolver elResolver;
	
	TechnologiesSelectionTreeTriggers (ELResolver elResolver){
		this.elResolver = elResolver;
	}
	
	@Override
	public void onNodeSelect(TreeNode expnode) throws Exception {
		CdiAppExchange ex = Beans.getReference(CdiAppExchange.class);
		IBeanFactory bf = Beans.getReference(IBeanFactory.class);
		ObjectControl oc =  (ObjectControl) bf.getTreeRootDomainArtifacts().getCurrentObject();
		Map<String, Object> selected = new HashMap<>();
		selected.put("path", oc.getPath());
		selected.put("class", oc.getProxyClazz().getName());
		ex.addObject("selectedTechnologies", selected);
	}

	@Override
	public void onNodeUnSelect(TreeNode expnode) {
		CdiAppExchange ex = Beans.getReference(CdiAppExchange.class);
		ex.removeObject("selectedTechnologies");
	}

	@Override
	public void onNodeExpand() {
		
	}

	@Override
	public void onNodeCollapse() {
		
	}

	@Override
	public void customizeObject(Object source, Object target) {
		
	}

}
