/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons.properties.selections.adapters.helper;

import org.tura.model.designer.repository.serialized.domain.DomainArtifacts;

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
