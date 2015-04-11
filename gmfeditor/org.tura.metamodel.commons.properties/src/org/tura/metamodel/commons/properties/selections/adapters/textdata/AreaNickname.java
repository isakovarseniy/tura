package org.tura.metamodel.commons.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.TextDataAdapter;
import org.tura.metamodel.commons.properties.selections.grid.impl.UielementOnEventRefreshAreaDS;

public class AreaNickname implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		UielementOnEventRefreshAreaDS.Area opt = (UielementOnEventRefreshAreaDS.Area) eObject;
		return opt.getElement().getNickname();
	}

	@Override
	public EStructuralFeature getFeature() {
		return null;
	}

}
