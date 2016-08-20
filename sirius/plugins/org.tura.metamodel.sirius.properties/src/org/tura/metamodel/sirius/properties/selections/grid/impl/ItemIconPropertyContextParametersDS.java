package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.Context;
import form.ItemIcon;

public class ItemIconPropertyContextParametersDS extends GeneralContextContextParametersDS  {

	public ItemIconPropertyContextParametersDS(GridProperty property) {
		super(property);
	}

	@Override
	public Context getContext(Object obj) {
		return ((ItemIcon)( obj)).getIcon();
	}

}
