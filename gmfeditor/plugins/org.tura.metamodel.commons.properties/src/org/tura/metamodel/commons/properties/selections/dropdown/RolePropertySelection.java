/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.RoleMapperRole;

public class RolePropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Role name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new RoleMapperRole();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
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
