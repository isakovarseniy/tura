/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import org.eclipse.emf.ecore.EObject;

import form.DataScroller;
import form.SourcesPointer;
import form.Table;
import form.TimeLine;
import form.Tree;

public class SourcesPointerValuePointerExternalIterator extends
        SourcesPointerValuePointer {

    public Object[] getWatchPointObject(Object eObject) {

        EObject eobj = (EObject) eObject;
        do {
            eobj = eobj.eContainer();
            if (eobj == null)
                return new Object[] {};
        } while (!(eobj instanceof Table) && !(eobj instanceof Tree) && !(eobj instanceof DataScroller) && !(eobj instanceof TimeLine));

        return new Object[] {
                ((SourcesPointer) eobj).getSourcePointer(),
                ((SourcesPointer) eObject).getSourceCast(),
                ((SourcesPointer) eObject).getSourceCastDataControl()

        };
    }

}