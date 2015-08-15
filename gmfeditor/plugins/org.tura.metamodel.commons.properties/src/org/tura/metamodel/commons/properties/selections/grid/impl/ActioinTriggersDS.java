package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class ActioinTriggersDS extends DataSource {

	private GridProperty property;

	public ActioinTriggersDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.ActionTrigger trigger = DomainFactory.eINSTANCE.createActionTrigger();
		trigger.setUid(UUID.randomUUID().toString());
		ArrayList<domain.ActionTrigger> ls = new ArrayList<domain.ActionTrigger>();
		ls.add(trigger);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain,
				((domain.Categorized) property.getModel()), DomainPackage.eINSTANCE.getActioinTriggers_Triggers(), ls));

		rowList.add(rowList.size(), trigger);
		this.notifyAddRow(trigger);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.ActionTrigger> ls = new ArrayList<domain.ActionTrigger>();
		ls.add((domain.ActionTrigger) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((domain.Categorized) property.getModel()), DomainPackage.eINSTANCE.getActioinTriggers_Triggers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.ActioinTriggers triggers = (domain.ActioinTriggers) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.ActionTrigger> i = triggers.getTriggers().iterator(); i.hasNext();) {
				domain.ActionTrigger p = i.next();
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
