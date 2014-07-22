package org.tura.platform.datacontrol.commons;


import java.lang.reflect.InvocationTargetException;

import com.octo.java.sql.query.Query;

public enum RestrictionsConverter {
	GT("gt"), GTEQ("ge"), LT("lt"), LTEQ("le"), EQ("eq"), LIKE("like");

	private String comp;

	RestrictionsConverter(String comp) {
		this.comp = comp;
	}

	public Query<?> getRestriction(Query<?> query, Object value)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
			 {
		return (Query<?>) Reflection.callTyped(query, comp, Object.class, value);

	}

}
