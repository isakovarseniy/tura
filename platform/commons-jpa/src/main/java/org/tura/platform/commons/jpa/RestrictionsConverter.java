package org.tura.platform.commons.jpa;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

import org.tura.platform.datacontrol.commons.Reflection;



public enum RestrictionsConverter {
	GT("gt",java.lang.Number.class),
	GTEQ("ge",java.lang.Number.class),
	LT("lt",java.lang.Number.class), 
	LTEQ("le",java.lang.Number.class),
	EQ("equal", java.lang.Object.class),
	LIKE("like",java.lang.String.class);

	private String comp;
	private Class<?> clazz;

	RestrictionsConverter(String comp,Class<?> clazz) {
		this.comp = comp;
		this.clazz=clazz;
	}

	public Predicate getRestriction(CriteriaBuilder cb, Expression<?> field, Object value) throws Exception{
		return (Predicate) Reflection.callTyped(cb, comp, Expression.class,field,clazz,value);
		
	}

}
