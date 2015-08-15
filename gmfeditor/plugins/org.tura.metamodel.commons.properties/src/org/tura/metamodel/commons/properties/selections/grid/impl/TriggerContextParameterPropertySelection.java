package org.tura.metamodel.commons.properties.selections.grid.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyComposite;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;

import domain.DomainPackage;

public class TriggerContextParameterPropertySelection extends ContextParameterPropertySelection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;

	public void refresh() {
		if (isFirstTime && getModel() != null) {
			isFirstTime = false;

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					for (int j = 0; j < getWatchPointFeature().length; j++) {
						if (notification.getFeatureID(getExpectedClass()) == getWatchPointFeature()[j].getFeatureID()) {

							EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();

							editingDomain.getCommandStack()
									.execute(RemoveCommand.create(editingDomain, getModel(),
											DomainPackage.eINSTANCE.getContextParameters_Parameters(),
											((domain.Trigger) getModel()).getParameters()));
							ds.cleanList();
							Control control = tableViewer.getControl();
							if (control != null && !control.isDisposed()) {
								tableViewer.setInput(ds);
								((TabbedPropertyComposite) (getPropertySheetPage().getControl())).getTabComposite()
										.layout(true, true);
							}

						}
					}
				}
			};
			getModel().eAdapters().add(adapter);
		}
		if (getModel() != null)
			super.refresh();

	}

	public void dispose() {
		try {
			if (getEObject() != null && getModel() != null)
				getModel().eAdapters().remove(adapter);
		} catch (IllegalStateException e) {

		}
		super.dispose();
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getMethodPointer_MethodRef() };
	}

	public Class<?> getExpectedClass() {
		return domain.MethodPointer.class;
	}

	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter obj) {
		return ((domain.Parameter) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new TriggerContextParameterDS(this);
	}

}
