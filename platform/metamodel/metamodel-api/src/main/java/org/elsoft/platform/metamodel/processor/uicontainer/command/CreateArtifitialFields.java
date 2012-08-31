package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateArtifitialFieldsDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.ArtifitialField;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;

public class CreateArtifitialFields {
	public static String CREATEARTIFITIALFIELDS = "org.elsoft.platform.metamodel.objects.command.form.datasource.CreateArtifitialFieldsDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateArtifitialFieldsDAO command = (CreateArtifitialFieldsDAO) cmd;
		DataLink lnk = (DataLink) context.get(command.getParentUUID());
		lnk.addArtifitialField(new ArtifitialField(command, rf));

		return Processor.COMMAND_COMPLITED;

	}

	public static void save(CommandHandler ch, String parentUUID, ArtifitialField artifitialField) {
		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEARTIFITIALFIELDS);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateArtifitialFieldsDAO obj = (CreateArtifitialFieldsDAO) dc.createObject();
		obj.setParentUUID(parentUUID);
		obj.setArtifitialFieldName(artifitialField.getArtifitialFieldName());
		obj.setDefaultValue(artifitialField.getDefaultValue());
		obj.setRefType(artifitialField.getType().getTypedao().getObjId());
		obj.setCommandExecutor(CreateArtifitialFields.class.getName());

	}
}
