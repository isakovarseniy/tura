package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.Uielement;

public class ReadOnlyPropertyContextContextParametersDS extends GeneralContextContextParametersDS {

	public ReadOnlyPropertyContextContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((Uielement)( obj)).getReadOnly();
	}

}
