package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;

public class DataControlFakeAttributeProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		DataControlFakeAttribute a = (DataControlFakeAttribute) o;
		return a.getType();
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
	
	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DataControlFakeAttribute attr = (DataControlFakeAttribute) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
