package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang.StringUtils;
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

		String exp = ((DataDefinitionReader) (((DataControlReader) parent)
				.getParent())).getFormName()
				+ "binding."
				+ StringUtils.uncapitalize(ls.get(0));

		if (ls.size() > 1) {
			if (ls.get(1).indexOf("trigger- ") != -1)
				exp = exp
						+ "."
						+ StringUtils.uncapitalize(ls.get(1).substring(
								"trigger- ".length()));
			else
				exp = exp + ".currentRow." + StringUtils.uncapitalize(ls.get(1));
		} else {
			exp = exp + ".currentRow";
		}

		dependency.setExpression(exp);
		program.add(dependency);

	}

}
