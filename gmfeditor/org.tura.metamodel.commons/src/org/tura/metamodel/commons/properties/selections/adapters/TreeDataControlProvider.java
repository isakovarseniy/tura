package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.tura.metamodel.commons.Util;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

public class TreeDataControlProvider implements IWorkbenchAdapter,
		IReturnTypeProvider {

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<domain.DataControl> ls = new ArrayList<>();
		try {
			TreeDataControl tdc = (TreeDataControl) o;
			new QueryHelper().getTreeLeafs(ls, tdc.getDc());
		} catch (Exception e) {
			return new Object[] {};
		}
		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		TreeDataControl tdc = (TreeDataControl) o;
		return "Tree" +Util.mergeAndCapitalize(tdc.getDc().getName());
	}

	@Override
	public Object getParent(Object o) {
		return null;
	}

}
