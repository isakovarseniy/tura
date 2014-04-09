package org.metamodel.tura.ui.properties.sections.dropdown;

import java.util.HashMap;
import java.util.Iterator;

import org.metamodel.tura.ui.properties.sections.dropdown.impl.DomainArtifactRefArtifactRef;

public abstract class ArtifactPropertySelection extends
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

}
