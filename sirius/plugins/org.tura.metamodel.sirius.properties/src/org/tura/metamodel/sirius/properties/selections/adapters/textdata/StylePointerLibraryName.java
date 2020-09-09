/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import application.ApplicationStyleLibraries;
import style.StylePackage;
import style.StylePointer;

public class StylePointerLibraryName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		StylePointer opt = (StylePointer) eObject;
		if (opt.getStyleLibrary() == null || opt.getStyleLibrary().getName() == null)
			return "";

		return ((ApplicationStyleLibraries) (opt.getStyleLibrary().eContainer().eContainer())).getName() + ":" + opt.getStyleLibrary().getName();
	}

	@Override
	public EStructuralFeature getFeature() {
		return StylePackage.eINSTANCE.getStylePointer_StyleLibrary();
	}

}
