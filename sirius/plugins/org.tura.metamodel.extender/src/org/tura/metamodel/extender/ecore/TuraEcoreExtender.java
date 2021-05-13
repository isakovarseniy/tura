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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ecore.extender.business.internal.accessor.ecore.EcoreIntrinsicExtender;

import application.ApplicationFactory;

@SuppressWarnings("restriction")
public class TuraEcoreExtender extends EcoreIntrinsicExtender{

	
    @Override
    public EObject createInstance(final String name) {
    	if ( "application.Application".equals(name)){
            return ApplicationFactory.eINSTANCE.createApplication();
    	}
        return super.createInstance(name);
    }
	
	
}
