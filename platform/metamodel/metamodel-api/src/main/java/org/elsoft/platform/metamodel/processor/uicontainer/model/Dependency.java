package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.UUID;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDependencyDAO;

public class Dependency {
	private String expression;
	private String uuid = UUID.randomUUID().toString();
	
	public Dependency(CreateDependencyDAO command, RepositoryFactory rf) {
		expression = command.getExpression();
	}
	
	
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
