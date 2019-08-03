package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class OverlayCanvasSourcetPropertySelection extends RefreshAreaPropertySelection{

	public OverlayCanvasSourcetPropertySelection() {
		ds = new OverlayCanvasSourceDS(this);
	}		
	
	
	@Override
	public String getColumnName() {
		return "Events sources";
	}
	
}
