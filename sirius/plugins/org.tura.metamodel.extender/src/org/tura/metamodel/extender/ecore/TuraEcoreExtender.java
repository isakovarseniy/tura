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
