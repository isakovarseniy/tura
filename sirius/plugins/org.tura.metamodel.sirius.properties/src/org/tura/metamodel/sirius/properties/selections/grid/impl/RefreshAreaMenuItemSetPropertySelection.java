
package org.tura.metamodel.sirius.properties.selections.grid.impl;

public class RefreshAreaMenuItemSetPropertySelection extends RefreshAreaPropertySelection{
	
	
	public RefreshAreaMenuItemSetPropertySelection() {
		ds = new RefreshAreaMenuSetDS(this);
	}	
	
	@Override
	public String getColumnName() {
		return "Set Refresh Area";
	}
}
