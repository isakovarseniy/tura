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

package org.apache.felix.gogo.jline.command;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelNotFoundException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.dom.ConstraintContext;

public class SelectiveEvlModule extends EvlModule {

	protected static List<Object> rootEObjects;

	@Override
	public ModuleElement adapt(AST cst, ModuleElement parentAst) {
		ModuleElement moduleElement = super.adapt(cst, parentAst);
		if (moduleElement instanceof ConstraintContext) {
			return new SelectiveConstraintContext();
		}
		return moduleElement;
	}

	public HashMap<String, Class<?>> getImportConfiguration() {
		HashMap<String, Class<?>> importConfiguration = super.getImportConfiguration();
		importConfiguration.put("evl", SelectiveEvlModule.class);
		return importConfiguration;
	}

	class SelectiveConstraintContext extends ConstraintContext {
		@Override
		public Collection<?> getAllOfSourceKind(IEolContext context)
				throws EolModelElementTypeNotFoundException, EolModelNotFoundException {
			// Only return a subset containing elements which are
			// descendants of one of the root objects
			return super.getAllOfSourceKind(context).stream().filter(e -> shouldCheck(e)).collect(Collectors.toList());
		}
	}

	protected boolean shouldCheck(Object object) {
		// Only check elements which are decendants of one of the
		// root objects
//		return EcoreUtil.isAncestor(rootEObjects, (EObject) object);
		throw new UnsupportedOperationException();
	}

	public void setRootEObjects(List<Object> rootEObjects) {
		SelectiveEvlModule.rootEObjects = rootEObjects;
	}

	public List<Object> getRootEObjects() {
		return rootEObjects;
	}
}