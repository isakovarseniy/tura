package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.Helper;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

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

			domain.DataControl ndc = (DataControl) dropDownDataSupplier
					.getWatchPointObject(getModel())[0];
			if (ndc == null || ndc.getCreate() == null)
				return values;

			QueryHelper helper = new QueryHelper();
			DiagramImpl root = (DiagramImpl) editPart.getRoot().getContents()
					.getModel();
			domain.Form frm = helper.getForm(root);

			Map<String, ArrayList<Object>> operations = new HashMap<>();
			Map<String, ArrayList<Object>> attributes = new HashMap<>();
			Map<String, ArrayList<Object>> artificialFields = new HashMap<>();
			int threshold = 1000;

			if (dropDownDataSupplier.getWatchPointObject(getModel())[1] != null
					&& dropDownDataSupplier.getWatchPointObject(getModel())[2] != null) {
				domain.TypeElement type = (Type) dropDownDataSupplier
						.getWatchPointObject(getModel())[1];
				domain.DataControl dc = (domain.DataControl) dropDownDataSupplier
						.getWatchPointObject(getModel())[2];
				addOperation(operations, attributes, artificialFields, type, dc);
				threshold = 1;
			} else {
				boolean treeRoot = false;
				try {
					for (TreeDataControl tdc : helper.findTreeRootControls(frm)) {
						if (tdc.getDc().equals(ndc)) {
							treeRoot = true;
							break;
						}
					}
					if (treeRoot) {
						ArrayList<Object> controls = new ArrayList<>();
						helper.getTreeLeafs(controls, ndc);
						threshold = controls.size();
						for (Object obj : controls) {
							domain.DataControl dc = (DataControl) obj;
							domain.TypeElement type = Util.getBase(dc);
							if (type != null)
								addOperation(operations, attributes,
										artificialFields, type, dc);
						}
					} else {
						domain.TypeElement type = Util.getBase(ndc);
						threshold = 1;
						if (type != null)
							addOperation(operations, attributes,
									artificialFields, type, ndc);
					}
				} catch (Exception e) {

				}
			}

			populateValue(operations, values, threshold);
			populateValue(attributes, values, threshold);
			populateValue(artificialFields, values, threshold);

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

	private void populateValue(Map<String, ArrayList<Object>> hash,
			Map<String, Object> values, int threshold) {
		for (ArrayList<Object> array : hash.values()) {
			int i = (int) array.get(1);
			IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform
					.getAdapterManager().getAdapter(array.get(0),
							IWorkbenchAdapter.class);

			if (i == threshold && adapter.getLabel(array.get(0)) != null) {
				values.put(adapter.getLabel(array.get(0)), array.get(0));
			}
		}
	}

	@SuppressWarnings("serial")
	private void addOperation(Map<String, ArrayList<Object>> operations,
			Map<String, ArrayList<Object>> attributes,
			Map<String, ArrayList<Object>> artificialFields,
			domain.TypeElement type, domain.DataControl dc) {

		final HashMap<String, domain.Operation> oper = new HashMap<>();
		final HashMap<String, domain.Attribute> attr = new HashMap<>();

		new Helper().addOperations(oper, attr, type);

		for (final String key : oper.keySet()) {
			if (operations.get(key) == null) {
				operations.put(key, new ArrayList<Object>() {
					{
						add(oper.get(key));
						add(1);
					}
				});
			} else {
				ArrayList<Object> ls = operations.get(key);
				int i = (int) ls.get(1);
				ls.set(1, ++i);
			}
		}

		for (final String key : attr.keySet()) {
			if (attributes.get(key) == null) {
				attributes.put(key, new ArrayList<Object>() {
					{
						add(attr.get(key));
						add(1);
					}
				});
			} else {
				ArrayList<Object> ls = attributes.get(key);
				int i = (int) ls.get(1);
				ls.set(1, ++i);
			}
		}

		for (final domain.ArtificialField fld : dc.getArtificialFields()) {
			String key = getArtificialFieldKey(fld);
			if (artificialFields.get(key) == null) {
				artificialFields.put(key, new ArrayList<Object>() {
					{
						add(fld);
						add(1);
					}
				});
			} else {
				ArrayList<Object> ls = artificialFields.get(key);
				int i = (int) ls.get(1);
				ls.set(1, ++i);
			}
		}
	}

	private String getArtificialFieldKey(domain.ArtificialField fld) {
		String key = "";

		if (fld.getTypeRef() != null)
			key = fld.getTypeRef().getUid();

		return fld.getName() + key;
	}

}
