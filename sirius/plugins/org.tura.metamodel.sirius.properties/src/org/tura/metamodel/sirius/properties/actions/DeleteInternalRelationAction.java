/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import form.DataControl;
import form.FormPackage;
import form.InternalRelation;
import form.RelationMapper;

public class DeleteInternalRelationAction  implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		try {

			InternalRelation ir = (InternalRelation) arg0.iterator().next();

			Session session = SessionManager.INSTANCE.getSession(ir);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();

			DataControl dcSrc = ir.getMaster();
			DataControl dcTrg = ir.getDetail();
			
			for (   RelationMapper rm :  dcSrc.getRelationMappers()){
				if (rm.getDataControlRef() != null && rm.getDataControlRef().getUid().equals(dcTrg.getUid()) ){
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain,rm,
									FormPackage.eINSTANCE.getRelationMapper_DataControlRef(), null));
					
				}
			}
			
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,ir.eContainer(),
							FormPackage.eINSTANCE.getControls_Relations(), ir));
			
			
		} catch (Exception e) {
			LogUtil.log(e);
		}

	}

}
