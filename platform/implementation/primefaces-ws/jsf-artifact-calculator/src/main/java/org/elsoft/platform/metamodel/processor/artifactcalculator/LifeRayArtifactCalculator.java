package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;

public class LifeRayArtifactCalculator extends ArtifactCalculator{

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,HashMap<String, Object> outputContext) {
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		list.add(new Artifact(MetamodelArtifactType.LIFERAY_DISPLAY,null,"LIFERAY-PORTLET-JSF"));
		list.add(new Artifact(MetamodelArtifactType.LIFERAY_PORTLET,model,"LIFERAY-PORTLET-JSF"));
		list.add(new Artifact(MetamodelArtifactType.PORTLET,model,"LIFERAY-PORTLET-JSF"));
		outputContext.putAll(context);

		return list;
	}

}
