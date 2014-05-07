package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class ApplicationRoleProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		
		domain.ApplicationRole ar = ((domain.ApplicationRole) o);
		if (ar == null || ar.getRoles() == null )
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		for (Iterator<domain.Group> itr = ((domain.ApplicationRole) o)
				.getRoles().getGroups().iterator(); itr.hasNext();) {
			domain.Group grp = itr.next();
			if (grp.getName() != null)
				ls.add(grp);
		}

		for (Iterator<domain.Role> itr = ((domain.ApplicationRole) o)
				.getRoles().getRoles().iterator(); itr.hasNext();) {
			domain.Role grp = itr.next();
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

}
