/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DomainArtifactsHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ModelMapperArtifactName;
import org.tura.metamodel.sirius.properties.selections.events.ModelMapperArtifactChangeEvent;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.tree.TreePropertySelectioin;

import artifact.Artifact;

public class ArtifactPropertySelection extends TreePropertySelectioin{

	@Override
	public String getLabelText() {
		return "Artifact:";
	}

	@Override
	public TreeRoot getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(  new DomainArtifactsHolder(new QueryHelper().getDomainArtifact(getModel())));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}


	@Override
	protected void showError() {
		
	}

	public void afterUpdate(){
		Bus.getInstance().notify(new ModelMapperArtifactChangeEvent());
	}
	
	@Override
	protected TextDataAdapter getDataAdapter() {
		return new ModelMapperArtifactName();
	}

	@Override
	protected Class<?> getComaringClass() {
		return Artifact.class;
	}

}
