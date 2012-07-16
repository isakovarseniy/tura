package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ActionElement;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;

public class CreateEventUIElement2Service {
	public static String CREATEEVENTUIELEMENT2SERVICE = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateEventUIElement2ServiceDAO command = (CreateEventUIElement2ServiceDAO) cmd;
		ActionElement element = (ActionElement) context.get(command
				.getParentUUID());

		DataLink lnk = (DataLink) context.get(command.getDstUUID());

		Helper.findType(rf, command.getDomain(), command.getFunctionalDomain(),
				command.getApplication(), command.getTypeName());

		MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
				.clean().searchString("method", command.getMethodName())
				.getObject();

		RemoteMethod rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
				.getMethodHandler(), method, element.getUiElementType()+command.getMethodType());

		rmi.setRefMethod(method.getObjId());
		rmi.setUuid(method.getObjId().toString());
		
		lnk.addRemoteUIEventMethods(rmi);

		element.setDataSrcLnk(lnk);
		String methodName = command.getDomain().toLowerCase() + "_"
				+ command.getFunctionalDomain().toLowerCase() + "_"
				+ command.getApplication().toLowerCase() + "_"+command.getTypeName().toLowerCase() +"_" + command.getMethodName().toLowerCase();
		element.setTriggerName(methodName.toLowerCase());
		element.setUiElement2ServiceEvent(command);

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, ActionElement element) {

		ch.getMode()
				.getElResolver()
				.setValue(SessionContext.COMMAND_TYPE,
						CREATEEVENTUIELEMENT2SERVICE);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateEventUIElement2ServiceDAO obj = (CreateEventUIElement2ServiceDAO) dc
				.createObject();

		obj.setDomain(element.getUiElement2ServiceEvent().getDomain());
		obj.setFunctionalDomain( element.getUiElement2ServiceEvent().getFunctionalDomain());
		obj.setApplication(element.getUiElement2ServiceEvent().getApplication() );
		obj.setTypeName( element.getUiElement2ServiceEvent().getTypeName());
		obj.setMethodName(element.getUiElement2ServiceEvent().getMethodName());
		obj.setMethodType(element.getUiElement2ServiceEvent().getMethodType());
		obj.setRefMethod(element.getUiElement2ServiceEvent().getRefMethod());
		
		obj.setCommandExecutor(CreateEventUIElement2Service.class.getName());
		obj.setParentUUID(element.getUiElement2ServiceEvent().getParentUUID());
		obj.setDstUUID(element.getUiElement2ServiceEvent().getDstUUID());
		obj.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2ServiceMethod.name());

	}

}
