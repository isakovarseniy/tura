package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import type.PrimitivesGroup;

public class PrimitivesGroupProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		PrimitivesGroup t = ((PrimitivesGroup) o);

		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(t.getPrimitives());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Primitive package";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}