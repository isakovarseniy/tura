package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Package;

public class PackageProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		domain.Package pack = (Package) o;
		ArrayList<domain.TypeElement> ls = new ArrayList<>();

		for (Iterator<domain.TypeElement> itr = pack.getTypedefinition()
				.getTypes().iterator(); itr.hasNext();) {
			domain.TypeElement t = itr.next();

			if (!(t instanceof domain.TypeReference))
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
		domain.Package pack = (Package) o;
		return pack.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
