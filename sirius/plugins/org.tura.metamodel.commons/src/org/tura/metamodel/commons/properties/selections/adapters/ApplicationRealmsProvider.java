package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationRealms;

public class ApplicationRealmsProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		ApplicationRealms p = (ApplicationRealms) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getRealms());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ApplicationRealms p = (ApplicationRealms) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
