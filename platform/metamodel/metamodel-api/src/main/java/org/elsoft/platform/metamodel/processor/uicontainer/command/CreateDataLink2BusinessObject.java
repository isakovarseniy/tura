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
import java.util.Iterator;

import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.context.SessionContext;
import org.elsoft.platform.metamodel.general.BusinessObjectDAO;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateDataLink2BusinessObjectDAO;
import org.elsoft.platform.metamodel.general.PropertyDAO;
import org.elsoft.platform.metamodel.general.TypeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.Processor;
import org.elsoft.platform.metamodel.processor.datasource.model.Field;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.PrimaryKey;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Version;

public class CreateDataLink2BusinessObject {

	public static String CREATEDATALINK2BUSINESSOBJECT = "org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO";

	public static int load(RepositoryFactory rf, HashMap<String, Object> context,
			CommandDAO cmd) {
		CreateDataLink2BusinessObjectDAO command = (CreateDataLink2BusinessObjectDAO) cmd;

		BusinessObjectDAO bo = Helper.findBusinessObject(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getBusinessObjectName());
		DataLink lnk = (DataLink) context.get(command.getParentUUID());

		if (bo != null) {
            lnk.setDomain(command.getDomain());
            lnk.setFunctionalDomain(command.getFunctionalDomain());
            lnk.setBusinessObjectName(command.getBusinessObjectName());
			
			TypeDefinitionHandler tdh = rf.getRoot().getFunctionalDomain()
					.getBusinessObjectsHandler().getTypeDefinitionHandler();

			TypeDAO tp = (TypeDAO) tdh.getObject();
			lnk.setMajorType(new IndependentType(tp));
			Iterator<?> itr = tdh.getPropertyHandler().getList();
			while (itr.hasNext()) {
				PropertyDAO prop = (PropertyDAO) itr.next();
				TypeDAO type = (TypeDAO) tdh.getPropertyHandler()
						.getTypeDefinitionHandler().getObject();
				lnk.addField(new Field(prop, type,context,lnk.getUuid()));
				
				Object j = prop.isPrimaryKey();
				if (( j != null)&&(prop.isPrimaryKey() ))
					lnk.addAnnotation(new PrimaryKey(prop.getPropertyName()));

				j=prop.isOptLock();
				if (( j != null)&&(prop.isOptLock() ))
					lnk.addAnnotation(new Version(prop.getPropertyName()));
			}
		}
		return Processor.COMMAND_COMPLITED;
	}

	public static void save( CommandHandler ch, String targetUUID, String domain, String functionalDomain, String businessObjectName) {
		ch.getMode().getElResolver().setValue(SessionContext.COMMAND_TYPE,
				CREATEDATALINK2BUSINESSOBJECT);
		DataControl<CommandDAO> dc = ch.getMode().getControl();
		CreateDataLink2BusinessObjectDAO obj = (CreateDataLink2BusinessObjectDAO) dc.createObject();
		obj.setDomain(domain);
		obj.setFunctionalDomain(functionalDomain);
		obj.setBusinessObjectName(businessObjectName);
		obj.setParentUUID(targetUUID);
		obj.setCommandExecutor(CreateDataLink2BusinessObject.class.getName());
	}


}
