package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationGroup;

public class ApplicationGroupProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		ApplicationGroup p = (ApplicationGroup) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getApplications());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ApplicationGroup p = (ApplicationGroup) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
