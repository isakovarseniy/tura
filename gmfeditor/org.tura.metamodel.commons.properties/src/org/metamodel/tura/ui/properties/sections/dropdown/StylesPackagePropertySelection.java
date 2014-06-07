package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.CSSMapperStylesPackageRef;

public class StylesPackagePropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Style Package name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new CSSMapperStylesPackageRef();
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();
			domain.CSSMapper mapper = (domain.CSSMapper) getModel();

			if (mapper.getParent().getParent().getParent().getParent()
					.getApplicationStyle() != null) {

				List<domain.StylesPackage> styles = mapper.getParent()
						.getParent().getParent().getParent()
						.getApplicationStyle().getStylesPackage();
				for (Iterator<domain.StylesPackage> itr = styles.iterator(); itr
						.hasNext();) {
					domain.StylesPackage pkg = itr.next();
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
