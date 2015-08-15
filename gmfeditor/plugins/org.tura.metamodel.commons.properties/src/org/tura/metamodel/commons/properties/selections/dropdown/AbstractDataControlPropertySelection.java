package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.DataControlProvider;
import org.tura.metamodel.commons.properties.selections.adapters.TreeDataControlProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;

public abstract class AbstractDataControlPropertySelection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Data control name";
	}

	protected HashMap<String, ?> getEnumerationFeatureValues() {
		if (values == null) {
			try {
				values = new LinkedHashMap<String, Object>();
				DiagramImpl root = (DiagramImpl) editPart.getRoot()
						.getContents().getModel();

				for (Object obj : new QueryHelper().getControlsList(root)) {
					if (obj instanceof TreeRootDataControlHolder) {
						TreeRootDataControlHolder th = (TreeRootDataControlHolder) obj;
						TreeDataControlProvider provider = new TreeDataControlProvider();
						for (TreeDataControl tdc : th.getControls()) {
							if (provider.getLabel(tdc) != null)
								values.put(provider.getLabel(tdc), tdc.getDc());
						}
					}
					if (obj instanceof DataControlHolder) {
						DataControlHolder dh = (DataControlHolder) obj;
						DataControlProvider provider = new DataControlProvider();
						for (domain.DataControl dc : dh.getControls()) {
							if (provider.getLabel(dc) != null)
								values.put(provider.getLabel(dc), dc);
						}
					}
				}
			} catch (Exception e) {

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
