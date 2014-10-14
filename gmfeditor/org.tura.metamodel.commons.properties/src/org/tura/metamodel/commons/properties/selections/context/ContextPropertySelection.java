package org.tura.metamodel.commons.properties.selections.context;

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
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.commons.properties.TextChangeHelper;
import org.tura.metamodel.commons.properties.selections.AbstractTuraPropertySection;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TriggerHolder;

import domain.Context;
import domain.ContextParameters;
import domain.ContextValue;
import domain.DomainFactory;
import domain.DomainPackage;

public abstract class ContextPropertySelection extends
		AbstractTuraPropertySection {

	protected Button btnConfirm;
	protected Button btnDialog;
	protected Text text;
	protected TextChangeHelper listener;
	protected CLabel nameLabel;
	protected Text text1;
	protected CLabel nameLabel1;
	private TreePath[] treePath;

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
		data.right = new FormAttachment(text1, 400);
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
		if (((domain.Context) getModel()).getValue() != null) {
			text.setText(((domain.Context) getModel()).getValue());
			text1.setText(((domain.Context) getModel()).getValue());
		} else {
			text.setText("");
			text1.setText("");
		}
		btnConfirm.setSelection(((domain.Context) getModel()).isConstant());
		configure();
	}

	private void configure() {
		domain.Context obj = (Context) getModel();
		if (! obj.isConstant()) {
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
										DomainPackage.eINSTANCE
												.getContextValue_Value(),
										newText));
			} else {
				CompoundCommand compoundCommand = new CompoundCommand();
				/* apply the property change to all selected elements */
				for (Iterator<?> i = eObjectList.iterator(); i.hasNext();) {
					EObject nextObject = (EObject) i.next();
					compoundCommand.append(SetCommand.create(editingDomain,
							nextObject,
							DomainPackage.eINSTANCE.getContextValue_Value(),
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
				} else {
					showError();
				}

			}
		}
	}

	protected void handleIsExpressionPress() {

		EditingDomain editingDomain = ((DiagramEditor) getPart())
				.getEditingDomain();

		updateConstant(editingDomain, (ContextValue) getModel(),
				btnConfirm.getSelection());
		updateConstantValue(editingDomain, (ContextValue) getModel(), null);
		removeExpession(editingDomain, (ContextValue) getModel());
		removeParameters(editingDomain, (ContextParameters) getModel());

		this.propertySheetPage.refresh();

	}

	protected boolean isEqual(String newText) {
		if (((domain.Context) getModel()).getValue() == null)
			return false;
		return ((domain.Context) getModel()).getValue().equals(newText);
	}

	protected List<domain.ExpressionPart> buildExpressionList(TreePath path) {
		ArrayList<domain.ExpressionPart> ls = new ArrayList<>();
		for (int i = 0; i < path.getSegmentCount(); i++) {
			domain.ExpressionPart part = DomainFactory.eINSTANCE
					.createExpressionPart();
			if (path.getSegment(i) instanceof EObject)
				part.setObjRef((EObject) path.getSegment(i));

			if (path.getSegment(i) instanceof TriggerHolder)
				part.setObjRef(((TriggerHolder) path.getSegment(i))
						.getTrigger());

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
			domain.ContextValue param, String value) {
		String valueString = null;
		if (value != null)
			valueString = ((String) value).trim();

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param,
						DomainPackage.eINSTANCE.getContextValue_Value(),
						valueString));

	}

	public void updateConstant(EditingDomain editingDomain,
			domain.ContextValue param, boolean value) {

		/* apply the property change to single selected object */
		editingDomain.getCommandStack().execute(
				SetCommand.create(editingDomain, param,
						DomainPackage.eINSTANCE.getContextValue_Constant(),
						value));
	}

	public void updateExpession(EditingDomain editingDomain,
			domain.ContextValue param, List<domain.ExpressionPart> ls) {
		editingDomain.getCommandStack().execute(
				AddCommand.create(editingDomain, param,
						DomainPackage.eINSTANCE.getContextValue_Expression(),
						ls));

	}

	public void removeExpession(EditingDomain editingDomain,
			domain.ContextValue param) {

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, param,
						DomainPackage.eINSTANCE.getContextValue_Expression(),
						param.getExpression()));

	}
	
	public void removeParameters(EditingDomain editingDomain, domain.ContextParameters model){

		editingDomain.getCommandStack().execute(
				RemoveCommand.create(editingDomain, model,
						DomainPackage.eINSTANCE.getContextParameters_Parameters(),
						model.getParameters()));
	}


	protected abstract TreeRoot getContextRoot();

	protected abstract boolean validateSelection(TreePath path);

	protected abstract void showError();

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
