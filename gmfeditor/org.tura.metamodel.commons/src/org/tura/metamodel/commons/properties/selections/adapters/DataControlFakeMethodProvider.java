package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;

public class DataControlFakeMethodProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getType();
	}

	@Override
	public Object[] getChildren(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return new Object[]{attr.getType()};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}
