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
package canvas.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.tura.metamodel.commons.editparts.HTMLLikeLayout;

import canvas.diagram.edit.policies.ColumnColumnElementCompartment2CanonicalEditPolicy;
import canvas.diagram.edit.policies.ColumnColumnElementCompartment2ItemSemanticEditPolicy;
import canvas.diagram.part.DomainVisualIDRegistry;
import canvas.diagram.part.Messages;
import canvas.diagram.providers.DomainElementTypes;
import domain.HTMLLayerHolder;

/**
 * @generated
 */
public class ColumnColumnElementCompartment2EditPart extends ShapeCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1607015;

	/**
	* @generated
	*/
	public ColumnColumnElementCompartment2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.ColumnColumnElementCompartment2EditPart_title;
	}

	/**
	* @generated
	*/

	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		HTMLLikeLayout layout = new HTMLLikeLayout();

		NodeImpl node = (NodeImpl) this.getParent().getModel();
		Object model = node.getElement();

		if (model instanceof HTMLLayerHolder)
			layout.setColumns(((HTMLLayerHolder) model).getColumns());
		else
			layout.setColumns(1);

		result.getContentPane().setLayoutManager(layout);

		return result;
	}

	protected void handleNotificationEvent(Notification event) {

		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			if (event.getNotifier() instanceof HTMLLayerHolder && event.getFeature() instanceof EAttribute) {
				EAttribute eAttribute = (EAttribute) event.getFeature();

				if (eAttribute.getName().equalsIgnoreCase("columns")) {
					ResizableCompartmentFigure figure = (ResizableCompartmentFigure) getFigure();
					HTMLLikeLayout layout = (HTMLLikeLayout) figure.getContentPane().getLayoutManager();
					layout.setColumns(event.getNewIntValue());
					figure.getContentPane().revalidate();
					figure.getUpdateManager().performUpdate();
				}
			}

			super.handleNotificationEvent(event);
		}

	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ColumnColumnElementCompartment2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DomainVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ColumnColumnElementCompartment2CanonicalEditPolicy());
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DomainElementTypes.InputText_1603012) {
				return this;
			}
			if (type == DomainElementTypes.OutputText_1603014) {
				return this;
			}
			if (type == DomainElementTypes.DropDownSelection_1603010) {
				return this;
			}
			if (type == DomainElementTypes.Date_1603031) {
				return this;
			}
			if (type == DomainElementTypes.Table_1603021) {
				return this;
			}
			if (type == DomainElementTypes.Tree_1603022) {
				return this;
			}
			if (type == DomainElementTypes.LayerHolder_1603020) {
				return this;
			}
			if (type == DomainElementTypes.CheckBox_1603015) {
				return this;
			}
			if (type == DomainElementTypes.Image_1603030) {
				return this;
			}
			if (type == DomainElementTypes.Label_1603013) {
				return this;
			}
			if (type == DomainElementTypes.Button_1603023) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
