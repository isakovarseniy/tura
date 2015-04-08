package org.tura.metamodel.commons.properties.selections.adapters.dropdown;

import org.eclipse.emf.ecore.EObject;

public class SourcesPointerSourceCastExternalIterator extends
		SourcesPointerSourceCast {

	public Object[] getWatchPointObject(Object eObject) {

		EObject eobj = (EObject) eObject;
		do {
			eobj = eobj.eContainer();
			if (eobj == null)
				return new Object[] {};
		} while (!(eobj instanceof domain.Table)
				&& !(eobj instanceof domain.Tree));

		return new Object[] { ((domain.SourcesPointer) eobj).getSourcePointer() };
	}

}
