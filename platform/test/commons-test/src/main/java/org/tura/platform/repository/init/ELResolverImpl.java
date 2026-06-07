/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.init;

import jakarta.el.ELContext;
import jakarta.el.ELManager;
import jakarta.el.ExpressionFactory;
import jakarta.el.StandardELContext;
import jakarta.el.ValueExpression;

import org.tura.platform.datacontrol.ELResolver;


public class ELResolverImpl implements ELResolver {
	private ExpressionFactory ef;
	private ELContext context;

	public ELResolverImpl() {
		ef = ExpressionFactory.newInstance();
		context = new StandardELContext(ELManager.getExpressionFactory());
	}

	public Object getValue(String exp) {
		
		
		
		ValueExpression ve = ef.createValueExpression(context, exp.replaceAll("\\#", "\\$"),
				Object.class);
		return ve.getValue(context);

	}

	public void setValue(String exp, Object value) {
		ValueExpression ve = ef.createValueExpression(context, "${"+exp+"}",
				Object.class);
		ve.setValue(context,value);
	}

	@Override
	public Object callMethod(String exp, Object[] values, Class<?>[] classes, Class<?> expectedValue) {
		return null;
	}
}
