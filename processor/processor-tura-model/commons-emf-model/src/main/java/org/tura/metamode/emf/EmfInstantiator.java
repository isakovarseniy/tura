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

package org.tura.metamode.emf;

import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

public class EmfInstantiator {

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		properties.put(EmfModel.PROPERTY_EXPAND, true);
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	
	
	@SuppressWarnings("unchecked")
	protected void expand(EmfModel model, EolModule module) throws Exception {
		module.parse("var q = EClass.all.select(r|r.name='ApplicationRealm');  return q;");
		List<EObject> bag = (List<EObject>) module.execute();
		EObject eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationMessageLibrary');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationInfrastructureLayer');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationUIPackage');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationRecipe');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationMapper');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ApplicationStyle');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ViewPortHolder');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='DomainMapper');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

		module.parse("var q = EClass.all.select(r|r.name='ObjectMapperGroup');  return q;");
		bag = (List<EObject>) module.execute();
		eObject = bag.get(0);
		EcoreUtil.resolveAll(eObject);

	}	
	
	
}
