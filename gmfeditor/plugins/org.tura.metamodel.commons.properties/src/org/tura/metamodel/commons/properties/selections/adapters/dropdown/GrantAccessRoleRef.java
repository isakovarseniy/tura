package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class GrantAccessRoleRef implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getGrantAccess_RoleRef() };
	}

	public String getFeatureAsText(Object eObject) {
		if (((domain.GrantAccess) eObject).getRoleRef() != null)
			return ((domain.GrantAccess) eObject).getRoleRef().getName();
		else
			return "";
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject)eObject).eGet(feature);
	}	
	
	public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values,
			EStructuralFeature feature, Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getGrantAccess_RoleRef()))
			return values.get(obj[0]);

		return null;
	}

	public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
		if (((domain.GrantAccess) eObject).getRoleRef() == null)
			return false;
		if (((domain.GrantAccess) eObject).getRoleRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.GrantAccess) eObject).getRoleRef().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[]{((domain.TypePointer) eObject).getPackageRef()};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getGrantAccess_RoleRef()};
	}

	public Class<?> getExpectedClass() {
		return domain.GrantAccess.class;
	}

	
}
