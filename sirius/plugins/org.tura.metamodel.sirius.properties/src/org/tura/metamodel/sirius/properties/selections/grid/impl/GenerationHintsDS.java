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

import artifact.Artifact;
import artifact.ArtifactFactory;
import artifact.ArtifactPackage;
import artifact.GenerationHintWithNickName;

public class GenerationHintsDS extends DataSource {

	protected GridProperty property;

	public GenerationHintsDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public List<Object> queryRows() {
		try {
			ArrayList<Object> rows = new ArrayList<Object>();
			for (GenerationHintWithNickName hint : ((Artifact) property.getModel()).getHints()) {
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
		GenerationHintWithNickName hint = ArtifactFactory.eINSTANCE.createGenerationHintWithNickName();
		hint.setUid(UUID.randomUUID().toString());


		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		ArrayList<GenerationHintWithNickName> ls = new ArrayList<GenerationHintWithNickName>();
		ls.add(hint);

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, ((Artifact) property.getModel()),
						ArtifactPackage.eINSTANCE.getArtifact_Hints(), ls));

		rowList.add(rowList.size(), hint);
		this.notifyAddRow(hint);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<GenerationHintWithNickName> ls = new ArrayList<GenerationHintWithNickName>();
		ls.add((GenerationHintWithNickName) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart()).getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, ((Artifact) property.getModel()),
						ArtifactPackage.eINSTANCE.getArtifact_Hints(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
