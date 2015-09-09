package org.tura.metamodel.commons.properties;

import org.eclipse.swt.widgets.Event;

public class ActionTriggerSelectionEvent extends Event{
	private  domain.ActionTrigger trigger;

	public ActionTriggerSelectionEvent( domain.ActionTrigger trigger){
		this.setTrigger(trigger);
	}

	public domain.ActionTrigger getTrigger() {
		return trigger;
	}

	public void setTrigger(domain.ActionTrigger trigger) {
		this.trigger = trigger;
	}
	
}
