package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.UIElement;

public class CreateSecurityTrigger {
	public static String CREATESCURITYTRIGGER = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateSecurityTriggerDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateSecurityTriggerDAO command = (CreateSecurityTriggerDAO) cmd;
		UIElement element = (UIElement) context.get(command.getParentUUID());
		element.setSecurityTrigger(command);

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
		obj.setDstUUID(trigger.getDstUUID());

		
		obj.setCommandExecutor(CreateSecurityTrigger.class.getName());
	}

}
