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

package org.tura.model.process;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.epl.EplModule;
import org.tura.convert.epsilon.EpsilonResourcesLoader;
import org.tura.convert.trg.TrgModelLoader;
import org.tura.metamode.emf.EmfInstantiator;

import domain.DomainPackage;
import model.SrcModelLoader;

public class EcoreModelLoader extends EmfInstantiator{

	public static void main(String[] args) {

		EcoreModelLoader loader = new EcoreModelLoader();
		
		try {

//Populate typess
			loader.runRules("createArtifacts.epl");

//Populate assosiations ans generalizations 			
			loader.runRules("createArtifacts.epl");

//Update objects 			
			loader.runRules("updateArtifacts.epl");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

	private void runRules(String rulesFile) throws Exception {
		EolModule module = new EolModule();

		String modelFile = SrcModelLoader.class.getResource("domain.ecore").toURI().toString();
		EmfModel srcModel = createEmfModelByURI("src", modelFile, EcorePackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().getModelRepository().addModel(srcModel);
		expand(srcModel, module);

		modelFile = TrgModelLoader.class.getResource("hr.domain").toURI().toString();
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





	protected String getFileURI(String fileName) throws URISyntaxException {
		URI uri = Paths.get(fileName).toUri();
		return uri.toString();
	}

}
