package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import recipe.RecipePackage;

public class IngredientModelMappingLayerDS extends MappingLayerDS{

	public IngredientModelMappingLayerDS(GridProperty property) {
		super(property);
	}

	@Override
	public EStructuralFeature getFeature() {
		return RecipePackage.eINSTANCE.getIngredient_ModeLayer();
	}

}
