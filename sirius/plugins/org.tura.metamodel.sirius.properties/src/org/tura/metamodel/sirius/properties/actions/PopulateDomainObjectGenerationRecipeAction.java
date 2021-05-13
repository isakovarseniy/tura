/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.actions;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.Display;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;

import type.TypeGroup;

public class PopulateDomainObjectGenerationRecipeAction extends AbstractSelectionAction{

	@Override
	public void showError() {
		String message = "Wrong element selected";
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Tura", null, message,
                        MessageDialog.ERROR, new String[] { "Ok" }, 0);
                dialog.open();
            }
        });

		
		
	}

	@Override
	public boolean validateSelection(TreePath path) {
		Object obj = path.getLastSegment();
		if ( obj instanceof TypeGroup  || obj instanceof type.Type) {
		   return true;
		}else {
			return false;
		}
	}

	@Override
	public Object getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(  new QueryHelper().getTypesRepository(getModel() )) ;
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}

	@Override
	public String getScript() {
		return "tura:/generation-templates/template/init/initModel.eol";
	}

}
