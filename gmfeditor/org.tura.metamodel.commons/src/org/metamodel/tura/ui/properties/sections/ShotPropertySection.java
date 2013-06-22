package org.metamodel.tura.ui.properties.sections;


import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import typedefinition.TypeReference;
import typedefinition.TypedefinitionPackage;

/**
 * A section for the shot property of a selected player Object.
 * 
 * @author Anthony Hunter
 */
public class ShotPropertySection
	extends AbstractEnumerationPropertySection {

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getFeature()
	 */
	protected EAttribute getFeature() {
		return TypedefinitionPackage.eINSTANCE.getTypeReference_Type();
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getFeatureAsText()
	 */
	protected String getFeatureAsText() {
		return ((typedefinition.TypeReference) eObject).getType().toString();
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getFeatureValue(int)
	 */
	protected Object getFeatureValue(int index) {
		return ShotKind.VALUES.get(index);
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getLabelText()
	 */
	protected String getLabelText() {
		return "Shot:";//$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#isEqual(int)
	 */
	protected boolean isEqual(int index) {
		return ShotKind.VALUES.get(index).equals(((TypeReference) eObject).getType());
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getEnumerationFeatureValues()
	 */
	protected String[] getEnumerationFeatureValues() {
		List values = ShotKind.VALUES;
		String[] ret = new String[values.size()];
		for (int i = 0; i < values.size(); i++) {
			ret[i] = ((ShotKind) values.get(i)).getName();
		}
		return ret;
	}
}