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

package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import application.ApplicationMappers;
import application.ApplicationPackage;
import mapper.MapperFactory;
import mapper.Version;

public class ApplicationVersionsDS extends DataSource {

	private GridProperty property;

	public ApplicationVersionsDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Version version = MapperFactory.eINSTANCE.createVersion();
		version.setName("New version");
		version.setUid(UUID.randomUUID().toString());
		ArrayList<Version> ls = new ArrayList<Version>();
		ls.add(version);

		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((ApplicationMappers) property.getModel()),ApplicationPackage.eINSTANCE.getApplicationMappers_Versions(), ls));

		rowList.add(rowList.size(), version);
		
		
		this.notifyAddRow(version);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Version> ls = new ArrayList<Version>();
		ls.add((Version) row);

		Session session = SessionManager.INSTANCE.getSession(this.property.getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, ((ApplicationMappers) property.getModel()),
				ApplicationPackage.eINSTANCE.getApplicationMappers_Versions(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}


	
	
	@Override
	public List<Object> queryRows() {
		
		ApplicationMappers appMappers = (ApplicationMappers) property.getModel();
		List<Version>  versions = new ArrayList<Version>();
		versions.addAll(appMappers.getVersions());

		List<Object>  result = new ArrayList<Object>();
		result.addAll(versions);
		return result;
		
	}

	@Override
	public int getSorterID() {
		return 0;
	}
	
}
