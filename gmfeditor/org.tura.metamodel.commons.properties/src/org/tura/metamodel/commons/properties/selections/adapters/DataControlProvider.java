package org.tura.metamodel.commons.properties.selections.adapters;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeAttribute;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlFakeMethod;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

import domain.DataControl;

public class DataControlProvider implements IWorkbenchAdapter ,IReturnTypeProvider{

	@Override
	public Object[] getChildren(Object o) {
		ArrayList<Object> ls = new ArrayList<>();
		domain.DataControl ctr =  (DataControl) o;

		QueryHelper qh = new QueryHelper();
		
		ls.add(new DataControlFakeAttribute("startIndex", qh.findIntegerType(o)));
		ls.add(new DataControlFakeAttribute("endindex", qh.findIntegerType(o)));
		ls.add(new DataControlFakeAttribute("query", qh.findSearchCriteriaType(o)));

		if (ctr.getCreate() != null  && ctr.getCreate().getMethodRef() != null)
			ls.add( new  DataControlFakeMethod( "currentObject" , ctr.getCreate().getMethodRef().getReturnValue().getTypeRef()));
		
		if (ctr.getCreate() != null  && ctr.getCreate().getMethodRef() != null)
			ls.add( new  TriggerHolder( "CreateTrigger" , ctr.getCreate()));

		if (ctr.getInsert() != null  && ctr.getInsert().getMethodRef() != null)
			ls.add(new  TriggerHolder( "InsertTrigger",ctr.getInsert()));
		
		if (ctr.getUpdate() != null  && ctr.getUpdate().getMethodRef() != null)
			ls.add(new  TriggerHolder( "UpdateTrigger",ctr.getUpdate()));
		
		if (ctr.getRemove() != null  && ctr.getRemove().getMethodRef() != null)
			ls.add(new  TriggerHolder( "RemoveTrigger",ctr.getRemove()));

		if (ctr.getSearch() != null  && ctr.getSearch().getMethodRef() != null)
			ls.add(new  TriggerHolder( "SearchTrigger",ctr.getSearch()));

		if (ctr.getPostCreateTrigger() != null  && ctr.getPostCreateTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PostCreateTrigger",ctr.getPostCreateTrigger()));

		if (ctr.getPostQueryTrigger() != null  && ctr.getPostQueryTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PostQueryTrigger",ctr.getPostQueryTrigger()));

		if (ctr.getPreDeleteTrigger() != null  && ctr.getPreDeleteTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PreDeleteTrigger",ctr.getPreDeleteTrigger()));
	
		if (ctr.getPreInsertTrigger() != null  && ctr.getPreInsertTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PreInsertTrigger",ctr.getPreInsertTrigger()));

		if (ctr.getPreQueryTrigger() != null  && ctr.getPreQueryTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PreQueryTrigger",ctr.getPreQueryTrigger()));
		
		if (ctr.getPreUpdateTrigger() != null  && ctr.getPreUpdateTrigger().getMethodRef() != null)
			ls.add(new  TriggerHolder( "PreUpdateTrigger",ctr.getPreUpdateTrigger()));

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
		return null;
	}

	@Override
	public Object getReturnType(Object o) {
		return null;
	}

}
