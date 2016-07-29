package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import artifact.ConfigVariable;

public class ConfigurationVariableProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return o;
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
		ConfigVariable p = (ConfigVariable) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
