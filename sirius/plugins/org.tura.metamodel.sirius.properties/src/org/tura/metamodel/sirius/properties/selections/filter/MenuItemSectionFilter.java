package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.MenuItem;

public class MenuItemSectionFilter implements IFilter{

	
	@Override
	public boolean select(Object toTest) {
		EditPart editPart = (EditPart) toTest;

		if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
			EObject element = obj.getTarget();

			if (element instanceof MenuItem ) {
				return true;
			}
		}
		return false;
	}
	
	
}
