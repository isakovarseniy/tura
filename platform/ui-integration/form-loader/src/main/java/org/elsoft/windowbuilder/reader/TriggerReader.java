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
package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2JavaScriptDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateEventUIElement2ServiceDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2ServiceMethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2ServiceMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2JavaScript;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Service;

public class TriggerReader extends Reader {
	private String triggerType;
	private List<String> service;
	private String method;
	private String script;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {

		triggerType = xmlReader.getAttributeValue(null, "triggerType");

		service = this.expressionParser(xmlReader.getAttributeValue(null,
				"service"));
		method = xmlReader.getAttributeValue(null, "method");

		script = xmlReader.getAttributeValue(null, "script");

		return this;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return false;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		if ((parent instanceof ButtonReader)
				&& (triggerType.equals("ONButtonClickJS"))) {
			CreateEventUIElement2JavaScriptDAO ui2js = new CreateEventUIElement2JavaScriptDAO();
			ui2js.setJavaScript(script);
			ui2js.setCommandExecutor(CreateEventUIElement2JavaScript.class
					.getName());
			ui2js.setParentUUID(parent.getUuid());
			ui2js.setTriggerType(triggerType);
			ui2js.setDstUUID(((ItemReader) parent).getDataControlId());
			ui2js.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2JavaScript
					.name());
			program.add(ui2js);

			return;

		}

		Helper.findType(rf, service.get(0), service.get(1), service.get(2),
				service.get(3));

		MethodDAO m = rf.getTypeDefinitionHandler().getMethodHandler()
				.cleanSearch().searchString("method", method).getObject();

		if (parent instanceof DataControlReader) {
			CreateDataLink2ServiceMethodDAO lnk2serv = new CreateDataLink2ServiceMethodDAO();
			lnk2serv.setDomain(service.get(0));
			lnk2serv.setFunctionalDomain(service.get(1));
			lnk2serv.setApplication(service.get(2));
			lnk2serv.setTypeName(service.get(3));
			lnk2serv.setMethodName(method);
			lnk2serv.setMethodType(triggerType);
			lnk2serv.setRefMethod(m.getObjId());
			lnk2serv.setCommandExecutor(CreateDataLink2ServiceMethod.class
					.getName());
			lnk2serv.setParentUUID(((DataControlReader) parent)
					.getDatacontrolUid());

			program.add(lnk2serv);
		}
		if ((parent instanceof ButtonReader)
				|| (parent instanceof DrugAndDropReader)) {

			CreateEventUIElement2ServiceDAO ui2serv = new CreateEventUIElement2ServiceDAO();
			ui2serv.setDomain(service.get(0));
			ui2serv.setFunctionalDomain(service.get(1));
			ui2serv.setApplication(service.get(2));
			ui2serv.setTypeName(service.get(3));
			ui2serv.setMethodName(method);
			ui2serv.setMethodType(triggerType);
			ui2serv.setRefMethod(m.getObjId());
			ui2serv.setCommandExecutor(CreateEventUIElement2Service.class
					.getName());
			ui2serv.setParentUUID(parent.getUuid());
			ui2serv.setDstUUID(((ItemReader) parent).getDataControlId());
			ui2serv.setEventType(MetamodelTriggerEventsType.CreateEventUIElement2ServiceMethod
					.name());

			program.add(ui2serv);

		}

	}

}
