package org.tura.metamodel.commons.properties.sections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.properties.sections.dropdown.impl.DomainOperationPackageRef;
import org.tura.metamodel.commons.properties.sections.dropdown.impl.DomainTypePointerPackageRef;

import domain.DomainPackage;

public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected void init() {
		if (getModel() instanceof domain.TypePointer)
			dropDownDataSupplier = new DomainTypePointerPackageRef();
		if (getModel() instanceof domain.Operation)
			dropDownDataSupplier = new DomainOperationPackageRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, ?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();
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
					values.put(p.getName(), p);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}

	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

	@Override
	public EObject getModel() {
		return getEObject();
	}
}