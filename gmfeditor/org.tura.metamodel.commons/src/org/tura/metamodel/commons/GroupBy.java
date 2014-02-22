package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class GroupBy {

	private HashMap<String, GroupBy> groupBy = new HashMap<>();
	@SuppressWarnings("rawtypes")
	private Collection value = new ArrayList<>();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void add(String path, Collection obj) {

		if (path == null) {
			value.addAll(obj);
			return;
		}

		String[] pathElements = StringUtils.split(path, ".");

		GroupBy grp = groupBy.get(pathElements[0].trim());
		if (grp == null) {
			grp = new GroupBy();
			groupBy.put(pathElements[0].trim(), grp);
		}

		grp.add(leftPath(path), obj);

	}

	public Set<String> getKeys() {
		return groupBy.keySet();
	}

	public Object getValue(String path) throws Exception {

		if (path == null)
			return value;

		String[] pathElements = StringUtils.split(path, ".");
		
		if ( groupBy.get(pathElements[0].trim()) == null )
			throw new Exception("Path "+path+" does not exists");

		return groupBy.get(pathElements[0].trim()).getValue(leftPath(path));

	}

	public GroupBy getGroup(String path) throws Exception {

		if (path == null)
			return this;

		String[] pathElements = StringUtils.split(path, ".");

		if ( groupBy.get(pathElements[0].trim()) == null )
			throw new Exception("Path "+path+" does not exists");

		return groupBy.get(pathElements[0].trim()).getGroup(leftPath(path));

	}

	
	
	private String leftPath(String path) {

		String[] pathElements = StringUtils.split(path, ".");

		String letfpath = null;
		if (pathElements.length == 2)
			letfpath = pathElements[1];
		if (pathElements.length > 2)
			letfpath = StringUtils.join(pathElements, ".", 1,
					pathElements.length);

		return letfpath;
	}

}
