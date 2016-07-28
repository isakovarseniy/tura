package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;

import form.Window;

public class WindowProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return new QueryHelper().findStringType(o);
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