package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class ArtifactProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		domain.Artifact p = (domain.Artifact) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getHints());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.Artifact p = (domain.Artifact) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
