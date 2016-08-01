package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DomainArtifactsHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.ModelMapperArtifactName;
import org.tura.metamodel.sirius.properties.selections.event.ArtifactChangeEvent;
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
		Bus.getInstance().notify(new ArtifactChangeEvent());
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
