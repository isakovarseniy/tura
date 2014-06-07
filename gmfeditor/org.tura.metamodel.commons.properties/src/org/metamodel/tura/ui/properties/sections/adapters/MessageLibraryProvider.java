package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class MessageLibraryProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		domain.MessageLibrary opr = (domain.MessageLibrary) o;
		for (Iterator<domain.Message> itr = opr.getMessages().iterator(); itr
				.hasNext();) {
			domain.Message t = itr.next();
			if (t.getName() != null)
				ls.add(t);
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.MessageLibrary opr = (domain.MessageLibrary) o;
		return opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
