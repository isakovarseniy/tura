package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;
import org.tura.metamodel.commons.properties.selections.grid.GridColumn;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;
import org.tura.metamodel.commons.properties.selections.grid.TextAndDialogCellEditor;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.TypeElement;

public abstract class ContextValuePropertySelection extends GridProperty {

	
	public abstract  boolean checkType(domain.ContextValue ctxv, domain.TypeElement type, Object model) ;
	public abstract domain.ContextValue modelToCtxValue(Object ctxv );
	
	class IsExpressioinColumn implements GridColumn {

		// Set the table column property names
		private final String ISCONSTANT_COLUMN = "Is Constant";
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
			column.setText(ISCONSTANT_COLUMN);
			column.setWidth(80);
			return column;
		}

		@Override
		public String getName() {
			return ISCONSTANT_COLUMN;
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
			domain.ContextValue ctxv =  modelToCtxValue(element);
			if (ctxv == null )
				return true;
			return ctxv.isConstant();
		}

		@Override
		public void modify(Object element, Object value) {

			TableItem item = (TableItem) element;
			domain.ContextValue ctxv =  modelToCtxValue(item.getData());

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			/* apply the property change to single selected object */
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, ctxv,
							DomainPackage.eINSTANCE.getContextValue_Constant(), value));

			removeExpession(editingDomain, ctxv);
			updateConstantValue(editingDomain, ctxv, null);
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
			return null;
		}

		@Override
		public int compareOptions(Object o1, Object o2) {
			return 0;
		}

		@Override
		public Object getValue(Object element) {
			String result = "";
			domain.ContextValue ctxv =  modelToCtxValue(element);

			result = ctxv.getValue();
			if (result == null)
				result = "";

			return result;

		}

		@Override
		public void modify(Object element, Object value) {
			if (element == null)
				return;
			TableItem item = (TableItem) element;
			domain.ContextValue ctxv =  modelToCtxValue( item.getData());
			EditingDomain editingDomain = this.property.getEditPart().getEditingDomain();
			if (value instanceof String)
				updateConstantValue(editingDomain, ctxv, (String) value);
			if (value instanceof TreePath)
				updateExpressionValue(editingDomain, ctxv, (TreePath) value,item.getData());

		}

		@Override
		public boolean isModify(Object element, String property) {
			domain.ContextValue ctxv =  modelToCtxValue(element);
			CellEditor editor;
			if (!ctxv.isConstant()) {
				editor = new TextAndDialogCellEditor(table);
				((TextAndDialogCellEditor) editor).setRootObject(getContextRoot());
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

	private TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot().getContents().getModel();

		try {
			for (Object obj : new QueryHelper().getControlsList(root))
				rootOfTree.addChild(obj);

			Object obj = new QueryHelper().getTypesRepository(root.getElement());
			if (obj != null)
				rootOfTree.addChild(obj);

			obj = new QueryHelper().getApplicationRoles(root);
			if (obj != null)
				rootOfTree.addChild(obj);

			obj = new QueryHelper().getRootControl(root);
			if (obj != null)
				rootOfTree.addChild(obj);

		} catch (Exception e) {
			// ignore
		}

		return rootOfTree;
	}

	public void updateExpressionValue(EditingDomain editingDomain, domain.ContextValue ctxv, TreePath path, Object model) {

		Object obj = path.getLastSegment();

		IReturnTypeProvider provider = (IReturnTypeProvider) Platform.getAdapterManager().getAdapter(obj,
				IReturnTypeProvider.class);

		domain.TypeElement type = null;
		if (provider != null && provider.getReturnType(obj) != null)
			type = (TypeElement) provider.getReturnType(obj);

		if (type == null || !checkType(ctxv, type,model)) {
			showError("Choosen type missmarch of parameter type");
			return;
		}

		removeExpession(editingDomain, ctxv);
		updateExpession(editingDomain, ctxv, buildExpressionList(path));
		updateConstantValue(editingDomain, ctxv, buildExpression(path));

	}


	protected List<domain.ExpressionPart> buildExpressionList(TreePath path) {
		ArrayList<domain.ExpressionPart> ls = new ArrayList<>();
		for (int i = 0; i < path.getSegmentCount(); i++) {
			domain.ExpressionPart part = DomainFactory.eINSTANCE.createExpressionPart();
			if (path.getSegment(i) instanceof EObject)
				part.setObjRef((EObject) path.getSegment(i));

			if (path.getSegment(i) instanceof TriggerHolder)
				part.setObjRef(((TriggerHolder) path.getSegment(i)).getTrigger());

			if (part.getObjRef() != null)
				part.setExpressionType(part.getObjRef().getClass().getSimpleName());
			else
				part.setExpressionType(path.getSegment(i).getClass().getSimpleName());

			part.setOrder(i);
			ls.add(part);

		}
		return ls;
	}

	protected String buildExpression(TreePath path) {
		String value = "";
		for (int i = 0; i < path.getSegmentCount(); i++) {
			IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform.getAdapterManager().getAdapter(path.getSegment(i),
					IWorkbenchAdapter.class);
			if (i != 0)
				value = value + ".";
			value = value + adapter.getLabel(path.getSegment(i));
		}
		return value;
	}

	private void updateConstantValue(EditingDomain editingDomain, domain.ContextValue param, String value) {
		String valueString = null;
		if (value != null)
			valueString = ((String) value).trim();

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param, DomainPackage.eINSTANCE.getContextValue_Value(),
						valueString));

	}

	public void updateExpession(EditingDomain editingDomain, domain.ContextValue param, List<domain.ExpressionPart> ls) {

		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param,
						DomainPackage.eINSTANCE.getContextValue_Expression(), ls));
	}

	private void showError(final String message) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog dialog = new MessageDialog(Display.getDefault().getActiveShell(), "Tura", null, message,
						MessageDialog.ERROR, new String[] { "Ok" }, 0);
				dialog.open();
			}
		});

	}

	private void removeExpession(EditingDomain editingDomain, domain.ContextValue ctxv) {
		if ( ctxv.getExpression() != null && ctxv.getExpression().size() != 0) {
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, ctxv,
							DomainPackage.eINSTANCE.getContextValue_Expression(), ctxv.getExpression()));
		}
	}

}