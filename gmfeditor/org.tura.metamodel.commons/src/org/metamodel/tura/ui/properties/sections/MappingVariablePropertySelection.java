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
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.IStructuredContentProvider;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import domain.DomainFactory;
import domain.DomainPackage;

public class MappingVariablePropertySelection extends
		AbstractGridPropertySelection {

	// Set the table column property names
	private final String OPTION_COLUMN = "Option";
	private final String VALUE_COLUMN = "Value";

	private VariableList optionList;

	// Set column names
	private String[] columnNames = new String[] { OPTION_COLUMN, VALUE_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

	}

	public void refresh() {
		// The input for the table viewer is the instance of OptionList
		optionList = new VariableList();
		tableViewer.setInput(optionList);
	}

	/**
	 * Return the OptionList
	 */
	public VariableList getTaskList() {
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
		column.setText(OPTION_COLUMN);
		column.setWidth(400);
		// Add listener to column so tasks are sorted by description when
		// clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new VariableSorter(
						VariableSorter.OPTION));
			}
		});

		// 1 nd column with task Option
		column = new TableColumn(table, SWT.LEFT, 1);
		column.setText(VALUE_COLUMN);
		column.setWidth(100);
		// Add listener to column so tasks are sorted by description when
		// clicked
		column.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				tableViewer.setSorter(new VariableSorter(
						VariableSorter.OPTION));
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

		// Column 1 : value (Free text)
		textEditor = new TextCellEditor(table);
		((Text) textEditor.getControl()).setTextLimit(100);
		editors[1] = textEditor;

		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new VariableCellModifier(this));
		// Set the default sorter for the viewer
		tableViewer.setSorter(new VariableSorter(VariableSorter.VALUE));
	}

	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new VariableContentProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new VariableLabelProvider();
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
	class VariableContentProvider implements IStructuredContentProvider,
			ITaskListViewer {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((VariableList) newInput).addChangeListener(this);
			if (oldInput != null)
				((VariableList) oldInput).removeChangeListener(this);
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
		public void addOption(domain.MappingVariable task) {
			tableViewer.add(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeOption(domain.MappingVariable task) {
			tableViewer.remove(task);
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
	public class VariableLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			domain.MappingVariable task = (domain.MappingVariable) element;
			switch (columnIndex) {
			case 0:
				result = task.getName();
				break;
			case 1:
				result = task.getValue();
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

	public class VariableSorter extends ViewerSorter {

		/**
		 * Constructor argument values that indicate to sort items by
		 * description, owner or percent complete.
		 */
		public final static int OPTION = 0;
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
		public VariableSorter(int criteria) {
			super();
			this.criteria = criteria;
		}

		/*
		 * (non-Javadoc) Method declared on ViewerSorter.
		 */
		public int compare(Viewer viewer, Object o1, Object o2) {

			domain.MappingVariable op1 = (domain.MappingVariable) o1;
			domain.MappingVariable op2 = (domain.MappingVariable) o2;

			switch (criteria) {
			case OPTION:
				return compareOptions(op1, op2);
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
		protected int compareOptions(domain.MappingVariable opt1,
				domain.MappingVariable opt2) {
			return collator.compare(opt1.getName(), opt2.getName());
		}

		@SuppressWarnings("deprecation")
		protected int compareValues(domain.MappingVariable opt1,
				domain.MappingVariable opt2) {
			if ((opt1.getValue() == null) || (opt2.getValue() == null))
				return -1;
			return collator.compare(opt1.getValue(), opt2.getValue());
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

	public class VariableList {

		private ArrayList<domain.MappingVariable> options = new ArrayList<domain.MappingVariable>();
		@SuppressWarnings("rawtypes")
		private Set changeListeners = new HashSet();
		private String[] spOptions;

		/**
		 * Constructor
		 */
		public VariableList() {
			super();
			this.initData();
		}

		public String[] getVariableOptions() {
			return spOptions;
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		private void initData() {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			ShapeImpl diagram = (ShapeImpl) editPart.getModel();
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Domain"));

				EObject types = (EObject) diagram.getElement();

				Collection<domain.MappingVariable> map = ((domain.ModelMapper) eObject)
						.getVariables();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
								+ ((domain.ModelMapper) eObject)
										.getDomainArtifact()
								+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
								+ ((domain.ModelMapper) eObject)
										.getArtifactName()
								+ "').oclAsType(domain::Artifact).modelQuery");

				Collection<domain.Variable> map1 = (Collection<domain.Variable>) ocl
						.evaluate(types, query);

				ArrayList<domain.MappingVariable> removeVariables = new ArrayList<domain.MappingVariable>();
				for (Iterator<domain.MappingVariable> itr1 = map.iterator(); itr1
						.hasNext();) {
					domain.MappingVariable ms = itr1.next();
					boolean isRemove = true;
					for (Iterator<domain.Variable> itr2 = map1.iterator(); itr2
							.hasNext();) {
						domain.Variable sp = itr2.next();
						if (sp.getName().equals(ms.getName()))
							isRemove = false;
					}
					if (isRemove)
						removeVariables.add(ms);
				}

				ArrayList<domain.Variable> addVariables = new ArrayList<domain.Variable>();
				for (Iterator<domain.Variable> itr1 = map1.iterator(); itr1
						.hasNext();) {
					domain.Variable ms = itr1.next();
					boolean isAdd = false;
					if (map.size() == 0)
						isAdd = true;
					else {
						isAdd = true;
						for (Iterator<domain.MappingVariable> itr2 = map
								.iterator(); itr2.hasNext();) {
							domain.MappingVariable sp = itr2.next();
							if (sp.getName().equals(ms.getName()))
								isAdd = false;
						}
					}
					if (isAdd)
						addVariables.add(ms);
				}

				// Add new
				for (Iterator<domain.Variable> itr = addVariables.iterator(); itr
						.hasNext();) {
					domain.Variable Variable = itr.next();
					domain.MappingVariable ms = DomainFactory.eINSTANCE
							.createMappingVariable();
					ms.setName(Variable.getName());
					editingDomain.getCommandStack().execute(
							AddCommand.create(editingDomain,
									((domain.ModelMapper) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Variables(), ms));
				}

				// Remove
				for (Iterator<domain.MappingVariable> itr = removeVariables
						.iterator(); itr.hasNext();) {
					domain.MappingVariable ms = itr.next();
					editingDomain.getCommandStack().execute(
							RemoveCommand.create(editingDomain,
									((domain.ModelMapper) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Variables(), ms));
				}

				for (Iterator<domain.MappingVariable> i = ((domain.ModelMapper) eObject)
						.getVariables().iterator(); i.hasNext();) {
					domain.MappingVariable p = i.next();
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
			domain.MappingVariable option = DomainFactory.eINSTANCE
					.createMappingVariable();
			option.setValue("New option");
			ArrayList<domain.MappingVariable> ls = new ArrayList<domain.MappingVariable>();
			ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							AddCommand.create(editingDomain,
									((domain.Variable) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Variables(), ls));

			options.add(options.size(), option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).addOption(option);
		}

		/**
		 * @param task
		 */
		public void removeTask(domain.MappingVariable option) {

			ArrayList<domain.MappingVariable> ls = new ArrayList<domain.MappingVariable>();
			ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							RemoveCommand.create(editingDomain,
									((domain.Variable) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Variables(), ls));

			options.remove(option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).removeOption(option);
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
		public void addOption(domain.MappingVariable task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeOption(domain.MappingVariable task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateOption(domain.MappingVariable task);
	}

	public class VariableCellModifier implements ICellModifier {
		private MappingVariablePropertySelection tableViewerExample;

		/**
		 * Constructor
		 * 
		 * @param TableViewerExample
		 *            an instance of a TableViewerExample
		 */
		public VariableCellModifier(
				MappingVariablePropertySelection tableViewerExample) {
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
			case 1: // VALUE_COLUMN
				result = opt.getValue();
				if (result == null)
					result ="";
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
			case 1: // VALUE_COLUMN
				String valueString = ((String) value).trim();
				EditingDomain editingDomain = ((DiagramEditor) getPart())
						.getEditingDomain();
				/* apply the property change to single selected object */
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, opt,
								DomainPackage.eINSTANCE.getMappingVariable_Value(),
								valueString));
				break;
			default:
			}
			tableViewerExample.getTaskList().taskChanged(opt);
		}
	}
}