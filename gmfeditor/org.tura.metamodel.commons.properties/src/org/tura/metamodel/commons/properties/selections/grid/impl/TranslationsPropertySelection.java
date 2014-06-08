package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainPackage;

public class TranslationsPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}
	
	public TranslationsPropertySelection() {
		ds = new TranslationsDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new TranslationColumn(table, this,0));
			columnList.add(new LangColumn(table, this,1));
		}
		return columnList;
	}

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		super.createControls(composite, aTabbedPropertySheetPage);
		createButtons(composite,aTabbedPropertySheetPage);
	}	
	
	private void createButtons(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		
		// Create and configure the "Add" button
		Button add = new Button(composite, SWT.PUSH | SWT.CENTER);
		add.setText("Add");

		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		gridData.widthHint = 80;
		add.setLayoutData(gridData);
		add.addSelectionListener(new SelectionAdapter() {

			// Add the selection and refresh the view
			public void widgetSelected(SelectionEvent e) {
				addRow();
			}
		});

		// Create and configure the "Delete" button
		Button delete = new Button(composite, SWT.PUSH | SWT.CENTER);
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
	
	
	class TranslationColumn implements GridColumn {

		// Set the table column property names
		private final String TRANSLATION_COLUMN = "Translation";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;
		private int col;

		public TranslationColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col=col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(TRANSLATION_COLUMN);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return TRANSLATION_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			TextCellEditor textEditor = new TextCellEditor(table);
			((Text) textEditor.getControl()).setTextLimit(60);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.Translation task = (domain.Translation) element;
			if (task.getTranslation() != null)
				result = task.getTranslation();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.Translation opt = (domain.Translation) item.getData();
			String valueString;

			valueString = ((String) value).trim();
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getTranslation_Translation(),
							valueString));

		}

		@Override
		public boolean isModify(Object element, String property) {
			return true;
		}
		
		@Override
		public Object getText(Object element) {
			return getValue(element);
		}
		
	}

	class LangColumn implements GridColumn {

		// Set the table column property names
		private final String LANGUAGE_COLUMN = "Language";

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;
		private int col;

		public LangColumn(Table table, GridProperty property,int col) {
			this.table = table;
			this.property = property;
			this.col=col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(LANGUAGE_COLUMN);
			column.setWidth(100);

			return column;
		}

		@Override
		public String getName() {
			return LANGUAGE_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			ComboBoxCellEditor comboBoxCellEditor = new ComboBoxCellEditor(
					table, new String[] {}, SWT.READ_ONLY);
			return comboBoxCellEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		private List<domain.LanguageRef> initOptions(Object obj) {
			
			EObject opt = (EObject) obj;
			return ((domain.MessageLibrary)(((domain.Message)(opt.eContainer())).eContainer())).getLibLanguages();
			

		}

		@Override
		public Object getValue(Object element) {
			Object result = null;
			domain.Translation opt = (domain.Translation) element;

			List<domain.LanguageRef> choicesOptions = initOptions(opt);

			ArrayList<String> choices = new ArrayList<String>();
			for (Iterator<domain.LanguageRef> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				choices.add(itr.next().getLang().getLang());
			}
			((ComboBoxCellEditor) (tableViewer.getCellEditors()[col]))
					.setItems(choices.toArray(new String[choices.size()]));

			if (opt == null) {
				result = new Integer(0);
				return result;
			}
			int i = choicesOptions.size() - 1;
			while (!opt.getUid().equals(choicesOptions.get(i).getUid())
					&& i > 0)
				--i;
			result = new Integer(i);

			return result;
		}

		@Override
		public void modify(Object element, Object value) {
			TableItem item = (TableItem) element;
			domain.Translation opt = (domain.Translation) item
					.getData();

			String valueString = ((ComboBoxCellEditor) (tableViewer
					.getCellEditors()[col])).getItems()[(int) value];

			List<domain.LanguageRef> choicesOptions = initOptions(opt);

			for (Iterator<domain.LanguageRef> itr = choicesOptions.iterator(); itr
					.hasNext();) {
				domain.LanguageRef option = itr.next();
				if (option.getLang().getLang().equals(valueString)) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();
					/* apply the property change to single selected object */
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, opt,
									DomainPackage.eINSTANCE
											.getTranslation_Lang(),
									option));
					break;
				}
			}

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.Translation opt = (domain.Translation) element;
			List<domain.LanguageRef> choicesOptions = initOptions(opt);
			if (choicesOptions == null || choicesOptions.size() == 0)
				return false;

			return true;
		}

		@Override
		public Object getText(Object element) {
			String result = "";
			domain.Translation task = (domain.Translation) element;
			if (task.getLang() == null)
				return "";
			if (task.getLang().getLang() == null)
				return "";

			if (task.getLang().getLang() == null)
				result = "";
			else
				result = task.getLang().getLang().getLang();
			return result;
		}

	}


}
