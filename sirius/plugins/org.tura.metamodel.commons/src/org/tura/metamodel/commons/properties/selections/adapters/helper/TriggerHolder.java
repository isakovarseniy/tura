package org.tura.metamodel.commons.properties.selections.adapters.helper;

import form.Trigger;

public class TriggerHolder {
	private String type;
	private Trigger trigger;
	
	public TriggerHolder(String type, Trigger trigger){
		this.trigger=trigger;
		this.type=type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Trigger getTrigger() {
		return trigger;
	}
	public void setTrigger(Trigger trigger) {
		this.trigger = trigger;
	}

}
