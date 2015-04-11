package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
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

			Object[] result = (new QueryHelper())
					.findRefreshedAeas((domain.Uielement) property.getModel());

			@SuppressWarnings("unchecked")
			List<domain.NickNamed> allAreas = (List<domain.NickNamed>) result[0];
			@SuppressWarnings("unchecked")
			List<domain.NickNamed> removeAreas = (List<domain.NickNamed>) result[1];

			// Remove
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, property.getModel(),
							DomainPackage.eINSTANCE
									.getUielement_OnEventRefreshArea(),
							removeAreas));

			HashMap<String, domain.NickNamed> map = new HashMap<String, domain.NickNamed>();
			for (Iterator<domain.NickNamed> itr = ((domain.Uielement) (property
					.getModel())).getOnEventRefreshArea().iterator(); itr
					.hasNext();) {
				domain.NickNamed event = itr.next();
				if (event instanceof domain.Uielement) {
					map.put( ((domain.Uielement) event).getUid(), event);
				}
				if (event instanceof domain.ViewPort) {
					map.put( ((domain.ViewPort) event).getUid(), event);
				}
			}

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.NickNamed> i = allAreas.iterator(); i
					.hasNext();) {
				domain.NickNamed p = i.next();
				Area a = new Area();
				a.setElement(p);
				if (p instanceof domain.Uielement) {
					a.setRefreshed(map.containsKey(((domain.Uielement) p)
							.getUid()));
					a.setUid(((domain.Uielement) p).getUid());
				}
				if (p instanceof domain.ViewPort) {
					a.setRefreshed(map.containsKey(((domain.ViewPort) p)
							.getUid()));
					a.setUid(((domain.ViewPort) p).getUid());
				}
				rows.add(a);
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

	public class Area {
		private domain.NickNamed element;
		private boolean refreshed;
		private String uid;

		public domain.NickNamed getElement() {
			return element;
		}

		public void setElement(domain.NickNamed element) {
			this.element = element;
		}

		public boolean isRefreshed() {
			return refreshed;
		}

		public void setRefreshed(boolean refreshed) {
			this.refreshed = refreshed;
		}

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

	}
}
