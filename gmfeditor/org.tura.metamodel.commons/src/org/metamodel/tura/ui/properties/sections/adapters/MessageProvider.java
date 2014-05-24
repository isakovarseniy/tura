package org.metamodel.tura.ui.properties.sections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.metamodel.tura.ui.properties.sections.QueryHelper;

public class MessageProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return new QueryHelper().findStringType(o);
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
		domain.Message opr = (domain.Message) o;
		return opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
