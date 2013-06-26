package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.tura.metamodel.commons.types.impl.RefTypeImpl;

import tura.impl.PackageImpl;
import tura.impl.TypesImpl;
import typedefinition.TypeReference;
import typedefinition.TypedefinitionPackage;

/**
 * A section for the shot property of a selected player Object.
 * 
 * @author Anthony Hunter
 */
public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private ArrayList<String> values;

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
		if (((typedefinition.TypeReference) eObject).getType() != null)
			return ((typedefinition.TypeReference) eObject).getType()
					.getPackageName();
		else
			return null;
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getFeatureValue(int)
	 */
	protected Object getFeatureValue(int index) {
		RefTypeImpl result = new RefTypeImpl();
		result.setPackageName(values.get(index));
		return result;
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getLabelText()
	 */
	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#isEqual(int)
	 */
	protected boolean isEqual(int index) {
		if (((TypeReference) eObject).getType() == null)
			return false;
		return values.get(index).equals(
				((TypeReference) eObject).getType().getPackageName());
	}

	/**
	 * @see org.eclipse.ui.examples.views.properties.tabbed.hockeyleague.ui.properties.sections.AbstractEnumerationPropertySection#getEnumerationFeatureValues()
	 */
	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			PackageImpl pckg = (PackageImpl) diagram.getElement();
			TypesImpl types = (TypesImpl) pckg.eContainer();

			for (Iterator<tura.Package> i = types.getPackages().iterator(); i
					.hasNext();) {
				tura.Package p = i.next();
				if (p.getName() != null)
					values.add(p.getName());
			}
			values.add("Primitives");
		}

		return values.toArray(new String[values.size()]);
	}
}