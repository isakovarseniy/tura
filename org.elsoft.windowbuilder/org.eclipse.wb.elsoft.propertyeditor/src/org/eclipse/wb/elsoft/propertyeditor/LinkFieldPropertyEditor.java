package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.e4.xwt.elsoft.types.DestinationDataControlProperty;
import org.eclipse.e4.xwt.elsoft.types.LinkFieldProperty;
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
import org.elsoft.platform.metamodel.general.PropertyDAO;

public class LinkFieldPropertyEditor extends PropertyEditor implements
		IClipboardSourceProvider {

	public static String MASTER_FIELD = "masterField";
	public static String DETAIL_FIELD = "detailField";

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

		Properties properties = (new ControlHelper()).load();

		ObjectInfo objInf = genericProperty.getObject().getParent();
		String dcName = null;
		if (genericProperty.getTitle().equals(MASTER_FIELD)) {
			Property val = objInf.getParent().getPropertyByTitle("Name");
			dcName = (String) val.getValue();
			if (dcName == null){
    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
    					"Master Iterator is not defined by parent elemnt", null);

    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
    					"An unexpectedexception has ocurred.", status,
    					IStatus.ERROR);
    			error.open();
    			return;
				
			}
			
		} else {
			Property val = objInf.getPropertyByTitle("dstDataControl");
			if (val.getValue() == null){
    			IStatus status = new Status(IStatus.ERROR, "Explorer", IStatus.OK,
    					"Detail Iterator is not defined by parent elemnt", null);

    			ErrorDialog error = new ErrorDialog(shell, "Explorer - Error",
    					"An unexpectedexception has ocurred.", status,
    					IStatus.ERROR);
    			error.open();
    			return;
				
			}
			dcName = ((DestinationDataControlProperty) val.getValue())
					.getDataControlName();
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
		if (value instanceof LinkFieldProperty) {
			LinkFieldProperty link = (LinkFieldProperty) value;

			if (link != null) {
				String text = link.getFieldName();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}

}
