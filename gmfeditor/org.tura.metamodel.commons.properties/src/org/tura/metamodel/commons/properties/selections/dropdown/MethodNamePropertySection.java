package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.Helper;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.DomainMethodPointerMethodMethodRef;

import domain.Type;

public class MethodNamePropertySection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Method name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new DomainMethodPointerMethodMethodRef();
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			if ((((domain.MethodPointer) getModel()).getTypeRef() == null)
					|| ((domain.MethodPointer) getModel()).getPackageRef() == null)
				return values;

			domain.Type type = (Type) ((domain.MethodPointer) getModel())
					.getTypeRef();

			HashMap<String, domain.Operation> operations = new HashMap<>();
			HashMap<String, domain.Attribute> attributes = new HashMap<>();

			new Helper().addOperations(operations, attributes, type);

			for (Iterator<domain.Operation> i = operations.values().iterator(); i
					.hasNext();) {
				domain.Operation opr = i.next();
				if (opr.getName() != null)
					values.put(opr.getName(), opr);
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
