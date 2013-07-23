package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import typesrepository.TypesrepositoryPackage;
import typesrepository.impl.TypesImpl;
import typedefinition.Type;
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
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(TypesrepositoryPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) diagram.getElement();

				OCLExpression<EClassifier> query = helper
						.createQuery("typesrepository::Package.allInstances()");
Object qq = ocl.evaluate(types, query);
System.out.print("");
				
				//				Collection<typedefinition.Type> map = (Collection<Type>) ocl
//						.evaluate(types, query);

				// EObject pckg = (EObject) diagram.getElement();
				// TypesImpl types = (TypesImpl) pckg.eContainer();
				//
				// for (Iterator<typesrepository.Package> i =
				// types.getPackages().iterator(); i
				// .hasNext();) {
				// typesrepository.Package p = i.next();
				// if (p.getName() != null)
				// values.add(p.getName());
				// }
			} catch (Exception e) {
				e.printStackTrace();
			}
			values.add("Primitives");

		}

		return values.toArray(new String[values.size()]);
	}
}