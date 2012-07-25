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

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.objects.command.CommandDAO;
import org.elsoft.platform.metamodel.objects.command.form.CreateFormDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateForm;

public class DataDefinitionReader extends Reader {
	private String formName;
	private String domain;
	private String functionalDomain;
	private String application;
	private String formUid;

	public String getFormName() {
		return formName;
	}

	public String getDomain() {
		return domain;
	}

	public String getFunctionalDomain() {
		return functionalDomain;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		String expression = xmlReader.getAttributeValue(null, "form");

		List<String> result = this.expressionParser(expression);
		domain = result.get(0);
		functionalDomain = result.get(1);
		application = result.get(2);
		formName = result.get(3);
		formUid = formName;

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		CreateFormDAO form = new CreateFormDAO();
		form.setCommandExecutor(CreateForm.class.getName());
		form.setFormName(formName);
		form.setDomain(domain);
		form.setFunctionalDomain(functionalDomain);
		form.setApplication(application);
		form.setUUID(getUuid());
		program.add(form);

		if (Reader.idMAP == null)
			Reader.idMAP = new HashMap<String, String>();
		Reader.idMAP.put(formName, form.getUUID());
		Reader.idMAP.put("formName", formName);
		
		Reader.formid=form.getUUID();
	}

	public String getFormUid() {
		return formUid;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}



}
