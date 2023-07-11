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

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.JavaScriptComponentMapperPointerMapperName;
import org.tura.metamodel.sirius.properties.selections.tree.TreePropertySelectioin;

import mapper.Mapper;
import recipe.Component;
import recipe.JavaComponent;
import recipe.RecipePackage;

public class JavaScriptComponentMapperPropertySelection extends TreePropertySelectioin {

	@Override
	public String getLabelText() {
		return "Library:";
	}

	@Override
	public TreeRoot getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(new QueryHelper().getMappers(getModel()));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}

	@Override
	protected void showError() {

	}

	@Override
	protected TextDataAdapter getDataAdapter() {
		return new JavaScriptComponentMapperPointerMapperName();
	}

	@Override
	protected Class<?> getComaringClass() {
		return Mapper.class;
	}

	@Override
	public void afterUpdate() {
		Component component = (Component) getModel();
		if (component instanceof JavaComponent) {
			JavaComponent javaComponent = (JavaComponent) component;

			Session session = SessionManager.INSTANCE.getSession(getModel());
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
			CompoundCommand compoundCommand = new CompoundCommand();

			compoundCommand.append(SetCommand.create(editingDomain, javaComponent,
					RecipePackage.eINSTANCE.getJavaComponent_ArtifactId(), null));

			compoundCommand.append(SetCommand.create(editingDomain, javaComponent,
					RecipePackage.eINSTANCE.getJavaComponent_GroupId(), null));

			compoundCommand.append(SetCommand.create(editingDomain, javaComponent,
					RecipePackage.eINSTANCE.getJavaComponent_BasePackage(), null));

			editingDomain.getCommandStack().execute(compoundCommand);
		}

	}

}
