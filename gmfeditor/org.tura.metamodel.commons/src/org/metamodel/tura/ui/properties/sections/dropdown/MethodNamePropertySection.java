package org.metamodel.tura.ui.properties.sections.dropdown;

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
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainMethodPointerMethodMethodRef;

import domain.DomainPackage;

public class MethodNamePropertySection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Method name";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new DomainMethodPointerMethodMethodRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if ((((domain.MethodPointer) getModel()).getTypeRef() == null)
					|| ((domain.MethodPointer) getModel()).getPackageRef() == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {
				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).uid='"
								+ ((domain.TypePointer) getModel())
										.getPackageRef().getUid()
								+ "').oclAsType(domain::Package).typedefinition.types->select(r|r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).uid = '"
								+ ((domain.MethodPointer) getModel())
										.getTypeRef().getUid()
								+ "').oclAsType(domain::Type).operations");

				Collection<domain.Operation> map = (Collection<domain.Operation>) ocl
						.evaluate(types, query);

				for (Iterator<domain.Operation> i = map.iterator(); i.hasNext();) {
					domain.Operation p = i.next();
					values.put(p.getName(), p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}
	@Override
	public EObject getModel() {
		return getEObject();
	}
	@Override
	public EObject getModel(EStructuralFeature feature) {
		return getEObject();
	}

}
