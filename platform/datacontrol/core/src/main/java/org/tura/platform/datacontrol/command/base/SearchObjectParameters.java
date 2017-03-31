package org.tura.platform.datacontrol.command.base;

public class SearchObjectParameters {
	
	private CallParameter searchCriteria;
	private CallParameter orderByCriteria;
	private CallParameter startIndex;
	private CallParameter endIndex;
	private CallParameter objectType;
	
	public CallParameter getSearchCriteria() {
		return searchCriteria;
	}
	public void setSearchCriteria(CallParameter searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public CallParameter getOrderByCriteria() {
		return orderByCriteria;
	}
	public void setOrderByCriteria(CallParameter orderByCriteria) {
		this.orderByCriteria = orderByCriteria;
	}
	public CallParameter getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(CallParameter startIndex) {
		this.startIndex = startIndex;
	}
	public CallParameter getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(CallParameter endIndex) {
		this.endIndex = endIndex;
	}
	public CallParameter getObjectType() {
		return objectType;
	}
	public void setObjectType(CallParameter objectType) {
		this.objectType = objectType;
	}
	

}
