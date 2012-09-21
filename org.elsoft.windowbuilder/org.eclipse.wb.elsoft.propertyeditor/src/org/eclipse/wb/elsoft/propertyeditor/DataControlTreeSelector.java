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
package org.eclipse.wb.elsoft.propertyeditor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;

public class DataControlTreeSelector {

	public String openDialog(Shell shell) {

		TreeViewerDialog dialog = new TreeViewerDialog(shell, buildModel());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return "";

			String expression = "";
			TreeModel leaf = (TreeModel) result[0];
			while (!leaf.nodeName.equals("root")) {
				if (!expression.equals(""))
					expression = "." + expression;
				expression = leaf.nodeName + expression;
				leaf = leaf.parent;
			}
			return expression;
		}
		return "";
	}

	private TreeModel buildModel() {

		Properties properties = (new ControlHelper()).load(ControlHelper.DATACONTROL_FILE_NAME);
		Enumeration<Object> enumerator = properties.keys();
		TreeModel root = new TreeModel("root", null);
		while (enumerator.hasMoreElements()) {

			String key = (String) enumerator.nextElement();
			BusinessObjectProperty bo = new BusinessObjectProperty(
					(String) properties.get(key));

			TreeModel dc = new TreeModel(key, root);
			addFields(bo, dc);
			addTriggers(bo, dc);
			addArtifitialFields(key,dc);
		}

		return root;
	}

	private void addArtifitialFields(String dataControl, TreeModel root){

		ControlHelper cntFile = new ControlHelper();
		Properties prop = cntFile.load(ControlHelper.ARTIFICIAL_FIELD_FILE_NAME);
		Enumeration<Object> enumer = prop.keys();
		while (enumer.hasMoreElements()){
			String key = (String) enumer.nextElement();
			StringTokenizer st = new StringTokenizer(key,".");

			String control = st.nextToken();
			String artfld = st.nextToken();
			if (control.equals(dataControl))
				new TreeModel(artfld, root);
		}
	}
	private void addFields(BusinessObjectProperty bo, TreeModel root) {

		Iterator<PropertyDAO> itr = Activator.rf
				.getRoot()
				.cleanSearch()
				.searchString("domainName", bo.getDomain())
				.seek()
				.getFunctionalDomain()
				.cleanSearch()
				.searchString("functionalDomainName", bo.getFunctionalDomain())
				.seek()
				.getBusinessObjectsHandler()
				.cleanSearch()
				.searchString("businessObjectTypeName",
						bo.getBusinessObjectName()).seek()
				.getTypeDefinitionHandler().getPropertyHandler().getList();

		while (itr.hasNext()) {
			new TreeModel(itr.next().getPropertyName(), root);
		}
	}

	private void addTriggers(BusinessObjectProperty bo, TreeModel root) {
		for (MetamodelTriggerEventsType val : MetamodelTriggerEventsType
				.values()) {
			if (!val.getMethod().equals("na"))
				new TreeModel(val.getMethod(), root);
		}
	}
}
