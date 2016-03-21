package org.tura.metamodel.commons.properties.selections.dropdown;

import org.eclipse.emf.ecore.EObject;

import domain.DataControl;

public class BaseClassTypeNamepropertySelection extends TypeNamePropertySection{
	
	@Override
	public EObject getModel() {
		return ((DataControl)getEObject()).getBaseTypeRef();
	}
	
}
