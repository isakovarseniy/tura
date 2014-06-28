package org.tura.platform.datacontrol.metainfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.MetaInfoHolder;
import org.tura.platform.datacontrol.commons.ComparatorType;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.SearchCriteria;

public class Relation {

	private MetaInfoHolder parent;
	private MetaInfoHolder child;
	private Object masterCurrentObject;
	private boolean cascade = true;

	private ArrayList<PropertyLink> links = new ArrayList<PropertyLink>();

	public MetaInfoHolder getParent() {
		return parent;
	}

	public void setParent(MetaInfoHolder parent) {
		this.parent = parent;
	}

	public MetaInfoHolder getChild() {
		return child;
	}

	public void setChild(MetaInfoHolder child) {
		this.child = child;
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

	public Object getMasterCurrentObject() {
		return masterCurrentObject;
	}

	public void setMasterCurrentObject(Object masterCurrentObject) {
		this.masterCurrentObject = masterCurrentObject;
	}
		
	
	@SuppressWarnings("unchecked")
	public List<SearchCriteria> getChildSearchCriteria() throws Exception {

		@SuppressWarnings("rawtypes")
		ArrayList scls = new ArrayList();

		Iterator<PropertyLink> itr = links.iterator();
		Object obj = getMasterCurrentObject();
		if (obj != null) {
			while (itr.hasNext()) {
				PropertyLink lnk = itr.next();
				String methodName = "get"
						+ StringUtils.capitalize(lnk.getParent());
				Method m = obj.getClass().getMethod(methodName, new Class[] {});
				Object value = m.invoke(obj, new Object[] {});
                if (value == null)
                	value = Constants.UNDEFINED_PARAMETER;
				SearchCriteria sc = new SearchCriteria();
				sc.setName(lnk.getChild());

				sc.setName(lnk.getChild());
				sc.setClassName(value.getClass().getName());
				sc.setValue(value.toString());
				sc.setComparator(ComparatorType.EQ.name());

				scls.add(sc);
			}
		}else{
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
