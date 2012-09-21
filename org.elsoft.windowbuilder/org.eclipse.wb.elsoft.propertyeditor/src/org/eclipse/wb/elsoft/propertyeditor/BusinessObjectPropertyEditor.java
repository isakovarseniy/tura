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

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.core.model.ObjectInfo;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;
import org.eclipse.wb.internal.core.xml.model.property.GenericPropertyImpl;
import org.elsoft.platform.metamodel.objects.suite.DomainDAO;
import org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO;
import org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO;
import org.elsoft.platform.metamodel.suite.DomainServiceDC;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.types.BusinessObjectHandler;

public class BusinessObjectPropertyEditor extends PropertyEditor implements
		IClipboardSourceProvider {

	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			openDialog(property);
		}
	};

	@Override
	public String getClipboardSource(GenericProperty property) throws Exception {
		return null;
	}

	@Override
	public PropertyEditorPresentation getPresentation() {
		return m_presentation;
	}

	private TreeModel buildModel() {
		DomainServiceDC dh = Activator.rf.getRoot();
		Iterator<DomainDAO> itr = dh.cleanSearch().getList();
		TreeModel root = new TreeModel("root", null);

		while (itr.hasNext()) {
			DomainDAO domain = itr.next();
			TreeModel domainNode = new TreeModel(domain.getDomainName(), root);
			FunctionalDomainHandler fd = dh.getFunctionalDomain();
			Iterator<FunctionalDomainDAO> itrFD = fd.cleanSearch().getList();
			while (itrFD.hasNext()) {
				FunctionalDomainDAO functionalDomain = itrFD.next();
				TreeModel functionalDomainNode = new TreeModel(
						functionalDomain.getFunctionalDomainName(), domainNode);
				BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
				Iterator<BusinessObjectDAO> itrBO = bh.cleanSearch().getList();
				while (itrBO.hasNext()) {
					BusinessObjectDAO busObj = itrBO.next();
					new TreeModel(busObj.getBusinessObjectTypeName(),
							functionalDomainNode);
				}

			}

		}
		return root;
	}

	private void openDialog(Property property) throws Exception {
		GenericProperty genericProperty = (GenericProperty) property;

		GenericPropertyImpl g = (GenericPropertyImpl) property;
		ObjectInfo obj = g.getObjectInfo();
		Property val = obj.getPropertyByTitle("Name");

		Display display = Display.getDefault();
		Shell shell = new Shell(display);

		if (val.getValue() == Property.UNKNOWN_VALUE) {
			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
					"DataControl name can't be empty", null); 
			
			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
					"An unexpectedexception has ocurred.", status,
					IStatus.ERROR);
			error.open();
			return;
		}
		String dcName = (String) val.getValue();

		shell.setLayout(new FillLayout());

		TreeViewerDialog dialog = new TreeViewerDialog(shell, buildModel());
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if ((((TreeModel) result[0]).parent == null)
					|| (((TreeModel) result[0]).parent.parent == null))
				return;

			String expression = ((TreeModel) result[0]).parent.parent.nodeName
					+ "." + ((TreeModel) result[0]).parent.nodeName + "."
					+ ((TreeModel) result[0]).nodeName;

			genericProperty.setExpression(expression, Property.UNKNOWN_VALUE);

			new ControlHelper().addDataControl(dcName, expression,ControlHelper.DATACONTROL_FILE_NAME);

		}

	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof BusinessObjectProperty) {
			BusinessObjectProperty businessObject = (BusinessObjectProperty) value;

			if (businessObject != null) {
				String text = businessObject.getDomain() + "."
						+ businessObject.getFunctionalDomain() + "."
						+ businessObject.getBusinessObjectName();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}
}
