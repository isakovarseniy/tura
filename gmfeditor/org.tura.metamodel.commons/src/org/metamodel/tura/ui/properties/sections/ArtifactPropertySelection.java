package org.metamodel.tura.ui.properties.sections;

import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
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

import domain.DomainPackage;

public class ArtifactPropertySelection extends
		AbstractEnumerationPropertySection {

	protected HashMap<String,domain.Artifact> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;

	protected EStructuralFeature[] getFeature() {
		return  new EStructuralFeature[] {
				DomainPackage.eINSTANCE.getArtifactRef_ArtifactName()		
		};
	}

	protected String getFeatureAsText() {
		return ((domain.ArtifactRef) eObject).getArtifactName();

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
											.getTypePointer_PackageRef())) {
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

	protected Object getFeatureValue(EStructuralFeature feature,Object... obj) {
		return values.get(obj[0]);
	}

	protected String getLabelText() {
		return "Artifact name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (((domain.ArtifactRef) eObject).getArtifactName() == null)
			return false;

		return values.get(key).equals(
				((domain.ArtifactRef) eObject).getArtifactName());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected HashMap<String,domain.Artifact> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String,domain.Artifact>();

			Diagram diagram = (Diagram) editPart.getRoot().getContents()
					.getModel();
			EObject types = (EObject) diagram.getElement();

			if (((domain.ArtifactRef) eObject).getDomainArtifact() == null)
				return values;

			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			try {
				OCLExpression<EClassifier> query = helper
						.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
								+ ((domain.ArtifactRef) eObject)
										.getDomainArtifact()
								+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name <> null)");

				Collection<domain.Artifact> map = (Collection<domain.Artifact>) ocl
						.evaluate(types, query);

				for (Iterator<domain.Artifact> i = map.iterator(); i.hasNext();) {
					domain.Artifact p = i.next();
					values.put(p.getName(),p);
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
