/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

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