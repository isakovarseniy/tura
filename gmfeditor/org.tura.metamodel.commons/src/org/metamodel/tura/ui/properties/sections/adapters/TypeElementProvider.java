package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Type;
import domain.TypeExtension;

public class TypeElementProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();

		HashMap<String, domain.Operation> operations = new HashMap<>();
		HashMap<String, domain.Attribute> attributes = new HashMap<>();
		
		domain.TypeElement typeElement = (domain.TypeElement) o;
		addOperations(operations,attributes,typeElement);

		ls.addAll(attributes.values());
		ls.addAll(operations.values());

		return ls.toArray();
	}

	private void addOperations(Map<String, domain.Operation> operations,
			Map<String, domain.Attribute> attributes, domain.TypeElement typeElement) {

		if (typeElement instanceof domain.TypeReference) {
			typeElement = ((domain.TypeReference) typeElement).getTypeRef();
		}

		if (typeElement instanceof domain.Type) {
			domain.Type type = (Type) typeElement;

           for (Iterator<domain.Operation> itrOpr = type.getOperations().iterator(); itrOpr.hasNext(); ){
        	   domain.Operation operation = itrOpr.next();
        	   String key = getOperationKey(operation);
        	   if ( operations.get(key) == null )
        		   operations.put(key, operation);
           }
			
           for (Iterator<domain.Attribute> itrAttr = type.getAttributes().iterator(); itrAttr.hasNext(); ){
        	   domain.Attribute attribute = itrAttr.next();
        	   String key = getAttributeKey(attribute);
        	   if ( attributes.get(key) == null )
        		   attributes.put(key, attribute);
           }
           
			if (type.getExtension() != null) {
				for (Iterator<TypeExtension> itr =  type.getExtension().iterator(); itr.hasNext();){
					domain.TypeExtension ext = itr.next();
					addOperations(operations,attributes,ext.getTarget());
				}
			}
		}

	}

	private String getOperationKey(domain.Operation operation){
		
		String key="";
		
		for (Iterator<domain.Parameter> itr = operation.getParameters().iterator();itr.hasNext();){
			domain.Parameter param = itr.next();
			if (param.getTypeRef() != null)
			     key = key+param.getTypeRef().getUid();
		}
		if (operation.getReturnValue()!= null && operation.getReturnValue().getTypeRef() != null)
		    key=operation.getReturnValue().getTypeRef().getUid()+key;
		
		key = operation.getName()+key;
		
		return key;
	}

	private String getAttributeKey(domain.Attribute attribute){
		String key="";
		
		if (attribute.getTypeRef() != null )
			key = attribute.getTypeRef().getUid();

		return attribute.getName()+ key;
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

}
