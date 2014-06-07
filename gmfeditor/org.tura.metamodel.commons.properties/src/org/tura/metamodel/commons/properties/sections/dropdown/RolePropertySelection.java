package org.tura.metamodel.commons.properties.sections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.sections.dropdown.impl.RoleMapperRole;

public class RolePropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Role name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new RoleMapperRole();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();
			domain.RoleMapper mapper = (domain.RoleMapper) getModel();

			if (mapper.getParent().getParent().getParent().getParent()
					.getApplicationRole() != null) {

				List<domain.Role> roles = mapper.getParent()
						.getParent().getParent().getParent()
						.getApplicationRole().getRoles().getRoles();
				for (Iterator<domain.Role> itr = roles.iterator(); itr
						.hasNext();) {
					domain.Role pkg = itr.next();
					if (pkg.getName() != null)
						values.put(pkg.getName(), pkg);
				}

			
				List<domain.Group> groups = mapper.getParent()
						.getParent().getParent().getParent()
						.getApplicationRole().getRoles().getGroups();
				for (Iterator<domain.Group> itr = groups.iterator(); itr
						.hasNext();) {
					domain.Group pkg = itr.next();
					if (pkg.getName() != null)
						values.put(pkg.getName(), pkg);
				}
			}
		}
		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}

}
