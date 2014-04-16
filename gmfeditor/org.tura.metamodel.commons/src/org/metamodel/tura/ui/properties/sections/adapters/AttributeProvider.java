package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Type;

public class AttributeProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		domain.Attribute attr = (domain.Attribute) o;
		if (attr.getTypeRef() != null
				&& attr.getTypeRef() instanceof domain.Type) {

			domain.Type typeElement = (Type) attr.getTypeRef();
			if (typeElement instanceof domain.Type) {
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
		domain.Attribute attr = (domain.Attribute) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
