package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

public class OverlayCanvasSourceDS extends OverlayCanvasDS{

	public OverlayCanvasSourceDS(GridProperty property) {
		super(property);
	}

	@Override
	public int getGroup() {
		return 1;
	}

}
