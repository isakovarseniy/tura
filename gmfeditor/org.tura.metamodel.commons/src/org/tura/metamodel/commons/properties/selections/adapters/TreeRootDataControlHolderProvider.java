package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;

public class TreeRootDataControlHolderProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		TreeRootDataControlHolder h = (TreeRootDataControlHolder) o;
		return h.getControls().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Tree data controls";
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
