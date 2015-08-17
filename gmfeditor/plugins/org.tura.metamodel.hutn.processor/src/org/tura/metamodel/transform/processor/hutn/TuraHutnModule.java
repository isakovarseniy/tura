/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.transform.processor.hutn;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.epsilon.hutn.HutnModule;
import org.eclipse.epsilon.hutn.exceptions.HutnGenerationException;
import org.eclipse.epsilon.hutn.generate.model.ModelGenerator;

public class TuraHutnModule extends HutnModule {

	public List<File> storeEmfModel(File baseDirectory,
			String defaultModelPath, String inferredMetamodelPath)
			throws HutnGenerationException {
		final List<File> generated = new LinkedList<File>();

		if (spec == null)
			throw new IllegalStateException("No HUTN has been parsed.");

		// Construct new generator based on whether a metamodel needs to be
		// inferred
		final ModelGenerator generator;

		generator = new TuraModelGenerator(spec);

		// Generate and store model based on whether a model file has been
		// specified in the @Spec
		final File model;
		model = new File(baseDirectory, defaultModelPath);


		generator.store(model);
		generated.add(model);

		return generated;
	}
	
	
}
