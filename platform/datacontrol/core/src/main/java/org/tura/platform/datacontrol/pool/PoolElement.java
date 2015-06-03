package org.tura.platform.datacontrol.pool;


public class PoolElement {
	
	private long createDate;
	private Object obj;
	private Object key;
	private Class<?> clazz;
	private String operation;
	private String shifterId;
	
	public PoolElement(Object obj, Object key, Class<?> clazz,String operation, String shifterId){
		this.clazz = clazz;
		this.key = key;
		this.obj = obj;
		this.operation = operation;
		this.shifterId =  shifterId;
		
	}
	
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the shifterId
	 */
	public String getShifterId() {
		return shifterId;
	}

	/**
	 * @param shifterId the shifterId to set
	 */
	public void setShifterId(String shifterId) {
		this.shifterId = shifterId;
	}

	
	
}
