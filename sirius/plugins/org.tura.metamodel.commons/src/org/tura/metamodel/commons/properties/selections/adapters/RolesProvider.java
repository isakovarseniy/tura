package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import permission.Group;
import permission.Role;
import permission.Roles;

public class RolesProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		
		Roles ar = ((Roles) o);
		if (ar == null || ar.getRoles() == null )
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		for (Group grp : ((Roles) o).getGroups()) {
			if (grp.getName() != null)
				ls.add(grp);
		}

		for (Role grp : ((Roles) o).getRoles()) {
			if (grp.getName() != null)
				ls.add(grp);
		}
		
		return ls.toArray();
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

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
}
