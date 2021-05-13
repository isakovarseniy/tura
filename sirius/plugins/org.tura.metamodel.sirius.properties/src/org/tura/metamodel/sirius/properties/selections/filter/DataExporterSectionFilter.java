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

package org.tura.metamodel.sirius.properties.selections.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.DataExporter;

public class DataExporterSectionFilter implements IFilter{

	
	@Override
	public boolean select(Object toTest) {
		EditPart editPart = (EditPart) toTest;

		if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
			EObject element = obj.getTarget();

			if (element instanceof DataExporter) {
				return true;
			}
		}
		return false;
	}
	
	
}