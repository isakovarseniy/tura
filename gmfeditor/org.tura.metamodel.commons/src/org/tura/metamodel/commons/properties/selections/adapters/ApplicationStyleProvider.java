package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class ApplicationStyleProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		domain.ApplicationStyle ar = ((domain.ApplicationStyle) o);
		if (ar == null || ar.getStylesPackage() == null )
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(ar.getStylesPackage());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Application styles";	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
