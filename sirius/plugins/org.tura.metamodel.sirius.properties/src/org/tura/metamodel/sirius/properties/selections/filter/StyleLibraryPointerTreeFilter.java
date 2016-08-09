package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import style.StylePointer;

public class StyleLibraryPointerTreeFilter  implements IFilter {

	@Override
	public boolean select(Object toTest) {

		if (toTest instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) toTest;
			EObject element = obj.getTarget();

			if (element instanceof StylePointer)  {
				return true;
			}
		}
		return false;
	}

}
