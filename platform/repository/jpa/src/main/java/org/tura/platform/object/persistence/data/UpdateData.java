package org.tura.platform.object.persistence.data;

public class UpdateData {
	
	Object pk;
	String className;
	String property;
	Object value;
	
	public Object getPk() {
		return pk;
	}
	public void setPk(Object pk) {
		this.pk = pk;
	}
	public String getProperty() {
		return property;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
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
