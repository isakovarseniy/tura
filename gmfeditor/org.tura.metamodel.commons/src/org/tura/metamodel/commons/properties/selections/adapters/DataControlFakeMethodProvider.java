package org.tura.metamodel.commons.properties.selections.adapters;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ExtendedType;

public class DataControlFakeMethodProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		return attr.getType();
	}

	@Override
	public Object[] getChildren(Object o) {
		DataControlFakeMethod attr = (DataControlFakeMethod) o;
		ExtendedType  ex = new ExtendedType(attr.getType());
		for (domain.ArtificialField f : attr.getDc().getArtificialFields()){
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
