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

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.CastObjectProperty;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.wb.core.model.ObjectInfo;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;
import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;

public class CastObjectPropertyEditor extends PropertyEditor implements
		IClipboardSourceProvider {

	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			if (check(property))
			openDialog(property,MetamodelTypeOfTypes.Entity.name());
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
	
	private boolean check(Property property) throws Exception {
		GenericProperty genericProperty = (GenericProperty) property;

		ObjectInfo objInf = genericProperty.getObject().getParent();
		Display display = Display.getDefault();
		Shell shell = new Shell(display);

		if ((objInf.getClass().getCanonicalName()
				.equals("org.eclipse.wb.internal.xwt.model.widgets.TableColumnInfo"))
				|| (objInf.getClass().getCanonicalName()
						.equals("org.eclipse.wb.internal.xwt.model.widgets.TreeColumnInfo"))) {
			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
					"Iterator defined by parent elemnt", null);

			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
					"An unexpectedexception has ocurred.", status,
					IStatus.ERROR);
			error.open();
			return false;

		}
		return true;
	}
	
	
	
	protected void openDialog(Property property,String  typeoftype) throws Exception {
		GenericProperty genericProperty = (GenericProperty) property;

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		TypeDefinitionHandler th = Activator.rf
				.getTypeDefinitionHandler()
				.cleanSearch()
				.searchString("typeOfType", typeoftype)
				.seek();


		Iterator<TypeDAO> itr = th.getList();
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, new LabelProvider());
		dialog.setTitle("Fields selection");
		dialog.setMessage("Select a String (* = any string, ? = any char):");

		ArrayList<String> array = new ArrayList<String>();
		while (itr.hasNext()) {
			TypeDAO type = itr.next();
			array.add(type.getDomain()+"."+type.getFunctionalDomain()+"."+type.getApplication()+"."+type.getTypeName());
		}

		dialog.setElements(array.toArray());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return;

			String fld = (String) result[0];

			genericProperty.setExpression(fld, Property.UNKNOWN_VALUE);
		}
	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof CastObjectProperty) {
			CastObjectProperty serviceObject = (CastObjectProperty) value;

			if (serviceObject != null) {
				String text = serviceObject.getDomain() + "."
						+ serviceObject.getFunctionalDomain() + "."
						+ serviceObject.getApplication()+"."
						+ serviceObject.getTypeName();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}
}


