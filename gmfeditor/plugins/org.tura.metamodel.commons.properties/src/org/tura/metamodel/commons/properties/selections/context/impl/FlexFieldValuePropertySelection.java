package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.FlexFieldNameSelectionEvent;
import org.tura.metamodel.commons.properties.FlexFieldSelectionEvent;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;

public class FlexFieldValuePropertySelection extends AnyTypePropertySelection {

	private domain.FlexField model;
	private SelectionListener listener = new SelectionListener(this);

	@Override
	public void createControls(Composite parent,
			final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().addListener(SWT.Selection,
				listener);
	}

	@Override
	protected void handleModified() {
		propertySheetPage.getControl().notifyListeners(SWT.Selection,
				new FlexFieldNameSelectionEvent());
	}

	@Override
	public EObject getModel() {
		if (model == null) {
			domain.FlexFields fields = (domain.FlexFields) getEObject();
			if (fields == null || !fields.getFields().iterator().hasNext())
				return null;
			return fields.getFields().iterator().next();
		}
		return model;
	}

	private class SelectionListener implements Listener {
		private AbstractTuraPropertySection property;

		public SelectionListener(AbstractTuraPropertySection property) {
			this.setProperty(property);
		}

		public void setProperty(AbstractTuraPropertySection property) {
			this.property = property;
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof FlexFieldSelectionEvent) {
				model = ((FlexFieldSelectionEvent) event).getField();
				try {
					property.refresh();
				} catch (org.eclipse.swt.SWTException e) {

				}
			}
		}
	}

}
