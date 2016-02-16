package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.MenuExtensionRefMenuExtensionPoint;

import domain.MenuExtensionRef;

public class ExtensionPointPropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Extension point";//$NON-NLS-1$
	}

	protected void init() {
			dropDownDataSupplier = new MenuExtensionRefMenuExtensionPoint();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			QueryHelper query = new QueryHelper();
			List<domain.MenuFolder> ls = query
					.findExtensionPoints((MenuExtensionRef) getModel());

			for (domain.MenuFolder p : ls) {
				values.put(p.getName(), p);
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