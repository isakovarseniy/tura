package org.tura.metamodel.commons.properties.sections.adapters.helper;

public class TriggerHolder {
	private String type;
	private domain.Trigger trigger;
	
	public TriggerHolder(String type, domain.Trigger trigger){
		this.trigger=trigger;
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public domain.Trigger getTrigger() {
		return trigger;
	}
	public void setTrigger(domain.Trigger trigger) {
		this.trigger = trigger;
	}

}
