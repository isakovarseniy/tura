package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class DomainApplicationsProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
	@Override
	public Object[] getChildren(Object o) {
		domain.DomainApplications ar = ((domain.DomainApplications) o);
		if (ar == null || ar.getApplications() == null )
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(ar.getApplications());

		return ls.toArray();
	}	
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Windows";	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
	
	
}
