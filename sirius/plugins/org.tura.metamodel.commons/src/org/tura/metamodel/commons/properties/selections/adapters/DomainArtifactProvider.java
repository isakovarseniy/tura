package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.DomainArtifact;

public class DomainArtifactProvider   implements IWorkbenchAdapter ,IReturnTypeProvider{

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
		DomainArtifact p = (DomainArtifact) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getArtifactPackages());
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.DomainArtifact p = (DomainArtifact) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
