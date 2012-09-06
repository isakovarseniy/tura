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
import java.util.UUID;

import org.eclipse.e4.xwt.elsoft.types.TriggerType;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.XmlObjectInfo;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;
import org.eclipse.wb.internal.core.xml.model.property.GenericPropertyImpl;
import org.elsoft.platform.datacontrol.DCMetaInfo;

public class TriggerTypePropertyEditor extends PropertyEditor implements
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

		XmlObjectInfo parent = (XmlObjectInfo) genericProperty.getObject()
				.getParent();

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, new LabelProvider());
		dialog.setTitle("DataControl selection");
		dialog.setMessage("Select a String (* = any string, ? = any char):");

		ArrayList<Object> array = new ArrayList<Object>();

		if (parent.getDescription().getComponentClass().getName()
				.equals("org.eclipse.wb.elsoft.components.DataControl")) {
			array.add(DCMetaInfo.POSTCreateTrigger.name());
			array.add(DCMetaInfo.POSTQueryTrigger.name());
			array.add(DCMetaInfo.PREInsertTrigger.name());
			array.add(DCMetaInfo.PREQueryTrigger.name());
			array.add(DCMetaInfo.PRERemoveTrigger.name());
			array.add(DCMetaInfo.PREUpdateTrigger.name());
		}

		if (parent.getDescription().getComponentClass().getName()
				.equals("org.eclipse.wb.elsoft.components.MetaAction")) {
			array.add("ONButtonPressed");
		}
		
		if (parent.getDescription().getComponentClass().getName()
				.equals("org.eclipse.wb.elsoft.components.DrugAndDrop")) {
			array.add("ONItemDrop");
		}
				

		dialog.setElements(array.toArray());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return;

			String expression = (String) result[0];

			genericProperty.setExpression(expression, Property.UNKNOWN_VALUE);
			Property nameProp = genericProperty.getObject().getPropertyByTitle(
					"Name");
			if (expression.equals("ActionTrigger"))
				nameProp.setValue(UUID.randomUUID().toString());
			else
				nameProp.setValue(expression);

		}

	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof TriggerType) {
			TriggerType link = (TriggerType) value;

			if (link != null) {
				String text = link.getTriggerType();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}

}
