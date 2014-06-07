package org.tura.metamodel.commons.properties.sections.context.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.Display;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.sections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.sections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.sections.context.ContextPropertySelection;

import domain.Form;
import domain.TypeElement;
import domain.Views;

public abstract class AbstractStringPropertySelection extends
		ContextPropertySelection {

	@Override
	public String getLabelText() {
		return "Multi language label";
	}

	@Override
	protected TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot()
				.getContents().getModel();

		domain.Controls controls = null;
		domain.Form frm = null;
		if (root.getElement() instanceof domain.Controls) {
			frm = (Form) ((domain.Controls) root.getElement()).getParent()
					.eContainer();
		}
		if (root.getElement() instanceof domain.CanvasView) {
			domain.Views views = (Views) ((domain.CanvasView) root.getElement())
					.getParent().eContainer().eContainer();
			frm = ((domain.Form) (views.getParent().eContainer()));
		}

		if (root.getElement() instanceof domain.Views) {
			domain.Views views = (Views) root.getElement();
			frm = ((domain.Form) (views.getParent().eContainer()));
		}

		if (frm.getDatacontrols() != null) {
			controls = frm.getDatacontrols().getFormControl();
			rootOfTree.addChild(controls);
		}

		try {
			rootOfTree.addChild(new QueryHelper().getTypesRepository(root
					.getElement()));
		} catch (Exception e) {
			// ignore
		}
		domain.Application app = ((domain.UIPackage) (frm.eContainer()))
				.getParent().getParent().getParent();

		if (app.getApplicationMessages() != null
				&& app.getApplicationMessages().getMessages() != null) {
			rootOfTree.addChild(app.getApplicationMessages().getMessages());
		}
		return rootOfTree;
	}

	@Override
	protected boolean validateSelection(TreePath path) {

		Object obj = path.getLastSegment();

		IReturnTypeProvider provider = (IReturnTypeProvider) Platform
				.getAdapterManager().getAdapter(obj, IReturnTypeProvider.class);

		domain.TypeElement type = null;
		if (provider != null && provider.getReturnType(obj) != null)
			type = (TypeElement) provider.getReturnType(obj);

		if (type == null)
			return false;

		domain.TypeElement bln = new QueryHelper().findStringType(getModel());
		if (!type.getUid().equals(bln.getUid()))
			return false;

		return true;
	}

	@Override
	protected void showError() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				MessageDialog dialog = new MessageDialog(Display.getDefault()
						.getActiveShell(), "Tura", null,
						"Choosen type missmarch of parameter type",
						MessageDialog.ERROR, new String[] { "Ok" }, 0);
				dialog.open();
			}
		});
	}

}
