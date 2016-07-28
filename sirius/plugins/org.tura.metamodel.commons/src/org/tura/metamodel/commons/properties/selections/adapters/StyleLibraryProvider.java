package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import style.StyleLibrary;
import style.StyleSet;

public class StyleLibraryProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		StyleLibrary ar = ((StyleLibrary) o);
		if (ar == null || ar.getStyles() == null)
			return new Object[] {};

		ArrayList<Object> ls = new ArrayList<>();
		for (StyleSet set : ar.getStyles()) {
			if (set.getName() != null)
				ls.add(set);
		}

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		StyleLibrary ar = ((StyleLibrary) o);
		return ar.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
