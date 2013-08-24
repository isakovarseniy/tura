package org.metamodel.tura.ui.properties.sections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
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
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class OptionPropertySelection extends AbstractGridPropertySelection {

	// Set the table column property names
	private final String COMPLETED_COLUMN = "completed";
	private final String DESCRIPTION_COLUMN = "description";
	private final String OWNER_COLUMN = "owner";
	private final String PERCENT_COLUMN = "percent";

	private ExampleTaskList taskList = new ExampleTaskList();

	// Set column names
	private String[] columnNames = new String[] { COMPLETED_COLUMN,
			DESCRIPTION_COLUMN, OWNER_COLUMN, PERCENT_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		// The input for the table viewer is the instance of ExampleTaskList
		taskList = new ExampleTaskList();
		tableViewer.setInput(taskList);

	}

	/**
	 * Return the ExampleTaskList
	 */
	public ExampleTaskList getTaskList() {
		return taskList;
	}

	/**
	 * Return the column names in a collection
	 * 
	 * @return List containing column names
	 */
	public java.util.List getColumnNames() {
		return Arrays.asList(columnNames);
	}

	/**
	 * Return the array of choices for a multiple choice cell
	 */
	public String[] getChoices(String property) {
		if (OWNER_COLUMN.equals(property))
			return taskList.getOwners(); // The ExampleTaskList knows about the
											// choice of owners
		else
			return new String[] {};
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

		// 1st column with image/checkboxes - NOTE: The SWT.CENTER has no
		// effect!!
		TableColumn column = new TableColumn(table, SWT.CENTER, 0);
		column.setText("!");
		column.setWidth(20);

		// 2nd column with task Description
		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText("Description");
		column.setWidth(400);
		// Add listener to column so tasks are sorted by description when
		// clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new ExampleTaskSorter(
						ExampleTaskSorter.DESCRIPTION));
			}
		});

		// 3rd column with task Owner
		column = new TableColumn(table, SWT.LEFT, 2);
		column.setText("Owner");
		column.setWidth(100);
		// Add listener to column so tasks are sorted by owner when clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new ExampleTaskSorter(
						ExampleTaskSorter.OWNER));
			}
		});

		// 4th column with task PercentComplete
		column = new TableColumn(table, SWT.CENTER, 3);
		column.setText("% Complete");
		column.setWidth(80);
		// Add listener to column so tasks are sorted by percent when clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new ExampleTaskSorter(
						ExampleTaskSorter.PERCENT_COMPLETE));
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

		// Column 1 : Completed (Checkbox)
		editors[0] = new CheckboxCellEditor(table);

		// Column 2 : Description (Free text)
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[1] = textEditor;

		// Column 3 : Owner (Combo Box)
		editors[2] = new ComboBoxCellEditor(table, taskList.getOwners(),
				SWT.READ_ONLY);

		// Column 4 : Percent complete (Text with digits only)
		textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).addVerifyListener(

		new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				// Here, we could use a RegExp such as the following
				// if using JRE1.4 such as e.doit = e.text.matches("[\\-0-9]*");
				e.doit = "0123456789".indexOf(e.text) >= 0;
			}
		});
		editors[3] = textEditor;

		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new ExampleCellModifier(this));
		// Set the default sorter for the viewer
		tableViewer.setSorter(new ExampleTaskSorter(
				ExampleTaskSorter.DESCRIPTION));
	}

	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new ExampleContentProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new ExampleLabelProvider();
	}

	@Override
	protected void addRow() {
		taskList.addTask();
	}

	@Override
	protected void removeRow(Object o) {
		taskList.removeTask((ExampleTask) o);
	}
	
	
	/**
	 * InnerClass that acts as a proxy for the ExampleTaskList providing content
	 * for the Table. It implements the ITaskListViewer interface since it must
	 * register changeListeners with the ExampleTaskList
	 */
	class ExampleContentProvider implements IStructuredContentProvider,
			ITaskListViewer {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((ExampleTaskList) newInput).addChangeListener(this);
			if (oldInput != null)
				((ExampleTaskList) oldInput).removeChangeListener(this);
		}

		public void dispose() {
			taskList.removeChangeListener(this);
		}

		// Return the tasks as an array of Objects
		public Object[] getElements(Object parent) {
			return taskList.getTasks().toArray();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#addTask(ExampleTask)
		 */
		public void addTask(ExampleTask task) {
			tableViewer.add(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeTask(ExampleTask task) {
			tableViewer.remove(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateTask(ExampleTask task) {
			tableViewer.update(task, null);
		}
	}

	/**
	 * Label provider for the TableViewerExample
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider
	 */
	public class ExampleLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		// Names of images used to represent checkboxes
		public static final String CHECKED_IMAGE = "checked";
		public static final String UNCHECKED_IMAGE = "unchecked";

		// For the checkbox images
		private ImageRegistry imageRegistry = new ImageRegistry();

		public ExampleLabelProvider() {
			String iconPath = "icons/";
			imageRegistry.put(CHECKED_IMAGE, ImageDescriptor.createFromFile(
					AbstractGridPropertySelection.class, iconPath
							+ CHECKED_IMAGE + ".gif"));
			imageRegistry.put(UNCHECKED_IMAGE, ImageDescriptor.createFromFile(
					AbstractGridPropertySelection.class, iconPath
							+ UNCHECKED_IMAGE + ".gif"));
		}

		/**
		 * Returns the image with the given key, or <code>null</code> if not
		 * found.
		 */
		private Image getImage(boolean isSelected) {
			String key = isSelected ? CHECKED_IMAGE : UNCHECKED_IMAGE;
			return imageRegistry.get(key);
		}

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			ExampleTask task = (ExampleTask) element;
			switch (columnIndex) {
			case 0: // COMPLETED_COLUMN
				break;
			case 1:
				result = task.getDescription();
				break;
			case 2:
				result = task.getOwner();
				break;
			case 3:
				result = task.getPercentComplete() + "";
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
			return (columnIndex == 0) ? // COMPLETED_COLUMN?
			getImage(((ExampleTask) element).isCompleted())
					: null;
		}

	}

	public class ExampleTaskSorter extends ViewerSorter {

		/**
		 * Constructor argument values that indicate to sort items by
		 * description, owner or percent complete.
		 */
		public final static int DESCRIPTION = 1;
		public final static int OWNER = 2;
		public final static int PERCENT_COMPLETE = 3;

		// Criteria that the instance uses
		private int criteria;

		/**
		 * Creates a resource sorter that will use the given sort criteria.
		 * 
		 * @param criteria
		 *            the sort criterion to use: one of <code>NAME</code> or
		 *            <code>TYPE</code>
		 */
		public ExampleTaskSorter(int criteria) {
			super();
			this.criteria = criteria;
		}

		/*
		 * (non-Javadoc) Method declared on ViewerSorter.
		 */
		public int compare(Viewer viewer, Object o1, Object o2) {

			ExampleTask task1 = (ExampleTask) o1;
			ExampleTask task2 = (ExampleTask) o2;

			switch (criteria) {
			case DESCRIPTION:
				return compareDescriptions(task1, task2);
			case OWNER:
				return compareOwners(task1, task2);
			case PERCENT_COMPLETE:
				return comparePercentComplete(task1, task2);
			default:
				return 0;
			}
		}

		/**
		 * Returns a number reflecting the collation order of the given tasks
		 * based on the percent completed.
		 * 
		 * @param task1
		 * @param task2
		 * @return a negative number if the first element is less than the
		 *         second element; the value <code>0</code> if the first element
		 *         is equal to the second element; and a positive number if the
		 *         first element is greater than the second element
		 */
		private int comparePercentComplete(ExampleTask task1, ExampleTask task2) {
			int result = task1.getPercentComplete()
					- task2.getPercentComplete();
			result = result < 0 ? -1 : (result > 0) ? 1 : 0;
			return result;
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
		protected int compareDescriptions(ExampleTask task1, ExampleTask task2) {
			return collator.compare(task1.getDescription(),
					task2.getDescription());
		}

		/**
		 * Returns a number reflecting the collation order of the given tasks
		 * based on their owner.
		 * 
		 * @param resource1
		 *            the first resource element to be ordered
		 * @param resource2
		 *            the second resource element to be ordered
		 * @return a negative number if the first element is less than the
		 *         second element; the value <code>0</code> if the first element
		 *         is equal to the second element; and a positive number if the
		 *         first element is greater than the second element
		 */
		protected int compareOwners(ExampleTask task1, ExampleTask task2) {
			return collator.compare(task1.getOwner(), task2.getOwner());
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

	public class ExampleTaskList {

		private final int COUNT = 10;
		private Vector tasks = new Vector(COUNT);
		private Set changeListeners = new HashSet();

		// Combo box choices
		final String[] OWNERS_ARRAY = { "?", "Nancy", "Larry", "Joe" };

		/**
		 * Constructor
		 */
		public ExampleTaskList() {
			super();
			this.initData();
		}

		/*
		 * Initialize the table data. Create COUNT tasks and add them them to
		 * the collection of tasks
		 */
		private void initData() {
			ExampleTask task;
			for (int i = 0; i < COUNT; i++) {
				task = new ExampleTask("Task " + i);
				task.setOwner(OWNERS_ARRAY[i % 3]);
				tasks.add(task);
			}
		};

		/**
		 * Return the array of owners
		 */
		public String[] getOwners() {
			return OWNERS_ARRAY;
		}

		/**
		 * Return the collection of tasks
		 */
		public Vector getTasks() {
			return tasks;
		}

		/**
		 * Add a new task to the collection of tasks
		 */
		public void addTask() {
			ExampleTask task = new ExampleTask("New task");
			tasks.add(tasks.size(), task);
			Iterator iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).addTask(task);
		}

		/**
		 * @param task
		 */
		public void removeTask(ExampleTask task) {
			tasks.remove(task);
			Iterator iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).removeTask(task);
		}

		/**
		 * @param task
		 */
		public void taskChanged(ExampleTask task) {
			Iterator iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).updateTask(task);
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
		public void addTask(ExampleTask task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeTask(ExampleTask task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateTask(ExampleTask task);
	}

	public class ExampleCellModifier implements ICellModifier {
		private OptionPropertySelection tableViewerExample;
		private String[] columnNames;
		
		/**
		 * Constructor 
		 * @param TableViewerExample an instance of a TableViewerExample 
		 */
		public ExampleCellModifier(OptionPropertySelection tableViewerExample) {
			super();
			this.tableViewerExample = tableViewerExample;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
		 */
		public boolean canModify(Object element, String property) {
			return true;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
		 */
		public Object getValue(Object element, String property) {

			// Find the index of the column
			int columnIndex = tableViewerExample.getColumnNames().indexOf(property);

			Object result = null;
			ExampleTask task = (ExampleTask) element;

			switch (columnIndex) {
				case 0 : // COMPLETED_COLUMN 
					result = new Boolean(task.isCompleted());
					break;
				case 1 : // DESCRIPTION_COLUMN 
					result = task.getDescription();
					break;
				case 2 : // OWNER_COLUMN 
					String stringValue = task.getOwner();
					String[] choices = tableViewerExample.getChoices(property);
					int i = choices.length - 1;
					while (!stringValue.equals(choices[i]) && i > 0)
						--i;
					result = new Integer(i);					
					break;
				case 3 : // PERCENT_COLUMN 
					result = task.getPercentComplete() + "";
					break;
				default :
					result = "";
			}
			return result;	
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
		 */
		public void modify(Object element, String property, Object value) {	

			// Find the index of the column 
			int columnIndex	= tableViewerExample.getColumnNames().indexOf(property);
				
			TableItem item = (TableItem) element;
			ExampleTask task = (ExampleTask) item.getData();
			String valueString;

			switch (columnIndex) {
				case 0 : // COMPLETED_COLUMN 
				    task.setCompleted(((Boolean) value).booleanValue());
					break;
				case 1 : // DESCRIPTION_COLUMN 
					valueString = ((String) value).trim();
					task.setDescription(valueString);
					break;
				case 2 : // OWNER_COLUMN 
					valueString = tableViewerExample.getChoices(property)[((Integer) value).intValue()].trim();
					if (!task.getOwner().equals(valueString)) {
						task.setOwner(valueString);
					}
					break;
				case 3 : // PERCENT_COLUMN
					valueString = ((String) value).trim();
					if (valueString.length() == 0)
						valueString = "0";
					task.setPercentComplete(Integer.parseInt(valueString));
					break;
				default :
				}
			tableViewerExample.getTaskList().taskChanged(task);
		}
	}

	public class ExampleTask {

		private boolean completed 	= false;
		private String description 	= "";
		private String owner 		= "?";
		private int percentComplete = 0;  

		/**
		 * Create a task with an initial description
		 * 
		 * @param string
		 */
		public ExampleTask(String string) {
			
			super();
			setDescription(string);
		}

		/**
		 * @return true if completed, false otherwise
		 */
		public boolean isCompleted() {
			return completed;
		}

		/**
		 * @return String task description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @return String task owner
		 */
		public String getOwner() {
			return owner;
		}

		/**
		 * @return int percent completed
		 * 
		 */
		public int getPercentComplete() {
			return percentComplete;
		}

		/**
		 * Set the 'completed' property
		 * 
		 * @param b
		 */
		public void setCompleted(boolean b) {
			completed = b;
		}

		/**
		 * Set the 'description' property
		 * 
		 * @param string
		 */
		public void setDescription(String string) {
			description = string;
		}

		/**
		 * Set the 'owner' property
		 * 
		 * @param string
		 */
		public void setOwner(String string) {
			owner = string;
		}

		/**
		 * Set the 'percentComplete' property
		 * 
		 * @param i
		 */
		public void setPercentComplete(int i) {
			percentComplete = i;
		}

	}

	
	

}
