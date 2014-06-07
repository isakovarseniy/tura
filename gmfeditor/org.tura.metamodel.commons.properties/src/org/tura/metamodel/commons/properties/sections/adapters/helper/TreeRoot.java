package org.tura.metamodel.commons.properties.sections.adapters.helper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

public class TreeRoot implements IAdaptable{
	@SuppressWarnings("rawtypes")
	private ArrayList children = new ArrayList();
	
	@SuppressWarnings("unchecked")
	public void addChild(Object obj){
		children.add(obj);
	}
	 
    @SuppressWarnings("rawtypes")
	public List getChildren(){
    	return children;
    }

	@SuppressWarnings("rawtypes")
	@Override
	 public Object getAdapter(Class adapter) {
	     return Platform.getAdapterManager().getAdapter(this, adapter);
	  }
}
