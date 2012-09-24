package org.elsoft.platform.metamodel.objects.command.form.datasource;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.elsoft.platform.metamodel.objects.command.CommandDAO;

@Entity(name = "Dependency")
@Table(name = "dependency")
@DiscriminatorValue("DEPENDENCY")
@XmlRootElement
public class CreateDependencyDAO extends CommandDAO {

	@Column(name = "EXPRESSION")
	private String expression;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
}
