package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class ApplicationUIPackageProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
	@Override
	public Object[] getChildren(Object o) {
		domain.ApplicationUIPackage ar = ((domain.ApplicationUIPackage) o);
		if (ar == null || ar.getUipackage() == null || ar.getUipackage().getForms() == null)
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(ar.getUipackage().getForms());

		return ls.toArray();
	}	
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return ((domain.ApplicationUIPackage)o).getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}