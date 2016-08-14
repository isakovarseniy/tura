package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.DomainTypesRepository;

public class DomainTypesRepositoryProvider implements IWorkbenchAdapter, IReturnTypeProvider {

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
		DomainTypesRepository t = ((DomainTypesRepository) o);

		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(t.getRepositoryPackages());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DomainTypesRepository t = ((DomainTypesRepository) o);
		return t.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}