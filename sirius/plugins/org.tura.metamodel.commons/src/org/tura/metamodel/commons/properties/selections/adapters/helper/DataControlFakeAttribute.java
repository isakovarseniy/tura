package org.tura.metamodel.commons.properties.selections.adapters.helper;

import form.DataControl;
import type.TypeElement;

public class DataControlFakeAttribute {
	private String name;
	private TypeElement type;
	private DataControl dc;

	public DataControl getDc() {
		return dc;
	}

	public void setDc(DataControl dc) {
		this.dc = dc;
	}

	public DataControlFakeAttribute(String name,TypeElement type,DataControl dc) {
		this.name = name;
		this.type = type;
		this.dc = dc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeElement getType() {
		return type;
	}

	public void setType(TypeElement type) {
		this.type = type;
	}

}
