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

public class TypeNamePropertySection extends AbstractEnumerationPropertySection {

	protected ArrayList<String> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;

	protected EAttribute getFeature() {
		return DomainPackage.eINSTANCE.getTypePointer_TypeName();
	}

	protected String getFeatureAsText() {
		return ((domain.TypePointer) eObject).getTypeName();

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
											.getTypePointer_PackageName())) {
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

	protected Object getFeatureValue(int index) {
		return values.get(index);
	}

	protected String getLabelText() {
		return "Type name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((domain.TypePointer) eObject).getTypeName() == null)
			return false;

		return values.get(index).equals(
				((domain.TypePointer) eObject).getTypeName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if (((domain.TypePointer) eObject).getPackageName() == null)
				return new String[] {};

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Types"));

			try {
				if ((((domain.TypePointer) eObject).getPackageName())
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
							.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
									+ ((domain.TypePointer) eObject)
											.getPackageName()
									+ "').oclAsType(domain::Package).typedefinition.types->select(r|r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name <> null)");

					Collection<domain.Type> map = (Collection<domain.Type>) ocl
							.evaluate(types, query);

					for (Iterator<domain.Type> i = map.iterator(); i.hasNext();) {
						domain.Type p = i.next();
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
