package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.Helper;

import domain.Type;

public class TypeElementProvider implements IWorkbenchAdapter  ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();

		HashMap<String, domain.Operation> operations = new HashMap<>();
		HashMap<String, domain.Attribute> attributes = new HashMap<>();
		
		domain.TypeElement typeElement = (domain.TypeElement) o;
		new Helper().addOperations(operations,attributes,typeElement);

		ls.addAll(attributes.values());
		ls.addAll(operations.values());

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
			return type.getParent().getParent().getName() + "::"
					+ type.getName();
		}
		return typeElement.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}


	@Override
	public Object getReturnType(Object o) {
		return null;
	}

}
