package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDependencyDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDependency;

public class DependencyReader extends Reader {
	private String experssionProperty;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		experssionProperty = xmlReader.getAttributeValue(null,
				"expressionProperty");
		return this;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateDependencyDAO dependency = new CreateDependencyDAO();
		dependency.setCommandExecutor(CreateDependency.class.getName());
		dependency.setParentUUID(((DataControlReader) parent)
				.getDatacontrolUid());
		dependency.setUUID(getUuid());

		List<String> ls = this.expressionParser(experssionProperty);
		
		String exp = expressionBuilder(((DataDefinitionReader) (((DataControlReader) parent)
				.getParent())).getFormName(),ls);

		dependency.setExpression(exp);
		program.add(dependency);

	}

}
