package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.DomainTypes;

public class DomainTypesProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		DomainTypes t = ((DomainTypes) o);

		ArrayList<Object> ls = new ArrayList<>();
		ls.add(t.getPrimitives());
		ls.addAll(t.getTypesRepository());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Types repository";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}