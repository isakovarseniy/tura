package org.tura.platform.repository.spa;

public class SpaControl implements Comparable<SpaControl>{
	
	private OperationLevel level;
	private String type;
	private Object key;
	private Object object;
	private int priority;
	private int sequence;
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public OperationLevel getLevel() {
		return level;
	}
	public void setLevel(OperationLevel level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	@Override
	public int compareTo(SpaControl o) {
		return this.sequence-o.getSequence();
	}

}
