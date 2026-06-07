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

package org.tura.platform.test.cdi;

import org.jboss.weld.manager.BeanManagerImpl;

import jakarta.el.ELContext;
import jakarta.el.ELManager;
import jakarta.el.ExpressionFactory;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

public class ExpressionsProducer {

	public  static ExpressionFactory expressionFactory = ExpressionFactory.newInstance();

	final protected ELContext context;

	@Inject
	public ExpressionsProducer(BeanManagerImpl beanManager) {
		ELManager manager = new ELManager();
		manager.addELResolver(beanManager.getELResolver());
		context = manager.getELContext();
		expressionFactory = manager.getExpressionFactory();

	}

	@Produces
	public ExpressionFactory getExpressionFactory() {
		
		return expressionFactory;
	}

	@Produces
	public ELContext getContext() {
		return context;
	}

}
