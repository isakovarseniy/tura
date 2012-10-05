package org.elsoft.platform.metamodel.objects.command.form.ui;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "SecurityTrigger")
@Table(name = "securitytrigger")
@DiscriminatorValue("SECURITYTRIGGER")
@XmlRootElement
public class CreateSecurityTriggerDAO  extends CommandDAO {

	@Column(name = "OPERATION_TYPE")
	private String operationType;
	
	@Column(name = "ROLES")
	private String roles;
	
	@Column(name = "GRANTED")
	private String granted;
			
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getGranted() {
		return granted;
	}
	public void setGranted(String granted) {
		this.granted = granted;
	}
	
	
}
