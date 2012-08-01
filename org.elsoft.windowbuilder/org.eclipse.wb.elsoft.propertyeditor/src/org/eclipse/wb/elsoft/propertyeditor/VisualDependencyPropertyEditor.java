package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import org.eclipse.e4.xwt.elsoft.types.VisualDependencyProperty;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.wb.elsoft.components.ControlHelper;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.PropertyEditor;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;
import org.eclipse.wb.internal.core.utils.ui.DrawUtils;
import org.eclipse.wb.internal.core.xml.model.clipboard.IClipboardSourceProvider;
import org.eclipse.wb.internal.core.xml.model.property.GenericProperty;

public class VisualDependencyPropertyEditor extends PropertyEditor implements
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

		VisualDependencyProperty depend = (VisualDependencyProperty) genericProperty
				.getValue();

		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		Properties properties = (new ControlHelper())
				.load(ControlHelper.ID_FILE_NAME);

		ArrayList<Object> array = new ArrayList<Object>();
		ArrayList<Object> checked = new ArrayList<Object>();
		Enumeration<Object> keys = properties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String val = properties.getProperty(key);
			Pair pair = new Pair(key, val);
			array.add(pair);
			if ((depend != null) && (depend.getDependencies() != null)
					&& (depend.getDependencies().contains(val)))
				checked.add(pair);
		}

		ListSelectionDialog dialog = new ListSelectionDialog(shell, array,
				new ListContentProvider(), new IDLabelProvider(),
				"Select dependency:");
		dialog.setInitialSelections(checked.toArray());

		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();

			if (result.length == 0)
				return;
			String expression = "";
			for (int i = 0; i < result.length; i++) {
				Pair pair = (Pair) result[i];
				expression = expression + " " + pair.value;
			}

			genericProperty.setExpression(expression.substring(1),
					Property.UNKNOWN_VALUE);

		}

	}

	@Override
	public void paint(Property property, GC gc, int x, int y, int width,
			int height) throws Exception {
		Object value = property.getValue();
		if (value instanceof VisualDependencyProperty) {
			VisualDependencyProperty dependency = (VisualDependencyProperty) value;

			if (dependency != null) {
				String text = dependency.toString();
				if (text != null) {
					DrawUtils.drawStringCV(gc, text, x, y, width, height);
				}
			}
		}
	}

	class Pair {
		public String name;
		public String value;

		public Pair(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}
}