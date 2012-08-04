package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateFieldSetDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ChildrenOwner;
import org.elsoft.platform.metamodel.processor.uicontainer.model.FieldSet;

public class CreateFieldSet {
	public static String CREATEFIELDSET = "org.elsoft.platform.metamodel.objects.command.form.ui.CreateFieldSetDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateFieldSetDAO command = (CreateFieldSetDAO) cmd;
		ChildrenOwner own = (ChildrenOwner) context
				.get(command.getParentUUID());
		own.addChild(new FieldSet(command, context));

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID, FieldSet fieldset) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEFIELDSET);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateFieldSetDAO obj = (CreateFieldSetDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setCss(fieldset.getCss());
		obj.setUUID(fieldset.getUuid());
		obj.setCssClass(fieldset.getCssClass());
		obj.setCommandExecutor(CreateFieldSet.class.getName());
	}

}
