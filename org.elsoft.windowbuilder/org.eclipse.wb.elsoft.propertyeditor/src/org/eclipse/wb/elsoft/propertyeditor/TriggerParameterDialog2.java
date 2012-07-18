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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.wb.elsoft.propertyeditor.TriggerPropertyEditor.ParameterLeaf;
import org.eclipse.wb.elsoft.propertyeditor.ExpressionLeaf;
import org.eclipse.wb.elsoft.propertyeditor.ValueLeaf;
import org.elsoft.platform.metamodel.general.MethodDAO;

public class TriggerParameterDialog2 extends ElementTreeSelectionDialog {
	protected Composite dialogComposite;
	protected TreeViewer v;
	protected ITreeContentProvider contentProvider;
	protected Shell shell;

	public TriggerParameterDialog2(Shell parent, ILabelProvider labelProvider,
			ITreeContentProvider contentProvider, 
			MethodDAO mo) {
		super(parent, labelProvider, contentProvider);
		this.shell = parent;
		setDoubleClickSelects(false);
		this.contentProvider = contentProvider;
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
				if (element instanceof ParameterLeaf)
					return false;
				if (element instanceof ExpressionLeaf)
					return ((ExpressionLeaf)element).overwriten;
				if (element instanceof ValueLeaf)
					return ((ValueLeaf)element).overwriten;
				return false;
			}

			public Object getValue(Object element, String property) {
				if (element instanceof ExpressionLeaf) {
					
					return new DataControlTreeSelector().openDialog(shell);
				} else
					return ((TreeModel) element).nodeName;
			}

			public void modify(Object element, String property, Object value) {
				element = ((Item) element).getData();
				if (element instanceof ExpressionLeaf) {
					((ExpressionLeaf) element).expression = (String) value;
					((ExpressionLeaf) element).updated=true;
					v.update(element, null);
				}
				if (element instanceof ValueLeaf) {
					((ValueLeaf) element).value = (String) value;
					((ValueLeaf) element).updated=true;
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

		v.setContentProvider(contentProvider);

		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 100;
		data.heightHint = 300;

		Tree treeWidget = v.getTree();
		treeWidget.setLayoutData(data);
		treeWidget.setFont(parent.getFont());

		return v;

	}

}
