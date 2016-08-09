package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import type.PackagePointer;

public class TypeGroupPointerSelectionTreeFilter  implements IFilter {

	@Override
	public boolean select(Object toTest) {

		if (toTest instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) toTest;
			EObject element = obj.getTarget();

			if (element instanceof PackagePointer)  {
				return true;
			}
		}
		return false;
	}

}
