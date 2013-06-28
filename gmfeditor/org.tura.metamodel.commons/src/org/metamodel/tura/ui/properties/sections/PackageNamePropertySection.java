package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.tura.metamodel.commons.types.impl.RefTypeImpl;

import tura.impl.PackageImpl;
import tura.impl.TypesImpl;
import typedefinition.TypePointer;
import typedefinition.TypedefinitionPackage;


public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private ArrayList<String> values;

	protected EAttribute getFeature() {
		return TypedefinitionPackage.eINSTANCE.getTypePointer_Type();
	}

	protected String getFeatureAsText() {
		if (((TypePointer) eObject).getType() != null)
			return ((TypePointer) eObject).getType()
					.getPackageName();
		else
			return null;
	}

	protected Object getFeatureValue(int index) {
		RefTypeImpl result = new RefTypeImpl();
		result.setPackageName(values.get(index));
		return result;
	}

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((TypePointer) eObject).getType() == null)
			return false;
		return values.get(index).equals(
				((TypePointer) eObject).getType().getPackageName());
	}

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