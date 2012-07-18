/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.eclipse.wb.elsoft.propertyeditor;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.e4.xwt.elsoft.types.BusinessObjectProperty;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.wb.elsoft.propertyeditor.TriggerPropertyEditor.CallLeaf;
import org.eclipse.wb.elsoft.propertyeditor.TriggerPropertyEditor.ParameterLeaf;
import org.eclipse.wb.elsoft.propertyeditor.TriggerPropertyEditor.TriggerLeaf;
import org.elsoft.platform.metamodel.general.MethodDAO;
import org.elsoft.platform.metamodel.general.MethodReferenceDAO;
import org.elsoft.platform.metamodel.general.ParameterDAO;
import org.elsoft.platform.metamodel.types.MethodHandler;
import org.elsoft.platform.metamodel.types.MethodReferenceHandler;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class TriggetPropertyDialog2 extends ElementTreeSelectionDialog {
	protected Composite dialogComposite;
	protected TreeViewer v;
	protected Shell shell;
	public BusinessObjectProperty bo;

	public TriggetPropertyDialog2(Shell parent, ILabelProvider labelProvider,
			ITreeContentProvider contentProvider, BusinessObjectProperty bo) {
		super(parent, labelProvider, contentProvider);
		this.shell = parent;
		this.bo = bo;
		setDoubleClickSelects(false);
	}

	protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
		dialogComposite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 1;
		layout.marginWidth = 1;
		layout.verticalSpacing = 1;
		layout.horizontalSpacing = 1;
		dialogComposite.setLayout(layout);
		dialogComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		v = new TreeViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);

		v.setCellEditors(new CellEditor[] { new TextCellEditor(v.getTree()) });
		v.setColumnProperties(new String[] { "col1" });
		v.setCellModifier(new ICellModifier() {

			public boolean canModify(Object element, String property) {
				return !(element instanceof TriggerLeaf);
			}

			public Object getValue(Object element, String property) {
				if (element instanceof ParameterLeaf) {
					TreeModel parent = ((TreeModel) element).parent;
					TriggerParameterDialog2 dialog = new TriggerParameterDialog2(
							shell, new ParameterLabelProvider(),
							new MyContentProvider(), 
							((CallLeaf) (parent.child.get(0))).methodObj);
					TreeModel root = null;
					if (((ParameterLeaf) element).params != null)
						root = ((ParameterLeaf) element).params;
					else
						root = createModel(
								((CallLeaf) (parent.child.get(0))).method,
								((ParameterLeaf) element).obj);

					dialog.setInput(root);

					if (dialog.open() == Window.OK) {
						((ParameterLeaf) element).params = root;
						((ParameterLeaf) element).updated = true;
					}
					return "Parameters - set";

				}
				if (element instanceof CallLeaf) {
					MethodReferenceHandler mrh = Activator.rf
							.getRoot()
							.clean()
							.searchString("domainName", bo.getDomain())
							.seek()
							.getFunctionalDomain()
							.clean()
							.searchString("functionalDomainName",
									bo.getFunctionalDomain())
							.seek()
							.getBusinessObjectsHandler()
							.clean()
							.searchString("businessObjectTypeName",
									bo.getBusinessObjectName()).seek()
							.getMethodReferenceHandler().clean();

					Iterator<MethodReferenceDAO> itr = mrh.searchString("methodType", ((TreeModel) element).parent.nodeName).getList();

					ElementListSelectionDialog dialog = new ElementListSelectionDialog(
							dialogComposite.getShell(),
							new MethodLabelProvider());
					dialog.setTitle("Method selection");
					dialog.setMessage("Select a String (* = any string, ? = any char):");

					ArrayList<Object> array = new ArrayList<Object>();
					while (itr.hasNext()) {
						itr.next();
						array.add(mrh.getMethodHandler().getObject());
					}

					dialog.setElements(array.toArray());

					if (dialog.open() == Window.OK) {
						((CallLeaf) element).methodObj = ((MethodDAO) dialog
								.getResult()[0]);
						((CallLeaf) element).updated = true;
						return ((MethodDAO) dialog.getResult()[0]).getMethod();
					}

				}
				return null;
			}

			public void modify(Object element, String property, Object value) {
				element = ((Item) element).getData();
				if (element instanceof CallLeaf) {
					((CallLeaf) element).method = (String) value;
					v.update(element, null);
				}
				if (element instanceof ParameterLeaf) {
					v.update(element, null);
				}
			}

		});

		TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(
				v, new FocusCellOwnerDrawHighlighter(v));
		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(
				v) {
			protected boolean isEditorActivationEvent(
					ColumnViewerEditorActivationEvent event) {
				return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
						|| event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
						|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
						|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
			}
		};

		TreeViewerEditor.create(v, focusCellManager, actSupport,
				ColumnViewerEditor.TABBING_HORIZONTAL
						| ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
						| ColumnViewerEditor.TABBING_VERTICAL
						| ColumnViewerEditor.KEYBOARD_ACTIVATION);

		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 100;
		data.heightHint = 300;

		Tree treeWidget = v.getTree();
		treeWidget.setLayoutData(data);
		treeWidget.setFont(parent.getFont());

		return v;

	}

	private class MethodLabelProvider extends BaseLabelProvider implements
			ILabelProvider {
		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			return ((MethodDAO) element).getMethod();
		}
	}


	private TreeModel createModel(String methodName, JSONObject obj) {

		TreeModel root = new TreeModel("root", null);

		MethodReferenceHandler mr = Activator.rf
				.getRoot()
				.clean()
				.searchString("domainName", bo.getDomain())
				.seek()
				.getFunctionalDomain()
				.clean()
				.searchString("functionalDomainName", bo.getFunctionalDomain())
				.seek()
				.getBusinessObjectsHandler()
				.clean()
				.searchString("businessObjectTypeName",
						bo.getBusinessObjectName()).seek()
				.getMethodReferenceHandler();

		Iterator<MethodReferenceDAO> itrMref = mr.clean().getList();
		MethodHandler methodh = null;
		while (itrMref.hasNext()) {
			itrMref.next();
			methodh = mr.getMethodHandler();
			MethodDAO meth = methodh.getObject();
			if (meth.getMethod().equals(methodName))
				break;
		}

		Iterator<ParameterDAO> itr = methodh.getParameterHandler().clean()
				.getList();
		while (itr.hasNext()) {
			ParameterDAO param = itr.next();
			PPParameterLeaf leaf = new PPParameterLeaf(
					param.getParameterName(), root);

			String expression = param.getDefaultExpression();
			String value = param.getDefaultValue();

			if (param.isOverwritten()) {
				JSONArray array = null;
				if (obj != null)
					array = (JSONArray) obj.get(leaf.nodeName);
				if (array != null) {
					expression = (String) array.get(0);
					value = (String) array.get(1);
				}
			}
			ExpressionLeaf ex = new ExpressionLeaf("Expression", leaf, expression);
			ex.overwriten = param.isOverwritten();
			ValueLeaf val = new ValueLeaf("Value", leaf, value);
			val.overwriten = param.isOverwritten();
		}
		return root;
	}





}
