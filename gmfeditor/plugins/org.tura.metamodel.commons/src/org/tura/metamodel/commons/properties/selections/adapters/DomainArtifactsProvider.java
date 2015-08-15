package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.DomainArtifacts;

public class DomainArtifactsProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		domain.DomainArtifacts p = (DomainArtifacts) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getDomainArtifact());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Root";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
