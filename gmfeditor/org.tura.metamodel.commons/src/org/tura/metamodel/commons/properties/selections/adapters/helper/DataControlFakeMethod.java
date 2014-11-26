package org.tura.metamodel.commons.properties.selections.adapters.helper;

public class DataControlFakeMethod {

	private String name;
	private domain.TypeElement type;
	private domain.DataControl dc;
	
	public DataControlFakeMethod(String name,domain.TypeElement type,domain.DataControl dc){
		this.name=name;
		this.type=type;
		this.dc=dc;
	}

	public domain.DataControl getDc() {
		return dc;
	}

	public void setDc(domain.DataControl dc) {
		this.dc = dc;
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
