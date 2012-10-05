package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateSecurityTrigger;

public class SecurityTriggerReader extends Reader{
	private String roles;
	private String granted;
	private String operation;


	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		roles = xmlReader.getAttributeValue(null, "roles");
		granted = xmlReader.getAttributeValue(null, "granted");
		operation = xmlReader.getAttributeValue(null, "operation");

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

		CreateSecurityTriggerDAO createSecurityTrigger = new CreateSecurityTriggerDAO();
		createSecurityTrigger.setCommandExecutor(CreateSecurityTrigger.class.getName());
		createSecurityTrigger.setParentUUID(parent.getUuid());
		createSecurityTrigger.setUUID(getUuid());
		createSecurityTrigger.setGranted(granted);
		createSecurityTrigger.setRoles(roles);
		createSecurityTrigger.setOperationType(operation);
		
		program.add(createSecurityTrigger);
	
	}
}
