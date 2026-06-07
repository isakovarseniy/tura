/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
 */

package org.kie.server.services.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jbpm.services.api.query.QueryService;
import org.kie.server.api.KieServerConstants;
import org.kie.server.services.api.KieContainerInstance;
import org.kie.server.services.api.KieServerExtension;
import org.kie.server.services.api.KieServerRegistry;
import org.kie.server.services.api.SupportedTransports;
import org.kie.server.services.impl.KieServerImpl;
import org.kie.server.services.impl.security.IdentityExtension;

public class QueryExtension implements  KieServerExtension{

	@Override
	public boolean isActive() {
		return true;
	}

	@Override
	public void init(KieServerImpl kieServer, KieServerRegistry registry) {
		KieServerExtension extension =  registry.getServerExtension("jBPM");
		QueryService queryService =  extension.getAppComponents(QueryService.class);
		String datasource = System.getProperty(KieServerConstants.CFG_PERSISTANCE_DS);
		JbpmConfiguration.init(queryService, datasource, registry);
	}

	@Override
	public void destroy(KieServerImpl kieServer, KieServerRegistry registry) {
		
	}

	@Override
	public void createContainer(String id, KieContainerInstance kieContainerInstance, Map<String, Object> parameters) {
		
	}

	@Override
	public void updateContainer(String id, KieContainerInstance kieContainerInstance, Map<String, Object> parameters) {
		
	}

	@Override
	public boolean isUpdateContainerAllowed(String id, KieContainerInstance kieContainerInstance,
			Map<String, Object> parameters) {
		return true;
	}

	@Override
	public void disposeContainer(String id, KieContainerInstance kieContainerInstance, Map<String, Object> parameters) {
		
	}

	@Override
	public List<Object> getAppComponents(SupportedTransports type) {
		return new  ArrayList<>();
	}

	@Override
	public <T> T getAppComponents(Class<T> serviceType) {
		return null;
	}

	@Override
	public String getImplementedCapability() {
		return "KieServer";
	}

	@Override
	public List<Object> getServices() {
		return null;
	}

	@Override
	public String getExtensionName() {
		return IdentityExtension.class.getSimpleName();
	}

	@Override
	public Integer getStartOrder() {
		return 1000;
	}

	@Override
	public boolean isInitialized() {
		return true;
	}

}
