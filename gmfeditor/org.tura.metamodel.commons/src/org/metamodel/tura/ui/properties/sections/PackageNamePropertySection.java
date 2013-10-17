package org.metamodel.tura.ui.properties.sections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.DomainPackage;

public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private LinkedHashMap<String,domain.Package> values;

	protected EStructuralFeature getFeature() {
		return DomainPackage.eINSTANCE.getTypePointer_PackageRef();
	}

	protected String getFeatureAsText() {
		if (((domain.TypePointer) eObject).getPackageRef() != null)
		    return ((domain.TypePointer) eObject).getPackageRef().getName();
		else
			return "";
	}

	protected Object getFeatureValue(Object key) {
		return values.get(key);
	}

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (((domain.TypePointer) eObject).getPackageRef() == null)
			return false;
		if (((domain.TypePointer) eObject).getPackageRef().getName() == null)
			return false;
		return values.get(key).equals(
				((domain.TypePointer) eObject).getPackageRef().getName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String,?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new LinkedHashMap<String,domain.Package>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			try {
				OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
				OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
						.createOCLHelper();
				helper.setContext(DomainPackage.eINSTANCE
						.getEClassifier("Types"));

				EObject types = (EObject) diagram.getElement();

				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->asOrderedSet()->select(r|r.oclIsKindOf(domain::Package) and  r.oclAsType(domain::Package).name <> null)");

				Collection<domain.Package> map = (Collection<domain.Package>) ocl
						.evaluate(types, query);

				for (Iterator<domain.Package> i = map.iterator(); i.hasNext();) {
					domain.Package p = i.next();
					values.put(p.getName(),p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}
}