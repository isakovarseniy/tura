package org.metamodel.tura.ui.properties.sections;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import domain.DomainPackage;

public class ArtifactPropertySelection extends
		AbstractEnumerationPropertySection {

	protected HashMap<String, domain.Artifact> values;
	private boolean isFirstTime = true;
	private CommandStackListener commandStackListener;

	protected EStructuralFeature[] getFeature() {
		return new EStructuralFeature[] { 
				DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef() };
	}

	protected String getFeatureAsText() {
		if (((domain.ArtifactRef) eObject).getArtifactRef() != null)
			return ((domain.ArtifactRef) eObject).getArtifactRef().getName();
		else
			return "";

	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		values = null;
		if (isFirstTime) {
			isFirstTime = false;
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();

			commandStackListener = new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					if (event.getSource() instanceof BasicCommandStack) {
						Command cmd = ((BasicCommandStack) event.getSource())
								.getMostRecentCommand();
						if (cmd instanceof CompoundCommand) {

							List<Command> list = ((CompoundCommand) cmd)
									.getCommandList();
							for (Iterator<Command> itr = list.iterator(); itr
									.hasNext();) {
								Command currCommand = itr.next();
								if (currCommand instanceof SetCommand) {
									if (((SetCommand) currCommand)
											.getFeature()
											.equals(DomainPackage.eINSTANCE
													.getArtifactRef_DomainArtifactRef())) {
										values = null;

										EditingDomain editingDomain = ((DiagramEditor) getPart())
												.getEditingDomain();
										CompoundCommand compoundCommand = new CompoundCommand();
										EStructuralFeature[] features = getFeature();
										for (int i = 0; i < features.length; i++) {
											compoundCommand.append(SetCommand
													.create(editingDomain,
															eObject,
															features[i], null));
										}
										editingDomain.getCommandStack()
												.execute(compoundCommand);

									}

								}

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

	protected Object getFeatureValue(EStructuralFeature feature, Object... objj) {
		if (feature
				.equals(DomainPackage.eINSTANCE.getArtifactRef_ArtifactRef()))
			return values.get(objj[0]);

		return null;
	}

	protected String getLabelText() {
		return "Artifact name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (((domain.ArtifactRef) eObject).getArtifactRef() == null)
			return false;

		if (((domain.ArtifactRef) eObject).getArtifactRef().getName() == null)
			return false;

		return values.get(key).equals(
				((domain.ArtifactRef) eObject).getArtifactRef().getName());
	}

	protected HashMap<String, domain.Artifact> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, domain.Artifact>();

			if (((domain.ArtifactRef) eObject).getDomainArtifactRef() == null)
				return values;

			for (Iterator<domain.Artifact> i = ((domain.ArtifactRef) eObject)
					.getDomainArtifactRef().getArtifact().getArtifacts()
					.iterator(); i.hasNext();) {
				domain.Artifact p = i.next();
				values.put(p.getName(), p);
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
