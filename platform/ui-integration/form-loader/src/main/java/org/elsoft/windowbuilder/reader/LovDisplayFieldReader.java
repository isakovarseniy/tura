package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;

public class LovDisplayFieldReader extends Reader {

	private String fieldLabel;
	private String field;
	
	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		fieldLabel = xmlReader.getAttributeValue(null, "fieldLabel");
		field = xmlReader.getAttributeValue(null, "displayField");
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setCommandExecutor(CreateDisplayFieldSpecifier.class.getName());
		dispOption.setValue1(fieldLabel);
		dispOption.setValue2(field);
		dispOption.setParentUUID(parent.getUuid());
		program.add(dispOption);
		
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
