package org.metamodel.tura.ui.properties.sections;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


public abstract class AbstractMappersListPropertySelection extends AbstractGridPropertySelection {

	// Set the table column property names
	private final String MAPPERS_COLUMN = "Mappers";

	protected AbstractMappersList optionList;

	// Set column names
	private String[] columnNames = new String[] { MAPPERS_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

	}

	public abstract void refresh() ;
	/**
	 * Return the OptionList
	 */
	public AbstractMappersList getTaskList() {
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
		optionList.removeTask((domain.ApplicationMapper) o);
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
				((AbstractMappersList) newInput).addChangeListener(this);
			if (oldInput != null)
				((AbstractMappersList) oldInput).removeChangeListener(this);
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
		public void addOption(List<domain.ApplicationMapper> task) {
			tableViewer.add(task.toArray(new domain.ApplicationMapper[task.size()]));
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeOption(List<domain.ApplicationMapper> task) {
			tableViewer.remove(task.toArray(new domain.ApplicationMapper[task.size()]));
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateOption(domain.ApplicationMapper task) {
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
			String task =( (domain.ApplicationMapper) element).getName();
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

			domain.ApplicationMapper op1 = (domain.ApplicationMapper) o1;
			domain.ApplicationMapper op2 = (domain.ApplicationMapper) o2;

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
		protected int compareOptions(domain.ApplicationMapper opt1, domain.ApplicationMapper opt2) {
			if ((opt1 == null) || (opt2 == null))
				return -1;
			return collator.compare(opt1.getName(), opt2.getName());
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


	public interface ITaskListViewer {

		/**
		 * Update the view to reflect the fact that a task was added to the task
		 * list
		 * 
		 * @param task
		 */
		public void addOption(List<domain.ApplicationMapper> task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeOption(List<domain.ApplicationMapper> task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateOption(domain.ApplicationMapper task);
	}


}