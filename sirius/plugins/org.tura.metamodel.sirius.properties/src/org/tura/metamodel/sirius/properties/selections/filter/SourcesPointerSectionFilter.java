/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
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

import form.DataScroller;
import form.SourcesPointer;
import form.Table;
import form.TimeLine;
import form.Tree;
import form.Views;

public class SourcesPointerSectionFilter implements IFilter {

    @Override
    public boolean select(Object toTest) {
        EditPart editPart = (EditPart) toTest;

        if (((View) editPart.getModel()).getElement() instanceof DRepresentationElement) {
            DRepresentationElement obj = (DRepresentationElement) ((View) editPart.getModel()).getElement();
            EObject element = obj.getTarget();

            if (element instanceof SourcesPointer) {
                return isNotExternalControlExists(element);
            }
        }
        return false;
    }

    
    protected boolean isNotExternalControlExists(EObject obj){
        EObject parent = obj.eContainer();
        if (parent instanceof Tree || parent instanceof Table || parent instanceof DataScroller || parent instanceof TimeLine){
            return false;
        }
        if (parent instanceof Views){
            return true;
        }
        return isNotExternalControlExists(parent);
    }
    
    
}