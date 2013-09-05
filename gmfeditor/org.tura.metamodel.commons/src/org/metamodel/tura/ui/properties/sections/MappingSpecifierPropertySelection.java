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
import org.eclipse.jface.viewers.ComboBoxCellEditor;
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

public class MappingSpecifierPropertySelection extends
		AbstractGridPropertySelection {

	// Set the table column property names
	private final String OPTION_COLUMN = "Option";
	private final String VALUE_COLUMN = "Value";

	private SpecifierList optionList;

	// Set column names
	private String[] columnNames = new String[] { OPTION_COLUMN, VALUE_COLUMN };

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

	}

	public void refresh() {
		// The input for the table viewer is the instance of OptionList
		optionList = new SpecifierList();
		tableViewer.setInput(optionList);

	}

	/**
	 * Return the OptionList
	 */
	public SpecifierList getTaskList() {
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
				tableViewer.setSorter(new SpecifierSorter(
						SpecifierSorter.OPTION));
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
				tableViewer.setSorter(new SpecifierSorter(
						SpecifierSorter.OPTION));
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
		editors[1] = new ComboBoxCellEditor(table, new String[] {},
				SWT.READ_ONLY);

		// Assign the cell editors to the viewer
		tableViewer.setCellEditors(editors);
		// Set the cell modifier for the viewer
		tableViewer.setCellModifier(new SpecifierCellModifier(this));
		// Set the default sorter for the viewer
		tableViewer.setSorter(new SpecifierSorter(SpecifierSorter.VALUE));
	}

	@Override
	protected IStructuredContentProvider getContentProvider() {
		return new SpecifierContentProvider();
	}

	@Override
	protected ITableLabelProvider getLabelProvider() {
		return new SpecifierLabelProvider();
	}

	@Override
	protected void addRow() {
		optionList.addTask();
	}

	@Override
	protected void removeRow(Object o) {
		optionList.removeTask((domain.MappingSpecifier) o);
	}

	/**
	 * InnerClass that acts as a proxy for the OptionList providing content for
	 * the Table. It implements the ITaskListViewer interface since it must
	 * register changeListeners with the OptionList
	 */
	class SpecifierContentProvider implements IStructuredContentProvider,
			ITaskListViewer {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((SpecifierList) newInput).addChangeListener(this);
			if (oldInput != null)
				((SpecifierList) oldInput).removeChangeListener(this);
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
		public void addOption(domain.MappingSpecifier task) {
			tableViewer.add(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#removeTask(ExampleTask)
		 */
		public void removeOption(domain.MappingSpecifier task) {
			tableViewer.remove(task);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ITaskListViewer#updateTask(ExampleTask)
		 */
		public void updateOption(domain.MappingSpecifier task) {
			tableViewer.update(task, null);
		}
	}

	/**
	 * Label provider for the TableViewerExample
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider
	 */
	public class SpecifierLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			String result = "";
			domain.MappingSpecifier task = (domain.MappingSpecifier) element;
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

	public class SpecifierSorter extends ViewerSorter {

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
		public SpecifierSorter(int criteria) {
			super();
			this.criteria = criteria;
		}

		/*
		 * (non-Javadoc) Method declared on ViewerSorter.
		 */
		public int compare(Viewer viewer, Object o1, Object o2) {

			domain.MappingSpecifier op1 = (domain.MappingSpecifier) o1;
			domain.MappingSpecifier op2 = (domain.MappingSpecifier) o2;

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
		protected int compareOptions(domain.MappingSpecifier opt1,
				domain.MappingSpecifier opt2) {
			return collator.compare(opt1.getName(), opt2.getName());
		}

		@SuppressWarnings("deprecation")
		protected int compareValues(domain.MappingSpecifier opt1,
				domain.MappingSpecifier opt2) {
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

	public class SpecifierList {

		private ArrayList<domain.MappingSpecifier> options = new ArrayList<domain.MappingSpecifier>();
		@SuppressWarnings("rawtypes")
		private Set changeListeners = new HashSet();
		private String[] spOptions;

		/**
		 * Constructor
		 */
		public SpecifierList() {
			super();
			this.initData();
		}

		public String[] getSpecifierOptions() {
			return spOptions;
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public String[] initOptions(domain.MappingSpecifier ms) {

			if (ms == null)
				return new String[] {};

			ShapeImpl diagram = (ShapeImpl) editPart.getModel();
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Domain"));

				EObject types = (EObject) diagram.getElement();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
								+ ((domain.ModelMapper) eObject)
										.getDomainArtifact()
								+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
								+ ((domain.ModelMapper) eObject)
										.getArtifactName()
								+ "').oclAsType(domain::Artifact).specifiers->select(r|r.oclAsType(domain::Specifier).name='"
								+ ms.getName()
								+ "').oclAsType(domain::Specifier).options");

				Collection<domain.Option> map = (Collection<domain.Option>) ocl
						.evaluate(types, query);

				ArrayList<String> ls = new ArrayList<>();
				for (Iterator<domain.Option> itr = map.iterator(); itr
						.hasNext();) {
					domain.Option opt = itr.next();
					ls.add(opt.getValue());
				}
				return ls.toArray(new String[ls.size()]);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
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

				Collection<domain.MappingSpecifier> map = ((domain.ModelMapper) eObject)
						.getSpecifiers();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
								+ ((domain.ModelMapper) eObject)
										.getDomainArtifact()
								+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
								+ ((domain.ModelMapper) eObject)
										.getArtifactName()
								+ "').oclAsType(domain::Artifact).specifiers");

				Collection<domain.Specifier> map1 = (Collection<domain.Specifier>) ocl
						.evaluate(types, query);

				ArrayList<domain.MappingSpecifier> removeSpecifiers = new ArrayList<domain.MappingSpecifier>();
				for (Iterator<domain.MappingSpecifier> itr1 = map.iterator(); itr1
						.hasNext();) {
					domain.MappingSpecifier ms = itr1.next();
					boolean isRemove = true;
					for (Iterator<domain.Specifier> itr2 = map1.iterator(); itr2
							.hasNext();) {
						domain.Specifier sp = itr2.next();
						if (sp.getName().equals(ms.getName()))
							isRemove = false;
					}
					if (isRemove)
						removeSpecifiers.add(ms);
				}

				ArrayList<domain.Specifier> addSpecifiers = new ArrayList<domain.Specifier>();
				for (Iterator<domain.Specifier> itr1 = map1.iterator(); itr1
						.hasNext();) {
					domain.Specifier ms = itr1.next();
					boolean isAdd = false;
					if (map.size() == 0)
						isAdd = true;
					else {
						isAdd = true;
						for (Iterator<domain.MappingSpecifier> itr2 = map
								.iterator(); itr2.hasNext();) {
							domain.MappingSpecifier sp = itr2.next();
							if (sp.getName().equals(ms.getName()))
								isAdd = false;
						}
					}
					if (isAdd)
						addSpecifiers.add(ms);
				}

				// Add new
				for (Iterator<domain.Specifier> itr = addSpecifiers.iterator(); itr
						.hasNext();) {
					domain.Specifier specifier = itr.next();
					domain.MappingSpecifier ms = DomainFactory.eINSTANCE
							.createMappingSpecifier();
					ms.setName(specifier.getName());
					editingDomain.getCommandStack().execute(
							AddCommand.create(editingDomain,
									((domain.ModelMapper) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Specifiers(), ms));
				}

				// Remove
				for (Iterator<domain.MappingSpecifier> itr = removeSpecifiers
						.iterator(); itr.hasNext();) {
					domain.MappingSpecifier ms = itr.next();
					editingDomain.getCommandStack().execute(
							RemoveCommand.create(editingDomain,
									((domain.ModelMapper) eObject),
									DomainPackage.eINSTANCE
											.getModelMapper_Specifiers(), ms));
				}

				for (Iterator<domain.MappingSpecifier> i = ((domain.ModelMapper) eObject)
						.getSpecifiers().iterator(); i.hasNext();) {
					domain.MappingSpecifier p = i.next();
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
			domain.MappingSpecifier option = DomainFactory.eINSTANCE
					.createMappingSpecifier();
			option.setValue("New option");
			ArrayList<domain.MappingSpecifier> ls = new ArrayList<domain.MappingSpecifier>();
			ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							AddCommand.create(editingDomain,
									((domain.Specifier) eObject),
									DomainPackage.eINSTANCE
											.getSpecifier_Options(), ls));

			options.add(options.size(), option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).addOption(option);
		}

		/**
		 * @param task
		 */
		public void removeTask(domain.MappingSpecifier option) {

			ArrayList<domain.MappingSpecifier> ls = new ArrayList<domain.MappingSpecifier>();
			ls.add(option);

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							RemoveCommand.create(editingDomain,
									((domain.Specifier) eObject),
									DomainPackage.eINSTANCE
											.getSpecifier_Options(), ls));

			options.remove(option);
			Iterator<?> iterator = changeListeners.iterator();
			while (iterator.hasNext())
				((ITaskListViewer) iterator.next()).removeOption(option);
		}

		/**
		 * @param task
		 */
		public void taskChanged(domain.MappingSpecifier task) {
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
		public void addOption(domain.MappingSpecifier task);

		/**
		 * Update the view to reflect the fact that a task was removed from the
		 * task list
		 * 
		 * @param task
		 */
		public void removeOption(domain.MappingSpecifier task);

		/**
		 * Update the view to reflect the fact that one of the tasks was
		 * modified
		 * 
		 * @param task
		 */
		public void updateOption(domain.MappingSpecifier task);
	}

	public class SpecifierCellModifier implements ICellModifier {
		private MappingSpecifierPropertySelection tableViewerExample;

		/**
		 * Constructor
		 * 
		 * @param TableViewerExample
		 *            an instance of a TableViewerExample
		 */
		public SpecifierCellModifier(
				MappingSpecifierPropertySelection tableViewerExample) {
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
			domain.MappingSpecifier opt = (domain.MappingSpecifier) element;

			switch (columnIndex) {
			case 0: // VALUE_COLUMN
				result = opt.getName();
				break;
			case 1: // VALUE_COLUMN

				String[] choices = optionList.initOptions(opt);
				((ComboBoxCellEditor) (tableViewer.getCellEditors()[1]))
						.setItems(choices);

				String stringValue = opt.getValue();
				if (stringValue == null) {
					result = new Integer(0);
					break;
				}
				int i = choices.length - 1;
				while (!stringValue.equals(choices[i]) && i > 0)
					--i;
				result = new Integer(i);
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
			domain.MappingSpecifier opt = (domain.MappingSpecifier) item
					.getData();

			switch (columnIndex) {
			case 1: // OPTION_COLUMN

				String valueString = ((ComboBoxCellEditor) (tableViewer
						.getCellEditors()[1])).getItems()[(int) value];

				EditingDomain editingDomain = ((DiagramEditor) getPart())
						.getEditingDomain();
				/* apply the property change to single selected object */
				editingDomain.getCommandStack().execute(
						SetCommand.create(editingDomain, opt,
								DomainPackage.eINSTANCE
										.getMappingSpecifier_Value(),
								valueString));
				break;
			default:
			}
			tableViewerExample.getTaskList().taskChanged(opt);
		}
	}
}