package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class MessagesProvider implements IWorkbenchAdapter, IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		domain.Messages opr = (domain.Messages) o;
		if (opr.getMessageLibraries() != null
				&& opr.getMessageLibraries().size() != 0) {
			for (Iterator<domain.MessageLibrary> itr = opr
					.getMessageLibraries().iterator(); itr.hasNext();) {
				domain.MessageLibrary t = itr.next();
				if (t.getName() != null)
					ls.add(t);
			}
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Messages";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
