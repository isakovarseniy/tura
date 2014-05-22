package org.metamodel.tura.ui.properties.sections.context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.metamodel.tura.ui.properties.sections.grid.impl.ContextParameterPropertySelection;

import domain.ContextValue;
import domain.DomainFactory;
import domain.DomainPackage;

public class EnabledPropertySelectionParameters extends
		ContextParameterPropertySelection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;

	
	
	public void refresh() {
		super.refresh();
		enableParametersEntry();
	}
	
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {

					if (notification.getFeatureID(domain.ContextValue.class) == DomainPackage.eINSTANCE
							.getContextValue_Expression().getFeatureID()) {
						enableParametersEntry();
					}

				}

			};
			getModel().eAdapters().add(adapter);
		}

	}
	
	private void enableParametersEntry(){
		domain.ContextValue cnt = (ContextValue) getModel();
		this.table.setVisible(false);
		if (cnt.isConstant()){
			if (cnt.getExpression() != null && cnt.getExpression().size() != 0 ){
				domain.ExpressionPart eobj = cnt.getExpression().get(cnt.getExpression().size() -1);
				if ( eobj.getObjRef() != null &&  eobj.getObjRef() instanceof domain.Operation){
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

	@Override
	public EObject getModel() {

		domain.Uielement el = ((domain.Uielement) getEObject());
		if (el.getEnabled() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE.getUielement_Enabled(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getEnabled();

	}

}
