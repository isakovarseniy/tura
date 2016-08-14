package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import artifact.ArtifactGroup;

public class ArtifactGroupProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		ArtifactGroup p = (ArtifactGroup) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getArtifacts());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ArtifactGroup p = (ArtifactGroup) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
