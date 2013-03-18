package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.RemoteMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;

public class CreateSecurityTrigger {
	public static String CREATESCURITYTRIGGER = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateSecurityTriggerDAO command = (CreateSecurityTriggerDAO) cmd;
		UIElement element = (UIElement) context.get(command.getParentUUID());
		RemoteMethod rmi = null;

		if ((command.getDomain() != null)
				&& (command.getFunctionalDomain() != null)
				&& (command.getApplication() != null)
				&& (command.getTypeName() != null)) {
			Helper.findType(rf, command.getDomain(),
					command.getFunctionalDomain(), command.getApplication(),
					command.getTypeName());

			MethodDAO method = rf.getTypeDefinitionHandler().getMethodHandler()
					.cleanSearch()
					.searchString("method", command.getMethodName())
					.getObject();

			rmi = new RemoteMethod(rf.getTypeDefinitionHandler()
					.getMethodHandler(), method, command.getMethodType());

			rmi.setRefMethod(method.getObjId());
			rmi.setUuid(method.getObjId().toString());
		}

		element.setSecurityTrigger(command,rmi);

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateSecurityTriggerDAO trigger) {

		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATESCURITYTRIGGER);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateSecurityTriggerDAO obj = (CreateSecurityTriggerDAO) dc
				.createObject();
		obj.setParentUUID(parentUUID);
		obj.setUUID(trigger.getUUID());
		obj.setOperationType(trigger.getOperationType());
		obj.setRoles(trigger.getRoles());
		obj.setGranted(trigger.getGranted());

		obj.setDomain(trigger.getDomain());
		obj.setFunctionalDomain( trigger.getFunctionalDomain());
		obj.setApplication(trigger.getApplication() );
		obj.setTypeName( trigger.getTypeName());
		obj.setMethodName(trigger.getMethodName());
		obj.setMethodType(trigger.getMethodType());
		obj.setRefMethod(trigger.getRefMethod());

		
		obj.setCommandExecutor(CreateSecurityTrigger.class.getName());
	}

}
