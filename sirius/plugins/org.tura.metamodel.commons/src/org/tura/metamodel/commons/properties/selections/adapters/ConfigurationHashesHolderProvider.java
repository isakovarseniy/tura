package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationHashesHolder;

public class ConfigurationHashesHolderProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object getApplicationType(Object o) {
		return null;
	}
	
	@Override
	public Object[] getChildren(Object o) {
		ConfigurationHashesHolder p = (ConfigurationHashesHolder) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getLeaf().getConfigHashes());
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Configuration Hash Variables";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
