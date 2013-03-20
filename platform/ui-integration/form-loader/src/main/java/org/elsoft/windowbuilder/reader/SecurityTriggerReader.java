package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2SecurityService;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateSecurityTrigger;

public class SecurityTriggerReader extends Reader {
	private String roles;
	private String granted;
	private String operation;
	private List<String> service;
	private String method;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		roles = xmlReader.getAttributeValue(null, "roles");
		granted = xmlReader.getAttributeValue(null, "granted");
		operation = xmlReader.getAttributeValue(null, "operation");
		service = this.expressionParser(xmlReader.getAttributeValue(null,
				"service"));
		method = xmlReader.getAttributeValue(null, "method");

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
		
		MethodDAO m = null;
		
		if ((service != null) && (method != null)) {

			Helper.findType(rf, service.get(0), service.get(1), service.get(2),
					service.get(3));

			m = rf.getTypeDefinitionHandler().getMethodHandler()
					.cleanSearch().searchString("method", method).getObject();
		}
		

		CreateSecurityTriggerDAO createSecurityTrigger = new CreateSecurityTriggerDAO();
		createSecurityTrigger.setCommandExecutor(CreateSecurityTrigger.class
				.getName());
		createSecurityTrigger.setParentUUID(parent.getUuid());
		createSecurityTrigger.setUUID(getUuid());
		createSecurityTrigger.setGranted(granted);
		createSecurityTrigger.setRoles(roles);
		createSecurityTrigger.setOperationType(operation);
		createSecurityTrigger.setDomain(service.get(0));
		createSecurityTrigger.setFunctionalDomain(service.get(1));
		createSecurityTrigger.setApplication(service.get(2));
		createSecurityTrigger.setTypeName(service.get(3));
		createSecurityTrigger.setMethodName(method);
		createSecurityTrigger.setMethodType(operation);
		createSecurityTrigger.setRefMethod(m.getObjId());
		createSecurityTrigger.setDstUUID(((ItemReader) parent).getDataControlId());

		program.add(createSecurityTrigger);

		if ((service != null) && (method != null)) {

			CreateEventUIElement2ServiceDAO ui2serv = new CreateEventUIElement2ServiceDAO();
			ui2serv.setDomain(service.get(0));
			ui2serv.setFunctionalDomain(service.get(1));
			ui2serv.setApplication(service.get(2));
			ui2serv.setTypeName(service.get(3));
			ui2serv.setMethodName(method);
			ui2serv.setMethodType(operation);
			ui2serv.setRefMethod(m.getObjId());
			ui2serv.setCommandExecutor(CreateEventUIElement2SecurityService.class
					.getName());
			ui2serv.setParentUUID(parent.getUuid());
			ui2serv.setDstUUID(((ItemReader) parent).getDataControlId());
			ui2serv.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2SecurityServiceMethod
					.name());

			program.add(ui2serv);

		}

	}
}
