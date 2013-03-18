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
	
	@Column(name = "DOMAIN")
	private String domain;

	@Column(name = "FUNCTIONAL_DOMAIN")
	private String functionalDomain;

	@Column(name = "APPLICATION")
	private String application;

	@Column(name = "TYPE_NAME")
	private String typeName;

	@Column(name = "METHOD_NAME")
	private String methodName;
	
	@Column(name = "METHODTYPE")
	private String methodType;

	@Column(name = "REF_TYPE")
	private Long refType;

	@Column(name = "REF_METHOD")
	private Long refMethod;
	

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
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getFunctionalDomain() {
		return functionalDomain;
	}
	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getMethodType() {
		return methodType;
	}
	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}
	public Long getRefType() {
		return refType;
	}
	public void setRefType(Long refType) {
		this.refType = refType;
	}
	public Long getRefMethod() {
		return refMethod;
	}
	public void setRefMethod(Long refMethod) {
		this.refMethod = refMethod;
	}
	
	
}
