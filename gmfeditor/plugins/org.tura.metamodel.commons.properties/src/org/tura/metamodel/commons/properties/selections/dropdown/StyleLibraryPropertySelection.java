package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.properties.selections.adapters.dropdown.CSSMapperStylesLibraryRef;

import domain.DomainPackage;

public class StyleLibraryPropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected String getLabelText() {
		return "Styles Library";//$NON-NLS-1$
	}

	protected void init() {
		dropDownDataSupplier = new CSSMapperStylesLibraryRef();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (dropDownDataSupplier == null)
			init();

		if (values == null) {
			values = new LinkedHashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if (dropDownDataSupplier.getWatchPointObject(getModel())[0] == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {

				String strQuery = getQuery().replaceAll(
						"\\$1",
						((domain.StylesPackage) dropDownDataSupplier
								.getWatchPointObject(getModel())[0]).getUid());

				OCLExpression<EClassifier> query = helper.createQuery(strQuery);

				Collection<domain.StyleLibrary> map = (Collection<domain.StyleLibrary>) ocl
						.evaluate(types, query);

				for (Iterator<domain.StyleLibrary> i = map.iterator(); i
						.hasNext();) {
					domain.StyleLibrary p = i.next();
					values.put((p.getName()), p);
				}

			} catch (Exception e) {
				LogUtil.log(e);
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

	protected String getQuery() {
		return "domain::StylesPackage.allInstances()->select(r|r.oclAsType(domain::StylesPackage).uid='$1').oclAsType(domain::StylesPackage).styles.libraries->"
				+ "select(r|(r.oclIsKindOf(domain::StyleLibrary) and  r.oclAsType(domain::StyleLibrary).name <> null)  "
				+ ")";
	}

}
