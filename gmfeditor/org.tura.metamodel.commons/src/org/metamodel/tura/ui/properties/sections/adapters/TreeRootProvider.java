package org.metamodel.tura.ui.properties.sections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.metamodel.tura.ui.properties.sections.grid.impl.TreeRoot;

public class TreeRootProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		return ((TreeRoot)o).getChildren().toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return null;
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
