package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class StylesPackageProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		domain.StylesPackage ar = ((domain.StylesPackage) o);
		if (ar == null || ar.getStyles() == null)
			return new Object[] {};

		ArrayList<Object> ls = new ArrayList<>();
		for (domain.StyleLibrary lib : ((domain.StylesPackage) o).getStyles()
				.getLibraries()) {
			if (lib.getName() != null)
				ls.add(lib);
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.StylesPackage ar = ((domain.StylesPackage) o);
		return ar.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
