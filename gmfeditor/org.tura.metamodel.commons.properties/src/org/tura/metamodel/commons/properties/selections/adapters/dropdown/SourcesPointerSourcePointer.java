package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

import domain.DomainPackage;

public class SourcesPointerSourcePointer implements DropDownDataAdapter {

	private AbstractTuraPropertySection property;

	public SourcesPointerSourcePointer(AbstractTuraPropertySection property) {
		this.property = property;
	}

	@Override
	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getSourcesPointer_SourcePointer() };
	}

	@Override
	public String getFeatureAsText(Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourcePointer() != null) {
			DiagramImpl root = (DiagramImpl) property.getEditPart().getRoot().getContents().getModel();
			domain.DataControl dc = ((domain.SourcesPointer) eObject).getSourcePointer();
			try {
				Object obj;
				if (Util.ifDataControlIsTreeRoot(dc, root)) {
					obj = new TreeDataControl(dc);
				} else {
					obj = dc;
				}
				IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform.getAdapterManager().getAdapter(obj,
						IWorkbenchAdapter.class);
				return adapter.getLabel(obj);

			} catch (Exception e) {
				return "";
			}
		} else
			return "";
	}

	@Override
	public Object getSelectedFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
		if (feature.equals(DomainPackage.eINSTANCE.getSourcesPointer_SourcePointer()))
			return values.get(obj[0]);

		return null;
	}

	@Override
	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		if (((domain.SourcesPointer) eObject).getSourcePointer() == null)
			return false;

		if (((domain.SourcesPointer) eObject).getSourcePointer().getName() == null)
			return false;

		return values.get(key).equals(((domain.SourcesPointer) eObject).getSourcePointer().getName());
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] {};
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {};
	}

	public Class<?> getExpectedClass() {
		return null;
	}

	@Override
	public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

}
