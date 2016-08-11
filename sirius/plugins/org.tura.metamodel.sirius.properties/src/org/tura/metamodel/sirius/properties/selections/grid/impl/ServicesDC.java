package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import form.FormPackage;
import form.ProxiesList;
import type.TypeFactory;
import type.TypePointer;


public class ServicesDC extends DataSource {

	private GridProperty property;

	public ServicesDC(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		TypePointer typeRef = TypeFactory.eINSTANCE.createTypePointer();
		ArrayList<TypePointer> ls = new ArrayList<TypePointer>();
		ls.add(typeRef);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain,
				((ProxiesList) property.getModel()), FormPackage.eINSTANCE.getProxiesList_TypePointers(), ls));

		rowList.add(rowList.size(), typeRef);
		this.notifyAddRow(typeRef);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<TypePointer> ls = new ArrayList<TypePointer>();
		ls.add((TypePointer) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((ProxiesList) property.getModel()), FormPackage.eINSTANCE.getProxiesList_TypePointers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			ProxiesList proxies = (ProxiesList) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			if (proxies != null) {
				for (TypePointer p :  proxies.getTypePointers()) {
					rows.add(p);
				}
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
