package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.tura.metamodel.commons.properties.selections.grid.impl.ContextParameterPropertySelection;

import domain.ContextValue;
import domain.DomainPackage;

public abstract class DependentContextParameterPropertySelection extends
		ContextParameterPropertySelection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;

	public void refresh() {
		try {
			super.refresh();
			enableParametersEntry();
		} catch (org.eclipse.swt.SWTException e) {

		}
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {

					if (notification.getFeatureID(domain.ContextValue.class) == DomainPackage.eINSTANCE
							.getContextValue_Expression().getFeatureID()) {
						ds.cleanList();
						enableParametersEntry();
						tableViewer.refresh();

					}

				}

			};
			getModel().eAdapters().add(adapter);
		}

	}

	private void enableParametersEntry() {
		domain.ContextValue cnt = (ContextValue) getModel();
		this.table.setVisible(false);
		if (cnt.isConstant()) {
			if (cnt.getExpression() != null && cnt.getExpression().size() != 0) {
				domain.ExpressionPart eobj = cnt.getExpression().get(
						cnt.getExpression().size() - 1);
				if (eobj.getObjRef() != null
						&& eobj.getObjRef() instanceof domain.Operation) {
					this.table.setVisible(true);
				}
			}
		}
	}

	public void dispose() {
		super.dispose();
		if (getEObject() != null && getModel() != null)
			getModel().eAdapters().remove(adapter);
	}

}
