package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.OrderType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDefaultOrderByDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDefaultOrderBy;

public class DefaultOrderByReader extends Reader{
	private String fieldsProperty;
	private String ascDescProperty;
	
	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		fieldsProperty = xmlReader
				.getAttributeValue(null, "fieldsProperty");
		ascDescProperty = xmlReader
				.getAttributeValue(null, "ascDescProperty");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateDefaultOrderByDAO defaultOrderBy = new CreateDefaultOrderByDAO();
		defaultOrderBy.setCommandExecutor(CreateDefaultOrderBy.class.getName());
		defaultOrderBy.setParentUUID(((DataControlReader)parent).getDatacontrolUid());
		defaultOrderBy.setColumnName(fieldsProperty);
		defaultOrderBy.setOrder(OrderType.valueOf(ascDescProperty).name());
		program.add(defaultOrderBy);
		
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
