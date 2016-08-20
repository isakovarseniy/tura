package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.Uielement;

public class RequiredPropertyContextContextParametersDS extends GeneralContextContextParametersDS {

	public RequiredPropertyContextContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((Uielement)( obj)).getRequired();
	}

}
