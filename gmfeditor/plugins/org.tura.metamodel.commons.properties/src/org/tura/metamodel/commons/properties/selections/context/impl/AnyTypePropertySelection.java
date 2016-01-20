package org.tura.metamodel.commons.properties.selections.context.impl;

import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.viewers.TreePath;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.context.ContextPropertySelection;

public abstract class AnyTypePropertySelection  extends ContextPropertySelection {

	@Override
	public String getLabelText() {
		return "Multi language label";
	}

	@Override
	protected TreeRoot getContextRoot() {

		TreeRoot rootOfTree = new TreeRoot();
		DiagramImpl root = (DiagramImpl) this.getEditPart().getRoot().getContents().getModel();

		try {
			for (Object obj : new QueryHelper().getControlsList(root))
				rootOfTree.addChild(obj);

			rootOfTree.addChild(new QueryHelper().getTypesRepository(root.getElement()));

			Object obj = new QueryHelper().getRootControl(root);
			if (obj != null)
				rootOfTree.addChild(obj);

		} catch (Exception e) {

			e.printStackTrace();
			// ignore
		}

		Object obj = new QueryHelper().getMessages(root);

		if (obj != null) {
			rootOfTree.addChild(obj);
		}

		obj = new QueryHelper().getApplicationStyle(root);

		if (obj != null) {
			rootOfTree.addChild(obj);
		}

		return rootOfTree;
	}

	@Override
	protected boolean validateSelection(TreePath path) {
		return true;
	}

	@Override
	protected void showError() {
	}

}
