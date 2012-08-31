package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.model.property.editor.presentation.ButtonPropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.editor.presentation.PropertyEditorPresentation;
import org.eclipse.wb.internal.core.model.property.table.PropertyTable;

public class OptionIteratorPropertyEditor extends IteratorPropertyEditor {
	private final PropertyEditorPresentation m_presentation = new ButtonPropertyEditorPresentation() {
		@Override
		protected void onClick(PropertyTable propertyTable, Property property)
				throws Exception {
			openDialog(property);
		}
	};

	@Override
	public PropertyEditorPresentation getPresentation() {
		return m_presentation;
	}

}
