package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationHashesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.ConfigurationVariablesHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.GenerationHintsHolder;

import artifact.TechLeaf;


public class TechLeafProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return o;
	}

	@Override
	public Object[] getChildren(Object o) {
		TechLeaf p = (TechLeaf) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getTechLeafs());
		ls.add(new ConfigurationHashesHolder(p));
		ls.add(new ConfigurationVariablesHolder(p));
		ls.add(new GenerationHintsHolder(p));

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TechLeaf p = (TechLeaf) o;
		return p.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
