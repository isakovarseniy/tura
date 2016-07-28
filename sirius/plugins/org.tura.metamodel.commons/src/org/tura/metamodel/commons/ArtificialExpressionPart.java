package org.tura.metamodel.commons;

public class ArtificialExpressionPart {

	private String uid;
	private Object objRef;
	private int order;
	private String expressionType;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Object getObjRef() {
		return objRef;
	}
	public void setObjRef(Object objRef) {
		this.objRef = objRef;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getExpressionType() {
		return expressionType;
	}
	public void setExpressionType(String expressionType) {
		this.expressionType = expressionType;
	}

}
