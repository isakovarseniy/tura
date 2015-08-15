package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.FormVariablesParameRef;

public class FormParametersPropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Parameter name";//$NON-NLS-1$
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			domain.Root root = (domain.Root) getModel().eContainer();

			List<domain.FormParameter> params = ((domain.Form) (((domain.Controls) (root
					.eContainer())).getParent().eContainer())).getParameters();
			for (domain.FormParameter param : params) {
				if (param.getName() != null)
					values.put(param.getName(), param);
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

	protected void init() {
		dropDownDataSupplier = new FormVariablesParameRef();
	}
}
