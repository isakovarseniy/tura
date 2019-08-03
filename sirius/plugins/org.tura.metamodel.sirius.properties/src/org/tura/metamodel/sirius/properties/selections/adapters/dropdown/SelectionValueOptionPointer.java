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
package org.tura.metamodel.sirius.properties.selections.adapters.dropdown;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.DropDownDataAdapter;

import form.ArtificialField;
import form.SelectOneFromListOfOptions;
import form.FormPackage;
import form.OptionSelection;
import type.Attribute;

public class SelectionValueOptionPointer implements DropDownDataAdapter {

    public EStructuralFeature[] getFeature() {

        return new EStructuralFeature[] { FormPackage.eINSTANCE.getSelection_ValueOptionPointer() };
    }

    public String getFeatureAsText(Object eObject) {
        String name = null;
        if (((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer() instanceof Attribute)
            name = ((Attribute) ((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer())
                    .getName();

        if (((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer() instanceof ArtificialField)
            name = ((ArtificialField) ((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer()).getName();

        return name;
    }

    public Object getSelectedFeatureValue(Object eObject, Map<String, Object> values, EStructuralFeature feature,
            Object... obj) {
        if (feature.equals(FormPackage.eINSTANCE.getSelection_ValueOptionPointer()))
            return values.get(obj[0]);

        return null;
    }

    public boolean isEqual(Map<String, Object> values, Object key, Object eObject) {
        if (((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer() == null)
            return false;

        String name = null;
        if (((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer() instanceof Attribute)
            name = ((Attribute) ((SelectOneFromListOfOptions) eObject).getSelection()
                .getValueOptionPointer()).getName();

        if (((SelectOneFromListOfOptions) eObject).getSelection().getValueOptionPointer() instanceof ArtificialField)
            name = ((ArtificialField) ((SelectOneFromListOfOptions) eObject).getSelection()
                    .getValueOptionPointer()).getName();

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