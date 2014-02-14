package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.metamodel.tura.ui.properties.sections.grid.DataSource;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.ApplicationMapper;
import domain.DomainPackage;

public abstract class AbstractMappersListDS extends DataSource {

	private GridProperty property;

	public AbstractMappersListDS(GridProperty property) {
		this.property = property;
	}

	public abstract List<domain.ApplicationMapper> findRemovedMappers(
			domain.UsingMappers usingMappers);

	public abstract Set<domain.ApplicationMapper> findAvailableMappers(
			domain.UsingMappers usingMappers);

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		Set<ApplicationMapper> set = findAvailableMappers((domain.UsingMappers) property
				.getEObject());
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent()
				.getActiveShell(), set, new ArrayContentProvider(),
				new MappersLabelProvider(), "Select Mappers:");
		dlg.setTitle("Mappers Selection");
		dlg.setInitialElementSelections(((domain.UsingMappers) property
				.getEObject()).getMappers());
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());

			List<domain.ApplicationMapper> addMappers = new ArrayList<domain.ApplicationMapper>();
			for (Iterator<?> itr = result.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = (domain.ApplicationMapper) itr
						.next();
				if (!((domain.UsingMappers) property.getEObject()).getMappers()
						.contains(mapper)) {
					addMappers.add(mapper);
				}
			}

			List<domain.ApplicationMapper> removeMappers = new ArrayList<domain.ApplicationMapper>();
			for (Iterator<?> itr = ((domain.UsingMappers) property.getEObject())
					.getMappers().iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = (domain.ApplicationMapper) itr
						.next();
				if (!result.contains(mapper)) {
					removeMappers.add(mapper);
				}
			}

			EditingDomain editingDomain = ((DiagramEditor) property.getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain,
							((domain.UsingMappers) property.getEObject()),
							DomainPackage.eINSTANCE.getUsingMappers_Mappers(),
							addMappers));

			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,
							((domain.UsingMappers) property.getEObject()),
							DomainPackage.eINSTANCE.getUsingMappers_Mappers(),
							removeMappers));

			rowList.removeAll(removeMappers);
			rowList.addAll(addMappers);

			for (Iterator<domain.ApplicationMapper>itra =  addMappers.iterator();itra.hasNext();){
				notifyAddRow(itra.next());
			}

			for (Iterator<domain.ApplicationMapper>itrr =  removeMappers.iterator();itrr.hasNext();){
				notifyRemoveRow(itrr.next());
			}
			
		}

	}

	@Override
	public void removeRow(Object row) {

	}

	@Override
	public List<Object> queryRows() {
		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		try {

			List<ApplicationMapper> removeMappers = findRemovedMappers((domain.UsingMappers) property
					.getEObject());

			// Remove
			for (Iterator<ApplicationMapper> itr = removeMappers.iterator(); itr
					.hasNext();) {
				ApplicationMapper ms = itr.next();
				editingDomain.getCommandStack().execute(
						RemoveCommand.create(editingDomain,
								((domain.UsingMappers) property.getEObject()),
								DomainPackage.eINSTANCE
										.getUsingMappers_Mappers(), ms));
			}

			ArrayList<Object> rows = new ArrayList<Object>();
			for (Iterator<domain.ApplicationMapper> i = ((domain.UsingMappers) property
					.getEObject()).getMappers().iterator(); i.hasNext();) {
				domain.ApplicationMapper p = i.next();
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

	class MappersLabelProvider extends LabelProvider {
		public String getText(Object element) {
			return element == null ? "" : ((domain.ApplicationMapper) element)
					.getName();
		}

	}

}
