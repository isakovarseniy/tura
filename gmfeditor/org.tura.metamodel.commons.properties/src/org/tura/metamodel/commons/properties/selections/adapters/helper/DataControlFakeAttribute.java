package org.tura.metamodel.commons.properties.selections.adapters.helper;

public class DataControlFakeAttribute {
	private String name;
	private domain.TypeElement type;
	
	public DataControlFakeAttribute(String name,domain.TypeElement type){
		this.name=name;
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public domain.TypeElement getType() {
		return type;
	}

	public void setType(domain.TypeElement type) {
		this.type = type;
	}

}
