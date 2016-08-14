package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import application.ApplicationMessageLibrary;

public class ApplicationMessageLibraryProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		ApplicationMessageLibrary p = (ApplicationMessageLibrary) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getLibraries());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Application Message Libraries";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}



}
