package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;

public class ExtendedTypeProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		ExtendedType ex = (ExtendedType) o;
		TypeElementProvider provider = new TypeElementProvider();
		
		ArrayList<Object> children = new ArrayList<>();
		children.addAll(Arrays.asList(provider.getChildren(ex.getType())));
		children.addAll(ex.getLs());

		return children.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ExtendedType ex = (ExtendedType) o;
		TypeElementProvider provider = new TypeElementProvider();
		return provider.getLabel(ex.getType());
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
