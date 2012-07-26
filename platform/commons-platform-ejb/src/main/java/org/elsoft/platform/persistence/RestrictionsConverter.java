package org.elsoft.platform.persistence;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

import org.elsoft.platform.Reflection;


public enum RestrictionsConverter {
	GT("gt"),
	GTEQ("ge"),
	LT("lt"), 
	LTEQ("le"),
	EQ("equal"),
	LIKE("like");

	private String comp;

	RestrictionsConverter(String comp) {
		this.comp = comp;
	}

	public Predicate getRestriction(CriteriaBuilder cb, Expression<?> field, Object value) throws Exception{
		return (Predicate) Reflection.callTyped(cb, comp, Expression.class,field,Object.class,value);
		
	}

}
