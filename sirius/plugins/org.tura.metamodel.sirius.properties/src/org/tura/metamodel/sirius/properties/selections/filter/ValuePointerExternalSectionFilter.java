/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import form.DataScroller;
import form.SourcesPointer;
import form.Table;
import form.TimeLine;
import form.Tree;

public class ValuePointerExternalSectionFilter extends SourcesPointerSectionFilter {

	@Override
	public boolean select(Object toTest) {
		EditPart editPart = (EditPart) toTest;

		if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
			DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
			EObject element = obj.getTarget();

			if (element instanceof SourcesPointer 
					&& !(element instanceof Tree) 
					&& !(element instanceof  Table)
					&& !(element instanceof  DataScroller)
					&& !(element instanceof  TimeLine)
					) {
				return !isNotExternalControlExists(element);
			}
		}
		return false;
	}

}
