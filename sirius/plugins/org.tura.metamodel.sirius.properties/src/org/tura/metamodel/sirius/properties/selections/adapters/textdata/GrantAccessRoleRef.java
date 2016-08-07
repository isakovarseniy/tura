package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import application.ApplicationRealm;
import permission.GrantAccess;
import permission.PermissionPackage;

public class GrantAccessRoleRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		GrantAccess opt = (GrantAccess) eObject;
		if (opt.getRoleRef() == null || opt.getRoleRef().getName() == null)
			return "";

		return ((ApplicationRealm) (opt.getRoleRef().eContainer().eContainer())).getName() + ":" + opt.getRoleRef().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return PermissionPackage.eINSTANCE.getGrantAccess_RoleRef();
	}

}
