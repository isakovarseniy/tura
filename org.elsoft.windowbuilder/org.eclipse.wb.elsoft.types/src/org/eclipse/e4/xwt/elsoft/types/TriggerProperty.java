package org.eclipse.e4.xwt.elsoft.types;

public class TriggerProperty {
	private String field;

	public TriggerProperty(String field) {
		this.field = field;
	}

	public String getStringObject() {
		return field.substring(2);
	}

}
