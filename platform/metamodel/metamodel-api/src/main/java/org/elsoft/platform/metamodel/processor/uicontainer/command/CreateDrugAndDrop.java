package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateDrugAndDropDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DrugAndDrop;

public class CreateDrugAndDrop {
	public static String CREATEDRUGANDDROP = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateDrugAndDropDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDrugAndDropDAO command = (CreateDrugAndDropDAO) cmd;
		ChildrenOwner cw = (ChildrenOwner) context.get(command.getParentUUID());
		cw.addChild(new DrugAndDrop(command, context));
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			DrugAndDrop inputText) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDRUGANDDROP);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDrugAndDropDAO obj = (CreateDrugAndDropDAO) dc
				.createObject();
		obj.setParentUUID(parentUUID);
		obj.setCommandExecutor(CreateDrugAndDrop.class.getName());
		obj.setUUID(inputText.getUuid());
	}

}
