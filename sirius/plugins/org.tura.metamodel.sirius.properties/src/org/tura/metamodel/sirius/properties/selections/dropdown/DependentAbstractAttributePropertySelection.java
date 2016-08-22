package org.tura.metamodel.sirius.properties.selections.dropdown;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.events.DataControlChangeEvent;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;

public abstract class DependentAbstractAttributePropertySelection extends AbstractAttributePropertySelection{

	class SelectionListener implements EventListener {
		@Override
		public void handleEvent(Event event) {
			if (event instanceof DataControlChangeEvent) {
				for (int j = 0; j < dropDownDataSupplier.getWatchPointFeature().length; j++) {
						values = null;
						EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
						CompoundCommand compoundCommand = new CompoundCommand();
						EStructuralFeature[] features = getFeature();

						for (int i = 0; i < features.length; i++) {
							if (features[i].getFeatureID() != dropDownDataSupplier
									.getWatchPointFeature()[j]
									.getFeatureID())
								compoundCommand.append(SetCommand.create(
										editingDomain,
										getModel(features[i]), features[i],
										null));
						}
						editingDomain.getCommandStack().execute(
								compoundCommand);
						refresh();
					}
			}
		}
	}

	
	
	
}
