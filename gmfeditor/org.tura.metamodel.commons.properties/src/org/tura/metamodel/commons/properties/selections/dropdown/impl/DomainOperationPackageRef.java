package org.tura.metamodel.commons.properties.selections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;
import domain.Package;

public class DomainOperationPackageRef implements DropDownDataSupplier {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getOperation_ReturnValue() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.Operation)eObject).getReturnValue() != null)
			return ((domain.Operation)eObject).getReturnValue().getPackageRef().getName();
		else
			return "";
	}

	public Object getFeatureValue(Object eObject,HashMap<String,Object> values,EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getOperation_ReturnValue()) ){
			domain.ReturnValue rv = domain.DomainFactory.eINSTANCE.createReturnValue();
			rv.setPackageRef((Package) values.get(obj[0]));
		    return rv;
		}
		return null;
	}
	
	public boolean isEqual(HashMap<String, Object> values,Object key,Object eObject) {
		if (((domain.Operation)eObject).getReturnValue() == null )
		   return false;
		if ( ((domain.Operation)eObject).getReturnValue().getPackageRef() == null)
			return false;
		if ( ((domain.Operation)eObject).getReturnValue().getPackageRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.Operation)eObject).getReturnValue().getPackageRef().getName());
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { };
	}

	public Class<?> getExpectedClass() {
		return null;
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{};
	}


}
