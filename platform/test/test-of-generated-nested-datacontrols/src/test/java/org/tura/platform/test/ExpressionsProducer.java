/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.el.CompositeELResolver;
import javax.el.ELContext;
import javax.el.ELContextEvent;
import javax.el.ExpressionFactory;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.jboss.weld.el.WeldELContextListener;
import org.jboss.weld.el.WeldExpressionFactory;
import org.jboss.weld.manager.BeanManagerImpl;
import org.jboss.weld.util.reflection.Reflections;

import de.odysseus.el.ExpressionFactoryImpl;
import de.odysseus.el.util.SimpleResolver;

public class ExpressionsProducer {
	public static final class Factory extends WeldExpressionFactory {
		public Factory() {
			super(new ExpressionFactoryImpl());
		}
	}

	public final static Pattern PATTERN = Pattern.compile("#\\{(.+?)\\}");
	public final static ExpressionFactory expressionFactory = ExpressionFactory
			.newInstance();

	final protected ELContext context;

	@Inject
	public ExpressionsProducer(BeanManagerImpl beanManager) {
		// Chain the resolvers, the Weld resolver first, then
		// read-only "simple" bean/map/list resolvers
		CompositeELResolver compositeELResolver = new CompositeELResolver();
		compositeELResolver.add(beanManager.getELResolver());
		compositeELResolver.add(new SimpleResolver(true));
		context = new de.odysseus.el.util.SimpleContext(compositeELResolver);

		// Let Weld know about the context, so it can handle dependent
		// scope properly if beans are instantiated by EL expressions
		ELContextEvent event = new ELContextEvent(context);
		new WeldELContextListener().contextCreated(event);
	}

//	@Produces
	public ExpressionFactory getExpressionFactory() {
		return expressionFactory;
	}

	@Produces
	public ELContext getContext() {
		return context;
	}

	public <T> T evaluateValueExpression(String expression,
			Class<T> expectedType) {
		Object result = getExpressionFactory().createValueExpression(context,
				expression, expectedType).getValue(context);
		return result != null ? expectedType.cast(result) : null;
	}

	public <T> T evaluateValueExpression(String expression) {
		Object result = evaluateValueExpression(expression, Object.class);
		return result != null ? Reflections.<T> cast(result) : null;
	}

	public <T> T evaluateMethodExpression(String expression,
			Class<T> expectedReturnType, Object[] params,
			Class<?>[] expectedParamTypes) {
		Object result = getExpressionFactory().createMethodExpression(context,
				expression, expectedReturnType, expectedParamTypes).invoke(
				context, params);
		return result != null ? expectedReturnType.cast(result) : null;
	}

	public <T> T evaluateMethodExpression(String expression,
			Class<T> expectedReturnType) {
		return evaluateMethodExpression(expression, expectedReturnType,
				new Object[0], new Class[0]);
	}

	public <T> T evaluateMethodExpression(String expression) {
		Object result = evaluateMethodExpression(expression, Object.class);
		return result != null ? Reflections.<T> cast(result) : null;
	}

	public <T> T evaluateMethodExpression(String expression, Object... params) {
		Object result = evaluateMethodExpression(expression, Object.class,
				params, new Class[params.length]);
		return result != null ? Reflections.<T> cast(result) : null;
	}

	public String toExpression(String name) {
		return "#{" + name + "}";
	}

	public <T> void addVariableValue(String name, Class<T> type, T value) {
		getContext().getVariableMapper().setVariable(name,
				getExpressionFactory().createValueExpression(value, type));
	}

	public String evaluateAllValueExpressions(String s) {
		StringBuffer sb = new StringBuffer();
		Matcher matcher = PATTERN.matcher(s);
		while (matcher.find()) {
			String expression = toExpression(matcher.group(1));
			Object result = evaluateValueExpression(expression);
			matcher.appendReplacement(sb, result != null ? result.toString()
					: "");
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

}
