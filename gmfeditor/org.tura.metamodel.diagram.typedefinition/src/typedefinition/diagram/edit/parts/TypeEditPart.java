/*
 * 
 */
package typedefinition.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

import typedefinition.diagram.edit.policies.OpenDiagramEditPolicy;
import typedefinition.diagram.edit.policies.TypeItemSemanticEditPolicy;
import typedefinition.diagram.part.DomainVisualIDRegistry;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 102002;

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
	public TypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						DomainVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TypeItemSemanticEditPolicy());
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
		return primaryShape = new TypeFigure();
	}

	/**
	 * @generated
	 */
	public TypeFigure getPrimaryShape() {
		return (TypeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TypeNameEditPart) {
			((TypeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof TypeTypeAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getTypeAttributesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TypeTypeAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TypeTypeOperationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getTypeOperationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TypeTypeOperationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TypeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof TypeTypeAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getTypeAttributesCompartmentFigure();
			pane.remove(((TypeTypeAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof TypeTypeOperationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getTypeOperationsCompartmentFigure();
			pane.remove(((TypeTypeOperationsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof TypeTypeAttributesCompartmentEditPart) {
			return getPrimaryShape().getTypeAttributesCompartmentFigure();
		}
		if (editPart instanceof TypeTypeOperationsCompartmentEditPart) {
			return getPrimaryShape().getTypeOperationsCompartmentFigure();
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
				.getType(TypeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.TypeExtension_104001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof typedefinition.diagram.edit.parts.TypeEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == DomainElementTypes.TypeExtension_104001) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.TypeExtension_104001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == DomainElementTypes.TypeExtension_104001) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == DomainElementTypes.Attribute_103001) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(TypeTypeAttributesCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.Operation_103002) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(TypeTypeOperationsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
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
	public class TypeFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTypeLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTypeAttributesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTypeOperationsCompartmentFigure;

		/**
		 * @generated
		 */
		public TypeFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTypeLabelFigure = new WrappingLabel();

			fFigureTypeLabelFigure.setText("Type");

			fFigureTypeLabelFigure.setFont(FFIGURETYPELABELFIGURE_FONT);

			fFigureTypeLabelFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureTypeLabelFigure);

			fTypeAttributesCompartmentFigure = new RectangleFigure();

			fTypeAttributesCompartmentFigure.setOutline(false);

			this.add(fTypeAttributesCompartmentFigure);

			fTypeOperationsCompartmentFigure = new RectangleFigure();

			fTypeOperationsCompartmentFigure.setOutline(false);

			this.add(fTypeOperationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTypeLabelFigure() {
			return fFigureTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTypeAttributesCompartmentFigure() {
			return fTypeAttributesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTypeOperationsCompartmentFigure() {
			return fTypeOperationsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 239, 222);

	/**
	 * @generated
	 */
	static final Font FFIGURETYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}
