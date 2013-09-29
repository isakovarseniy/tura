package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import org.metamodel.tura.ui.properties.sections.MappersListPropertySelection.ITaskListViewer;

import domain.DomainPackage;

public abstract class AbstractMappersList {

	private ArrayList<String> options = new ArrayList<String>();
	@SuppressWarnings("rawtypes")
	private Set changeListeners = new HashSet();
	private String[] spOptions;
	private MappersListPropertySelection mappersListPropertySelection;

	/**
	 * Constructor
	 */
	public AbstractMappersList(
			MappersListPropertySelection mappersListPropertySelection) {
		super();
		this.mappersListPropertySelection = mappersListPropertySelection;
		this.initData();
	}

	public String[] getMapperOptions() {
		return spOptions;
	}

	public abstract List<String> findRemovedMappers(
			domain.UsingMappers usingMappers);

	public abstract Set<String> findAvailableMappers(
			domain.UsingMappers usingMappers);

	private void initData() {

		EditingDomain editingDomain = ((DiagramEditor) mappersListPropertySelection
				.getPart()).getEditingDomain();

		try {

			List<String> removeMappers = findRemovedMappers((domain.UsingMappers) mappersListPropertySelection.eObject);

			// Remove
			for (Iterator<String> itr = removeMappers.iterator(); itr.hasNext();) {
				String ms = itr.next();
				editingDomain
						.getCommandStack()
						.execute(
								RemoveCommand
										.create(editingDomain,
												((domain.UsingMappers) mappersListPropertySelection.eObject),
												DomainPackage.eINSTANCE
														.getUsingMappers_Mappers(),
												ms));
			}

			for (Iterator<String> i = ((domain.UsingMappers) mappersListPropertySelection.eObject)
					.getMappers().iterator(); i.hasNext();) {
				String p = i.next();
				options.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Return the collection of tasks
	 */
	public List<?> getOptions() {
		return options;
	}

	/**
	 * Add a new task to the collection of tasks
	 */
	public void addTask() {
		Set<String> set = findAvailableMappers((domain.UsingMappers) mappersListPropertySelection.eObject);
		ListSelectionDialog dlg = new ListSelectionDialog(Display.getCurrent()
				.getActiveShell(), set, new ArrayContentProvider(),
				new LabelProvider(), "Select Mappers:");
		dlg.setTitle("Mappers Selection");
		dlg.setInitialElementSelections(((domain.UsingMappers) mappersListPropertySelection.eObject)
				.getMappers());
		List<Object> result = new ArrayList<>();
		if (dlg.open() == Window.OK) {
			result = Arrays.asList(dlg.getResult());
		}

		List<String> addMappers = new ArrayList<String>();
		for (Iterator<?> itr = result.iterator(); itr.hasNext();) {
			String mapper = (String) itr.next();
			if (!((domain.UsingMappers) mappersListPropertySelection.eObject)
					.getMappers().contains(mapper)) {
				addMappers.add(mapper);
			}
		}

		List<String> removeMappers = new ArrayList<String>();
		for (Iterator<?> itr = ((domain.UsingMappers) mappersListPropertySelection.eObject)
				.getMappers().iterator(); itr.hasNext();) {
			String mapper = (String) itr.next();
			if (!result.contains(mapper)) {
				removeMappers.add(mapper);
			}
		}

		EditingDomain editingDomain = ((DiagramEditor) mappersListPropertySelection
				.getPart()).getEditingDomain();

		editingDomain
				.getCommandStack()
				.execute(
						AddCommand
								.create(editingDomain,
										((domain.UsingMappers) mappersListPropertySelection.eObject),
										DomainPackage.eINSTANCE
												.getUsingMappers_Mappers(),
										addMappers));

		editingDomain
				.getCommandStack()
				.execute(
						RemoveCommand
								.create(editingDomain,
										((domain.UsingMappers) mappersListPropertySelection.eObject),
										DomainPackage.eINSTANCE
												.getUsingMappers_Mappers(),
										removeMappers));

		options.removeAll(removeMappers);
		options.addAll(addMappers);

		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ITaskListViewer) iterator.next()).addOption(addMappers);

		iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ITaskListViewer) iterator.next()).removeOption(removeMappers);

	}

	/**
	 * @param task
	 */
	public void removeTask(Object option) {

	}

	/**
	 * @param task
	 */
	public void taskChanged(domain.MappingVariable task) {
		Iterator<?> iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((ITaskListViewer) iterator.next()).updateOption(task);
	}

	/**
	 * @param viewer
	 */
	public void removeChangeListener(ITaskListViewer viewer) {
		changeListeners.remove(viewer);
	}

	/**
	 * @param viewer
	 */
	@SuppressWarnings("unchecked")
	public void addChangeListener(ITaskListViewer viewer) {
		changeListeners.add(viewer);
	}

}
