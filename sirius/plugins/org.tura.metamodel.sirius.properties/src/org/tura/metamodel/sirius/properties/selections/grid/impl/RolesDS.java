/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import permission.GrantAccess;
import permission.PermissionFactory;
import permission.PermissionPackage;
import permission.Secured;

public class RolesDS extends DataSource {

	private GridProperty property;

	public RolesDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		GrantAccess access = PermissionFactory.eINSTANCE.createGrantAccess();
		access.setUid(UUID.randomUUID().toString());
		ArrayList<GrantAccess> ls = new ArrayList<GrantAccess>();
		ls.add(access);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((Secured) property.getModel()),
						PermissionPackage.eINSTANCE.getSecured_Grants(), ls));

		rowList.add(rowList.size(), access);
		this.notifyAddRow(access);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<GrantAccess> ls = new ArrayList<GrantAccess>();
		ls.add((GrantAccess) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((Secured) property.getModel()),
						PermissionPackage.eINSTANCE.getSecured_Grants(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			Secured operation = ((Secured) property
					.getModel());

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<GrantAccess> i = operation.getGrants()
					.iterator(); i.hasNext();) {
				GrantAccess p = i.next();
				rows.add(p);
			}
			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
