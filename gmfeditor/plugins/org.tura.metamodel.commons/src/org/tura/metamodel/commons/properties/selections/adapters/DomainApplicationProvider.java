package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class DomainApplicationProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
	@Override
	public Object[] getChildren(Object o) {
		domain.DomainApplication ar = ((domain.DomainApplication) o);
		if (ar == null || ar.getApplication() == null || ar.getApplication().getApplicationUILayer() == null)
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(ar.getApplication().getApplicationUILayer().getApplicationUIPackages());

		return ls.toArray();
	}	
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return ((domain.DomainApplication)o).getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}