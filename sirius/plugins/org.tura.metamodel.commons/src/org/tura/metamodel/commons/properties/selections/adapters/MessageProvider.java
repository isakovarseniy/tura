package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;

import message.Message;

public class MessageProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}
	
	@Override
	public Object getApplicationType(Object o) {
		try{
			   return new QueryHelper().findMessageType((EObject) o);
			}catch(Exception e){
				LogUtil.log(e);
				return null;
			}
	}	

	@Override
	public Object[] getChildren(Object o) {
		return new Object[] {};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		Message opr = (Message) o;
		return opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
