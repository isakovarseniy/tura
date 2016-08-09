package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import application.ApplicationStyleLibraries;
import style.StylePackage;
import style.StylePointer;

public class StylePointerLibraryName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		StylePointer opt = (StylePointer) eObject;
		if (opt.getStyleLibrary() == null || opt.getStyleLibrary().getName() == null)
			return "";

		return ((ApplicationStyleLibraries) (opt.getStyleLibrary().eContainer().eContainer())).getName() + ":" + opt.getStyleLibrary().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return StylePackage.eINSTANCE.getStylePointer_StyleLibrary();
	}

}
