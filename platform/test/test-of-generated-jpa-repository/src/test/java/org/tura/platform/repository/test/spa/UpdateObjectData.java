package org.tura.platform.repository.test.spa;

import org.tura.platform.repository.core.RepoKeyPath;

public class UpdateObjectData {

	private RepoKeyPath pk;
	private String property;
	private Object value;
	
	
	public RepoKeyPath getPk() {
		return pk;
	}
	public void setPk(RepoKeyPath pk) {
		this.pk = pk;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
}
