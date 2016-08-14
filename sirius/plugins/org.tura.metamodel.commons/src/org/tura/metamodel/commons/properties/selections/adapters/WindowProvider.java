package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import form.Window;

public class WindowProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		return new Object[]{};
	}	
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return ((Window)o).getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
	
	
}