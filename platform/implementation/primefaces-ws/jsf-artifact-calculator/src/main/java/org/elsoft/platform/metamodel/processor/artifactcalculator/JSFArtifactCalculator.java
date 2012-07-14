/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.platform.metamodel.processor.artifactcalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.DataControlModelBuilder;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.DataControlModelBuilder.DataLinkExtender;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.FactoryBeanModelBuilder;
import org.elsoft.platform.metamodel.processor.artifactcalculator.modelbuilder.JSPXModeBuilder;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.processor.ArtifactCalculator;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Canvas;
import org.elsoft.platform.metamodel.processor.uicontainer.model.DataLink;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Form;
import org.elsoft.platform.metamodel.processor.uicontainer.model.Window;

public class JSFArtifactCalculator extends ArtifactCalculator {
	public static String PROXY_LIST = "ProxyList";
	public static String DEPENDENIES_LIST = "DependenciesList";
	

	@Override
	protected List<Artifact> getArtifactList(Object model,
			HashMap<String, Object> context,
			HashMap<String, Object> outputContext) {
		ArrayList<Artifact> list = new ArrayList<Artifact>();

		Form frm = (Form) model;
		
		Iterator<Window> itrWin = frm.getWindows().iterator();
		while (itrWin.hasNext()) {
			Window win = itrWin.next();
			list.add(new Artifact(MetamodelArtifactType.JSPXFile,
					(new JSPXModeBuilder()).builder(win, frm)));
		}

		Iterator<Canvas> itrCanvas = frm.getCanvases().iterator();
		while (itrCanvas.hasNext()) {
			Canvas canvas = itrCanvas.next();
			list.add(new Artifact(MetamodelArtifactType.JSPXFile,
					(new JSPXModeBuilder()).builder(canvas, frm)));
		}

		@SuppressWarnings("unchecked")
		HashMap<String, Object> proxyMap = (HashMap<String, Object>) context
				.get(PROXY_LIST);
		if (proxyMap == null)
			proxyMap = new HashMap<String, Object>();


		@SuppressWarnings("unchecked")
		HashMap<String, Object> dependenciesMap = (HashMap<String, Object>) context
				.get(DEPENDENIES_LIST);
		if (dependenciesMap == null)
			dependenciesMap = new HashMap<String, Object>();
		
		
		Iterator<DataLink> itrLink = frm.getDatalinks().iterator();
		while (itrLink.hasNext()) {
			DataLink link = itrLink.next();
			Artifact artifact = new Artifact(
					MetamodelArtifactType.DataControlFile,
					new DataControlModelBuilder().builder(
							(RepositoryFactory) context
									.get(PlatformConfig.REPOSITORYFACTORY_PARAMETER),
							link,
							(String) context
									.get(PlatformConfig.DOMAIN_PARAMETER),
							(String) context
									.get(PlatformConfig.FUNCTIONAL_DOMAIN_PARAMETER),
							(String) context
									.get(PlatformConfig.APPLICATION_PARAMETER),
							(MetamodelPlatformLevel) context
									.get(PlatformConfig.LAYER_PARAMETER), frm));

			proxyMap.putAll(((DataLinkExtender) (artifact.getModel()))
					.getProxyHash());

			dependenciesMap.putAll(((DataLinkExtender) (artifact.getModel()))
					.getDependensiesHash());
			
			list.add(artifact);
		}
		outputContext.put(PROXY_LIST, proxyMap);
		outputContext.put(DEPENDENIES_LIST, dependenciesMap);
		

		list.add(new Artifact(MetamodelArtifactType.FactoryBeanFile,
				(new FactoryBeanModelBuilder()).builder(frm)));

		return list;
	}

	@Override
	protected String getTechnology() {
		return "JSF";
	}

}
