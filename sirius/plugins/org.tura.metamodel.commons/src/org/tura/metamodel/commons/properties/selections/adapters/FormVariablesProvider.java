package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import form.Root;

public class FormVariablesProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{
	
	@Override
	public Object[] getChildren(Object o) {
		Root root = (Root) o;
		return root.getVariables().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Form variables";
	}
	
	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
}
