package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class RefreshAreaMenuItemGetPropertySelection extends RefreshAreaPropertySelection{
	
	
	public RefreshAreaMenuItemGetPropertySelection() {
		ds = new RefreshAreaMenuGetDS(this);
	}	
	
	@Override
	public String getColumnName() {
		return "Get Refresh Area";
	}
}
