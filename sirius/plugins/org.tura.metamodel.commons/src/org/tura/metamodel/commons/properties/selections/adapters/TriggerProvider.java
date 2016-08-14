package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

import type.TypeElement;
import type.TypeGroup;
import type.Type;

public class TriggerProvider implements IWorkbenchAdapter  ,IReturnTypeProvider {

	@Override
	public Object[] getChildren(Object o) {
		
		ArrayList<TypeElement> ls = new ArrayList<>();
		TriggerHolder trg =  (TriggerHolder) o;
		if (trg.getTrigger().getMethodRef().getReturnValue() != null)
			ls.add(trg.getTrigger().getMethodRef().getReturnValue().getTypeRef());
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TriggerHolder trg =  (TriggerHolder) o;
		
		TypeGroup pkg = (TypeGroup) trg.getTrigger().getMethodRef().eContainer().eContainer();
		Type type = (Type) trg.getTrigger().getMethodRef().eContainer();
				
		return trg.getType()+" -- "+  pkg.getName()+"::"+type.getName()+"::"+trg.getTrigger().getMethodRef().getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	@Override
	public Object getApplicationType(Object o) {
		return null;
	}
	
}
