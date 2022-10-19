/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.convert;

import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.epl.EplModule;
import org.junit.Test;
import org.tura.convert.epsilon.EpsilonResourcesLoader;
import org.tura.convert.src.SrcModelLoader;
import org.tura.convert.trg.TrgModelLoader;

import domain.DomainPackage;

public class MultiResourceModelLoadTest {

	@Test
	public void queryTest() {
		try {
			Object qq = runQuery("query3.eol");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	
	@Test
	public void transformTest() {
		try {

//Populate types
			runRules("createArtifacts.epl");
			
//Populate assosiations ans generalizations 			
			runRules("createArtifacts.epl");

			
//Update objects 			
			runRules("updateArtifacts.epl");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}finally{
			
		}

	}

	private Object runQuery(String filename) throws Exception {
		
		EolModule module = new EolModule();

		String modelFile = SrcModelLoader.class.getResource("domain.ecore").toURI().toString();
		EmfModel srcModel = createEmfModelByURI("src", modelFile, EcorePackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(srcModel);
		expand(srcModel, module);

		modelFile = TrgModelLoader.class.getResource("tura-designer.domain").toURI().toString();
		EmfModel trgModel = createEmfModelByURI("trg", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(trgModel);
		
		modelFile = EpsilonResourcesLoader.class.getResource(filename).toURI().toString();
		
		module.parse(URI.create(modelFile));
		printParsingError(module.getParseProblems());
		
		return module.execute();
		
		
	}
	
	private void runRules(String rulesFile) throws Exception{
		EolModule module = new EolModule();

		String modelFile = SrcModelLoader.class.getResource("domain.ecore").toURI().toString();
		EmfModel srcModel = createEmfModelByURI("src", modelFile, EcorePackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(srcModel);
		expand(srcModel, module);

		modelFile = TrgModelLoader.class.getResource("tura-designer.domain").toURI().toString();
		EmfModel trgModel = createEmfModelByURI("trg", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(trgModel);

		EplModule eplModule = new EplModule();
		modelFile = EpsilonResourcesLoader.class.getResource(rulesFile).toURI().toString();
		eplModule.getContext().getModelRepository().addModel(srcModel);
		eplModule.getContext().getModelRepository().addModel(trgModel);

		eplModule.parse(URI.create(modelFile));
		printParsingError(eplModule.getParseProblems());
		eplModule.execute();
		trgModel.store();
		
		
	}
	
	
	protected void printParsingError(List<ParseProblem> prblems) throws Exception {
		if (!prblems.isEmpty()) {
			for (ParseProblem problem : prblems) {
				System.err.println(problem.toString());
			}
			throw new Exception("Ecl parsing exception");
		}		
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
	}

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

	protected String getFileURI(String fileName) throws URISyntaxException {
		URI uri = Paths.get(fileName).toUri();
		return uri.toString();
	}

}
