package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;

import style.StyleSet;

public class StyleSetProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return o;
	}
	
	@Override
	public Object getApplicationType(Object o) {
		try{
			   return new QueryHelper().findStyleType((EObject) o);
			}catch(Exception e){
				LogUtil.log(e);
				return null;
			}
	}	

	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		StyleSet opr = (StyleSet) o;
		return opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
