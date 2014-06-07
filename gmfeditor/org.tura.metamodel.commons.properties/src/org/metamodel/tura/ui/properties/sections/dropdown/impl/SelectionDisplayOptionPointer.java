package org.metamodel.tura.ui.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class SelectionDisplayOptionPointer implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {

		return new EStructuralFeature[] { DomainPackage.eINSTANCE
				.getSelection_DisplayOptionPointer() };
	}

	public String getFeatureAsText(Object eObject) {
		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getDisplayOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.DropDownSelection) eObject).getSelection()
					.getDisplayOptionPointer()).getName();

		if (((domain.DropDownSelection) eObject).getSelection().getDisplayOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getDisplayOptionPointer()).getName();

		return name;
	}

	public Object getFeatureValue(Object eObject,
			HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE
				.getSelection_DisplayOptionPointer()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(HashMap<String, Object> values, Object key,
			Object eObject) {
		if (((domain.DropDownSelection) eObject).getSelection().getDisplayOptionPointer() == null)
			return false;

		String name = null;
		if (((domain.DropDownSelection) eObject).getSelection().getDisplayOptionPointer() instanceof domain.Attribute)
			name = ((domain.Attribute) ((domain.Selection) eObject)
					.getDisplayOptionPointer()).getName();

		if (((domain.DropDownSelection) eObject).getSelection().getDisplayOptionPointer() instanceof domain.ArtificialField)
			name = ((domain.ArtificialField) ((domain.DropDownSelection) eObject).getSelection()
					.getDisplayOptionPointer()).getName();

		if (name == null)
			return false;
		return values.get(key).equals(name);
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {((domain.OptionSelection) eObject).getOptionPointer(),
				((domain.OptionSelection) eObject).getOptionCast()
				};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] 
				{ DomainPackage.eINSTANCE.getOptionSelection_OptionPointer(),
				  DomainPackage.eINSTANCE.getOptionSelection_OptionCast()
				};
	}

	public Class<?> getExpectedClass() {
		return EObject.class;
	}
}