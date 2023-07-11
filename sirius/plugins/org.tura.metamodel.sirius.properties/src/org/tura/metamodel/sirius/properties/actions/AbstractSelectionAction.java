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

package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.epsilon.command.EolCommand;

public abstract class AbstractSelectionAction implements IExternalJavaAction{

	protected TreePath[] treePath;
	private EObject eObject;
	
	
	public abstract void showError();

	public abstract boolean validateSelection(TreePath path) ;

	public abstract  Object getContextRoot();
	
	public abstract  String getScript();
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		eObject =  node.getTarget();
		executeScript();
		return;
		
		
//		MultiSelectionTreeDialog dialog = new MultiSelectionTreeDialog(Display
//				.getCurrent().getActiveShell(), new WorkbenchLabelProvider(),
//				new BaseWorkbenchContentProvider());
//		dialog.setTitle("Context");
//		dialog.setMessage("");
//		
//		dialog.setInput(getContextRoot());
//		if (dialog.open() == Window.OK) {
//			treePath = dialog.getTreePath();
//			if (treePath != null && treePath.length > 0) {
//				TreePath path = treePath[0];
//				if (validateSelection(path)) {
//					executeScript();					
//				} else {
//					showError();
//				}
//
//			}
//		}		
		
	}

  public EObject getModel() {
	  return eObject;
  }

  
  private void executeScript () {
		Session session = SessionManager.INSTANCE.getSession(eObject);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();
		
		EolCommand cmd = new EolCommand(eObject.eResource(),getScript());
		HashMap<String , Object> parameters = new HashMap<String, Object>();
		parameters.put("self",eObject);
		cmd.setVariables(parameters);
		editingDomain.getCommandStack().execute(cmd);
  }
  
}
