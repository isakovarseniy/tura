package org.metamodel.tura.ui.properties.sections.grid.impl;

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
import org.metamodel.tura.ui.properties.sections.grid.DataSource;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class QueryParameterDS extends DataSource {

	private GridProperty property;

	public QueryParameterDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.QueryParameter parameter = DomainFactory.eINSTANCE
				.createQueryParameter();
		parameter.setName("New option");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.QueryParameter> ls = new ArrayList<domain.QueryParameter>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						AddCommand.create(editingDomain,
								((domain.ModelQuery) property.getModel()),
								DomainPackage.eINSTANCE
										.getModelQuery_Parameters(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.QueryParameter> ls = new ArrayList<domain.QueryParameter>();
		ls.add((domain.QueryParameter) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						RemoveCommand.create(editingDomain,
								((domain.ModelQuery) property.getModel()),
								DomainPackage.eINSTANCE
										.getModelQuery_Parameters(), ls));

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

			domain.DomainArtifact domainArtifact = ((domain.ModelQuery) property
					.getModel()).getParent().getParent().getParent();
			domain.Artifact artifact = ((domain.ModelQuery) property
					.getModel()).getParent();

			EObject types = (EObject) diagram.getElement();

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid ='"
							+ domainArtifact.getUid()
							+ "').oclAsType(domain::DomainArtifact).artifact.artifacts-> select(r|r.oclAsType(domain::Artifact).uid ='"
							+ artifact.getUid()
							+ "').oclAsType(domain::Artifact).modelQuery->select(r|r.oclAsType(domain::ModelQuery).uid ='"
							+ ((domain.ModelQuery) property.getModel())
									.getUid()
							+ "').oclAsType(domain::ModelQuery).parameters");

			Collection<domain.QueryParameter> map = (Collection<domain.QueryParameter>) ocl
					.evaluate(types, query);

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.QueryParameter> i = map.iterator(); i
					.hasNext();) {
				domain.QueryParameter p = i.next();
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
