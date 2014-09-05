package org.tura.metamodel.hutn.builder.helper;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.epsilon.hutn.HutnModule;
import org.eclipse.epsilon.hutn.exceptions.HutnGenerationException;
import org.eclipse.epsilon.hutn.generate.model.ModelGenerator;


public class TuraHutnModule extends HutnModule{

	private boolean hasInferredMetaModel() {
		if (spec == null) throw new IllegalStateException("No HUTN has been parsed.");
		return spec.getNsUris().isEmpty();
	}
	

	
	public List<File> storeEmfModel(File baseDirectory, String defaultModelPath, String inferredMetamodelPath) throws HutnGenerationException {
		final List<File> generated = new LinkedList<File>();
		
		if (spec == null) throw new IllegalStateException("No HUTN has been parsed.");
		
		// Construct new generator based on whether a metamodel needs to be inferred
		final ModelGenerator generator;
		
		if (hasInferredMetaModel()) {
			final File metamodel = new File(baseDirectory, inferredMetamodelPath);
			generateEmfMetaModel(metamodel);
			generator = new TuraModelGenerator(spec, metamodel);
			
			generated.add(metamodel);
			
		} else {
			generator = new TuraModelGenerator(spec);
		}
			
		// Generate and store model based on whether a model file has been specified in the @Spec
		final File model;
		
		if (spec.getModelFile() == null) {
			model = new File(baseDirectory, defaultModelPath);
		} else {
			model = new File(baseDirectory, spec.getModelFile());
		}
		
		generator.store(model);
		generated.add(model);
		
		return generated;
	}

	
}
