package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Diagram;

public abstract class AbstractDataControlPropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Data control name";
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {
		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			domain.ViewArea viewArea = ((domain.CanvasView) diagram
					.getElement()).getParent();
			domain.Views views = (domain.Views) viewArea.eContainer()
					.eContainer();

			if (((domain.Form) views.getParent().eContainer())
					.getDatacontrols() != null
					&& ((domain.Form) views.getParent().eContainer())
							.getDatacontrols().getFormControl() != null) {

				List<domain.DataControl> dc = ((domain.Form) views.getParent()
						.eContainer()).getDatacontrols().getFormControl()
						.getControls();
				for (Iterator<domain.DataControl> i = dc.iterator(); i
						.hasNext();) {
					domain.DataControl p = i.next();
					if (p.getName() != null)
						values.put(p.getName(), p);
				}
			}
		}
		return values;
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}
	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
