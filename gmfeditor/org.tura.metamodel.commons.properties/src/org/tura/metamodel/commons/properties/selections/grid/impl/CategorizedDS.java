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

import domain.Categorized;
import domain.DomainFactory;
import domain.DomainPackage;

public class CategorizedDS extends DataSource {

	private GridProperty property;

	public CategorizedDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Classifier classifier = DomainFactory.eINSTANCE.createClassifier();
		classifier.setUid(UUID.randomUUID().toString());
		ArrayList<domain.Classifier> ls = new ArrayList<domain.Classifier>();
		ls.add(classifier);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(AddCommand.create(editingDomain,
				((domain.Categorized) property.getModel()), DomainPackage.eINSTANCE.getCategorized_Classifiers(), ls));

		rowList.add(rowList.size(), classifier);
		this.notifyAddRow(classifier);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.Classifier> ls = new ArrayList<domain.Classifier>();
		ls.add((domain.Classifier) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain,
				((domain.Categorized) property.getModel()), DomainPackage.eINSTANCE.getCategorized_Classifiers(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public List<Object> queryRows() {
		try {
			domain.Categorized categorized = (Categorized) property.getModel();

			ArrayList<Object> rows = new ArrayList<Object>();
			if (categorized != null) {
				for (Iterator<domain.Classifier> i = categorized.getClassifiers().iterator(); i.hasNext();) {
					domain.Classifier p = i.next();
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
