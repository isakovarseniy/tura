package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.properties.selections.adapters.helper.GenerationHintsHolder;

public class GenerationHintsHolderProvider  implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		GenerationHintsHolder p = (GenerationHintsHolder) o;
		ArrayList<Object> ls = new ArrayList<>();
		ls.addAll(p.getLeaf().getHints());
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Generation Hints";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
