package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;

import domain.DomainFactory;
import domain.DomainPackage;

public class DefaultOrderByPropertySelection extends DefaultSearchPropertySelection{

	@Override
	public EObject getModel() {
		if (((domain.DataControl) getEObject()).getDefaultOrderBy() == null){
			EditingDomain editingDomain = ((DiagramEditor) this.getPart())
					.getEditingDomain();

			domain.ContextParameters  ctx = DomainFactory.eINSTANCE.createContextParameters();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, getEObject(), DomainPackage.eINSTANCE
							.getDataControl_DefaultOrderBy(), ctx));
		}
		return ((domain.DataControl) getEObject()).getDefaultOrderBy();
	}

	
	@Override
	public domain.TypeElement contextRefTypeExtreactor(domain.ContextParameter  obj) {
		return new QueryHelper().findStringType(obj) ;
	}
	
	
	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new FieldsColumn(table, this, 0));
			columnList.add(new IsExpressioinColumn(table, this, 1));
			columnList.add(new ValueColumn(table, this, 2));
		}
		return columnList;
	}
	
	
}
