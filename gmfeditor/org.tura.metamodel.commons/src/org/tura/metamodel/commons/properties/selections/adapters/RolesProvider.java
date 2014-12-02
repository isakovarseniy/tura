package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class RolesProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		domain.Roles tps = (domain.Roles) o;
		return tps.getRoles().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Roles";
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
