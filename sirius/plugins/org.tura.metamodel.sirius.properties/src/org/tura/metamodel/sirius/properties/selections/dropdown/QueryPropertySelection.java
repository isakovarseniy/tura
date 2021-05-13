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

package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.DomainMapperQueryRef;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.QueryChangeEvent;

import artifact.Artifact;
import artifact.ModelQuery;
import recipe.ModelMapper;
import recipe.Query;

public class QueryPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Query name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new DomainMapperQueryRef();
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			if ((((ModelMapper) (((Query) getModel()).eContainer())).getArtifactRef() == null))
				return values;
			
			Artifact artifact = ((ModelMapper) (((Query) getModel()).eContainer())).getArtifactRef();
			
			for (ModelQuery p : artifact.getModelQuery()) {
				values.put(p.getName(), p);
			}
		}
		return values;
	}


	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

	@Override
	public void afterUpdate(){
		Bus.getInstance().notify(new QueryChangeEvent());
	}
	
}
