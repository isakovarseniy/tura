package org.eclipse.wb.elsoft.components;

import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Widget;

public class LovReturnField extends Item{

	private SourceProperty displayField;
	private IteratorProperty returnIterator;
	private SourceProperty returnField;
	
	
	
	public SourceProperty getDisplayField() {
		return displayField;
	}

	public void setDisplayField(SourceProperty displayField) {
		this.displayField = displayField;
	}


	public IteratorProperty getReturnIterator() {
		return returnIterator;
	}


	public void setReturnIterator(IteratorProperty returnIterator) {
		this.returnIterator = returnIterator;
	}


	public LovReturnField(Widget parent, int style) {
		super(parent, style);
	}

	public SourceProperty getReturnField() {
		return returnField;
	}

	public void setReturnField(SourceProperty returnField) {
		this.returnField = returnField;
	}

}
