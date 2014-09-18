package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.Helper;

import domain.DataControl;
import domain.Type;

public abstract class AbstractAttributePropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Attribute name";//$NON-NLS-1$
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

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

			if (dropDownDataSupplier.getWatchPointObject(getModel())[1] != null)
			   type = (Type) dropDownDataSupplier.getWatchPointObject(getModel())[1]; 

			HashMap<String, domain.Operation> operations = new HashMap<>();
			HashMap<String, domain.Attribute> attributes = new HashMap<>();
			
			new Helper().addOperations(operations,attributes,type);
			
			for (Iterator<domain.Attribute> i = attributes.values().iterator(); i
					.hasNext();) {
				domain.Attribute p = i.next();
				if (p.getName() != null)
					values.put(p.getName(), p);
			}

			for (Iterator<domain.ArtificialField> i = dc.getArtificialFields().iterator(); i
					.hasNext();) {
				domain.ArtificialField p = i.next();
				if (p.getName() != null)
					values.put("*->"+p.getName(), p);
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
