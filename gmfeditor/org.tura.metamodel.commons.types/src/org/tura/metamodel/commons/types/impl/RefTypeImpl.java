package org.tura.metamodel.commons.types.impl;

import org.tura.metamodel.commons.types.RefType;

public class RefTypeImpl implements RefType {

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	private String packageName;
	private String typeName;
	
 	public String toString(){
		return packageName+"."+typeName;
	}
}
