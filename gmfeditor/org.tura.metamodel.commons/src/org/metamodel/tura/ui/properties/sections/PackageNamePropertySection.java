package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;

import typesrepository.impl.TypesImpl;
import typedefinition.TypePointer;
import typedefinition.TypedefinitionPackage;


public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private ArrayList<String> values;

	protected EAttribute getFeature() {
		return TypedefinitionPackage.eINSTANCE.getTypePointer_PackageName();
	}

	protected String getFeatureAsText() {
			return ((TypePointer) eObject).getPackageName();
	}

	protected Object getFeatureValue(int index) {
		return values.get(index);
	}

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((TypePointer) eObject).getPackageName() == null)
			return false;
		return values.get(index).equals(
				((TypePointer) eObject).getPackageName());
	}

	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			
			EObject pckg = (EObject) diagram.getElement();
			TypesImpl types = (TypesImpl) pckg.eContainer();

			for (Iterator<typesrepository.Package> i = types.getPackages().iterator(); i
					.hasNext();) {
				typesrepository.Package p = i.next();
				if (p.getName() != null)
					values.add(p.getName());
			}
			values.add("Primitives");
		}

		return values.toArray(new String[values.size()]);
	}
}