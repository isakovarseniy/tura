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

package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ArtificialField;
import form.FormPackage;
import form.OptionSelection;
import type.Attribute;

public class SelectionDisplayOptionPointer implements DropDownDataAdapter {

    public EStructuralFeature[] getFeature() {

        return new EStructuralFeature[] { FormPackage.eINSTANCE.getSelection_DisplayOptionPointer() };
    }

    public String getFeatureAsText(Object eObject) {
        String name = null;
        if (((OptionSelection) eObject).getSelection().getDisplayOptionPointer() instanceof Attribute)
            name = ((Attribute) ((OptionSelection) eObject).getSelection().getDisplayOptionPointer())
                    .getName();

        if (((OptionSelection) eObject).getSelection().getDisplayOptionPointer() instanceof ArtificialField)
            name = ((ArtificialField) ((OptionSelection) eObject).getSelection().getDisplayOptionPointer()).getName();

        return name;
    }

    public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
            Object... obj) {
        if (feature.equals(FormPackage.eINSTANCE.getSelection_DisplayOptionPointer()))
            return values.get(obj[0]);

        return null;
    }

    public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
        if (((OptionSelection) eObject).getSelection().getDisplayOptionPointer() == null)
            return false;

        String name = null;
        if (((OptionSelection) eObject).getSelection().getDisplayOptionPointer() instanceof Attribute)
            name = ((Attribute) ((OptionSelection) eObject).getSelection()
                 .getDisplayOptionPointer()).getName();

        if (((OptionSelection) eObject).getSelection().getDisplayOptionPointer() instanceof ArtificialField)
            name = ((ArtificialField) ((OptionSelection) eObject).getSelection()
                    .getDisplayOptionPointer()).getName();

        if (name == null)
            return false;
        return values.get(key).equals(name);
    }

    public Object[] getWatchPointObject(Object eObject) {
        return new Object[] { ((OptionSelection) eObject).getOptionPointer(),
                ((OptionSelection) eObject).getOptionCast(),
                ((OptionSelection) eObject).getOptionCastDataControl() };
    }

    public EStructuralFeature[] getWatchPointFeature() {
        return new EStructuralFeature[] { FormPackage.eINSTANCE.getOptionSelection_OptionPointer(),
                FormPackage.eINSTANCE.getOptionSelection_OptionCast(),
                FormPackage.eINSTANCE.getOptionSelection_OptionCastDataControl() };
    }

    public Class<?> getExpectedClass() {
        return EObject.class;
    }

    @Override
    public Object getCurrentFeatureValue(Object eObject, EStructuralFeature feature) {
        return null;
    }
}