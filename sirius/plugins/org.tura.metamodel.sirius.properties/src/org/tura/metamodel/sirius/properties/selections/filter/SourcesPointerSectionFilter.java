package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.SourcesPointer;
import form.Table;
import form.Tree;
import form.Views;

public class SourcesPointerSectionFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {
		EditPart editPart = (EditPart) toTest;

		if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
			EObject element = obj.getTarget();

			if (element instanceof SourcesPointer) {
				return isNotExternalControlExists(element);
			}
		}
		return false;
	}

	
	protected boolean isNotExternalControlExists(EObject obj){
		EObject parent = obj.eContainer();
		if (parent instanceof Tree || parent instanceof Table){
			return false;
		}
		if (parent instanceof Views){
			return true;
		}
		return isNotExternalControlExists(parent);
	}
	
	
}
