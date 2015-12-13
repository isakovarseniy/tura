package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;
import org.tura.metamodel.commons.properties.selections.grid.TextColumnConverter;
import org.tura.metamodel.commons.properties.selections.grid.impl.RefreshAreaRow;

import domain.DomainPackage;

public class RefreshAreaGroup implements TextDataAdapter, TextColumnConverter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getAreaRef_Group();
	}

	@Override
	public String convertToText(Object obj) {
		return  new Integer (  ((RefreshAreaRow)obj).getGroup()).toString() ;
	}

	@Override
	public Object convertToObject(String str) {
		return new Integer(str);
	}

}
