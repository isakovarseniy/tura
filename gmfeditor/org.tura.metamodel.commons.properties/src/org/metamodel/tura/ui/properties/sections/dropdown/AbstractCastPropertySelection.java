package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.QueryHelper;

import domain.DataControl;
import domain.Type;

public abstract class AbstractCastPropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Cast type";//$NON-NLS-1$
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new HashMap<String, Object>();

			if (dropDownDataSupplier.getWatchPointObject(getModel()) == null)
				return values;

			domain.DataControl dc = (DataControl) dropDownDataSupplier
					.getWatchPointObject(getModel())[0];
			if (dc == null || dc.getCreate() == null)
				return values;

			if (dc.getCreate().getMethodRef() == null
					|| dc.getCreate().getMethodRef().getReturnValue() == null
					|| dc.getCreate().getMethodRef().getReturnValue()
							.getTypeRef() == null)
				return values;

			domain.Type type = (Type) dc.getCreate().getMethodRef()
					.getReturnValue().getTypeRef();

			ArrayList<domain.Type> typeTree = new ArrayList<>();
			new QueryHelper().getInheritTypes(typeTree, type);

			for (Iterator<domain.Type> itr = typeTree.iterator(); itr.hasNext();) {
				domain.Type p = itr.next();
				if (p.getName() != null)
					values.put(p.getName(), p);
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
