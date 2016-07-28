package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.Util;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;

import form.ArtificialField;
import type.TypeElement;

public class DataControlFakeMethodProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getType();
	}

	@Override
	public Object[] getChildren(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		TypeElement type = attr.getType();
	    if (attr.getType().getUid().equals(new QueryHelper().findBaseType(attr.getType()).getUid()  ) ){
	    	type = Util.getBase(attr.getDc());
	    }
		ExtendedType  ex = new ExtendedType(type);
		for (ArtificialField f : attr.getDc().getArtificialFields()){
			ex.getLs().add(f);
		}
		return new Object[]{ex};
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}
	
}
