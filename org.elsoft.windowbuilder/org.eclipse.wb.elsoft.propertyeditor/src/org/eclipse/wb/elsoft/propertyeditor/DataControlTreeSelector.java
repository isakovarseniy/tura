package org.eclipse.wb.elsoft.propertyeditor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.general.PropertyDAO;

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

		Properties properties = (new ControlHelper()).load();
		Enumeration<Object> enumerator = properties.keys();
		TreeModel root = new TreeModel("root", null);
		while (enumerator.hasMoreElements()) {

			String key = (String) enumerator.nextElement();
			BusinessObjectProperty bo = new BusinessObjectProperty(
					(String) properties.get(key));

			TreeModel dc = new TreeModel(key, root);
			addFields(bo, dc);
			addTriggers(bo, dc);
		}

		return root;
	}

	private void addFields(BusinessObjectProperty bo, TreeModel root) {

		Iterator<PropertyDAO> itr = Activator.rf
				.getRoot()
				.clean()
				.searchString("domainName", bo.getDomain())
				.seek()
				.getFunctionalDomain()
				.clean()
				.searchString("functionalDomainName", bo.getFunctionalDomain())
				.seek()
				.getBusinessObjectsHandler()
				.clean()
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