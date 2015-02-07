package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.Display;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.IReturnTypeProvider;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.context.ContextPropertySelection;

import domain.TypeElement;

public abstract class AbstractBooleanPropertySelection extends
		ContextPropertySelection {

	@Override
	public String getLabelText() {
		return "Value:";
	}

	@Override
	protected TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot()
				.getContents().getModel();

		try {
			for (Object obj : new QueryHelper().getControlsList(root))
				rootOfTree.addChild(obj);

			rootOfTree.addChild(new QueryHelper().getTypesRepository(root
					.getElement()));
			
			rootOfTree.addChild(new QueryHelper().getRootControl(root));
			
		} catch (Exception e) {
			// ignore
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

		domain.TypeElement bln = new QueryHelper().findBooleanType(getModel());
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
