/*
 * 
 */
package businessobjects.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import businessobjects.diagram.edit.policies.BusinessObjectItemSemanticEditPolicy;
import businessobjects.diagram.edit.policies.OpenDiagramEditPolicy;
import businessobjects.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class BusinessObjectEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 602001;

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
	public BusinessObjectEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new BusinessObjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new BusinessObjectFigure();
	}

	/**
	 * @generated
	 */
	public BusinessObjectFigure getPrimaryShape() {
		return (BusinessObjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BusinessObjectNameEditPart) {
			((BusinessObjectNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureBusinessObjectLabelFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectCreateMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectInsertMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectUpdateMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectRemoveMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectSearchMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectOthersMethodsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BusinessObjectNameEditPart) {
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectCreateMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectInsertMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectUpdateMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectRemoveMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectSearchMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getBusinessObjectOthersMethodsCompartmentFigure();
			pane.remove(((BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectCreateMethodsCompartmentFigure();
		}
		if (editPart instanceof BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectInsertMethodsCompartmentFigure();
		}
		if (editPart instanceof BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectUpdateMethodsCompartmentFigure();
		}
		if (editPart instanceof BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectRemoveMethodsCompartmentFigure();
		}
		if (editPart instanceof BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectSearchMethodsCompartmentFigure();
		}
		if (editPart instanceof BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart) {
			return getPrimaryShape()
					.getBusinessObjectOthersMethodsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
		return getChildBySemanticHint(DomainVisualIDRegistry
				.getType(BusinessObjectNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class BusinessObjectFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBusinessObjectLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectCreateMethodsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectInsertMethodsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectUpdateMethodsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectRemoveMethodsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectSearchMethodsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBusinessObjectOthersMethodsCompartmentFigure;

		/**
		 * @generated
		 */
		public BusinessObjectFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureBusinessObjectLabelFigure = new WrappingLabel();

			fFigureBusinessObjectLabelFigure.setText("BusinessObject");

			fFigureBusinessObjectLabelFigure
					.setFont(FFIGUREBUSINESSOBJECTLABELFIGURE_FONT);

			fFigureBusinessObjectLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureBusinessObjectLabelFigure);

			fBusinessObjectCreateMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectCreateMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectCreateMethodsCompartmentFigure);

			fBusinessObjectInsertMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectInsertMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectInsertMethodsCompartmentFigure);

			fBusinessObjectUpdateMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectUpdateMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectUpdateMethodsCompartmentFigure);

			fBusinessObjectRemoveMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectRemoveMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectRemoveMethodsCompartmentFigure);

			fBusinessObjectSearchMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectSearchMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectSearchMethodsCompartmentFigure);

			fBusinessObjectOthersMethodsCompartmentFigure = new RectangleFigure();

			fBusinessObjectOthersMethodsCompartmentFigure.setOutline(false);

			this.add(fBusinessObjectOthersMethodsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBusinessObjectLabelFigure() {
			return fFigureBusinessObjectLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectCreateMethodsCompartmentFigure() {
			return fBusinessObjectCreateMethodsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectInsertMethodsCompartmentFigure() {
			return fBusinessObjectInsertMethodsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectUpdateMethodsCompartmentFigure() {
			return fBusinessObjectUpdateMethodsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectRemoveMethodsCompartmentFigure() {
			return fBusinessObjectRemoveMethodsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectSearchMethodsCompartmentFigure() {
			return fBusinessObjectSearchMethodsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBusinessObjectOthersMethodsCompartmentFigure() {
			return fBusinessObjectOthersMethodsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREBUSINESSOBJECTLABELFIGURE_FONT = new Font(
			Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}
