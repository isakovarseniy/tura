/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.epsilon.model;

import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.eol.dom.Expression;
import org.eclipse.epsilon.eol.dom.NameExpression;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.operations.declarative.SelectOperation;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.proxy.access.LazyList;

public class LazySelectOperation extends SelectOperation {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Collection<?> execute(boolean returnOnMatch, Object target, NameExpression operationNameExpression,
			List<Parameter> iterators, Expression expression, IEolContext context) throws EolRuntimeException {
		LazyList t = (LazyList) target;
		try {
			t.reset();
		} catch (Throwable e1) {
			throw new EolRuntimeException(e1);
		}
		try {
			List<SearchCriteria> search = (List<SearchCriteria>) new Ast2sql()
					.ast2sql(createIteratorVariable(null, iterators.get(0), context), expression, context);
			t.setSearchCriteria(search);
			return t;
		} catch (Throwable e) {
			return super.execute(returnOnMatch, target, operationNameExpression, iterators, expression, context);
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Collection<?> execute(Object target, NameExpression operationNameExpression, List<Parameter> iterators,
			List<Expression> expressions, IEolContext context) throws EolRuntimeException {
		LazyList t = (LazyList) target;
		try {
			t.reset();
		} catch (Throwable e1) {
			throw new EolRuntimeException(e1);
		}
		try {
			List<SearchCriteria> search = (List<SearchCriteria>) new Ast2sql()
					.ast2sql(createIteratorVariable(null, iterators.get(0), context), expressions.get(0), context);
			t.setSearchCriteria(search);
			return t;
		} catch (Throwable e) {
			return super.execute(target, operationNameExpression, iterators, expressions, context);
		}

	}

}
