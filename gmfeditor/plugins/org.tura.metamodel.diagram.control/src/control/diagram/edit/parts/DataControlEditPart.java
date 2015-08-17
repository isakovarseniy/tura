/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package control.diagram.edit.parts;

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

import control.diagram.edit.policies.DataControlItemSemanticEditPolicy;
import control.diagram.edit.policies.OpenDiagramEditPolicy;
import control.diagram.part.DomainVisualIDRegistry;
import control.diagram.providers.DomainElementTypes;
import domain.DomainPackage;
import domain.Orderable;

/**
 * @generated
 */
public class DataControlEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1102002;

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
	public DataControlEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DomainVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DataControlItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
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
		return primaryShape = new DataControlFigure();
	}

	/**
	* @generated
	*/
	public DataControlFigure getPrimaryShape() {
		return (DataControlFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataControlNameEditPart) {
			((DataControlNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureDataControlLabelFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreQueryTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreQueryTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPostQueryTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPostQueryTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreInsertTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreInsertTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreDeleteTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreDeleteTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostCreateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPostCreateTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPostCreateTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreUpdateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreUpdateTriggerCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlPreUpdateTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlCreateCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlCreateCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlCreateCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlInsertCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlInsertCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlInsertCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlUpdateCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlUpdateCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlUpdateCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlRemoveCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlRemoveCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlRemoveCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlSearchCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlSearchCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlSearchCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlArtificialFieldsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlArtificialFieldsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataControlDataControlArtificialFieldsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataControlNameEditPart) {
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreQueryTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreQueryTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPostQueryTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPostQueryTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreInsertTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreInsertTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreDeleteTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreDeleteTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPostCreateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPostCreateTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPostCreateTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlPreUpdateTriggerCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlPreUpdateTriggerCompartmentFigure();
			pane.remove(((DataControlDataControlPreUpdateTriggerCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlCreateCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlCreateCompartmentFigure();
			pane.remove(((DataControlDataControlCreateCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlInsertCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlInsertCompartmentFigure();
			pane.remove(((DataControlDataControlInsertCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlUpdateCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlUpdateCompartmentFigure();
			pane.remove(((DataControlDataControlUpdateCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlRemoveCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlRemoveCompartmentFigure();
			pane.remove(((DataControlDataControlRemoveCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlSearchCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlSearchCompartmentFigure();
			pane.remove(((DataControlDataControlSearchCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataControlDataControlArtificialFieldsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDataControlArtificialFieldsCompartmentFigure();
			pane.remove(((DataControlDataControlArtificialFieldsCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof DataControlDataControlPreQueryTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPreQueryTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPostQueryTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPostQueryTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreInsertTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPreInsertTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreDeleteTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPreDeleteTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPostCreateTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPostCreateTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlPreUpdateTriggerCompartmentEditPart) {
			return getPrimaryShape().getDataControlPreUpdateTriggerCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlCreateCompartmentEditPart) {
			return getPrimaryShape().getDataControlCreateCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlInsertCompartmentEditPart) {
			return getPrimaryShape().getDataControlInsertCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlUpdateCompartmentEditPart) {
			return getPrimaryShape().getDataControlUpdateCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlRemoveCompartmentEditPart) {
			return getPrimaryShape().getDataControlRemoveCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlSearchCompartmentEditPart) {
			return getPrimaryShape().getDataControlSearchCompartmentFigure();
		}
		if (editPart instanceof DataControlDataControlArtificialFieldsCompartmentEditPart) {
			return getPrimaryShape().getDataControlArtificialFieldsCompartmentFigure();
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
					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, obj,
							DomainPackage.eINSTANCE.getOrderable_Order(), evt.getNewValue()));

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
		return getChildBySemanticHint(DomainVisualIDRegistry.getType(DataControlNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DomainElementTypes.PREQueryTrigger_1103002) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.POSTQueryTrigger_1103003) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PREInsertTrigger_1103004) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PREDeleteTrigger_1103005) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.POSTCreateTrigger_1103011) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.PREUpdateTrigger_1103010) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.CreateTrigger_1103012) {
				return getChildBySemanticHint(
						DomainVisualIDRegistry.getType(DataControlDataControlCreateCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.InsertTrigger_1103013) {
				return getChildBySemanticHint(
						DomainVisualIDRegistry.getType(DataControlDataControlInsertCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.UpdateTrigger_1103014) {
				return getChildBySemanticHint(
						DomainVisualIDRegistry.getType(DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.DeleteTrigger_1103015) {
				return getChildBySemanticHint(
						DomainVisualIDRegistry.getType(DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.SearchTrigger_1103016) {
				return getChildBySemanticHint(
						DomainVisualIDRegistry.getType(DataControlDataControlSearchCompartmentEditPart.VISUAL_ID));
			}
			if (type == DomainElementTypes.ArtificialField_1103008) {
				return getChildBySemanticHint(DomainVisualIDRegistry
						.getType(DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID));
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
	public class DataControlFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDataControlLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreQueryTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPostQueryTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreInsertTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreDeleteTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPostCreateTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlPreUpdateTriggerCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlCreateCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlInsertCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlUpdateCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlRemoveCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlSearchCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDataControlArtificialFieldsCompartmentFigure;

		/**
		 * @generated
		 */
		public DataControlFigure() {
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

			fFigureDataControlLabelFigure = new WrappingLabel();

			fFigureDataControlLabelFigure.setText("DataControl");

			fFigureDataControlLabelFigure.setFont(FFIGUREDATACONTROLLABELFIGURE_FONT);

			fFigureDataControlLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureDataControlLabelFigure);

			fDataControlPreQueryTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreQueryTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreQueryTriggerCompartmentFigure);

			fDataControlPostQueryTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPostQueryTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPostQueryTriggerCompartmentFigure);

			fDataControlPreInsertTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreInsertTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreInsertTriggerCompartmentFigure);

			fDataControlPreDeleteTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreDeleteTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreDeleteTriggerCompartmentFigure);

			fDataControlPostCreateTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPostCreateTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPostCreateTriggerCompartmentFigure);

			fDataControlPreUpdateTriggerCompartmentFigure = new RectangleFigure();

			fDataControlPreUpdateTriggerCompartmentFigure.setOutline(false);

			this.add(fDataControlPreUpdateTriggerCompartmentFigure);

			fDataControlCreateCompartmentFigure = new RectangleFigure();

			fDataControlCreateCompartmentFigure.setOutline(false);

			this.add(fDataControlCreateCompartmentFigure);

			fDataControlInsertCompartmentFigure = new RectangleFigure();

			fDataControlInsertCompartmentFigure.setOutline(false);

			this.add(fDataControlInsertCompartmentFigure);

			fDataControlUpdateCompartmentFigure = new RectangleFigure();

			fDataControlUpdateCompartmentFigure.setOutline(false);

			this.add(fDataControlUpdateCompartmentFigure);

			fDataControlRemoveCompartmentFigure = new RectangleFigure();

			fDataControlRemoveCompartmentFigure.setOutline(false);

			this.add(fDataControlRemoveCompartmentFigure);

			fDataControlSearchCompartmentFigure = new RectangleFigure();

			fDataControlSearchCompartmentFigure.setOutline(false);

			this.add(fDataControlSearchCompartmentFigure);

			fDataControlArtificialFieldsCompartmentFigure = new RectangleFigure();

			fDataControlArtificialFieldsCompartmentFigure.setOutline(false);

			this.add(fDataControlArtificialFieldsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDataControlLabelFigure() {
			return fFigureDataControlLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreQueryTriggerCompartmentFigure() {
			return fDataControlPreQueryTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPostQueryTriggerCompartmentFigure() {
			return fDataControlPostQueryTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreInsertTriggerCompartmentFigure() {
			return fDataControlPreInsertTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreDeleteTriggerCompartmentFigure() {
			return fDataControlPreDeleteTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPostCreateTriggerCompartmentFigure() {
			return fDataControlPostCreateTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlPreUpdateTriggerCompartmentFigure() {
			return fDataControlPreUpdateTriggerCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlCreateCompartmentFigure() {
			return fDataControlCreateCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlInsertCompartmentFigure() {
			return fDataControlInsertCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlUpdateCompartmentFigure() {
			return fDataControlUpdateCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlRemoveCompartmentFigure() {
			return fDataControlRemoveCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlSearchCompartmentFigure() {
			return fDataControlSearchCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDataControlArtificialFieldsCompartmentFigure() {
			return fDataControlArtificialFieldsCompartmentFigure;
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
	static final Font FFIGUREDATACONTROLLABELFIGURE_FONT = new Font(Display.getCurrent(), "Palatino", 12, SWT.ITALIC);

}
