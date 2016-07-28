package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import type.TypeElement;
import type.TypeGroup;
import type.TypeReference;

public class PackageProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		TypeGroup pack = (TypeGroup) o;
		ArrayList<TypeElement> ls = new ArrayList<>();

		for (TypeElement t : pack.getTypes()) {

			if (!(t instanceof TypeReference))
				ls.add(t);

		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TypeGroup pack = (TypeGroup) o;
		return pack.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

}
