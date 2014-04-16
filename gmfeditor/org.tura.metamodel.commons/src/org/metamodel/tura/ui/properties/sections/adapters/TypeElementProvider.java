package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Type;

public class TypeElementProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();

		domain.TypeElement typeElement = (domain.TypeElement) o;
		if (typeElement instanceof domain.Type) {
			ls.addAll(((domain.Type) typeElement).getOperations());
			ls.addAll(((domain.Type) typeElement).getAttributes());
		}

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.TypeElement typeElement = (domain.TypeElement) o;
		if (typeElement instanceof domain.Type) {
			domain.Type type = (Type) typeElement;
			return  type.getParent().getParent().getName()+"::"+type.getName();
		}
		return typeElement.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
