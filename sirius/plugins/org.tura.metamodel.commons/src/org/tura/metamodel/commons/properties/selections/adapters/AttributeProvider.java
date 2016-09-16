package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import type.Type;
import type.Attribute;

public class AttributeProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		Attribute attr = (Attribute) o;
		if (attr.getTypeRef() != null && attr.getTypeRef() instanceof Type) {

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
		Attribute attr = (Attribute) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		Attribute attr = (Attribute) o;
		
		return attr.getTypeRef();
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}	
}
