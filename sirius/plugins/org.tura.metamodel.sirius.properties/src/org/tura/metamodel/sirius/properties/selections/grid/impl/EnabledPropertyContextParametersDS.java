package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.EnabledUIItem;

public class EnabledPropertyContextParametersDS extends GeneralContextContextParametersDS  {

	public EnabledPropertyContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((EnabledUIItem)( obj)).getEnabled();
	}

}
