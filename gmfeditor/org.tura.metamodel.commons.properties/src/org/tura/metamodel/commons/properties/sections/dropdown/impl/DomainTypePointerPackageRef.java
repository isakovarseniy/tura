package org.tura.metamodel.commons.properties.sections.dropdown.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.sections.dropdown.DropDownDataSupplier;

import domain.DomainPackage;

public class DomainTypePointerPackageRef implements DropDownDataSupplier{

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getTypePointer_PackageRef(),
				DomainPackage.eINSTANCE.getTypePointer_FakePackageName() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.TypePointer)eObject).getPackageRef() != null)
			return ((domain.TypePointer)eObject).getPackageRef().getName();
		else
			return "";
	}

	public Object getFeatureValue(Object eObject,HashMap<String,Object> values,EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getTypePointer_PackageRef()) )
		    return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getTypePointer_FakePackageName()) )
		    return ((domain.Package)values.get(obj[0])).getName();
		
		return null;
	}
	
	public boolean isEqual(HashMap<String,Object> values,Object key,Object eObject) {
		if ( ((domain.TypePointer)eObject).getPackageRef() == null)
			return false;
		if ( ((domain.TypePointer)eObject).getPackageRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.TypePointer) eObject).getPackageRef().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { };
	}

	public Class<?> getExpectedClass() {
		return null;
	}
	


}
