/*
 * 
 */
package uipackage.diagram.edit.parts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import org.tura.metamodel.commons.editparts.OrderedDefaultSizeNodeFigure;
import uipackage.diagram.edit.policies.FormItemSemanticEditPolicy;
import uipackage.diagram.edit.policies.OpenDiagramEditPolicy;
import uipackage.diagram.part.DomainVisualIDRegistry;
import uipackage.diagram.providers.DomainElementTypes;
import domain.DomainPackage;
import domain.Orderable;

/**
 * @generated
 */
public class FormEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1002002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public FormEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				DomainVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new FormItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new FormFigure();
	}

	/**
	 * @generated
	 */
	public FormFigure getPrimaryShape() {
		return (FormFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FormNameEditPart) {
			((FormNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureFormLabelFigure());
			return true;
		}
		if (childEditPart instanceof FormFormViewCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormViewCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FormFormViewCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FormFormDatacontrolsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormDatacontrolsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FormFormDatacontrolsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FormFormParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormParametersCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((FormFormParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof FormNameEditPart) {
			return true;
		}
		if (childEditPart instanceof FormFormViewCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormViewCompartmentFigure();
			pane.remove(((FormFormViewCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FormFormDatacontrolsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormDatacontrolsCompartmentFigure();
			pane.remove(((FormFormDatacontrolsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof FormFormParametersCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFormParametersCompartmentFigure();
			pane.remove(((FormFormParametersCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof FormFormViewCompartmentEditPart) {
			return getPrimaryShape().getFormViewCompartmentFigure();
		}
		if (editPart instanceof FormFormDatacontrolsCompartmentEditPart) {
			return getPrimaryShape().getFormDatacontrolsCompartmentFigure();
		}
		if (editPart instanceof FormFormParametersCompartmentEditPart) {
			return getPrimaryShape().getFormParametersCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new OrderedDefaultSizeNodeFigure(40, 40);
		result.addPropertyChangeListener("order", new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				EObject obj = ((View) getModel()).getElement();
				if (obj instanceof Orderable) {
					EditingDomain editingDomain = getEditingDomain();
					editingDomain.getCommandStack().execute(
							SetCommand.create(editingDomain, obj, DomainPackage.eINSTANCE.getOrderable_Order(),
									evt.getNewValue()));

				}
			}
		});

		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DomainVisualIDRegistry.getType(FormNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DomainElementTypes.FormView_1003001) {
				return getChildBySemanticHint(DomainVisualIDRegistry.getType(FormFormViewCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.FormDataControls_1003002) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(FormFormDatacontrolsCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.FormParameter_1003003) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(FormFormParametersCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class FormFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFormLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFormViewCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFormDatacontrolsCompartmentFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fFormParametersCompartmentFigure;

		/**
		 * @generated
		 */
		public FormFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFormLabelFigure = new WrappingLabel();

			fFigureFormLabelFigure.setText("Form");

			fFigureFormLabelFigure.setFont(FFIGUREFORMLABELFIGURE_FONT);

			fFigureFormLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureFormLabelFigure);

			fFormViewCompartmentFigure = new RectangleFigure();

			fFormViewCompartmentFigure.setOutline(false);

			this.add(fFormViewCompartmentFigure);

			fFormDatacontrolsCompartmentFigure = new RectangleFigure();

			fFormDatacontrolsCompartmentFigure.setOutline(false);

			this.add(fFormDatacontrolsCompartmentFigure);

			fFormParametersCompartmentFigure = new RectangleFigure();

			fFormParametersCompartmentFigure.setOutline(false);

			this.add(fFormParametersCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFormLabelFigure() {
			return fFigureFormLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormViewCompartmentFigure() {
			return fFormViewCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormDatacontrolsCompartmentFigure() {
			return fFormDatacontrolsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFormParametersCompartmentFigure() {
			return fFormParametersCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 241, 238, 203);

	/**
	 * @generated
	 */
	static final Font FFIGUREFORMLABELFIGURE_FONT = new Font(Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}
