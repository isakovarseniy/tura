package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class DomainTypePointerPackageRef implements DropDownDataAdapter{

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getTypePointer_PackageRef(),
				DomainPackage.eINSTANCE.getTypePointer_FakePackageName() };
	}

	public String getFeatureAsText(Object eObject) {
		if ((eObject != null)&&((domain.TypePointer)eObject).getPackageRef() != null)
			return ((domain.TypePointer)eObject).getPackageRef().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}
	
	public Object getSelectedFeatureValue(Object eObject,Map<String,Object> values,EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getTypePointer_PackageRef()) )
		    return values.get(obj[0]);

		if (feature.equals(DomainPackage.eINSTANCE.getTypePointer_FakePackageName()) )
		    return ((domain.Package)values.get(obj[0])).getName();
		
		return null;
	}
	
	public boolean isEqual(Map<String,Object> values,Object key,Object eObject) {
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
