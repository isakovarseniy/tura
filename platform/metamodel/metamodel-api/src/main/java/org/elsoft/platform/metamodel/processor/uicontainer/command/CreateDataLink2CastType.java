package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2CastTypeDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class CreateDataLink2CastType {

	public static String CREATEDATALINK2CASTTYPE = "org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2CastTypeDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {

		CreateDataLink2CastTypeDAO command = (CreateDataLink2CastTypeDAO) cmd;

		Helper.findType(rf, command.getDomain(), command.getFunctionalDomain(),
				command.getApplication(), command.getTypeName());

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		DataLink lnk = (DataLink) context.get(command.getParentUUID());

		Object cast = lnk.getCastObjects().get(
				lnk.getUuid() + "." + command.getDomain() + "."
						+ command.getFunctionalDomain() + "."
						+ command.getApplication() + "."
						+ command.getTypeName());
		if (cast == null) {
			Iterator<?> itr = tdh.getPropertyHandler().getList();

			while (itr.hasNext()) {
				PropertyDAO prop = (PropertyDAO) itr.next();
				TypeDAO type = (TypeDAO) tdh.getPropertyHandler()
						.getTypeDefinitionHandler().getObject();
				lnk.addField(new Field(prop, type, context, lnk.getUuid(),
						command.getDomain() + "."
								+ command.getFunctionalDomain() + "."
								+ command.getApplication() + "."
								+ command.getTypeName()));
			}
			lnk.addCastcastObject(command);
		}
		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID,
			CreateDataLink2CastTypeDAO castObject) {

		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDATALINK2CASTTYPE);

		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLink2CastTypeDAO obj = (CreateDataLink2CastTypeDAO) dc
				.createObject();

		obj.setParentUUID(parentUUID);
		obj.setCommandExecutor(CreateDataLink2CastType.class.getName());
		obj.setDomain(castObject.getDomain());
		obj.setFunctionalDomain(castObject.getFunctionalDomain());
		obj.setApplication(castObject.getApplication());
		obj.setTypeName(castObject.getTypeName());

	}

}
