package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.core.model.ObjectInfo;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;
import org.eclipse.wb.internal.core.xml.model.property.GenericPropertyImpl;
import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;

public class PrimitiveTypePropertyEditor extends ServicesPropertyEditor {
	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			if (check(property))
				openDialog(property, MetamodelTypeOfTypes.Primitive.name());
		}
	};

	private boolean check(Property property) throws Exception {

		GenericProperty genericProperty = (GenericProperty) property;
		ObjectInfo objInf = genericProperty.getObject().getParent();
		String dataControlName =  (String) objInf.getPropertyByTitle("Name").getValue();

		GenericPropertyImpl g = (GenericPropertyImpl) property;
		ObjectInfo obj = g.getObjectInfo();
		Property val = obj.getPropertyByTitle("Name");

		if( (val == null)||(val.getValue().equals(Property.UNKNOWN_VALUE)) ) {
			Display display = Display.getDefault();
			Shell shell = new Shell(display);

			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
					"Name can't be empty", null);

			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
					"An unexpectedexception has ocurred.", status,
					IStatus.ERROR);
			error.open();
			return false;

		}
        String fieldName = (String) val.getValue();
		ControlHelper control = new ControlHelper();
		if (!control.isExists(dataControlName+"."+fieldName,
				ControlHelper.ARTIFICIAL_FIELD_FILE_NAME)) {
			control.addDataControl(dataControlName+"."+fieldName,
					dataControlName+"."+fieldName,
					ControlHelper.ARTIFICIAL_FIELD_FILE_NAME);
		}
		return true;
	}

	@Override
	public PropertyEditorPresentation getPresentation() {
		return m_presentation;
	}

}
