package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ImageHolder;

public class CreateEventUIElement2ImageHolderField {

	public static String CREATEEVENTUIELEMENT2IMAGEHOLDERFIELD = "org.elsoft.platform.metamodel.objects.command.EventDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) throws Exception {
		EventDAO command = (EventDAO) cmd;

		ImageHolder element = (ImageHolder) context.get(command.getParentUUID());

		element.setUIElement2ImageHolderField(command, context);
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			ImageHolder element ) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEEVENTUIELEMENT2IMAGEHOLDERFIELD);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		EventDAO obj = (EventDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setDstUUID(element.getImageSrcField().getUuid());
		obj.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2ImageHolder.name());
		obj.setCommandExecutor(CreateEventUIElement2ImageHolderField.class.getName());
	}
	
	
}
