package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;

public class ConnectionArtifactCalculator extends ArtifactCalculator{

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {
		// TODO Auto-generated method stub
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		list.add(new Artifact(MetamodelArtifactType.DBConnection,null,"JSF-JPA-HIBERNATE"));
		outputContext.putAll(context);

		return list;
	}

}
