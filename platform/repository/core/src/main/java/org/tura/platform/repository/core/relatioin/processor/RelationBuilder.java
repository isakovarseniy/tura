package org.tura.platform.repository.core.relatioin.processor;

import java.lang.reflect.Method;

import org.tura.platform.repository.core.RelationAdapter;
import org.tura.platform.repository.core.annotation.Assosiation;

public class RelationBuilder {
	public static String ONE2ONE = "One2One";
	public static String ONE2MANY = "One2Many";
	public static String MANY2MANY = "Many2Many";

	public static RelationAdapter build(Method method) {

		Assosiation assosiation = method.getAnnotation(Assosiation.class);
		if (assosiation == null) {
			return null;
		}
		if (ONE2ONE.equals(assosiation.type())) {
			return new One2OneRelationAdapter(method, null);
		}

		if (ONE2MANY.equals(assosiation.type())) {
			return new One2ManyRelationAdapter(method, null);
		}
		if (MANY2MANY.equals(assosiation.type())) {
			return new Many2ManyRelationAdapter(method, null);
		}

		return null;

	}

}
