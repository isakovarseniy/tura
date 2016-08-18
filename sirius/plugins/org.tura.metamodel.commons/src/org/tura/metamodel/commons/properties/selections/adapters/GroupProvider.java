package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;

import permission.Group;

public class GroupProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		return new Object[]{};
	}
	
	@Override
	public Object getApplicationType(Object o) {
		try{
			  return new QueryHelper().findGroupType((EObject) o);
			}catch(Exception e){
				LogUtil.log(e);
				return null;
			}
	}	

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Group opr = (Group) o;
		return "g-"+opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return o;
	}

}
