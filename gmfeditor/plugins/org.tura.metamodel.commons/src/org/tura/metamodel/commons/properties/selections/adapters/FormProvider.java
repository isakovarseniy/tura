package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class FormProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
	@Override
	public Object[] getChildren(Object o) {
		domain.Form ar = ((domain.Form) o);
		if (ar == null || ar.getView() == null || ar.getView().getView() == null || ar.getView().getView().getCanvases() == null)
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		for (   domain.CanvasFrame canvas : ar.getView().getView().getCanvases()){
			 if (canvas instanceof domain.Window)
			     ls.add(canvas);
		}

		return ls.toArray();
	}	
	
	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return ((domain.Form)o).getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}