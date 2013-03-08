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
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.datasource.CreateDataLinkDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateDataLink2BusinessObjectMethodDAO;
import org.elsoft.platform.metamodel.objects.command.links.CreateMethodParameterExpressionDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.processor.Helper;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObject;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDataLink2BusinessObjectMethod;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateMethodParameterExpression;
import org.elsoft.platform.metamodel.types.MethodReferenceHandler;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DataControlReader extends Reader {

	private String name;
	private List<String> businessObject;
	private JSONObject triggerProperty;
	private String datacontrolUid = UUID.randomUUID().toString();
	private Reader parent;

	public String getDatacontrolUid() {
		return datacontrolUid;
	}

	public String getName() {
		return name;
	}

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		name = xmlReader
				.getAttributeValue("http://www.eclipse.org/xwt", "Name");
		businessObject = this.expressionParser(xmlReader.getAttributeValue(
				null, "businessObject"));
		triggerProperty = (JSONObject) JSONValue.parse(xmlReader
				.getAttributeValue(null, "triggerProperty").substring(2));
		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		this.parent = parent;

		if (Reader.idMAP == null)
			Reader.idMAP = new HashMap<String, String>();
		if (Reader.idMAP.get(name) != null)
			datacontrolUid = Reader.idMAP.get(name);
		else
			Reader.idMAP.put(name, datacontrolUid);

		CreateDataLinkDAO dataLink = new CreateDataLinkDAO();
		String formUUID = ((DataDefinitionReader) parent).getFormUid();

		dataLink.setParentUUID(formUUID);
		dataLink.setCommandExecutor(CreateDataLink.class.getName());
		dataLink.setUUID(datacontrolUid);
		dataLink.setDataLinkName(name);
		program.add(dataLink);

		CreateDataLink2BusinessObjectDAO createDataLink2BusinessObject = new CreateDataLink2BusinessObjectDAO();
		createDataLink2BusinessObject
				.setCommandExecutor(CreateDataLink2BusinessObject.class
						.getName());
		createDataLink2BusinessObject.setDomain(businessObject.get(0));
		createDataLink2BusinessObject
				.setFunctionalDomain(businessObject.get(1));
		createDataLink2BusinessObject.setBusinessObjectName(businessObject
				.get(2));
		createDataLink2BusinessObject.setParentUUID(datacontrolUid);
		program.add(createDataLink2BusinessObject);

		@SuppressWarnings("unchecked")
		Iterator<String> itr = triggerProperty.keySet().iterator();
		while (itr.hasNext()) {
			CreateDataLink2BusinessObjectMethodDAO createDataLink2BusinessObjectMethod = new CreateDataLink2BusinessObjectMethodDAO();
			createDataLink2BusinessObjectMethod
					.setCommandExecutor(CreateDataLink2BusinessObjectMethod.class
							.getName());
			createDataLink2BusinessObjectMethod.setParentUUID(dataLink
					.getUUID());

			String triggerName = itr.next();
			String method = (String) ((JSONObject) (triggerProperty
					.get(triggerName))).get("call");

			createDataLink2BusinessObjectMethod.setMethodType(triggerName);
			createDataLink2BusinessObjectMethod
					.setDomain(businessObject.get(0));
			createDataLink2BusinessObjectMethod
					.setFunctionalDomain(businessObject.get(1));
			createDataLink2BusinessObjectMethod
					.setBusinessObjectName(businessObject.get(2));
			createDataLink2BusinessObjectMethod = findMethod(rf,
					createDataLink2BusinessObjectMethod, method);
			program.add(createDataLink2BusinessObjectMethod);

			JSONObject parameters = (JSONObject) ((JSONObject) (triggerProperty
					.get(triggerName))).get("parameters");
			if (parameters != null) {
				@SuppressWarnings("unchecked")
				Iterator<String> itrParam = parameters.keySet().iterator();
				while (itrParam.hasNext()) {
					String paramName = itrParam.next();
					JSONArray array = (JSONArray) parameters.get(paramName);
					CreateMethodParameterExpressionDAO methodParameterExpression = new CreateMethodParameterExpressionDAO();
					methodParameterExpression
							.setCommandExecutor(CreateMethodParameterExpression.class
									.getName());
					methodParameterExpression.setParamName(paramName);

					List<String> ls = this.expressionParser((String) array
							.get(0));

					if (ls != null) {

						methodParameterExpression
								.setExpression(expressionBuilder(
										((DataDefinitionReader) parent)
												.getFormName(), ls));
					}
					if (array.get(1) != null)
						methodParameterExpression.setValue((String) array
								.get(1));

					methodParameterExpression
							.setParentUUID(createDataLink2BusinessObjectMethod
									.getRefMethod().toString());
					program.add(methodParameterExpression);

				}
			}
		}
	}

	public static CreateDataLink2BusinessObjectMethodDAO findMethod(
			RepositoryFactory rf,
			CreateDataLink2BusinessObjectMethodDAO command, String methodName) {

		Helper.findBusinessObject(rf, command.getDomain(),
				command.getFunctionalDomain(), command.getBusinessObjectName());
		MethodReferenceHandler mrh = rf.getRoot().getFunctionalDomain()
				.getBusinessObjectsHandler().getMethodReferenceHandler();
		Iterator<MethodReferenceDAO> itr = mrh.cleanSearch()
				.searchString("methodType", command.getMethodType()).getList();

		while (itr.hasNext()) {
			MethodReferenceDAO refMethod = itr.next();
			MethodDAO method = mrh.getMethodHandler().getObject();
			if (method.getMethod().equals(methodName)) {
				command.setRefMethod(refMethod.getObjId());
				break;
			}
		}

		return command;

	}

	public Reader getParent() {
		return parent;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
