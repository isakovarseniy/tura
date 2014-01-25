package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import domain.DomainFactory;
import domain.DomainPackage;

public class QueryParameterPropertySelection extends AbstractGridPropertySelection {

	// Set the table column property names
	private final String OPTION_COLUMN = "Parameter";

	private OptionList optionList;

	// Set column names
	private String[] columnNames = new String[] { OPTION_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

	}

	public void refresh() {
		// The input for the table viewer is the instance of OptionList
		optionList = new OptionList();
		tableViewer.setInput(optionList);
	}

	/**
	 * Return the OptionList
	 */
	public OptionList getTaskList() {
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

		// Create and configure the "Delete" button
		Button delete = new Button(parent, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		delete.setLayoutData(gridData);

		delete.addSelectionListener(new SelectionAdapter() {

			// Remove the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				Object row = ((IStructuredSelection) tableViewer
						.getSelection()).getFirstElement();
				if (row != null) {
					removeRow(row);
				}
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

		// 1nd column with task Option
		TableColumn column = new TableColumn(table, SWT.LEFT, 0);
		column.setText(OPTION_COLUMN);
		column.setWidth(400);
		// Add listener to column so tasks are sorted by description when
		// clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new OptionSorter(OptionSorter.VALUE));
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

		// Column 1 : Options (Free text)
		TextCellEditor textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(60);
		editors[0] = textEditor;

		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new QueryParameterCellModifier(this));
		// Set the default sorter for the viewer
		tableViewer.setSorter(new OptionSorter(OptionSorter.VALUE));
	}

	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new OptionContentProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new OptionLabelProvider();
	}

	@Override
	protected void addRow() {
		optionList.addTask();
	}

	@Override
	protected void removeRow(Object o) {
		optionList.removeTask((domain.QueryParameter) o);
	}

	/**
	 * InnerClass that acts as a proxy for the OptionList providing content for
	 * the Table. It implements the ITaskListViewer interface since it must
	 * register changeListeners with the OptionList
	 */
	class OptionContentProvider implements IStructuredContentProvider,
			ITaskListViewer {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((OptionList) newInput).addChangeListener(this);
			if (oldInput != null)
				((OptionList) oldInput).removeChangeListener(this);
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
		public void addOption(domain.QueryParameter task) {
			tableViewer.add(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeOption(domain.QueryParameter task) {
			tableViewer.remove(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateOption(domain.QueryParameter task) {
			tableViewer.update(task, null);
		}
	}

	/**
	 * Label provider for the TableViewerExample
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider
	 */
	public class OptionLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			domain.QueryParameter task = (domain.QueryParameter) element;
			switch (columnIndex) {
			case 0:
				result = task.getName();
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

	public class OptionSorter extends ViewerSorter {

		/**
		 * Constructor argument values that indicate to sort items by
		 * description, owner or percent complete.
		 */
		public final static int VALUE = 1;

		// Criteria that the instance uses
		private int criteria;

		/**
		 * Creates a resource sorter that will use the given sort criteria.
		 * 
		 * @param criteria
		 *            the sort criterion to use: one of <code>NAME</code> or
		 *            <code>TYPE</code>
		 */
		public OptionSorter(int criteria) {
			super();
			this.criteria = criteria;
		}

		/*
		 * (non-Javadoc) Method declared on ViewerSorter.
		 */
		public int compare(Viewer viewer, Object o1, Object o2) {

			domain.QueryParameter op1 = (domain.QueryParameter) o1;
			domain.QueryParameter op2 = (domain.QueryParameter) o2;

			switch (criteria) {
			case VALUE:
				return compareValues(op1, op2);
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
		protected int compareValues(domain.QueryParameter opt1, domain.QueryParameter opt2) {
			
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

	public class OptionList {

		private ArrayList<domain.QueryParameter> options = new ArrayList<domain.QueryParameter>();
		@SuppressWarnings("rawtypes")
		private Set changeListeners = new HashSet();

		/**
		 * Constructor
		 */
		public OptionList() {
			super();
			this.initData();
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		private void initData() {
			NodeImpl diagram = (NodeImpl) editPart.getModel();
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Domain"));

				domain.DomainArtifact domainArtifact =   ((domain.ModelQuery) eObject).getParent().getParent().getParent();
				domain.Artifact artifact =   ((domain.ModelQuery) eObject).getParent();
						
				EObject types = (EObject) diagram.getElement();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid ='"
								+domainArtifact.getUid()+
								"').oclAsType(domain::DomainArtifact).artifact.artifacts-> select(r|r.oclAsType(domain::Artifact).uid ='"
								+artifact.getUid()
								+"').oclAsType(domain::Artifact).modelQuery->select(r|r.oclAsType(domain::ModelQuery).uid ='" 
								+ ((domain.ModelQuery) eObject).getUid()
								+ "').oclAsType(domain::ModelQuery).parameters");

				Collection<domain.QueryParameter> map = (Collection<domain.QueryParameter>) ocl
						.evaluate(types, query);

				for (Iterator<domain.QueryParameter> i = map.iterator(); i.hasNext();) {
					domain.QueryParameter p = i.next();
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
			domain.QueryParameter option = DomainFactory.eINSTANCE.createQueryParameter();
			option.setName("New option");
			 ArrayList <domain.QueryParameter> ls = new ArrayList <domain.QueryParameter>();
			 ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain,((domain.ModelQuery) eObject),
							DomainPackage.eINSTANCE.getModelQuery_Parameters(),
							ls));
			
			options.add(options.size(), option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).addOption(option);
		}

		/**
		 * @param task
		 */
		public void removeTask(domain.QueryParameter option) {
			
			 ArrayList <domain.QueryParameter> ls = new ArrayList <domain.QueryParameter>();
			 ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,((domain.ModelQuery) eObject),
							DomainPackage.eINSTANCE.getModelQuery_Parameters(),
							ls));
			
			options.remove(option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).removeOption(option);
		}

		/**
		 * @param task
		 */
		public void taskChanged(domain.QueryParameter task) {
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
		public void addOption(domain.QueryParameter task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeOption(domain.QueryParameter task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateOption(domain.QueryParameter task);
	}

	public class QueryParameterCellModifier implements ICellModifier {
		private QueryParameterPropertySelection tableViewerExample;

		/**
		 * Constructor
		 * 
		 * @param TableViewerExample
		 *            an instance of a TableViewerExample
		 */
		public QueryParameterCellModifier(QueryParameterPropertySelection tableViewerExample) {
			super();
			this.tableViewerExample = tableViewerExample;
		}

		/**
		 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object,
		 *      java.lang.String)
		 */
		public boolean canModify(Object element, String property) {
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
			domain.QueryParameter opt = (domain.QueryParameter) element;

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
			domain.QueryParameter opt = (domain.QueryParameter) item.getData();
			String valueString;

			switch (columnIndex) {
			case 0: // OPTION_COLUMN
				valueString = ((String) value).trim();
				EditingDomain editingDomain = ((DiagramEditor) getPart())
						.getEditingDomain();
				/* apply the property change to single selected object */
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, opt,
								DomainPackage.eINSTANCE.getQueryParameter_Name(),
								valueString));
				break;
			default:
			}
			tableViewerExample.getTaskList().taskChanged(opt);
		}
	}

}