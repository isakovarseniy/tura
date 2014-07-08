package org.tura.platform.datacontrol;

import com.octo.java.sql.exp.OpExp;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.visitor.DefaultQueryBuilder;

public class ExpressionResolver extends DefaultQueryBuilder {

	private ELResolver el;

	public ExpressionResolver(ELResolver el) {
		this.el = el;
	}

	public void visit(final OpExp exp) throws QueryException {

		if ((exp.getRhsValue() != null)) {
			Object param = exp.getRhsValue();
			if (param instanceof String) {
				exp.setRhsValue(resolver((String) param));
			}
		}

		if ((exp.getLhsValue() != null)) {
			Object param = exp.getLhsValue();
			if (param instanceof String) {
				exp.setLhsValue(resolver((String) param));
			}
		}

		super.visit(exp);
	}

	private Object resolver(String str) {
		int lastindex = str.length() - 1;
		if (str.length() > 3 && "#{".equals(str.substring(0, 2))
				&& "}".equals(str.substring(lastindex))) {
			return el.getValue(str.substring(2, lastindex));
		} else
			return str;
	}

}
