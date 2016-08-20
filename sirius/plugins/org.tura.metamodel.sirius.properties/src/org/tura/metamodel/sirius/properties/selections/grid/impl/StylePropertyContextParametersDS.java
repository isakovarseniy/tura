package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.StyleElement;

public class StylePropertyContextParametersDS extends GeneralContextContextParametersDS  {

	public StylePropertyContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((StyleElement)( obj)).getStyle();
	}

}
