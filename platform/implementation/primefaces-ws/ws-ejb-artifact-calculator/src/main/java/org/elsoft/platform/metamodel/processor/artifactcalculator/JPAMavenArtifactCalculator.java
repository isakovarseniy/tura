package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.TypeModelBuilder;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class JPAMavenArtifactCalculator extends ArtifactCalculator {

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		@SuppressWarnings("unchecked")
		ArrayList<Object> wsClient = (ArrayList<Object>) context
				.get(JPAArtifactCalculator.JPA_SERVICES);

		Iterator<Object> itr = wsClient.iterator();
		HashMap<String, Object> retModel = new HashMap<String, Object>();

		while (itr.hasNext()) {

			TypeModelBuilder.MappedType obj = new TypeModelBuilder().new MappedType(
					((IndependentType) itr.next()).getTypedao(),
					(String) context.get(PlatformConfig.DOMAIN_PARAMETER),
					(String) context
							.get(PlatformConfig.FUNCTIONAL_DOMAIN_PARAMETER),
					(String) context.get(PlatformConfig.APPLICATION_PARAMETER),
					(MetamodelPlatformLevel) context
							.get(PlatformConfig.LAYER_PARAMETER),
					(RepositoryFactory) context
							.get(PlatformConfig.REPOSITORYFACTORY_PARAMETER));

			retModel.put(obj.getResPackageName() + obj.getResTypeName(), obj);
		}
		list.add(new Artifact(MetamodelArtifactType.MAVENPOMFile, null,"JPA"));
		list.add(new Artifact(MetamodelArtifactType.JPAObject, retModel
				.values(),"JPA"));
		return list;
	}

}
