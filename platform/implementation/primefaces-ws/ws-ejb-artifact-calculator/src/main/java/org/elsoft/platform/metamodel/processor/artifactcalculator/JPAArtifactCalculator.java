package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.TypeModelBuilder;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class JPAArtifactCalculator extends ArtifactCalculator {
	public static String JPA_SERVICES = "JPA_SERVICES";

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {

		ArrayList<Artifact> list = new ArrayList<Artifact>();
		IndependentType it = (IndependentType) model;

		it = new TypeModelBuilder().builder((RepositoryFactory) context
				.get(PlatformConfig.REPOSITORYFACTORY_PARAMETER),
				(String) context.get(PlatformConfig.DOMAIN_PARAMETER),
				(String) context
						.get(PlatformConfig.FUNCTIONAL_DOMAIN_PARAMETER),
				(String) context.get(PlatformConfig.APPLICATION_PARAMETER),
				(MetamodelPlatformLevel) context
						.get(PlatformConfig.LAYER_PARAMETER), it);

		if (MetamodelTypeOfTypes.Entity.name().equals(it.getTypeOftype())) {
			list.add(new Artifact(MetamodelArtifactType.ENTITY, it,"JPA"));

			@SuppressWarnings("unchecked")
			ArrayList<Object> wsClient = (ArrayList<Object>) context
					.get(JPA_SERVICES);
			if (wsClient == null)
				wsClient = new ArrayList<Object>();

			wsClient.add(it);

			outputContext.put(JPA_SERVICES, wsClient);

		}

		if (MetamodelTypeOfTypes.Service.name().equals(it.getTypeOftype())) {
			list.add(new Artifact(MetamodelArtifactType.SESSIONBEAN, it,"JPA"));
		}

		return list;

	}

}
