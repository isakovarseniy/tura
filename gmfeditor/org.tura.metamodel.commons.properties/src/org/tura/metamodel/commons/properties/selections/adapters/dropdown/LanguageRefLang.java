package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import java.util.HashMap;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.DropDownDataAdapter;

import domain.DomainPackage;

public class LanguageRefLang implements DropDownDataAdapter {

	public EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { DomainPackage.eINSTANCE.getLanguageRef_Lang() };
	}

	public String getFeatureAsText(Object eObject) {
		String result = "";
		domain.LanguageRef lang = (domain.LanguageRef) eObject;
		if (lang.getLang() == null)
			return "";

		if (lang.getLang().getLang() == null)
			result = "";
		else
			result = lang.getLang().getLang();
		return result;
	}

	public Object getFeatureValue(Object eObject, HashMap<String, Object> values, EStructuralFeature feature,
			Object... obj) {
			return ((domain.Language) values.get(obj[0]));

	}

	public boolean isEqual(HashMap<String, Object> values, Object key, Object eObject) {
		return true;
	}

	public Object[] getWatchPointObject(Object eObject) {
		return new Object[] { };
	}

	public EStructuralFeature[] getWatchPointFeature() {
		return new EStructuralFeature[] {  };
	}

	public Class<?> getExpectedClass() {
		return null;
	}

}
