package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import mapper.Mapper;

public class MapperTreeFilter implements IFilter {

	@Override
	public boolean select(Object toTest) {

		if (toTest instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) toTest;
			EObject element = obj.getTarget();

			if (element instanceof Mapper)  {
				return true;
			}
		}
		return false;
	}

}
