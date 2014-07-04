package org.tura.platform.datacontrol.commons;


import java.lang.reflect.InvocationTargetException;

import com.octo.java.sql.query.Query;
import com.octo.java.sql.query.SelectQuery;

public enum RestrictionsConverter {
	GT("gt"), GTEQ("ge"), LT("lt"), LTEQ("le"), EQ("equal"), LIKE("like");

	private String comp;

	RestrictionsConverter(String comp) {
		this.comp = comp;
	}

	public Query<?> getRestriction(SelectQuery query, Object value)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
			 {
		return (Query<?>) Reflection.call(query, comp, value);

	}

}
