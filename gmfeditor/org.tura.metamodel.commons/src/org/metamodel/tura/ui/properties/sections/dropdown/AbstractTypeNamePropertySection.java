package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ui.IWorkbenchPart;
import org.metamodel.tura.ui.properties.sections.AbstractEnumerationPropertySection;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainOperationTypeRef;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainTypePointerTypeRef;

import domain.DomainPackage;

public abstract class AbstractTypeNamePropertySection extends
		AbstractEnumerationPropertySection {

	private HashMap<String, Object> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;
	private DropDownDataSupplier typeNameProperty;

	protected EStructuralFeature[] getFeature() {
		if (typeNameProperty == null)
			init();
		return typeNameProperty.getFeature();
	}

	protected String getFeatureAsText() {
		if (typeNameProperty == null)
			init();
		return typeNameProperty.getFeatureAsText(eObject);
	}

	protected Object getFeatureValue(EStructuralFeature feature, Object... obj) {
		if (typeNameProperty == null)
			init();
		return typeNameProperty.getFeatureValue(eObject, values, feature, obj);
	}

	protected String getLabelText() {
		return "Type name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (typeNameProperty == null)
			init();
		return typeNameProperty.isEqual(values, key, eObject);
	}

	private void init() {
		if (eObject instanceof domain.TypePointer)
			typeNameProperty = new DomainTypePointerTypeRef();
		if (eObject instanceof domain.Operation)
			typeNameProperty = new DomainOperationTypeRef();
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(typeNameProperty
							.getExpectedClass()) == typeNameProperty
							.getWatchPointFeature().getFeatureID()) {
						values = null;

						EditingDomain editingDomain = ((DiagramEditor) getPart())
								.getEditingDomain();
						CompoundCommand compoundCommand = new CompoundCommand();
						EStructuralFeature[] features = getFeature();
						for (int i = 0; i < features.length; i++) {
							if (features[i].getFeatureID() != typeNameProperty
									.getWatchPointFeature().getFeatureID())
								compoundCommand.append(SetCommand.create(
										editingDomain, eObject, features[i],
										null));
						}
						editingDomain.getCommandStack()
								.execute(compoundCommand);
						refresh();
					}
				}

			};
			eObject.eAdapters().add(adapter);
		}

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, Object> getEnumerationFeatureValues() {
		if (typeNameProperty == null)
			init();

		if (values == null) {
			values = new HashMap<String, Object>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if (typeNameProperty.getWatchPointObject(eObject) == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {

				String strQuery = getQuery().replaceAll("\\$1",
						((domain.Package)typeNameProperty.getWatchPointObject(eObject)).getUid());

				OCLExpression<EClassifier> query = helper.createQuery(strQuery);

				Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
						.evaluate(types, query);

				for (Iterator<domain.TypeElement> i = map.iterator(); i
						.hasNext();) {
					domain.TypeElement p = i.next();
					values.put((p.getName()), p);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values;
	}

	protected abstract String getQuery();

	public void dispose() {
		super.dispose();
		if (getPart() != null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			if (commandStackListener != null) {
				editingDomain.getCommandStack().removeCommandStackListener(
						commandStackListener);
			}
		}
	}

}
