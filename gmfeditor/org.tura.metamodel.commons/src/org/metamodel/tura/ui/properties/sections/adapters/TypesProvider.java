package org.metamodel.tura.ui.properties.sections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Types;

public class TypesProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		domain.Types tps = (Types) o;
		tps.getPackages();
		return tps.getPackages().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Packages";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
