package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class RefreshAreaSetPropertySelection extends RefreshAreaPropertySelection{
	
	
	public RefreshAreaSetPropertySelection() {
		ds = new RefreshAreaSetDS(this);
	}	
	
	@Override
	public String getColumnName() {
		return "Set Refresh Area";
	}
}
