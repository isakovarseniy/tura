package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDataLink2ServiceMethodDAO;
import org.elsoft.platform.metamodel.general.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2ServiceMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Service;

public class TriggerReader extends Reader {
	private String triggerType;
	private List<String> service;
	private String method;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {

		triggerType = xmlReader.getAttributeValue(null, "triggerType");

		service = this.expressionParser(xmlReader.getAttributeValue(null,
				"service"));
		method = xmlReader.getAttributeValue(null, "method");

		return this;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return false;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		Helper.findType(rf, service.get(0), service.get(1), service.get(2),
				service.get(3));

		MethodDAO m = rf.getTypeDefinitionHandler().getMethodHandler().clean()
				.searchString("method", method).getObject();

		if (parent instanceof DataControlReader) {
			CreateDataLink2ServiceMethodDAO lnk2serv = new CreateDataLink2ServiceMethodDAO();
			lnk2serv.setDomain(service.get(0));
			lnk2serv.setFunctionalDomain(service.get(1));
			lnk2serv.setApplication(service.get(2));
			lnk2serv.setTypeName(service.get(3));
			lnk2serv.setMethodName(method);
			lnk2serv.setMethodType(triggerType);
			lnk2serv.setRefMethod(m.getObjId());
			lnk2serv.setCommandExecutor(CreateDataLink2ServiceMethod.class
					.getName());
			lnk2serv.setParentUUID(((DataControlReader) parent)
					.getDatacontrolUid());
			
			program.add(lnk2serv);
		}
		if (parent instanceof ButtonReader) {

			CreateEventUIElement2ServiceDAO ui2serv = new CreateEventUIElement2ServiceDAO();
			ui2serv.setDomain(service.get(0));
			ui2serv.setFunctionalDomain(service.get(1));
			ui2serv.setApplication(service.get(2));
			ui2serv.setTypeName(service.get(3));
			ui2serv.setMethodName(method);
			ui2serv.setMethodType(triggerType);
			ui2serv.setRefMethod(m.getObjId());
			ui2serv.setCommandExecutor(CreateEventUIElement2Service.class
					.getName());
			ui2serv.setParentUUID(((ButtonReader) parent).getUuid());
			ui2serv.setDstUUID(((ButtonReader) parent).getDataControlId());
			ui2serv.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2ServiceMethod
					.name());

			program.add(ui2serv);

		}

	}

}
