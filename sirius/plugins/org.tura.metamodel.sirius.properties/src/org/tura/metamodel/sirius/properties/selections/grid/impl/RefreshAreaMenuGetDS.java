package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class RefreshAreaMenuGetDS extends RefreshAreaMenuItemDS{

	public RefreshAreaMenuGetDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 2;
	}



}
