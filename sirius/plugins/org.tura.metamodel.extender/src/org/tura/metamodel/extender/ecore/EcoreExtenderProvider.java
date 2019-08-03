package org.tura.metamodel.extender.ecore;


import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.sirius.ecore.extender.business.api.accessor.IExtenderProvider;
import org.eclipse.sirius.ecore.extender.business.api.accessor.IMetamodelExtender;

/**
 * Provider for the Ecore intrinsic data.
 * 
 * @author cbrun
 * 
 */
public class EcoreExtenderProvider implements IExtenderProvider {
    /**
     * {@inheritDoc}
     */
    public IMetamodelExtender getExtender(final ResourceSet set) {
        return new TuraEcoreExtender();
    }

    /**
     * {@inheritDoc}
     */
    public boolean provides(final ResourceSet set) {
        return true;
    }

}