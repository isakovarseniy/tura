package org.elsoft.platform.metamodel.objects.command.form;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "FormParameter")
@Table(name = "Form_Parameter")
@DiscriminatorValue("FORMPARAMETER")
@XmlRootElement
public class CreateFormParameterDAO extends CommandDAO{
	
	@Column(name = "PARAMETER_NAME")
	private String parameterName;

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

}
