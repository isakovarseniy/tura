package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.FormVariable;

public class FormVariableProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

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
		domain.FormVariable v = (FormVariable) o;
		return v.getName();
	}
	
	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		domain.FormVariable v = (FormVariable) o;
		return v.getTypeRef();
	}
	
	
}
