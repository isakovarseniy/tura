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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.VersionProvider;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.VersionReferenceVersionReference;

import mapper.Mapper;
import mapper.Version;
import recipe.Component;

public class VersionPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Version";
	}

	protected void init() {
		dropDownDataSupplier = new VersionReferenceVersionReference(this);
	}

	
	protected HashMap<String, ?> getEnumerationFeatureValues() {
		if (values == null || values.size() == 0) {
			try {
				values = new LinkedHashMap<String, Object>();
				EObject  obj = (EObject) getModel();
				
				List<Version> versions = new ArrayList<Version>();
				if ( obj instanceof Mapper ){
					versions = new QueryHelper().getVersions((Mapper) obj);
				}
				
				if ( obj instanceof Component ){
					versions = new QueryHelper().getVersions((Component) obj);
				}

				for (Version version  : versions) {
					values.put(new VersionProvider().getLabel(version) , version);
				}
			} catch (Exception e) {

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
		
	}


}
