package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.FieldsProperty;
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
import org.elsoft.platform.metamodel.general.PropertyDAO;
import org.elsoft.platform.metamodel.general.TypeDAO;
import org.elsoft.platform.metamodel.types.PropertyHandler;

public class FieldsPropertyEditor extends PropertyEditor implements
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
		GenericProperty genericProperty = (GenericProperty) property;

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		ObjectInfo objInf = genericProperty.getObject().getParent();
		Property val = objInf.getPropertyByTitle("businessObject");
		BusinessObjectProperty bo = (BusinessObjectProperty) val.getValue();

		PropertyHandler ph = Activator.rf
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
				.getTypeDefinitionHandler().getPropertyHandler();


		Iterator<PropertyDAO> itr = ph.getList();
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, new LabelProvider());
		dialog.setTitle("Fields selection");
		dialog.setMessage("Select a String (* = any string, ? = any char):");

		ArrayList<FieldSelector> array = new ArrayList<FieldSelector>();
		while (itr.hasNext()) {
			PropertyDAO prop = itr.next();
			TypeDAO type = ph.getTypeDefinitionHandler().getObject();
			array.add(new FieldSelector(prop.getPropertyName(),type));
		}

		dialog.setElements(array.toArray());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return;

			FieldSelector fld = (FieldSelector) result[0];

			genericProperty.setExpression(fld.field, Property.UNKNOWN_VALUE);
			Property refType = genericProperty.getObject().getPropertyByTitle("refType");
			((GenericProperty)refType).setExpression(fld.type.getTypeName(), Property.UNKNOWN_VALUE);
		}
	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof FieldsProperty) {
			FieldsProperty fieldProperty = (FieldsProperty) value;

			if (fieldProperty != null) {
				String text = fieldProperty.getField();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}
	
	public class FieldSelector{
		public String field;
		public TypeDAO type;
		
		public FieldSelector(String field,TypeDAO type){
			this.field=field;
			this.type=type;
		}
		public String toString(){
			return field;
		}
	}
}
