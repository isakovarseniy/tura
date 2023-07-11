/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.models.Model;

public class ModelFactory {
	
	
	public Model getModel(EObject context) {
		
		InMemoryEmfModel model = new InMemoryEmfModel(context.eResource()){
			//Take Global registry 
			//Override original method to avoid exception  "Unavailable type"
			protected Registry getPackageRegistry() {
				if (registry == null) {
						registry = EPackage.Registry.INSTANCE;
				}
				return registry;
			}
		};
		return model;		
		
	}

}
