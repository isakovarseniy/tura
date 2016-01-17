/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.Display;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.context.ContextPropertySelection;

import domain.TypeElement;

public abstract class AbstractBooleanPropertySelection extends
		ContextPropertySelection {

	@Override
	public String getLabelText() {
		return "Value:";
	}

	@Override
	protected TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot()
				.getContents().getModel();

		try {
			for (Object obj : new QueryHelper().getControlsList(root))
				rootOfTree.addChild(obj);

			rootOfTree.addChild(new QueryHelper().getTypesRepository(root
					.getElement()));
			
			Object obj = new QueryHelper().getRootControl(root);
			if (obj != null)
				rootOfTree.addChild(obj);
			
		} catch (Exception e) {
			// ignore
			e.printStackTrace();
		}

		return rootOfTree;
	}

	@Override
	protected boolean validateSelection(TreePath path) {

		Object obj = path.getLastSegment();

		IReturnTypeProvider provider = (IReturnTypeProvider) Platform
				.getAdapterManager().getAdapter(obj, IReturnTypeProvider.class);

		domain.TypeElement type = null;
		if (provider != null && provider.getReturnType(obj) != null)
			type = (TypeElement) provider.getReturnType(obj);

		if (type == null)
			return false;

		domain.TypeElement bln = new QueryHelper().findBooleanType(getModel());
		if (!type.getUid().equals(bln.getUid()))
			return false;

		return true;
	}

	@Override
	protected void showError() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog dialog = new MessageDialog(Display.getDefault()
						.getActiveShell(), "Tura", null,
						"Choosen type missmarch of parameter type",
						MessageDialog.ERROR, new String[] { "Ok" }, 0);
				dialog.open();
			}
		});
	}

}
