package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import form.ArtificialField;
import type.Type;


public class ArtificialFieldProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return ((ArtificialField) o).getTypeRef();
	}

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		ArtificialField attr = (ArtificialField) o;
		if (attr.getTypeRef() != null&& attr.getTypeRef() instanceof Type) {

			Type typeElement = (Type) attr.getTypeRef();
			if (typeElement instanceof Type) {
				ls.addAll(typeElement.getOperations());
				ls.addAll(typeElement.getAttributes());
			}
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		ArtificialField attr = (ArtificialField) o;
		return "---> "+attr.getName();		
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
