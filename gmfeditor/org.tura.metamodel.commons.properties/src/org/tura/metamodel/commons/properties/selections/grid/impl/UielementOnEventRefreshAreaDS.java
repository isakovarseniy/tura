package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class UielementOnEventRefreshAreaDS extends DataSource {

	private GridProperty property;

	public UielementOnEventRefreshAreaDS(GridProperty property) {
		this.property = property;
	}

	@Override
	public void addRow() {
	}

	@Override
	public void removeRow(Object row) {
	}

	@Override
	public List<Object> queryRows() {

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		try {

			Object[] result = (new QueryHelper()).findRefreshedAeas(
					(domain.Uielement) property.getModel());

			@SuppressWarnings("unchecked")
			List<domain.Uielement> allAreas = (List<domain.Uielement>) result[0];
			@SuppressWarnings("unchecked")
			List<domain.Uielement> removeAreas = (List<domain.Uielement>) result[1];

			
			// Remove
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								property.getModel(),
								DomainPackage.eINSTANCE.getUielement_OnEventRefreshArea(),
								removeAreas));

				HashMap<String, domain.Uielement> map = new HashMap<String, domain.Uielement> ();
				for (Iterator<domain.Uielement> itr = ((domain.Uielement)(property.getModel())).getOnEventRefreshArea().iterator(); itr.hasNext() ; ){
					domain.Uielement event = itr.next();
					map.put(event.getUid(), event);
				}
				
			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.Uielement> i = allAreas.iterator(); i.hasNext();) {
				domain.Uielement p = i.next();
				Area a = new Area();
				a.setUielement(p);
				a.setRefreshed(map.containsKey(p.getUid()));
				rows.add(a);
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

	public class Area {
		private  domain.Uielement uielement;
		private boolean refreshed;
		
		public domain.Uielement getUielement() {
			return uielement;
		}
		public void setUielement(domain.Uielement uielement) {
			this.uielement = uielement;
		}
		public boolean isRefreshed() {
			return refreshed;
		}
		public void setRefreshed(boolean refreshed) {
			this.refreshed = refreshed;
		}
			
		
	}
}
