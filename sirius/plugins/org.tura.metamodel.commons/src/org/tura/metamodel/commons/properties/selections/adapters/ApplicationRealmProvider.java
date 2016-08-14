package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationRealm;

public class ApplicationRealmProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	
	@Override
	public Object[] getChildren(Object o) {
		ApplicationRealm p = (ApplicationRealm) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getRoles().getRoles());
		ls.addAll(p.getRoles().getGroups());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ApplicationRealm p = (ApplicationRealm) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
