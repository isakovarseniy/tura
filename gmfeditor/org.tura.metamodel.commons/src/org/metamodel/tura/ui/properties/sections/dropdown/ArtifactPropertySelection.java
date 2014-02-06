package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainArtifactRefArtifactRef;

public class ArtifactPropertySelection extends
		AbstractEnumerationPropertySection {

	private boolean isFirstTime = true;
	private HashMap<String, Object> values;
	private DropDownDataSupplier artifactProperty;
	private AdapterImpl adapter;

	protected EStructuralFeature[] getFeature() {
		if (artifactProperty == null)
			init();
		return artifactProperty.getFeature();
	}

	protected String getFeatureAsText() {
		if (artifactProperty == null)
			init();
		return artifactProperty.getFeatureAsText(eObject);
	}

	private void init() {
		artifactProperty = new DomainArtifactRefArtifactRef();
	}

	protected Object getFeatureValue(EStructuralFeature feature, Object... obj) {
		if (artifactProperty == null)
			init();
		return artifactProperty.getFeatureValue(eObject, values, feature, obj);
	}

	protected String getLabelText() {
		return "Artifact name";//$NON-NLS-1$
	}

	protected boolean isEqual(Object key) {
		if (artifactProperty == null)
			init();
		return artifactProperty.isEqual(values, key, eObject);
	}

	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);

		if (isFirstTime) {

			AdapterImpl adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					if (notification.getFeatureID(artifactProperty
							.getExpectedClass()) == artifactProperty
							.getWatchPointFeature().getFeatureID()) {
						values = null;

						EditingDomain editingDomain = ((DiagramEditor) getPart())
								.getEditingDomain();
						CompoundCommand compoundCommand = new CompoundCommand();
						EStructuralFeature[] features = getFeature();
						for (int i = 0; i < features.length; i++) {
							if (features[i].getFeatureID() != artifactProperty
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

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();

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
		eObject.eAdapters().remove(adapter);
	}

}
