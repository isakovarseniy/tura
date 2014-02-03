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
import org.metamodel.tura.ui.properties.sections.AbstractEnumerationPropertySection;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainOperationPackageRef;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainTypePointerPackageRef;

import domain.DomainPackage;

public class PackageNamePropertySection extends
		AbstractEnumerationPropertySection {

	private HashMap<String,Object> values;
	private DropDownDataSupplier packageNameProperty;
	

	protected EStructuralFeature[] getFeature() {
		if (packageNameProperty == null)
			init();
		return packageNameProperty.getFeature();
	}

	protected String getFeatureAsText() {
		if (packageNameProperty == null)
			init();
		return packageNameProperty.getFeatureAsText(eObject);
	}

	protected Object getFeatureValue(EStructuralFeature feature,Object... obj) {
		if (packageNameProperty == null)
			init();
		return packageNameProperty.getFeatureValue(eObject,values,feature,obj);
	}

	protected String getLabelText() {
		return "Package name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (packageNameProperty == null)
			init();
		return packageNameProperty.isEqual(values,key,eObject);
	}

	private void init(){
		if (eObject instanceof domain.TypePointer)
			packageNameProperty= new DomainTypePointerPackageRef();
		if (eObject instanceof domain.Operation)
			packageNameProperty= new DomainOperationPackageRef();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String,?> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String,Object>();
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