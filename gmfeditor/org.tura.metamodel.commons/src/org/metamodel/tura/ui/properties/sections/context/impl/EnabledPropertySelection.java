package org.metamodel.tura.ui.properties.sections.context.impl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.Display;
import org.metamodel.tura.ui.properties.sections.QueryHelper;
import org.metamodel.tura.ui.properties.sections.adapters.IReturnTypeProvider;
import org.metamodel.tura.ui.properties.sections.adapters.helper.TreeRoot;
import org.metamodel.tura.ui.properties.sections.context.ContextPropertySelection;

import domain.DomainFactory;
import domain.DomainPackage;
import domain.Form;
import domain.TypeElement;
import domain.Views;

public class EnabledPropertySelection extends ContextPropertySelection {

	@Override
	public String getLabelText() {
		return "On click event";
	}

	@Override
	public EObject getModel() {

		domain.Uielement el = ((domain.Uielement) getEObject());
		if (el.getEnabled() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							DomainPackage.eINSTANCE
									.getUielement_Enabled(),
							DomainFactory.eINSTANCE.createContext()));

		}

		return el.getEnabled();
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
			domain.Views views = (Views) ((domain.CanvasView) root.getElement()).getParent()
					.eContainer().eContainer();
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
