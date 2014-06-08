package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.text.MessageFormat;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * A CellEditor that is a blending of DialogCellEditor and TextCellEditor. The
 * user can either type directly into the Text or use the button to open a
 * Dialog for editing the cell's value.
 * 
 */
public class TextAndDialogCellEditor extends DialogCellEditor {

	private Text textField;
	private String dialogMessage;
	private String dialogTitle;
	private Object rootObject;
	private TreePath[] treePath;

	public TextAndDialogCellEditor(Composite parent) {
		super(parent);
	}

	public void setDialogMessage(String dialogMessage) {
		this.dialogMessage = dialogMessage;
	}

	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}

	protected Control createContents(Composite cell) {
		textField = new Text(cell, SWT.NONE);
		textField.setFont(cell.getFont());
		textField.setBackground(cell.getBackground());
		textField.setEnabled(false);
		textField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent event) {
				setValueToModel();
			}
		});

		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				keyReleaseOccured(event);
			}
		});

		return textField;
	}

	protected void keyReleaseOccured(KeyEvent keyEvent) {
		if (keyEvent.keyCode == SWT.CR || keyEvent.keyCode == SWT.KEYPAD_CR) { // Enter
																				// key
			setValueToModel();
		}
		super.keyReleaseOccured(keyEvent);
	}

	protected void setValueToModel() {
		String newValue = textField.getText();
		boolean newValidState = isCorrect(newValue);
		if (newValidState) {
			markDirty();
			doSetValue(newValue);
		} else {
			// try to insert the current value into the error message.
			setErrorMessage(MessageFormat.format(getErrorMessage(),
					new Object[] { newValue.toString() }));
		}
	}

	protected void updateContents(Object value) {
		if (textField == null) {
			return;
		}

		String text = "";
		if (value != null) {
			text = value.toString();
		}
		textField.setText(text);

	}

	protected void doSetFocus() {
		// Overridden to set focus to the Text widget instead of the Button.
		textField.setFocus();
		textField.selectAll();
	}

	protected Object openDialogBox(Control cellEditorWindow) {

		PathTreeSelectionDialog dialog = new PathTreeSelectionDialog(
				cellEditorWindow.getShell(), new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle(dialogTitle);
		dialog.setMessage(dialogMessage);
		dialog.setInput(rootObject);
		if (dialog.open() == Window.OK) {
			if (treePath != null && treePath.length > 0)
				return treePath[0];
			else
				return null;
		} else {
			return null;
		}
	}

	protected String getDialogInitialValue() {
		Object value = getValue();
		if (value == null) {
			return null;
		} else {
			return value.toString();
		}
	}

	public Object getRootObject() {
		return rootObject;
	}

	public void setRootObject(Object rootObject) {
		this.rootObject = rootObject;
	}

	class PathTreeSelectionDialog extends ElementTreeSelectionDialog {

		public PathTreeSelectionDialog(Shell parent,
				ILabelProvider labelProvider,
				ITreeContentProvider contentProvider) {
			super(parent, labelProvider, contentProvider);
		}

		protected TreeViewer createTreeViewer(Composite parent) {
			TreeViewer viewer = super.createTreeViewer(parent);

			viewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					treePath = ((TreeSelection) event.getSelection())
							.getPaths();
					updateOKStatus();
				}
			});

			return viewer;
		}
	}

}
