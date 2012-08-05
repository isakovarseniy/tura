package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.IDProperty;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;

public class IDPropertyEditor extends PropertyEditor implements
		IClipboardSourceProvider {

	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			openDialog(propertyTable, property);
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

	private void openDialog(PropertyTable propertyTable, Property property)
			throws Exception {

		GenericProperty genericProperty = (GenericProperty) property;

		Display display = Display.getDefault();
		Shell shell = new Shell(display);

		IDPropertyDialog dialog = new IDPropertyDialog(
				propertyTable.getShell(), property);
		if (dialog.open() == Window.OK) {
			dialog.getDialogValue();
			ControlHelper control = new ControlHelper();
			if (!control.isExists(dialog.getDialogValue(),
					ControlHelper.ID_FILE_NAME)) {
				genericProperty.setExpression(dialog.getDialogValue(),
						Property.UNKNOWN_VALUE);
				control.addDataControl(dialog.getDialogValue(),
						dialog.getDialogValue(), ControlHelper.ID_FILE_NAME);
			} else {
				IStatus status = new Status(IStatus.ERROR, "Explorer",
						IStatus.OK, "Object name can't be empty", null);

				ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
						"An unexpectedexception has ocurred.", status,
						IStatus.ERROR);
				error.open();
				return;
			}
		}
	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof IDProperty) {
			IDProperty idProperty = (IDProperty) value;

			if (idProperty != null) {
				String text = idProperty.getIdValue();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}

}
