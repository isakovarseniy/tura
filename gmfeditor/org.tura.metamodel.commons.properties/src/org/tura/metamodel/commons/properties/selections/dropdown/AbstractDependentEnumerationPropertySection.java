package org.tura.metamodel.commons.properties.selections.dropdown;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractDependentEnumerationPropertySection extends
		AbstractEnumerationPropertySection {

	private AdapterImpl adapter;
	private boolean isFirstTime = true;

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					for (int j = 0; j < dropDownDataSupplier
							.getWatchPointFeature().length; j++) {
						if (notification.getFeatureID(dropDownDataSupplier
								.getExpectedClass()) == dropDownDataSupplier
								.getWatchPointFeature()[j].getFeatureID() && getPart() !=null) {
							values = null;

							EditingDomain editingDomain = ((DiagramEditor) getPart())
									.getEditingDomain();
							CompoundCommand compoundCommand = new CompoundCommand();
							EStructuralFeature[] features = getFeature();

							for (int i = 0; i < features.length; i++) {
								if (features[i].getFeatureID() != dropDownDataSupplier
										.getWatchPointFeature()[j]
										.getFeatureID())
									compoundCommand.append(SetCommand.create(
											editingDomain, getModel(features[i]),
											features[i], null));
							}
							editingDomain.getCommandStack().execute(
									compoundCommand);
							refresh();
						}
					}

				}

			};
			getModel().eAdapters().add(adapter);
		}

	}

	public void dispose() {
		super.dispose();
		if  ( getEObject() != null && getModel() != null)
			getModel().eAdapters().remove(adapter);
	}

}
