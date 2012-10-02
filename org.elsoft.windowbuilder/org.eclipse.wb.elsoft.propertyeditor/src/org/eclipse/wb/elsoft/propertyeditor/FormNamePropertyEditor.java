package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.FormNameProperty;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;

public class FormNamePropertyEditor extends IDPropertyEditor {


	protected void openDialog(PropertyTable propertyTable, Property property)
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
					ControlHelper.FORM_NAME)) {
				genericProperty.setExpression(dialog.getDialogValue(),
						Property.UNKNOWN_VALUE);
				control.addDataControl("FormName",
						dialog.getDialogValue(), ControlHelper.FORM_NAME);
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
		if (value instanceof FormNameProperty) {
			FormNameProperty idProperty = (FormNameProperty) value;

			if (idProperty != null) {
				String text = idProperty.toString();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}


}
