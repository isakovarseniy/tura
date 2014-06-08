package org.tura.metamodel.commons.properties.selections.dropdown;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.commons.properties.selections.dropdown.impl.DomainArtifactRefArtifactRef;

public class ArtifactPropertySelection extends
		AbstractDependentEnumerationPropertySection {

	protected void init() {
		dropDownDataSupplier = new DomainArtifactRefArtifactRef();
	}

	protected String getLabelText() {
		return "Artifact name";//$NON-NLS-1$
	}

	protected HashMap<String, Object> getEnumerationFeatureValues() {

		if (values == null) {
			values = new HashMap<String, Object>();

			if (((domain.ArtifactRef) getModel()).getDomainArtifactRef() == null)
				return values;

			for (Iterator<domain.Artifact> i = ((domain.ArtifactRef) getModel())
					.getDomainArtifactRef().getArtifact().getArtifacts()
					.iterator(); i.hasNext();) {
				domain.Artifact p = i.next();
				values.put(p.getName(), p);
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

}
