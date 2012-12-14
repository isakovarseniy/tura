package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.EventDAO;

@Entity(name = "CreateEventUIElement2JavaScript")
@Table(name = "UIElement2JavaScript")
@DiscriminatorValue("UIELEMENT2JAVASCRIPT")
@XmlRootElement
public class CreateEventUIElement2JavaScriptDAO extends EventDAO{
	
	@Column(name = "JAVASCRIPT")
	private String javaScript;

	public String getJavaScript() {
		return javaScript;
	}

	public void setJavaScript(String javaScript) {
		this.javaScript = javaScript;
	}

	@Column(name = "TRIGGERTYPE")

	private String triggerType;
	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}


	
}
