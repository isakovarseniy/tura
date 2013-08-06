package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
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

	protected ArrayList<String> values;
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
											.getTypePointer_TypeName())) {
								values = null;

								EditingDomain editingDomain = ((DiagramEditor) getPart())
										.getEditingDomain();
	
								editingDomain.getCommandStack().execute(
								SetCommand.create(editingDomain, ((SetCommand) cmd).getOwner(),
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

	protected Object getFeatureValue(int index) {
		return values.get(index);
	}

	protected String getLabelText() {
		return "Method name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((domain.BusinessMethod) eObject).getMethod() == null)
			return false;

		return values.get(index).equals(((domain.BusinessMethod) eObject).getMethod());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject pckg = (EObject) diagram.getElement();
			EObject types = (EObject) pckg.eContainer();

			if ((((domain.BusinessMethod) eObject).getTypeName() == null)
					|| ((domain.BusinessMethod) eObject).getPackageName() == null)
				return new String[] {};

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE
					.getEClassifier("Types"));

			try {
				if ((((domain.BusinessMethod) eObject).getPackageName())
						.equals("Primitives")) {
					OCLExpression<EClassifier> query = helper
							.createQuery("self.primitives");
					Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
							.evaluate(types, query);
					for (Iterator<domain.Primitive> i = map.iterator(); i
							.hasNext();) {
						domain.Primitive p = i.next();
						values.add(p.getName());
					}
				} else {
					OCLExpression<EClassifier> query = helper
							.createQuery("self.packages->select(r|r.name='"
									+ ((domain.BusinessMethod) eObject).getPackageName()
									+ "').types->select(r|r.oclIsKindOf(typedefinition::Type) and  r.oclAsType(typedefinition::Type).name='"
									+ ((domain.BusinessMethod) eObject).getTypeName()
									+ "').oclAsType(typedefinition::Type).operations");
					Collection<domain.Operation> map = (Collection<domain.Operation>) ocl
							.evaluate(types, query);

					for (Iterator<domain.Operation> i = map.iterator(); i
							.hasNext();) {
						domain.Operation p = i.next();
						values.add(p.getName());
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return values.toArray(new String[values.size()]);
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
