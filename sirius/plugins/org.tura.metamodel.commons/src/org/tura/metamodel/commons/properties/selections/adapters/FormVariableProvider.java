package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import form.FormVariable;

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
		FormVariable v = (FormVariable) o;
		return v.getName();
	}
	
	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
}
