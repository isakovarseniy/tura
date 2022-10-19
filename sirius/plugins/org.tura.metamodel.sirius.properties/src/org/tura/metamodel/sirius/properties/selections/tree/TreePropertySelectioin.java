/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.tree;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.TextChangeHelper;
import org.tura.metamodel.sirius.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.sirius.properties.selections.PathTreeSelectionDialog;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

public abstract class TreePropertySelectioin extends AbstractTuraPropertySection{

	protected Button btnConfirm;
	protected Button btnDialog;
	protected TextChangeHelper listener;
	protected CLabel nameLabel;
	protected Text text1;
	protected CLabel nameLabel1;
	protected TreePath[] treePath;

	
	public abstract String  getLabelText();

	protected abstract TreeRoot getContextRoot();

	protected abstract void showError();
	
	protected abstract TextDataAdapter getDataAdapter();
	
	protected Class<?> getComaringClass(	){
		return null;
	}
	
	public void createControls(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Composite composite = aTabbedPropertySheetPage.getWidgetFactory()
				.createFlatFormComposite(parent);

		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 4;
		composite.setLayout(layout);
		createInputText(composite);

	}
	
	private void createInputText(Composite parent) {
		Composite composite = getWidgetFactory()
				.createFlatFormComposite(parent);
		FormData data;

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

		Button btn = new Button(composite, SWT.PUSH | SWT.CENTER);
		btn.setText("Clear");
		data = new FormData();
		data.left = new FormAttachment(btnDialog, 0);
		data.top = new FormAttachment(btnDialog, 0, SWT.CENTER);
		btn.setLayoutData(data);

		btn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleClearContext();
				refresh();
				
			}
		});
		
		
		
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
	}

	public void refresh() {
		super.refresh();
		
		EStructuralFeature feature = getDataAdapter().getFeature();
		text1.setText((String) getDataAdapter().getFeatureValue(getModel(), feature));
		
	}
	
	protected void handleClearContext() {
		Session session = SessionManager.INSTANCE.getSession(getModel());
		EditingDomain editingDomain = session.getTransactionalEditingDomain();
		EStructuralFeature feature = getDataAdapter().getFeature();
		Command setCommand = SetCommand.create(editingDomain, getModel(), feature, null);
		editingDomain.getCommandStack().execute(setCommand);
		
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
				TreePath path = treePath[0];
				if (validateSelection(path)) {

					Session session = SessionManager.INSTANCE.getSession(getModel());
					EditingDomain editingDomain = session.getTransactionalEditingDomain();
					EStructuralFeature feature = getDataAdapter().getFeature();
					Command setCommand = SetCommand.create(editingDomain, getModel(), feature, path.getLastSegment());
					editingDomain.getCommandStack().execute(setCommand);
				
					refresh();
					afterUpdate();
					
				} else {
					showError();
				}

			}
		}
	}
	
	protected boolean validateSelection(TreePath path) {
		Object obj = path.getLastSegment();

		IReturnTypeProvider provider = (IReturnTypeProvider) Platform
				.getAdapterManager().getAdapter(obj, IReturnTypeProvider.class);

		Object type = null;
		if (provider != null && provider.getReturnType(obj) != null)
			type =provider.getReturnType(obj);

		if (type == null)
			return false;

		if (checkType(obj) )
			return true;
		return false;

	}	
	
	public void afterUpdate(){
		
	}
	
	protected boolean checkType(Object type){
		return getComaringClass().isAssignableFrom(type.getClass());
	}
	
	
	@Override
	public EObject getModel() {
		DRepresentationElement element = (DRepresentationElement) getEObject();
		return element.getTarget();
	}
	
}
