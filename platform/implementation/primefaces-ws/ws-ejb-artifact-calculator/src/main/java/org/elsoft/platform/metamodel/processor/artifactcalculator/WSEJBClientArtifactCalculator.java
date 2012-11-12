package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.datasource.model.IndependentType;

public class WSEJBClientArtifactCalculator extends ArtifactCalculator {
	public static String WS_CLIENT = "WS_Client";

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {

		IndependentType it = (IndependentType) model;

		@SuppressWarnings("unchecked")
		ArrayList<Object> wsClient = (ArrayList<Object>) context
				.get(WS_CLIENT);
		if (wsClient == null)
			wsClient = new ArrayList<Object>();
    
		 wsClient.add(it);
		
		outputContext.put(WS_CLIENT, wsClient);
		return new ArrayList<Artifact>();
	}

}
