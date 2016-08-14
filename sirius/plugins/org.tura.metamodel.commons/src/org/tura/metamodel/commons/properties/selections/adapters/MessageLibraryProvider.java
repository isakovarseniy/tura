package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import message.Message;
import message.MessageLibrary;

public class MessageLibraryProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

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
		ArrayList<Object> ls = new ArrayList<>();
		MessageLibrary opr = (MessageLibrary) o;
		for (Message t : opr.getMessages()) {
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
		MessageLibrary opr = (MessageLibrary) o;
		return opr.getName();
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
