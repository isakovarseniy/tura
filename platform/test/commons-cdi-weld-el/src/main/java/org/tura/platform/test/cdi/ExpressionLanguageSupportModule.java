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
import org.jboss.weld.module.ExpressionLanguageSupport;
import org.jboss.weld.module.WeldModule;
import org.jboss.weld.module.web.el.WeldELResolver;
import org.jboss.weld.module.web.el.WeldExpressionFactory;

import jakarta.el.ELResolver;
import jakarta.el.ExpressionFactory;

public class ExpressionLanguageSupportModule implements WeldModule {

	public static final ExpressionLanguageSupport EL_SUPPORT = new ExpressionLanguageSupport() {
		@Override
		public void cleanup() {
		}

		@Override
		public ExpressionFactory wrapExpressionFactory(ExpressionFactory expressionFactory) {
			return new WeldExpressionFactory(expressionFactory);
		}

		@Override
		public ELResolver createElResolver(BeanManagerImpl manager) {
			return new WeldELResolver(manager);
		}
	};

	@Override
	public String getName() {
		return "weld-expression-support";
	}

	@Override
	public void postServiceRegistration(PostServiceRegistrationContext ctx) {
		ctx.getServices().add(ExpressionLanguageSupport.class, EL_SUPPORT);
	}

}
