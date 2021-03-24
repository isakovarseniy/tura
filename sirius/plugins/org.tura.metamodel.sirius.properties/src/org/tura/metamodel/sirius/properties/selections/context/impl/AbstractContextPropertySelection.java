/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.context.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.swt.widgets.Display;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.QueryHelper1;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.context.ContextPropertySelection;

public abstract class AbstractContextPropertySelection extends ContextPropertySelection {


	@Override
	protected TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot().getContents().getModel();
		DSemanticDiagram element = (DSemanticDiagram) root.getElement();

		try {
			for (Object obj : new QueryHelper1().getControlsList(root)){
				if (obj != null){
				  rootOfTree.addChild(obj);
				}
			}

			Object obj = new QueryHelper().getTypesRepository(element.getTarget());
			if (obj != null){
			    rootOfTree.addChild(obj);
			}

			obj = new QueryHelper1().getRootControl(root);
			if (obj != null)
				rootOfTree.addChild(obj);

			obj = new QueryHelper1().getMessages(root);

			if (obj != null) {
				rootOfTree.addChild(obj);
			}
			
			obj = new QueryHelper1().getApplicationStyle(root);

			if (obj != null) {
				rootOfTree.addChild(obj);
			}

		} catch (Exception e) {

			e.printStackTrace();
			// ignore
		}
		return rootOfTree;
	}

	protected abstract boolean checkType(Object type);
	
	protected boolean validateSelection(TreePath path) {
		Object obj = path.getLastSegment();

		IReturnTypeProvider provider = (IReturnTypeProvider) Platform
				.getAdapterManager().getAdapter(obj, IReturnTypeProvider.class);

		Object type = null;
		if (provider != null && provider.getApplicationType(obj) != null)
			type =provider.getApplicationType(obj);

		if (type == null)
			return false;

		if (checkType(type) )
			return true;
		return false;

	}	
	

	@Override
	protected void showError() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Tura", null,
						"Choosen type missmarch of parameter type", MessageDialog.ERROR, new String[] { "Ok" }, 0);
				dialog.open();
			}
		});
	}

}
