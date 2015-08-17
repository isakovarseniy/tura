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
package infarastructure.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import infarastructure.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case EnterpriseInfrastructureEditPart.VISUAL_ID:
				return new EnterpriseInfrastructureEditPart(view);

			case DatacenterEditPart.VISUAL_ID:
				return new DatacenterEditPart(view);

			case DatacenterNameEditPart.VISUAL_ID:
				return new DatacenterNameEditPart(view);

			case SubsystemEditPart.VISUAL_ID:
				return new SubsystemEditPart(view);

			case SubsystemNameEditPart.VISUAL_ID:
				return new SubsystemNameEditPart(view);

			case InfrastructureLayerEditPart.VISUAL_ID:
				return new InfrastructureLayerEditPart(view);

			case InfrastructureLayerNameEditPart.VISUAL_ID:
				return new InfrastructureLayerNameEditPart(view);

			case ServerEditPart.VISUAL_ID:
				return new ServerEditPart(view);

			case ServerNameEditPart.VISUAL_ID:
				return new ServerNameEditPart(view);

			case RouterEditPart.VISUAL_ID:
				return new RouterEditPart(view);

			case RouterNameEditPart.VISUAL_ID:
				return new RouterNameEditPart(view);

			case HubEditPart.VISUAL_ID:
				return new HubEditPart(view);

			case HubNameEditPart.VISUAL_ID:
				return new HubNameEditPart(view);

			case StorageEditPart.VISUAL_ID:
				return new StorageEditPart(view);

			case StorageNameEditPart.VISUAL_ID:
				return new StorageNameEditPart(view);

			case ServerClasterEditPart.VISUAL_ID:
				return new ServerClasterEditPart(view);

			case ServerClasterNameEditPart.VISUAL_ID:
				return new ServerClasterNameEditPart(view);

			case Server2EditPart.VISUAL_ID:
				return new Server2EditPart(view);

			case ServerName2EditPart.VISUAL_ID:
				return new ServerName2EditPart(view);

			case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
				return new DatacenterDatacenterSubsystemsCompartmentEditPart(view);

			case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
				return new SubsystemSubsystemInfrastructureLayerCompartmentEditPart(view);

			case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
				return new InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart(view);

			case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
				return new ServerClasterServerClasterServersCompartmentEditPart(view);

			case InfrastructureConnectionEditPart.VISUAL_ID:
				return new InfrastructureConnectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
