package org.tura.platform.repository.operation;

import org.tura.platform.repository.core.RepoKeyPath;

public class UpdateObjectData {

	private RepoKeyPath pk;
	private Object value;
	private String property;
	public RepoKeyPath getPk() {
		return pk;
	}
	public void setPk(RepoKeyPath pk) {
		this.pk = pk;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

	
	
	
}
