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

package org.tura.metamodel.sirius.properties.selections.dropdown;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.adapters.dropdown.TranslationLanguage;

import application.ApplicationMessageLibraries;
import message.Language;
import message.Translation;

public class LanguagePropertySelection extends AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Language:";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new TranslationLanguage();
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String, Object>();
			
			ApplicationMessageLibraries lib = (ApplicationMessageLibraries) ((((Translation) getModel()).eContainer().eContainer()   )).eContainer().eContainer();
			if (lib.getApplicationLanguages() == null)
				return values;
			
			List<Language> languagies = lib.getApplicationLanguages().getLanguages();
			
			for (Language l : languagies) {
				values.put(l.getLang(), l);
			}
		}
		return values;
	}


	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getModel();
	}

}
