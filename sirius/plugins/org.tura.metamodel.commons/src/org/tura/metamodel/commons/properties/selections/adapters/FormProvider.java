package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import form.CanvasFrame;
import form.Form;
import form.Window;

public class FormProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	
	@Override
	public Object[] getChildren(Object o) {
		Form ar = ((Form) o);
		if (ar == null || ar.getView() == null ||  ar.getView().getCanvases() == null)
			return new Object[]{};
			
		ArrayList<Object> ls = new ArrayList<>();
		for (   CanvasFrame canvas : ar.getView().getCanvases()){
			 if (canvas instanceof Window)
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
		return ((Form)o).getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}