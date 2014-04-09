package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.metamodel.tura.ui.properties.sections.QueryHelper;
import org.metamodel.tura.ui.properties.sections.grid.DataSource;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.QueryParameter;
import domain.QueryVariable;

public class QueryVariableDS extends DataSource {

	private GridProperty property;

	public QueryVariableDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.QueryVariable queryVar = DomainFactory.eINSTANCE
				.createQueryVariable();
		queryVar.setValue("New option");
		ArrayList<domain.QueryVariable> ls = new ArrayList<domain.QueryVariable>();
		ls.add(queryVar);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain,
						((domain.QueryParameter) property.getModel()),
						DomainPackage.eINSTANCE.getQuery_Variables(), ls));

		rowList.add(rowList.size(), queryVar);
		this.notifyAddRow(queryVar);
	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.QueryVariable> ls = new ArrayList<domain.QueryVariable>();
		ls.add((QueryVariable) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain,
						((domain.QueryParameter) property.getModel()),
						DomainPackage.eINSTANCE.getQuery_Variables(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> queryRows() {

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		NodeImpl diagram = (NodeImpl) property.getEditPart().getModel();
		try {

			EObject types = (EObject) diagram.getElement();
			Object[] result = (new QueryHelper()).findMappingVariable(
					(domain.Query) property.getModel(), types);

			List<domain.QueryParameter> addVariables = (List<QueryParameter>) result[0];
			List<domain.QueryVariable> removeVariables = (List<QueryVariable>) result[1];

			// Add new
			for (Iterator<domain.QueryParameter> itr = addVariables.iterator(); itr
					.hasNext();) {
				domain.QueryParameter Variable = itr.next();
				domain.QueryVariable ms = DomainFactory.eINSTANCE
						.createQueryVariable();
				ms.setQueryParamRef(Variable);
				editingDomain.getCommandStack().execute(
						AddCommand.create(editingDomain,
								((domain.Query) property.getModel()),
								DomainPackage.eINSTANCE
										.getQuery_Variables(), ms));
			}

			// Remove
			for (Iterator<domain.QueryVariable> itr = removeVariables
					.iterator(); itr.hasNext();) {
				domain.QueryVariable ms = itr.next();
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								((domain.Query) property.getModel()),
								DomainPackage.eINSTANCE
										.getQuery_Variables(), ms));
			}
			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.QueryVariable> i = ((domain.Query) property.getModel())
					.getVariables().iterator(); i.hasNext();) {
				domain.QueryVariable p = i.next();
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
