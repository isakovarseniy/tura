package org.metamodel.tura.ui.properties.sections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.metamodel.tura.ui.properties.sections.QueryHelper;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TreeRoot;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TriggerHolder;
import org.metamodel.tura.ui.properties.sections.grid.GridColumn;
import org.metamodel.tura.ui.properties.sections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class TriggerParameterPropertySelection extends GridProperty {

	private List<GridColumn> columnList;

	@Override
	public EObject getModel() {
		return getEObject();
	}

	public TriggerParameterPropertySelection() {
		ds = new TriggerParameterrDS(this);
	}

	@Override
	public List<GridColumn> getColumns() {
		if (columnList == null) {
			columnList = new ArrayList<GridColumn>();
			columnList.add(new ParameterColumn(table, this, 0));
			columnList.add(new IsExpressioinColumn(table, this, 1));
			columnList.add(new ValueColumn(table, this, 2));
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
	}

	class ParameterColumn implements GridColumn {

		// Set the table column property names
		private final String PARAMETER_COLUMN = "Parameter";
		private int col;

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public ParameterColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(PARAMETER_COLUMN);
			column.setWidth(100);
			return column;
		}

		@Override
		public String getName() {
			return PARAMETER_COLUMN;
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
			domain.TriggerParameter task = (domain.TriggerParameter) element;
			if (task.getParameter().getName() != null)
				result = task.getParameter().getName();
			return result;
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.TriggerParameter opt = (domain.TriggerParameter) item
					.getData();
			String valueString;

			valueString = ((String) value).trim();
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt,
							DomainPackage.eINSTANCE.getParameter_Name(),
							valueString));

		}

		@Override
		public boolean isModify(Object element, String property) {
			return false;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

	}

	class IsExpressioinColumn implements GridColumn {

		// Set the table column property names
		private final String ISEXPRESSIOIN_COLUMN = "IsExpression";
		private int col;

		private Table table;
		@SuppressWarnings("unused")
		private GridProperty property;

		public IsExpressioinColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(ISEXPRESSIOIN_COLUMN);
			column.setWidth(80);
			return column;
		}

		@Override
		public String getName() {
			return ISEXPRESSIOIN_COLUMN;
		}

		@Override
		public CellEditor getEditor() {
			CheckboxCellEditor textEditor = new CheckboxCellEditor(table);
			return textEditor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			domain.TriggerParameter task = (domain.TriggerParameter) element;
			return task.getValue().isIsExpression();
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.TriggerParameter opt = (domain.TriggerParameter) item
					.getData();

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, opt.getValue(),
							DomainPackage.eINSTANCE
									.getContextValue_IsExpression(), value));

		removeExpession(editingDomain, opt);
		   updateConstantValue(editingDomain, opt, null);
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

	class ValueColumn implements GridColumn {

		public static final String COLUMN_NAME = "Value";
		private int col;

		private Table table;
		private GridProperty property;

		public ValueColumn(Table table, GridProperty property, int col) {
			this.table = table;
			this.property = property;
			this.col = col;
		}

		@Override
		public TableColumn createColumn() {
			// 1 nd column with task Option
			TableColumn column = new TableColumn(table, SWT.LEFT, col);
			column.setText(COLUMN_NAME);
			column.setWidth(400);
			return column;
		}

		@Override
		public String getName() {
			return COLUMN_NAME;
		}

		@Override
		public CellEditor getEditor() {
			CellEditor editor = new TextAndDialogCellEditor(table);
			return editor;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.TriggerParameter opt = (domain.TriggerParameter) element;

			result = opt.getValue().getValue();
			if (result == null)
				result = "";

			return result;

		}

		@Override
		public void modify(Object element, Object value) {
			if (element == null )
				return;
			TableItem item = (TableItem) element;
			domain.TriggerParameter opt = (domain.TriggerParameter) item
					.getData();
			EditingDomain editingDomain = this.property.getEditPart().getEditingDomain();
			if (value instanceof String)
				updateConstantValue(editingDomain, opt, (String) value);
			if (value instanceof TreePath)
				updateExpressionValue(editingDomain, opt, (TreePath) value);

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.TriggerParameter obj = (domain.TriggerParameter) element;
			CellEditor editor;
			if (obj.getValue().isIsExpression()) {
				TreeRoot rootOfTree = new TreeRoot();
				DiagramImpl root = (DiagramImpl) this.property.getEditPart()
						.getRoot().getContents().getModel();
				if (root.getElement() instanceof domain.Controls) {
					rootOfTree.addChild(((domain.Controls) root.getElement())
							.getParent().getFormControl());
				}
				if (root.getElement() instanceof domain.Views) {
					rootOfTree.addChild(((domain.Form) (((domain.Views) root
							.getElement()).getParent().eContainer()))
							.getDatacontrols().getFormControl());
				}
				try {
					rootOfTree.addChild(new QueryHelper()
							.getTypesRepository(root.getElement()));
				} catch (Exception e) {
					// ignore
				}

				editor = this.getEditor();
				((TextAndDialogCellEditor) editor).setRootObject(rootOfTree);
			} else {
				editor = new TextCellEditor(table);
				((Text) editor.getControl()).setTextLimit(60);
			}
			this.property.getTableViewer().getCellEditors()[col] = editor;
			return true;
		}

		@Override
		public Object getText(Object element) {
			return getValue(element);
		}

	}

	public void updateExpressionValue(EditingDomain editingDomain, domain.TriggerParameter param,
			TreePath path) {
		String value = "";

		removeExpession(editingDomain, param);
		ArrayList<domain.ExpressionPart> ls = new ArrayList<>();
		for (int i = 0; i < path.getSegmentCount(); i++) {
			domain.ExpressionPart part = DomainFactory.eINSTANCE
					.createExpressionPart();
			if (path.getSegment(i) instanceof EObject)
				part.setObjRef((EObject) path.getSegment(i));

			if (path.getSegment(i) instanceof TriggerHolder)
				part.setObjRef(((TriggerHolder) path.getSegment(i))
						.getTrigger());

			part.setOrder(i);
			ls.add(part);

			IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform
					.getAdapterManager().getAdapter(path.getSegment(i),
							IWorkbenchAdapter.class);
			if (i != 0)
				value = value + ".";
			value = value + adapter.getLabel(path.getSegment(i));
		}

		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param.getValue(),
						DomainPackage.eINSTANCE
								.getContextValue_Expression(), ls));
		updateConstantValue(editingDomain,param, value);

	}
	
	public void updateConstantValue(EditingDomain editingDomain,domain.TriggerParameter param,
			String value) {
		String valueString = null;
		if (value != null)
		   valueString = ((String) value).trim();

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param.getValue(),
						DomainPackage.eINSTANCE.getContextValue_Value(),
						valueString));

	}

	public void removeExpession(EditingDomain editingDomain,
			domain.TriggerParameter param) {
		if (param.getValue() != null
				&& param.getValue().getExpression() != null
				&& param.getValue().getExpression().size() != 0) {
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, param.getValue(),
							DomainPackage.eINSTANCE
									.getContextValue_Expression(), param
									.getValue().getExpression()));
		}
	}
	
	
}
