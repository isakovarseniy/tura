package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class GrantAccessApplicationRef implements DropDownDataAdapter{

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getGrantAccess_ApplicationRef()};
	}

	public String getFeatureAsText(Object eObject) {
		if ((eObject != null)&&((domain.GrantAccess)eObject).getApplicationRef() != null)
			return ((domain.GrantAccess)eObject).getApplicationRef().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}
	
	public Object getSelectedFeatureValue(Object eObject,Map<String,Object> values,EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getGrantAccess_ApplicationRef()) )
		    return values.get(obj[0]);

		return null;
	}
	
	public boolean isEqual(Map<String,Object> values,Object key,Object eObject) {
		if ( ((domain.GrantAccess)eObject).getApplicationRef() == null)
			return false;
		if ( ((domain.GrantAccess)eObject).getApplicationRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.GrantAccess) eObject).getApplicationRef().getName());
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
