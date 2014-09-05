package org.tura.metamodel.hutn.builder.helper;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.hutn.exceptions.HutnGenerationException;
import org.eclipse.epsilon.hutn.generate.model.ModelGenerator;
import org.eclipse.epsilon.hutn.model.hutn.Spec;

public class TuraModelGenerator extends ModelGenerator {

	public TuraModelGenerator(Spec spec) throws HutnGenerationException {
		super(spec);
	}

	public TuraModelGenerator(Spec spec, File metaModelFile)
			throws HutnGenerationException {
		super(spec, metaModelFile);

	}

	public static Resource createResource(URI uri) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new EcoreResourceFactoryImpl());

		final Resource resource = resourceSet.createResource(uri);

		return resource;
	}

	public static Resource getResource(URI uri) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new EcoreResourceFactoryImpl());

		final Resource resource = resourceSet.getResource(uri, true);

		return resource;
	}

	public void store(File path) throws HutnGenerationException {
		EmfModel target = null;

		try {
			final URI fileUri = URI.createFileURI(path.getAbsolutePath());

			Resource resource = null;
			if (path.exists()) {
				resource = getResource(fileUri);
			} else
				resource = createResource(fileUri);

			target = generate(resource);

			target.store(fileUri);

		} finally {
			// Ensure that the model is always disposed, so that
			// its contents don't remain in memory and included
			// in the next call to generate

			if (target != null)
			 target.dispose();
		}
	}

}
