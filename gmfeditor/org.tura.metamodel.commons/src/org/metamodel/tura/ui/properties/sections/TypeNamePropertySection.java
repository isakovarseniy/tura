package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.tura.metamodel.commons.types.impl.RefTypeImpl;

import tura.impl.PackageImpl;
import tura.impl.TypesImpl;
import typedefinition.TypeElement;
import typedefinition.TypeReference;
import typedefinition.TypedefinitionPackage;

public class TypeNamePropertySection extends AbstractEnumerationPropertySection {

	protected ArrayList<String> values;
	private boolean isFirstTime = true;

	protected EAttribute getFeature() {
		return TypedefinitionPackage.eINSTANCE.getTypeReference_Type();
	}

	protected String getFeatureAsText() {
		if (((typedefinition.TypeReference) eObject).getType() != null)
			return ((typedefinition.TypeReference) eObject).getType()
					.getTypeName();
		else
			return null;
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (isFirstTime) {
			isFirstTime = false;
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			editingDomain.getCommandStack().addCommandStackListener(

			new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					if (event.getSource() instanceof BasicCommandStack) {
						Command cmd = ((BasicCommandStack) event.getSource())
								.getMostRecentCommand();
						if (cmd instanceof SetCommand) {
							if (((SetCommand) cmd).getFeature().equals(
									TypedefinitionPackage.eINSTANCE
											.getTypeReference_Type())) {
								values = null;
								refresh();
							}
						}
					}
				}
			});
		}

	}

	protected Object getFeatureValue(int index) {

		RefTypeImpl tp = new RefTypeImpl();
		tp.setPackageName(((TypeReference) eObject).getType().getPackageName());
		tp.setTypeName(values.get(index));

		return tp;
	}

	protected String getLabelText() {
		return "Type name";//$NON-NLS-1$
	}

	protected boolean isEqual(int index) {
		if (((TypeReference) eObject).getType() == null)
			return false;

		return values.get(index).equals(
				((TypeReference) eObject).getType().getTypeName());
	}

	protected String[] getEnumerationFeatureValues() {

		if (values == null) {
			values = new ArrayList<String>();
			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			PackageImpl pckg = (PackageImpl) diagram.getElement();
			TypesImpl types = (TypesImpl) pckg.eContainer();

			for (Iterator<tura.Package> i = types.getPackages().iterator(); i
					.hasNext();) {
				tura.Package p = i.next();
				if ((p.getName() != null)
						&& (((typedefinition.TypeReference) eObject).getType() != null)) {
					if (p.getName().equals(
							((typedefinition.TypeReference) eObject).getType()
									.getPackageName())) {
						for (Iterator<TypeElement> j = p.getTypes().iterator(); j
								.hasNext();) {
							TypeElement te = j.next();
							if ((te instanceof typedefinition.Type)
									&& (((typedefinition.Type) te).getName() != null))
								values.add(((typedefinition.Type) te).getName());
						}
					}
				}
			}
		}

		return values.toArray(new String[values.size()]);
	}
}
