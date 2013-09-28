package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import domain.DomainPackage;

public class MappersListPropertySelection extends AbstractGridPropertySelection {

	// Set the table column property names
	private final String MAPPERS_COLUMN = "Mappers";

	private MappersList optionList;

	// Set column names
	private String[] columnNames = new String[] { MAPPERS_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

	}

	public void refresh() {
		optionList = new MappersList();
		tableViewer.setInput(optionList);
	}

	/**
	 * Return the OptionList
	 */
	public MappersList getTaskList() {
		return optionList;
	}

	/**
	 * Return the column names in a collection
	 * 
	 * @return List containing column names
	 */
	public List<String> getColumnNames() {
		return Arrays.asList(columnNames);
	}

	/**
	 * Add the "Add", "Delete" and "Close" buttons
	 * 
	 * @param parent
	 *            the parent composite
	 */
	protected void createButtons(Composite parent) {

		// Create and configure the "Add" button
		Button add = new Button(parent, SWT.PUSH | SWT.CENTER);
		add.setText("Add");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);
		add.addSelectionListener(new SelectionAdapter() {

			// Add a task to the ExampleTaskList and refresh the view
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});
	}

	/**
	 * Create the Table
	 */
	protected void createTable(Composite parent) {
		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		table = new Table(parent, style);

		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		// 0 nd column with task Option
		TableColumn column = new TableColumn(table, SWT.LEFT, 0);
		column.setText(MAPPERS_COLUMN);
		column.setWidth(400);
		// Add listener to column so tasks are sorted by description when
		// clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new MappersSorter(
						MappersSorter.MAPPERS_COLUMN));
			}
		});

	}

	/**
	 * Create the TableViewer
	 */
	protected void createTableViewer() {

		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);

		tableViewer.setColumnProperties(columnNames);

		// Create the cell editors
		CellEditor[] editors = new CellEditor[columnNames.length];

		// Column 0 : Options (Free text)
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[0] = textEditor;

		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new VariableCellModifier(this));
		// Set the default sorter for the viewer
		tableViewer.setSorter(new MappersSorter(MappersSorter.MAPPERS_COLUMN));
	}

	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new MappersContentProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new MappersLabelProvider();
	}

	@Override
	protected void addRow() {
		optionList.addTask();
	}

	@Override
	protected void removeRow(Object o) {
		optionList.removeTask((domain.MappingVariable) o);
	}

	/**
	 * InnerClass that acts as a proxy for the OptionList providing content for
	 * the Table. It implements the ITaskListViewer interface since it must
	 * register changeListeners with the OptionList
	 */
	class MappersContentProvider implements IStructuredContentProvider,
			ITaskListViewer {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((MappersList) newInput).addChangeListener(this);
			if (oldInput != null)
				((MappersList) oldInput).removeChangeListener(this);
		}

		public void dispose() {
			optionList.removeChangeListener(this);
		}

		// Return the tasks as an array of Objects
		public Object[] getElements(Object parent) {
			return optionList.getOptions().toArray();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#addTask(ExampleTask)
		 */
		public void addOption(List<String> task) {
			tableViewer.add(task.toArray(new String[task.size()]));
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeOption(List<String> task) {
			tableViewer.remove(task.toArray(new String[task.size()]));
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateOption(domain.MappingVariable task) {
			tableViewer.update(task, null);
		}
	}

	/**
	 * Label provider for the TableViewerExample
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider
	 */
	public class MappersLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			String task = (String) element;
			switch (columnIndex) {
			case 0:
				result = task;
				break;
			default:
				break;
			}

			return result;
		}

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
		 *      int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

	}

	public class MappersSorter extends ViewerSorter {

		/**
		 * Constructor argument values that indicate to sort items by
		 * description, owner or percent complete.
		 */
		public final static int MAPPERS_COLUMN = 0;

		// Criteria that the instance uses
		private int criteria;

		/**
		 * Creates a resource sorter that will use the given sort criteria.
		 * 
		 * @param criteria
		 *            the sort criterion to use: one of <code>NAME</code> or
		 *            <code>TYPE</code>
		 */
		public MappersSorter(int criteria) {
			super();
			this.criteria = criteria;
		}

		/*
		 * (non-Javadoc) Method declared on ViewerSorter.
		 */
		public int compare(Viewer viewer, Object o1, Object o2) {

			String op1 = (String) o1;
			String op2 = (String) o2;

			switch (criteria) {
			case MAPPERS_COLUMN:
				return compareOptions(op1, op2);
			default:
				return 0;
			}
		}

		/**
		 * Returns a number reflecting the collation order of the given tasks
		 * based on the description.
		 * 
		 * @param task1
		 *            the first task element to be ordered
		 * @param resource2
		 *            the second task element to be ordered
		 * @return a negative number if the first element is less than the
		 *         second element; the value <code>0</code> if the first element
		 *         is equal to the second element; and a positive number if the
		 *         first element is greater than the second element
		 */

		@SuppressWarnings("deprecation")
		protected int compareOptions(String opt1, String opt2) {
			if ((opt1 == null) || (opt2 == null))
				return -1;
			return collator.compare(opt1, opt2);
		}

		/**
		 * Returns the sort criteria of this this sorter.
		 * 
		 * @return the sort criterion
		 */
		public int getCriteria() {
			return criteria;
		}
	}

	public class MappersList {

		private ArrayList<String> options = new ArrayList<String>();
		@SuppressWarnings("rawtypes")
		private Set changeListeners = new HashSet();
		private String[] spOptions;

		/**
		 * Constructor
		 */
		public MappersList() {
			super();
			this.initData();
		}

		public String[] getMapperOptions() {
			return spOptions;
		}

		private void initData() {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			try {

				List<String> removeMappers = (new QueryHelper())
						.findMappers((domain.Recipe) eObject);

				// Remove
				for (Iterator<String> itr = removeMappers.iterator(); itr
						.hasNext();) {
					String ms = itr.next();
					editingDomain.getCommandStack().execute(
							RemoveCommand
									.create(editingDomain,
											((domain.Recipe) eObject),
											DomainPackage.eINSTANCE
													.getRecipe_Mappers(), ms));
				}

				for (Iterator<String> i = ((domain.Recipe) eObject)
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
			Set<String> set = mappersList((domain.Recipe) eObject);
			ListSelectionDialog dlg = new ListSelectionDialog(Display
					.getCurrent().getActiveShell(), set,
					new ArrayContentProvider(), new LabelProvider(),
					"Select Mappers:");
			dlg.setTitle("Mappers Selection");
			dlg.setInitialElementSelections(((domain.Recipe) eObject).getMappers());
			List<Object> result = new ArrayList<>();
			if (dlg.open() == Window.OK) {
				result = Arrays.asList(dlg.getResult());
			}

			List<String> addMappers = new ArrayList<String>();
			for (Iterator<?> itr = result.iterator(); itr.hasNext();) {
				String mapper = (String) itr.next();
				if (!((domain.Recipe) eObject).getMappers().contains(mapper)) {
					addMappers.add(mapper);
				}
			}

			List<String> removeMappers = new ArrayList<String>();
			for (Iterator<?> itr = ((domain.Recipe) eObject).getMappers()
					.iterator(); itr.hasNext();) {
				String mapper = (String) itr.next();
				if (!result.contains(mapper)) {
					removeMappers.add(mapper);
				}
			}

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain, ((domain.Recipe) eObject),
							DomainPackage.eINSTANCE.getRecipe_Mappers(),
							addMappers));

			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,
							((domain.Recipe) eObject),
							DomainPackage.eINSTANCE.getRecipe_Mappers(),
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

		public Set<String> mappersList(domain.Recipe recipe) {

			HashSet<String> mappers = new HashSet<String>();
			try {

				List<domain.ApplicationMapper> appMapperLst = recipe
						.getParent().getParent().getParent().getParent()
						.getApplicationMappers().getMappers();

				for (Iterator<domain.ApplicationMapper> itr = appMapperLst
						.iterator(); itr.hasNext();) {
					domain.ApplicationMapper mapper = itr.next();
					mappers.add(mapper.getName());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			return mappers;
		}

		/**
		 * @param task
		 */
		public void removeTask(domain.MappingVariable option) {

			// ArrayList<domain.MappingVariable> ls = new
			// ArrayList<domain.MappingVariable>();
			// ls.add(option);
			//
			// EditingDomain editingDomain = ((DiagramEditor) getPart())
			// .getEditingDomain();
			//
			// editingDomain.getCommandStack().execute(
			// RemoveCommand.create(editingDomain,
			// ((domain.Variable) eObject),
			// DomainPackage.eINSTANCE.getModelMapper_Variables(),
			// ls));
			//
			// options.remove(option);
			// Iterator<?> iterator = changeListeners.iterator();
			// while (iterator.hasNext())
			// ((ITaskListViewer) iterator.next()).removeOption(option);
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

	public interface ITaskListViewer {

		/**
		 * Update the view to reflect the fact that a task was added to the task
		 * list
		 * 
		 * @param task
		 */
		public void addOption(List<String> task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeOption(List<String> task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateOption(domain.MappingVariable task);
	}

	public class VariableCellModifier implements ICellModifier {
		private MappersListPropertySelection tableViewerExample;

		/**
		 * Constructor
		 * 
		 * @param TableViewerExample
		 *            an instance of a TableViewerExample
		 */
		public VariableCellModifier(
				MappersListPropertySelection tableViewerExample) {
			super();
			this.tableViewerExample = tableViewerExample;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object,
		 *      java.lang.String)
		 */
		public boolean canModify(Object element, String property) {
			int columnIndex = tableViewerExample.getColumnNames().indexOf(
					property);
			if (columnIndex == 0)
				return false;
			return true;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object,
		 *      java.lang.String)
		 */
		public Object getValue(Object element, String property) {

			// Find the index of the column
			int columnIndex = tableViewerExample.getColumnNames().indexOf(
					property);

			Object result = null;
			domain.MappingVariable opt = (domain.MappingVariable) element;

			switch (columnIndex) {
			case 0: // VALUE_COLUMN
				result = opt.getName();
				break;
			default:
				result = "";
			}
			return result;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object,
		 *      java.lang.String, java.lang.Object)
		 */
		public void modify(Object element, String property, Object value) {
			// Find the index of the column
			int columnIndex = tableViewerExample.getColumnNames().indexOf(
					property);

			TableItem item = (TableItem) element;
			domain.MappingVariable opt = (domain.MappingVariable) item
					.getData();

			switch (columnIndex) {
			case 0: // VALUE_COLUMN
				String valueString = ((String) value).trim();
				EditingDomain editingDomain = ((DiagramEditor) getPart())
						.getEditingDomain();
				/* apply the property change to single selected object */
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, opt,
								DomainPackage.eINSTANCE
										.getMappingVariable_Value(),
								valueString));
				break;
			default:
			}
			tableViewerExample.getTaskList().taskChanged(opt);
		}
	}
}