package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.ProxiesList;

public class ProxiesDC extends DataSource {

	private GridProperty property;

	public ProxiesDC(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.TypePointer typeRef = DomainFactory.eINSTANCE.createTypePointer();
		ArrayList<domain.TypePointer> ls = new ArrayList<domain.TypePointer>();
		ls.add(typeRef);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain,
				((domain.ProxiesList) property.getModel()), DomainPackage.eINSTANCE.getProxiesList_TypePointers(), ls));

		rowList.add(rowList.size(), typeRef);
		this.notifyAddRow(typeRef);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.TypePointer> ls = new ArrayList<domain.TypePointer>();
		ls.add((domain.TypePointer) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((domain.ProxiesList) property.getModel()), DomainPackage.eINSTANCE.getProxiesList_TypePointers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.ProxiesList proxies = (ProxiesList) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			if (proxies != null) {
				for (domain.TypePointer p :  proxies.getTypePointers()) {
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
