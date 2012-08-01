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
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.IteratorProperty;
import org.eclipse.e4.xwt.elsoft.types.SourceProperty;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
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
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;

public class SourcePropertyEditor extends PropertyEditor implements
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

	private void openDialog(Property property) throws Exception {
		GenericPropertyImpl genericProperty = (GenericPropertyImpl) property;

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		Properties properties = (new ControlHelper()).load(ControlHelper.DATACONTROL_FILE_NAME);

		ObjectInfo objInf = genericProperty.getObject();
		String dcName = null;

		if (objInf.getParent().getClass().getCanonicalName().equals("org.eclipse.wb.internal.xwt.model.widgets.ButtonInfo")){
			if (property.getTitle().equals("displayField")){
				Property val  = objInf.getParent().getPropertyByTitle("optionIterator");
	            if (val.getValue() == null){
	    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
	    					"Option Iterator is not defined by parent elemnt", null);

	    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
	    					"An unexpectedexception has ocurred.", status,
	    					IStatus.ERROR);
	    			error.open();
	    			return;
	            }
				dcName = ((IteratorProperty) val.getValue()).getIterator();
			}
			if (property.getTitle().equals("returnField")){
				Property val  = objInf.getPropertyByTitle("returnIterator");
	            if (val.getValue() == null){
	    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
	    					"Return Iterator is not defined by parent elemnt", null);

	    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
	    					"An unexpectedexception has ocurred.", status,
	    					IStatus.ERROR);
	    			error.open();
	    			return;
	            }
				dcName = ((IteratorProperty) val.getValue()).getIterator();
			}

		
		}else{
		
		if (
		   ( objInf.getParent().getClass().getCanonicalName().equals("org.eclipse.wb.internal.xwt.model.widgets.TableColumnInfo"))||
		   ( objInf.getParent().getClass().getCanonicalName().equals("org.eclipse.wb.internal.xwt.model.widgets.TreeColumnInfo"))
		   )
		
		{
			Property val  = objInf.getParent().getParent().getPropertyByTitle("iteratorProperty");
            if (val.getValue() == null){
    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
    					"Iterator is not defined by parent elemnt", null);

    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
    					"An unexpectedexception has ocurred.", status,
    					IStatus.ERROR);
    			error.open();
    			return;
            }
			
			dcName = ((IteratorProperty) val.getValue()).getIterator();
		}else{
			Property val = objInf.getPropertyByTitle("iteratorProperty");
            if (val.getValue() == null){
    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
    					"Iterator is not defined in current elemnt", null);

    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
    					"An unexpectedexception has ocurred.", status,
    					IStatus.ERROR);
    			error.open();
    			return;
            }
			
			dcName = ((IteratorProperty) val.getValue()).getIterator();
		}
		
		}
		BusinessObjectProperty bo = new BusinessObjectProperty(
				(String) properties.get(dcName));

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

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, new LabelProvider());
		dialog.setTitle("Fields selection");
		dialog.setMessage("Select a String (* = any string, ? = any char):");

		ArrayList<Object> array = new ArrayList<Object>();
		while (itr.hasNext()) {
			array.add(itr.next().getPropertyName());
		}

		dialog.setElements(array.toArray());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return;

			String expression = (String) result[0];

			genericProperty.setExpression(expression, Property.UNKNOWN_VALUE);
		}

	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof SourceProperty) {
			SourceProperty link = (SourceProperty) value;

			if (link != null) {
				String text = link.getSource();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}

}
