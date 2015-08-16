/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
