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
import org.tura.metamodel.commons.types.impl.RefTypeImpl;

import typesrepository.TypesrepositoryPackage;
import typedefinition.Type;
import typedefinition.TypedefinitionPackage;
import typedefinition.TypePointer;

public class TypeNamePropertySection extends AbstractEnumerationPropertySection {

	protected ArrayList<String> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;

	protected EAttribute getFeature() {
		return TypedefinitionPackage.eINSTANCE.getTypePointer_Type();
	}

	protected String getFeatureAsText() {
		if (((TypePointer) eObject).getType() != null)
			return ((TypePointer) eObject).getType().getTypeName();
		else
			return null;
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
									TypedefinitionPackage.eINSTANCE
											.getTypePointer_Type())) {
								values = null;
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

		RefTypeImpl tp = new RefTypeImpl();
		tp.setPackageName(((TypePointer) eObject).getType().getPackageName());
		tp.setTypeName(values.get(index));

		return tp;
	}

	protected String getLabelText() {
		return "Type name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((TypePointer) eObject).getType() == null)
			return false;

		return values.get(index).equals(
				((TypePointer) eObject).getType().getTypeName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject pckg = (EObject) diagram.getElement();
			EObject types = (EObject) pckg.eContainer();

			if ((((TypePointer) eObject).getType() == null)
					|| ((TypePointer) eObject).getType().getPackageName() == null)
				return new String[] {};

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(TypesrepositoryPackage.eINSTANCE.getEClassifier("Types"));

			try {
				if ((((TypePointer) eObject).getType().getPackageName())
						.equals("Primitives")) {
					OCLExpression<EClassifier> query = helper
							.createQuery("self.primitives");
					Collection<typesrepository.Primitive> map = (Collection<typesrepository.Primitive>) ocl
							.evaluate(types, query);
					for (Iterator<typesrepository.Primitive> i = map.iterator(); i
							.hasNext();) {
						typesrepository.Primitive p = i.next();
						values.add(p.getName());
					}
				} else {
					OCLExpression<EClassifier> query = helper
							.createQuery("self.packages->select(r|r.name='"
									+ ((TypePointer) eObject).getType()
											.getPackageName() + "').types->select(oclIsKindOf(typedefinition::Type))");
					Collection<typedefinition.Type> map = (Collection<Type>) ocl.evaluate(
							types, query);

					for (Iterator<typedefinition.Type> i = map.iterator(); i
							.hasNext();) {
						typedefinition.Type p = i.next();
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
