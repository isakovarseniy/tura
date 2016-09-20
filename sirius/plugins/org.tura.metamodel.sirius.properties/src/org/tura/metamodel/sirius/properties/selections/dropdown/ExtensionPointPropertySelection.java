package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.MenuExtensionRefMenuExtensionPoint;

import form.MenuExtensionRef;
import form.MenuFolder;

public class ExtensionPointPropertySelection extends AbstractEnumerationPropertySection {

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
			List<MenuFolder> ls = query.findExtensionPoints((MenuExtensionRef) getModel());

			for (MenuFolder p : ls) {
				values.put(p.getName(), p);
			}
		}

		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}
}