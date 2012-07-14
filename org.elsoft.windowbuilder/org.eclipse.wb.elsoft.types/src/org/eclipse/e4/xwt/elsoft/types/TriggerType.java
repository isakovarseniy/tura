package org.eclipse.e4.xwt.elsoft.types;

import java.util.StringTokenizer;

public class TriggerType {
	
	private String triggerType;
	private String triggerName;
	
	
	public TriggerType(String property){
		StringTokenizer tokenizer = new StringTokenizer(property, ".");

		if (tokenizer.hasMoreElements())
			triggerType = tokenizer.nextToken();

		if (tokenizer.hasMoreElements())
			triggerName = tokenizer.nextToken();
	
	}

	public String getTriggerType() {
		return triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}
	public String getTriggerName() {
		return triggerName;
	}
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

}
