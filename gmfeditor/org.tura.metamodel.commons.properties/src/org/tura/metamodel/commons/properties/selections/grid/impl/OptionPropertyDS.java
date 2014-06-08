package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.Option;

public class OptionPropertyDS extends DataSource {

	private GridProperty property;

	public OptionPropertyDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Option option = DomainFactory.eINSTANCE.createOption();
		option.setValue("New option");
		option.setUid(UUID.randomUUID().toString());
		ArrayList<domain.Option> ls = new ArrayList<domain.Option>();
		ls.add(option);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.Specifier) property.getModel()),
						DomainPackage.eINSTANCE.getSpecifier_Options(), ls));

		rowList.add(rowList.size(), option);
		this.notifyAddRow(option);

	}

	@Override
	public void removeRow(Object row) {

		ArrayList<domain.Option> ls = new ArrayList<domain.Option>();
		ls.add((Option) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.Specifier) property.getModel()),
						DomainPackage.eINSTANCE.getSpecifier_Options(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Object> queryRows() {
		NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
		try {
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			domain.DomainArtifact domainArtifact = ((domain.Specifier) property
					.getModel()).getParent().getParent().getParent();
			domain.Artifact artifact = ((domain.Specifier) property
					.getModel()).getParent();

			EObject types = (EObject) diagram.getElement();

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid ='"
							+ domainArtifact.getUid()
							+ "').oclAsType(domain::DomainArtifact).artifact.artifacts-> select(r|r.oclAsType(domain::Artifact).uid ='"
							+ artifact.getUid()
							+ "').oclAsType(domain::Artifact).specifiers->select(r|r.oclAsType(domain::Specifier).uid ='"
							+ ((domain.Specifier) property.getModel())
									.getUid()
							+ "').oclAsType(domain::Specifier).options");

			Collection<domain.Option> map = (Collection<domain.Option>) ocl
					.evaluate(types, query);

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.Option> i = map.iterator(); i.hasNext();) {
				domain.Option p = i.next();
				rows.add(p);
			}
			return rows;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getSorterID() {
		return 0;
	}

}
