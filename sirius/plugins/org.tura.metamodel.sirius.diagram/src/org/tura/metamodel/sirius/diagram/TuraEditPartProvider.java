/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.diagram;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartment2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartmentEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusVisualIDRegistry;

public class TuraEditPartProvider extends AbstractEditPartProvider {

	public final static String MODEL_ID = "Sirius"; //$NON-NLS-1$

	/**
	 * @was-generated
	 */
	protected IGraphicalEditPart createEditPart(View view) {
		switch (SiriusVisualIDRegistry.getVisualID(view)) {

		case DNodeContainerViewNodeContainerCompartmentEditPart.VISUAL_ID:
			return new TuraContainerViewNodeContainerCompartmentEditPart(view);

		case DNodeContainerViewNodeContainerCompartment2EditPart.VISUAL_ID:
			return new TuraContainerViewNodeContainerCompartment2EditPart(view);

		}
		return null;

	}

	/**
	 * @was-generated
	 */
	public synchronized IGraphicalEditPart createGraphicEditPart(View view) {
		return createEditPart(view);
	}

	/**
	 * @was-generated NOT customize the root edit part.
	 */
	public synchronized boolean provides(IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			View view = ((IEditPartOperation) operation).getView();
			if (!MODEL_ID.equals(SiriusVisualIDRegistry.getModelID(view))) {
				return false;
			}else{
				if ((SiriusVisualIDRegistry.getVisualID(view) == DNodeContainerViewNodeContainerCompartmentEditPart.VISUAL_ID)
						||
						(SiriusVisualIDRegistry.getVisualID(view) == DNodeContainerViewNodeContainerCompartment2EditPart.VISUAL_ID)
					){
						return true;
					}else{
						return false;
					}
			}
		}
		return false;
	}
}
