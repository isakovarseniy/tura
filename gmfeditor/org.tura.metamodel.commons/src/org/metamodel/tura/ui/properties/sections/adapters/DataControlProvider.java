package org.metamodel.tura.ui.properties.sections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;

import domain.DataControl;

public class DataControlProvider implements IWorkbenchAdapter{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<domain.Trigger> ls = new ArrayList<>();
		domain.DataControl ctr =  (DataControl) o;

		if (ctr.getCreate() != null  && ctr.getCreate().getMethodRef() != null)
			ls.add(ctr.getCreate());

		if (ctr.getInsert() != null  && ctr.getInsert().getMethodRef() != null)
			ls.add(ctr.getInsert());
		
		if (ctr.getUpdate() != null  && ctr.getUpdate().getMethodRef() != null)
			ls.add(ctr.getUpdate());
		
		if (ctr.getRemove() != null  && ctr.getRemove().getMethodRef() != null)
			ls.add(ctr.getRemove());

		if (ctr.getSearch() != null  && ctr.getSearch().getMethodRef() != null)
			ls.add(ctr.getSearch());

		if (ctr.getPostCreateTrigger() != null  && ctr.getPostCreateTrigger().getMethodRef() != null)
			ls.add(ctr.getPostCreateTrigger());

		if (ctr.getPostQueryTrigger() != null  && ctr.getPostQueryTrigger().getMethodRef() != null)
			ls.add(ctr.getPostQueryTrigger());

		if (ctr.getPreDeleteTrigger() != null  && ctr.getPreDeleteTrigger().getMethodRef() != null)
			ls.add(ctr.getPreDeleteTrigger());
	
		if (ctr.getPreInsertTrigger() != null  && ctr.getPreInsertTrigger().getMethodRef() != null)
			ls.add(ctr.getPreInsertTrigger());

		if (ctr.getPreQueryTrigger() != null  && ctr.getPreQueryTrigger().getMethodRef() != null)
			ls.add(ctr.getPreQueryTrigger());
		
		if (ctr.getPreUpdateTrigger() != null  && ctr.getPreUpdateTrigger().getMethodRef() != null)
			ls.add(ctr.getPreUpdateTrigger());

		return ls.toArray();
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {
		return null;
	}

	@Override
	public String getLabel(Object o) {
		domain.DataControl ctr =  (DataControl) o;
		return ctr.getName();
	}

	@Override
	public Object getParent(Object o) {
		domain.DataControl ctr =  (DataControl) o;
		return ctr.getParent();
	}

}
