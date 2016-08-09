package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import application.ApplicationRealm;
import permission.PermissionPackage;
import permission.SecurityEntityPointer;

public class GrantAccessRoleRef  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		SecurityEntityPointer opt = (SecurityEntityPointer) eObject;
		if (opt.getSecurityEntity() == null || opt.getSecurityEntity().getName() == null)
			return "";

		return ((ApplicationRealm) (opt.getSecurityEntity().eContainer().eContainer())).getName() + ":" + opt.getSecurityEntity().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return PermissionPackage.eINSTANCE.getSecurityEntityPointer_SecurityEntity();
	}

}
