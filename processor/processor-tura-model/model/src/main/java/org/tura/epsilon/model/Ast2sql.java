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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.eol.dom.AndOperatorExpression;
import org.eclipse.epsilon.eol.dom.EagerOperatorExpression;
import org.eclipse.epsilon.eol.dom.Expression;
import org.eclipse.epsilon.eol.dom.FeatureCallExpression;
import org.eclipse.epsilon.eol.dom.LiteralExpression;
import org.eclipse.epsilon.eol.dom.NameExpression;
import org.eclipse.epsilon.eol.dom.OperationCallExpression;
import org.eclipse.epsilon.eol.dom.OperatorExpression;
import org.eclipse.epsilon.eol.dom.PropertyCallExpression;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.tura.platform.datacontrol.commons.SearchCriteria;

import com.octo.java.sql.exp.Operator;

public class Ast2sql {

	@SuppressWarnings("unchecked")
	public Object ast2sql(Variable iterator, Expression ast, IEolContext context)
			throws EolRuntimeException {

      if (ast instanceof OperatorExpression && ((OperatorExpression) ast).getFirstOperand() != null
				&& ((OperatorExpression) ast).getSecondOperand() != null) {

			final OperatorExpression oexp = (OperatorExpression) ast;
			
			String originalOperation = oexp.getOperator();
			String operation = originalOperation;

		    Object firstPart  =  ast2sql( iterator, oexp.getFirstOperand(), context);
		    Object secondPart = ast2sql( iterator, oexp.getSecondOperand(), context);
		    
		    if ( ast instanceof EagerOperatorExpression ) {
		        Operator op = findOperation(operation);
		        SearchCriteria  sc  = null;
		    	if ( firstPart instanceof SearchCriteria && secondPart  instanceof String) {
		    		sc =  (SearchCriteria) firstPart;
		    		sc.setName((String) secondPart);
		    		sc.setComparator(op.name());
		    		List<SearchCriteria> search = new ArrayList<>();
		    		search.add(sc);
		    		return search;
		    	}
		    	if ( secondPart instanceof SearchCriteria && firstPart  instanceof String) {
		    		sc =  (SearchCriteria) secondPart;
		    		sc.setName((String) firstPart);
		    		sc.setComparator(op.name());
		    		List<SearchCriteria> search = new ArrayList<>();
		    		search.add(sc);
		    		return search;
		    	}
				throw new EolRuntimeException("No much operation");
		    }
		    if ( ast instanceof AndOperatorExpression ) {
	    		List<SearchCriteria> search = new ArrayList<>();
	    		search.addAll((Collection<? extends SearchCriteria>) firstPart);
	    		search.addAll((Collection<? extends SearchCriteria>) secondPart);
		    	return search;
		    }
		    
			throw new EolRuntimeException("No much operation");

		}
		else if (ast instanceof PropertyCallExpression
				&& ((PropertyCallExpression) ast).getTargetExpression() instanceof    NameExpression) {
			PropertyCallExpression pexp = (PropertyCallExpression) ast;
			if  ( ((NameExpression) ((PropertyCallExpression) ast).getTargetExpression()).getName().equals(iterator.getName())) {
			      return pexp.getNameExpression().getName();
			}else {
				Object value  =  pexp.execute(context);
				SearchCriteria  sc  =   new  SearchCriteria();
				sc.setValue(value);
				return sc;
			}
		} 
		else if (ast instanceof PropertyCallExpression
				&& ((PropertyCallExpression) ast).getTargetExpression() instanceof  FeatureCallExpression) {
			PropertyCallExpression pexp = (PropertyCallExpression) ast;
			
			Object value  =  pexp.execute(context);
			SearchCriteria  sc  =   new  SearchCriteria();
			sc.setValue(value);
			return sc;

		} else if (ast instanceof LiteralExpression) {
			@SuppressWarnings("rawtypes")
			LiteralExpression pexp = (LiteralExpression) ast;
			SearchCriteria  sc  =   new  SearchCriteria();
			sc.setValue(pexp.getValue());
			return sc;
		}
		else if (ast instanceof OperationCallExpression) {
			OperationCallExpression ocexp = (OperationCallExpression) ast;
			Object value  =  ocexp.execute(context);
			SearchCriteria  sc  =   new  SearchCriteria();
			sc.setValue(value);
			return sc;
			
		} 
		throw new EolRuntimeException("No much operation");
	}
	
	
	private Operator findOperation(String  operation) throws EolRuntimeException {
		for (  Operator opr : Operator.values()) {
			if (opr.getValue().toUpperCase().equals(operation.toUpperCase()) ) {
				return opr;
			}
		}
		throw new EolRuntimeException("No operation  find");
	}
}
