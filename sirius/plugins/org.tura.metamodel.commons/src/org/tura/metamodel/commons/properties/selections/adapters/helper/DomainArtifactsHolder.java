package org.tura.metamodel.commons.properties.selections.adapters.helper;

import domain.DomainArtifacts;

public class DomainArtifactsHolder {
	
	private DomainArtifacts domainArtifacts;
	
	public DomainArtifactsHolder(DomainArtifacts domainArtifacts){
		this.setDomainArtifacts(domainArtifacts);
	}

	public DomainArtifacts getDomainArtifacts() {
		return domainArtifacts;
	}

	public void setDomainArtifacts(DomainArtifacts domainArtifacts) {
		this.domainArtifacts = domainArtifacts;
	}

}
