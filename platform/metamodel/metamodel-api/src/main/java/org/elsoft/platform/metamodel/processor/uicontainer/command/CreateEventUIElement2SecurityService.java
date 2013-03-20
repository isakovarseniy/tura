package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;

public class CreateEventUIElement2SecurityService {
	public static String CREATEEVENTUIELEMENT2SERVICE = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateEventUIElement2ServiceDAO command = (CreateEventUIElement2ServiceDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getDstUUID());

		Helper.findType(rf, command.getDomain(), command.getFunctionalDomain(),
				command.getApplication(), command.getTypeName());

		MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
				.cleanSearch().searchString("method", command.getMethodName())
				.getObject();

		RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
				.getMethodHandler(), method, "Security");

		rmi.setRefMethod(method.getObjId());
		rmi.setUuid(method.getObjId().toString());

		lnk.addRemoteUIEventMethods(rmi);

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, CreateSecurityTriggerDAO element) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTUIELEMENT2SERVICE);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateEventUIElement2ServiceDAO obj = (CreateEventUIElement2ServiceDAO) dc
				.createObject();

		obj.setDomain(element.getDomain());
		obj.setFunctionalDomain(element.getFunctionalDomain());
		obj.setApplication(element.getApplication());
		obj.setTypeName(element.getTypeName());
		obj.setMethodName(element.getMethodName());
		obj.setMethodType(element.getMethodType());
		obj.setRefMethod(element.getRefMethod());

		obj.setCommandExecutor(CreateEventUIElement2SecurityService.class.getName());
		obj.setParentUUID(element.getParentUUID());
		obj.setDstUUID(element.getDstUUID());
		obj.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2SecurityServiceMethod
				.name());

	}

}
