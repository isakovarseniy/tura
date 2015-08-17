/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.DomainArtifactRefArtifactRef;

public class ArtifactPropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected void init() {
		dropDownDataSupplier = new DomainArtifactRefArtifactRef();
	}

	protected String getLabelText() {
		return "Artifact name";//$NON-NLS-1$
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			if (((domain.ArtifactRef) getModel()).getDomainArtifactRef() == null)
				return values;

			for (Iterator<domain.Artifact> i = ((domain.ArtifactRef) getModel())
					.getDomainArtifactRef().getArtifact().getArtifacts()
					.iterator(); i.hasNext();) {
				domain.Artifact p = i.next();
				values.put(p.getName(), p);
			}

		}

		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
