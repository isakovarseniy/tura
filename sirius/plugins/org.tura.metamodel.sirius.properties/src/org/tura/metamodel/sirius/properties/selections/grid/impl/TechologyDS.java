package org.tura.metamodel.sirius.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;
import org.tura.metamodel.sirius.properties.selections.grid.GridProperty;

import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.Option;
import artifact.Technology;

public class TechologyDS extends DataSource {

	protected GridProperty property;

	public TechologyDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (Option hint : ((Technology) property.getModel()).getOptions()) {
				rows.add(hint);
			}

			return rows;
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Option hint = ArtifactFactory.eINSTANCE.createOption();
		hint.setUid(UUID.randomUUID().toString());


		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		ArrayList<Option> ls = new ArrayList<Option>();
		ls.add(hint);

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((Technology) property.getModel()),
						ArtifactPackage.eINSTANCE.getTechnology_Options(), ls));

		rowList.add(rowList.size(), hint);
		this.notifyAddRow(hint);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<Option> ls = new ArrayList<Option>();
		ls.add((Option) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((Technology) property.getModel()),
						ArtifactPackage.eINSTANCE.getTechnology_Options(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
