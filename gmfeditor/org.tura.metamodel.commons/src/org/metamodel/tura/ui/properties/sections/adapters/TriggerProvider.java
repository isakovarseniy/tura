package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TriggerHolder;

public class TriggerProvider implements IWorkbenchAdapter  ,IReturnTypeProvider {

	@Override
	public Object[] getChildren(Object o) {
		
		ArrayList<domain.TypeElement> ls = new ArrayList<>();
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
		return trg.getType()+" -- "+  trg.getTrigger().getPackageRef().getName()+"::"+trg.getTrigger().getTypeRef().getName()+"::"+trg.getTrigger().getMethodRef().getName();
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
