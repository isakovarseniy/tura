package org.tura.platform.datacontrol.commons;

import java.lang.reflect.InvocationTargetException;

import com.octo.java.sql.exp.Column;
import com.octo.java.sql.query.Query;
import com.octo.java.sql.query.SelectQuery;

public enum ConditionConverter {
	WHERE("where"), AND("and");

	private String condition;

	ConditionConverter(String condition) {
		this.condition = condition;
	}

	public Query<?> getRestriction(SelectQuery query, Column column)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		return (Query<?>) Reflection.call(query, condition, column);

	}

}
