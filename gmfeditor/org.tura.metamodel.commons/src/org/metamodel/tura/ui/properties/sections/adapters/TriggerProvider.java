package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.Trigger;

public class TriggerProvider implements IWorkbenchAdapter  {

	@Override
	public Object[] getChildren(Object o) {
		
		ArrayList<domain.TypeElement> ls = new ArrayList<>();
		domain.Trigger trg =  (Trigger) o;
		if (trg.getMethodRef().getReturnValue() != null)
			ls.add(trg.getMethodRef().getReturnValue().getTypeRef());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.Trigger trg =  (Trigger) o;
		return trg.getPackageRef().getName()+"::"+trg.getTypeRef().getName()+"::"+trg.getMethodRef().getName();
	}

	@Override
	public Object getParent(Object o) {
		domain.Trigger trg =  (Trigger) o;
		return trg.eContainer();
	}

}
