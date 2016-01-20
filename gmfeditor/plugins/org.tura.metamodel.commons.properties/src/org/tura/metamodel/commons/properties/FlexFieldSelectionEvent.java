package org.tura.metamodel.commons.properties;

import org.eclipse.swt.widgets.Event;

public class FlexFieldSelectionEvent extends Event{
	private  domain.FlexField field;

	public FlexFieldSelectionEvent( domain.FlexField field){
		this.setField(field);
	}

	public domain.FlexField getField() {
		return field;
	}

	public void setField(domain.FlexField field) {
		this.field = field;
	}
	
}
