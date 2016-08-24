package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.MenuMenuHolder;

import form.MenuFolder;

public class MenuPointerPropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Menu";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new MenuMenuHolder();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			QueryHelper query = new QueryHelper();
			DiagramImpl diagram = (DiagramImpl) editPart.getRoot().getContents()
					.getModel();

			
			List<MenuFolder> ls = query.findMenus(query.getForm(diagram));

			for (MenuFolder p : ls) {
				values.put(p.getName(), p);
			}
		}

		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
