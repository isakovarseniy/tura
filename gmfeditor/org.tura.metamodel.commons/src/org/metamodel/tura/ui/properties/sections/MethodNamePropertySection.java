package org.metamodel.tura.ui.properties.sections;

import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
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

import domain.DomainPackage;

public class MethodNamePropertySection extends
		AbstractEnumerationPropertySection {

	protected HashMap<String, domain.Operation> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;

	protected EAttribute getFeature() {
		return DomainPackage.eINSTANCE.getBusinessMethod_Method();
	}

	protected String getFeatureAsText() {
		return ((domain.BusinessMethod) eObject).getMethod();
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (isFirstTime) {
			isFirstTime = false;
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			commandStackListener = new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					if (event.getSource() instanceof BasicCommandStack) {
						Command cmd = ((BasicCommandStack) event.getSource())
								.getMostRecentCommand();
						if (cmd instanceof SetCommand) {
							if (((SetCommand) cmd).getFeature().equals(
									DomainPackage.eINSTANCE
											.getTypePointer_TypeRef())) {
								values = null;

								EditingDomain editingDomain = ((DiagramEditor) getPart())
										.getEditingDomain();

								editingDomain.getCommandStack().execute(
										SetCommand.create(editingDomain,
												((SetCommand) cmd).getOwner(),
												getFeature(), null));

								refresh();
							}
						}
					}
				}
			};

			editingDomain.getCommandStack().addCommandStackListener(
					commandStackListener);
		}

	}

	protected Object getFeatureValue(Object key) {
		return values.get(key);
	}

	protected String getLabelText() {
		return "Method name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (((domain.BusinessMethod) eObject).getMethod() == null)
			return false;

		return values.get(key).equals(
				((domain.BusinessMethod) eObject).getMethod());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String, domain.Operation> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, domain.Operation>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if ((((domain.BusinessMethod) eObject).getTypeRef() == null)
					|| ((domain.BusinessMethod) eObject).getPackageRef() == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));		
			
			try {
				OCLExpression<EClassifier> query = helper
						.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
								+ ((domain.TypePointer) eObject)
										.getPackageRef().getName()
								+ "').oclAsType(domain::Package).typedefinition.types->select(r|r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = '"
								+ ((domain.BusinessMethod) eObject)
										.getTypeRef().getName()
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
