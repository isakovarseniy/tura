package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class OperationProvider implements IWorkbenchAdapter{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		domain.Operation opr = (domain.Operation) o;
		if (opr.getReturnValue() != null) {
			ls.add(opr.getReturnValue().getTypeRef());
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.Operation opr = (domain.Operation) o;
		return opr.getName()+"()";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
