package org.tura.platform.datacontrol.metainfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.DataControlWrapper;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.commons.TuraException;

import com.octo.java.sql.exp.Operator;

public class Relation {

	private IDataControl parent;
	private IDataControl child;
	private Object masterCurrentObject;
	private boolean cascade = true;

	private ArrayList<PropertyLink> links = new ArrayList<PropertyLink>();


	public IDataControl getParent() throws TuraException {
		try{
			return  DataControlWrapper.newInstance(parent) ;
		}catch(Exception e){
			throw new TuraException(e);
		}
	}	
	public void setParent(IDataControl parent) {
		this.parent = parent;
	}

	public IDataControl getChild()  {
		return child;

	}

	public void setChild(IDataControl child) throws TuraException {
		try{
			this.child = DataControlWrapper.newInstance(child);
		}catch(Exception e){
			throw new TuraException(e);
		}
	}

	public void setLink(String parentProp, String childProp) {
		links.add(new PropertyLink(parentProp, childProp));
	}

	public List<PropertyLink> getLinks() {
		return this.links;
	}

	public boolean isCascade() {
		return cascade;
	}

	public void setCascade(boolean cascade) {
		this.cascade = cascade;
	}

	public Object getMasterCurrentObject() throws TuraException {
		if (masterCurrentObject == null)
			masterCurrentObject = getParent().getCurrentObject();
		return masterCurrentObject;
	}

	public void setMasterCurrentObject(Object masterCurrentObject) {
		this.masterCurrentObject = masterCurrentObject;
	}
	

	@SuppressWarnings("unchecked")
	public List<SearchCriteria> getChildSearchCriteria()
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, TuraException {

		@SuppressWarnings("rawtypes")
		ArrayList scls = new ArrayList();

		Iterator<PropertyLink> itr = links.iterator();
		if (masterCurrentObject == null)
			masterCurrentObject = getParent().getCurrentObject();
		if (masterCurrentObject != null) {
			while (itr.hasNext()) {
				PropertyLink lnk = itr.next();
				String methodName = "get"
						+ StringUtils.capitalize(lnk.getParent());
				Method m = masterCurrentObject.getClass().getMethod(methodName, new Class[] {});
				Object value = m.invoke(masterCurrentObject, new Object[] {});
				if (value == null)
					value = Constants.UNDEFINED_PARAMETER;
				SearchCriteria sc = new SearchCriteria();
				sc.setName(lnk.getChild());

				sc.setName(lnk.getChild());
				sc.setClassName(value.getClass().getName());
				sc.setValue(value);
				sc.setComparator(Operator.EQ.name());

				scls.add(sc);
			}
		} else {
			PropertyLink lnk = itr.next();

			SearchCriteria sc = new SearchCriteria();
			sc.setName(lnk.getChild());

			Object value = Constants.UNDEFINED_PARAMETER;
			sc.setName(lnk.getChild());
			sc.setClassName(value.getClass().getName());
			sc.setValue(value.toString());

			scls.add(sc);

		}
		return scls;
	}

}
