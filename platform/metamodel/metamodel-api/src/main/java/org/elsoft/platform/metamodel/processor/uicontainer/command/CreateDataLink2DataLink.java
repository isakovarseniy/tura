/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform.metamodel.processor.uicontainer.command;

import java.util.HashMap;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDataLink2DataLinkDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Field2field;

public class CreateDataLink2DataLink {
	public static String CREATEDATALINK2DATALINK = "org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2DataLinkDAO";

	public static int load(RepositoryFactory rf,
			HashMap<String, Object> context, CommandDAO cmd) {
		CreateDataLink2DataLinkDAO command = (CreateDataLink2DataLinkDAO) cmd;
		DataLink masterLnk = (DataLink) context.get(command.getParentUUID());
		DataLink detailLnk = (DataLink) context.get(command.getDstUUID());

		if ((masterLnk == null) || (detailLnk == null))
			return Processor.COMMAND_POSTPONE;

		Field2field f2f = new Field2field(command.getMasterField(),
				command.getDetailField());

		masterLnk.addRelation(command.getRelationName(), f2f, masterLnk,
				detailLnk,command.isTreeRelation());

		return Processor.COMMAND_COMPLITED;
	}

	public static void save(CommandHandler ch, String parentUUID,
			String detailUUID, String relationName, String masterField,
			String detailField, Boolean treeRelation) {

		ch.getMode().getElResolver()
				.setValue(SessionContext.COMMAND_TYPE, CREATEDATALINK2DATALINK);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLink2DataLinkDAO obj = (CreateDataLink2DataLinkDAO) dc
				.createObject();

		obj.setParentUUID(parentUUID);
		obj.setDstUUID(detailUUID);
		obj.setMasterField(masterField);
		obj.setDetailField(detailField);
		obj.setRelationName(relationName);
		obj.setTreeRelation(treeRelation);
		obj.setCommandExecutor(CreateDataLink2DataLink.class.getName());
	}

}
