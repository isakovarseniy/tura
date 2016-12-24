package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.IngredientControllertLayer;

import mapper.MappingLayer;

public class IngredientControllerLayerPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Layer:";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new IngredientControllertLayer();
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			
			List<MappingLayer> result = new QueryHelper().findApplicationLayers(getModel());
			ArrayList<MappingLayer> array = new ArrayList<MappingLayer>();
			array.addAll(result);
			
			for (MappingLayer l : array) {
				values.put(l.getName(), l);
			}
		}
		return values;
	}


	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

}
