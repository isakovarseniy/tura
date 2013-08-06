package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.MappedType;

public class MAVENPOMXMLArtifactCalculatorJPA extends ArtifactCalculator {
	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {

		ArrayList<Artifact> list = new ArrayList<Artifact>();

		list.add(new Artifact(MetamodelArtifactType.MAVENPOMFile, null, "JSF-HIBERNATE"));
		list.add(new Artifact(MetamodelArtifactType.TRANSACTIONMANAGER, null,
				"JSF-JPA-SERVICE"));

		@SuppressWarnings("unchecked")
		HashMap<String, Object> returnTypesMap = (HashMap<String, Object>) context
				.get(JSFArtifactCalculator.RETURN_TYPES);
		HashMap<String, Object> filteredReturnTypesMap = new HashMap<String, Object>();

		Iterator<String> itr = returnTypesMap.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			MappedType tp = (MappedType) returnTypesMap.get(key);
			if ((tp.getTechnology() != null)
					&& (tp.getTechnology().equals("JPA-SERVICE"))) {
				filteredReturnTypesMap.put(key, tp);
			}
		}
		context.put(JSFArtifactCalculator.RETURN_TYPES, filteredReturnTypesMap);
		outputContext.putAll(context);

		return list;
	}

}
