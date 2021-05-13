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

package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import artifact.Option;
import artifact.TechLeaf;
import recipe.MappingTecnologiy;
import recipe.RecipePackage;

public class MappingTechnologyTechRef implements DropDownDataAdapter {

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { RecipePackage.eINSTANCE.getMappingTecnologiy_ValueRef() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (eObject instanceof MappingTecnologiy){
			if (((MappingTecnologiy) eObject).getValueRef() != null){
				TechLeaf leaf = ((MappingTecnologiy) eObject).getValueRef().getValue();
				return getName(leaf);
			}
			else{
				return "";
			}
		}
		if (eObject instanceof Option){
				TechLeaf leaf = ((Option) eObject).getValue();
				return getName(leaf);
		}
		return null;
	
	}

	private String getName(TechLeaf leaf){
		if (leaf == null) {
			return "";
		}
		if (leaf.eContainer() instanceof TechLeaf){
			return ((TechLeaf) (leaf.eContainer())).getName() + ":" + leaf.getName();
		}else{
			return leaf.getName();
		}
	}
	
	
	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}

	
	@Override
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		return values.get(obj[0]);
	}

	@Override
	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((MappingTecnologiy) eObject).getValueRef() == null)
			return false;
		if (((MappingTecnologiy) eObject).getValueRef() == null)
			return false;
		return values.get(key).equals(((MappingTecnologiy) eObject).getValueRef());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return null;
	}



}
