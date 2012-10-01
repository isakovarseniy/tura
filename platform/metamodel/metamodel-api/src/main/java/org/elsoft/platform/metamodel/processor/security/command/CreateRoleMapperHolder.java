package org.elsoft.platform.metamodel.processor.security.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperHolderDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.security.model.RoleMapperHolder;

public class CreateRoleMapperHolder {
	public static String CREATEROLEMAPPERHOLDER = "org.elsoft.platform.metamodel.objects.command.security.CreateRoleMapperHolderDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateRoleMapperHolderDAO command = (CreateRoleMapperHolderDAO)cmd;
		context.put(command.getUUID(), new RoleMapperHolder(command));
		
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateRoleMapperHolderDAO holder) {

		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEROLEMAPPERHOLDER);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateRoleMapperHolderDAO obj = (CreateRoleMapperHolderDAO) dc.createObject();
		obj.setUUID(holder.getUUID());
		obj.setCommandExecutor(CreateRoleMapperHolder.class.getName());

	}

}
