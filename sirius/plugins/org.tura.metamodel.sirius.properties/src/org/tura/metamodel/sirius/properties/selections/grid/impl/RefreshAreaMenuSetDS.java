package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class RefreshAreaMenuSetDS extends RefreshAreaMenuItemDS{

	public RefreshAreaMenuSetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 1;
	}



}
