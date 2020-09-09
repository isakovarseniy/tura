/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;
import org.tura.metamodel.sirius.properties.TextChangeHelper;
import org.tura.metamodel.sirius.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.sirius.properties.selections.PathTreeSelectionDialog;

import form.Context;
import form.ContextParameters;
import form.ContextValue;
import form.ExpressionPart;
import form.FormFactory;
import form.FormPackage;

public abstract class ContextPropertySelection extends  AbstractTuraPropertySection {

	protected Button btnConfirm;
	protected Button btnDialog;
	protected Text text;
	protected TextChangeHelper listener;
	protected CLabel nameLabel;
	protected Text text1;
	protected CLabel nameLabel1;
	protected TreePath[] treePath;

	private String MESSAGE = "is constant";

	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		createCheckBox(composite);
		createInputText(composite);

	}

	private void createCheckBox(Composite parent) {

		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		FormData data;

		btnConfirm = new Button(composite, SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(0, getStandardLabelWidth(composite,
				new String[] { MESSAGE }));
		data.right = new FormAttachment(10, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		btnConfirm.setLayoutData(data);
		btnConfirm.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleIsExpressionPress();
				handleModified();
			}
		});

		CLabel label = getWidgetFactory().createCLabel(composite, MESSAGE);
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(btnConfirm,
				-ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(btnConfirm, 0, SWT.CENTER);
		label.setLayoutData(data);

	}

	private void createInputText(Composite parent) {
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		FormData data;

		text = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, getStandardLabelWidth(composite,
				new String[] { getLabelText() }));
		data.right = new FormAttachment(10, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		text.setLayoutData(data);

		nameLabel = getWidgetFactory().createCLabel(composite, getLabelText());
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(text, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(text, 0, SWT.CENTER);
		nameLabel.setLayoutData(data);

		listener = new TextChangeHelper() {

			public void textChanged(Control control) {
				handleTextModified();
				handleModified();
			}
		};
		listener.startListeningTo(text);
		listener.startListeningForEnter(text);

		text1 = getWidgetFactory().createText(composite, ""); //$NON-NLS-1$
		text1.setEnabled(false);
		data = new FormData();
		data.left = new FormAttachment(0, getStandardLabelWidth(composite,
				new String[] { getLabelText() }));
		data.right = new FormAttachment(10, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);
		text1.setLayoutData(data);

		nameLabel1 = getWidgetFactory().createCLabel(composite, getLabelText());
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(text1, -ITabbedPropertyConstants.HSPACE);
		data.top = new FormAttachment(text1, 0, SWT.CENTER);
		nameLabel1.setLayoutData(data);

		btnDialog = new Button(composite, SWT.PUSH | SWT.CENTER);
		btnDialog.setText("Context");
		data = new FormData();
		data.left = new FormAttachment(text1, 0);
		data.top = new FormAttachment(text1, 0, SWT.CENTER);
		btnDialog.setLayoutData(data);

		btnDialog.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleCallContext();
			}
		});

	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
	}

	public abstract String getLabelText();

	public void refresh() {
		super.refresh();
		if (getModel() != null
				&& ((Context) getModel()).getValue() != null) {
			text.setText(((Context) getModel()).getValue());
			text1.setText(((Context) getModel()).getValue());
		} else {
			text.setText("");
			text1.setText("");
		}
		if (getModel() != null) {
			btnConfirm.setSelection(((Context) getModel()).isConstant());
			configure();
		}else{
			btnConfirm.setSelection(false);
			text1.setVisible(true);
			nameLabel1.setVisible(true);
			btnDialog.setVisible(true);
		}
	}

	private void configure() {
		Context obj = (Context) getModel();
		if (!obj.isConstant()) {
			text1.setVisible(true);
			nameLabel1.setVisible(true);
			btnDialog.setVisible(true);

			nameLabel.setVisible(false);
			text.setVisible(false);
		} else {
			text1.setVisible(false);
			nameLabel1.setVisible(false);
			btnDialog.setVisible(false);

			nameLabel.setVisible(true);
			text.setVisible(true);
		}

	}

	protected void handleTextModified() {
		String newText = text.getText();
		boolean equals = isEqual(newText);
		if (!equals) {
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			if (eObjectList.size() == 1) {
				/* apply the property change to single selected object */
				editingDomain.getCommandStack().execute(
						SetCommand
								.create(editingDomain, getModel(),
										FormPackage.eINSTANCE
												.getContextValue_Value(),
										newText));
			} else {
				CompoundCommand compoundCommand = new CompoundCommand();
				/* apply the property change to all selected elements */
				for (Iterator<?> i = eObjectList.iterator(); i.hasNext();) {
					EObject nextObject = (EObject) i.next();
					compoundCommand.append(SetCommand.create(editingDomain,
							nextObject,
							FormPackage.eINSTANCE.getContextValue_Value(),
							newText));
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			}
		}
	}

	protected void handleCallContext() {

		PathTreeSelectionDialog dialog = new PathTreeSelectionDialog(Display
				.getCurrent().getActiveShell(), new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle("Context");
		dialog.setMessage("");
		dialog.setInput(getContextRoot());
		if (dialog.open() == Window.OK) {
			treePath = dialog.getTreePath();
			if (treePath != null && treePath.length > 0) {
				if (validateSelection(treePath[0])) {
					EditingDomain editingDomain = ((DiagramEditor) getPart())
							.getEditingDomain();
					removeExpession(editingDomain, (ContextValue) getModel());
					updateConstantValue(editingDomain,
							(ContextValue) getModel(),
							buildExpression(treePath[0]));
					updateExpession(editingDomain, (ContextValue) getModel(),
							buildExpressionList(treePath[0]));
					refresh();
					handleModified();
					afterUpdate();

				} else {
					showError();
				}

			}
		}
	}

	protected void handleModified() {

	}

	protected void handleIsExpressionPress() {

		EditingDomain editingDomain = ((DiagramEditor) getPart())
				.getEditingDomain();

		updateConstant(editingDomain, (ContextValue) getModel(),
				btnConfirm.getSelection());
		updateConstantValue(editingDomain, (ContextValue) getModel(), null);
		removeExpession(editingDomain, (ContextValue) getModel());
		removeParameters(editingDomain, (ContextParameters) getModel());
		afterUpdate();

		this.propertySheetPage.refresh();

	}

	protected boolean isEqual(String newText) {
		if (getModel() == null)
			return false;
		if (((Context) getModel()).getValue() == null)
			return false;
		return ((Context) getModel()).getValue().equals(newText);
	}

	protected List<ExpressionPart> buildExpressionList(TreePath path) {
		ArrayList<ExpressionPart> ls = new ArrayList<>();
		for (int i = 0; i < path.getSegmentCount(); i++) {
			ExpressionPart part = FormFactory.eINSTANCE
					.createExpressionPart();
			if (path.getSegment(i) instanceof EObject)
				part.setObjRef((EObject) path.getSegment(i));

			if (path.getSegment(i) instanceof TriggerHolder)
				part.setObjRef(((TriggerHolder) path.getSegment(i))
						.getTrigger());

			if (part.getObjRef() != null)
				part.setExpressionType(part.getObjRef().getClass()
						.getSimpleName());
			else
				part.setExpressionType(path.getSegment(i).getClass()
						.getSimpleName());

			part.setOrder(i);
			ls.add(part);

		}
		return ls;
	}

	protected String buildExpression(TreePath path) {
		String value = "";
		for (int i = 0; i < path.getSegmentCount(); i++) {
			IWorkbenchAdapter adapter = (IWorkbenchAdapter) Platform
					.getAdapterManager().getAdapter(path.getSegment(i),
							IWorkbenchAdapter.class);
			if (i != 0)
				value = value + ".";
			value = value + adapter.getLabel(path.getSegment(i));
		}
		return value;
	}

	public void updateConstantValue(EditingDomain editingDomain,
			ContextValue param, String value) {
		String valueString = null;
		if (value != null)
			valueString = ((String) value).trim();

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param,
						FormPackage.eINSTANCE.getContextValue_Value(),
						valueString));

	}

	public void updateConstant(EditingDomain editingDomain,
			ContextValue param, boolean value) {

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param,
						FormPackage.eINSTANCE.getContextValue_Constant(),
						value));
	}

	public void updateExpession(EditingDomain editingDomain,
			ContextValue param, List<ExpressionPart> ls) {
		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, param,
						FormPackage.eINSTANCE.getContextValue_Expression(),
						ls));

	}

	public void removeExpession(EditingDomain editingDomain,
			ContextValue param) {

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, param,
						FormPackage.eINSTANCE.getContextValue_Expression(),
						param.getExpression()));

	}

	public void removeParameters(EditingDomain editingDomain,
			ContextParameters model) {

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, model,
						FormPackage.eINSTANCE
								.getContextParameters_Parameters(), model
								.getParameters()));
	}
	
	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}
	
	protected void afterUpdate(){
		
	}

	protected abstract TreeRoot getContextRoot();

	protected abstract boolean validateSelection(TreePath path);

	protected abstract void showError();


}
