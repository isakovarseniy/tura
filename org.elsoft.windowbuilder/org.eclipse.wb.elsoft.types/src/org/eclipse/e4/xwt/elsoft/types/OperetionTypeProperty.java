package org.eclipse.e4.xwt.elsoft.types;

public class OperetionTypeProperty {
	private String operation = "Rendered";
	
	public OperetionTypeProperty(String operation){
		this.setOperation(operation);
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}
