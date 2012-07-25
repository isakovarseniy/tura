package org.elsoft.platform.metamodel.general;

import java.lang.reflect.Method;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public enum RestrictionsConverter {

	GT("gt"),
	GTEQ("ge"),
	LT("lt"), 
	LTEQ("le"),
	EQ("eq"),
	LIKE("like");

	private String comp;

	RestrictionsConverter(String comp) {
		this.comp = comp;
	}

	public Criterion getRestriction(String field, Object value) throws Exception{
		Method m = Restrictions.class.getDeclaredMethod(comp, String.class,Object.class);
		m.setAccessible(true); 
		return (Criterion) m.invoke(null, field,value);
		
	}
}
