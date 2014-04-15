package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

public class ControlsProvider implements IWorkbenchAdapter {

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<domain.DataControl> ls = new ArrayList<>();
		for (Iterator<domain.DataControl> itr = ((domain.Controls) o)
				.getControls().iterator(); itr.hasNext();) {
			domain.DataControl ctl = itr.next();
			if (ctl.getName() != null)
				ls.add(ctl);
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel(Object o) {
		return "Data controls";
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
