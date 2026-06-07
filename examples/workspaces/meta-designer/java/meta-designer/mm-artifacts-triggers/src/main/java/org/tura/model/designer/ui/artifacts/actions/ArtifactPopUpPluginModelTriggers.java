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

package org.tura.model.designer.ui.artifacts.actions;

import jakarta.enterprise.context.spi.CreationalContext;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;

import org.tura.model.designer.Constants;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.uuiclient.model.WindowsPluginModelCallBack;
import org.tura.platform.uuiclient.model.plugin.PluginRepository;

public class ArtifactPopUpPluginModelTriggers implements WindowsPluginModelCallBack{

	private static final long serialVersionUID = 1L;

	public ArtifactPopUpPluginModelTriggers(ELResolver elResolver) {
		
	}
	
	public PluginRepository getPluginRepository() {
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<PluginRepository> bean = (Bean<PluginRepository>) bm.getBeans(PluginRepository.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		PluginRepository repository = (PluginRepository) bm.getReference(bean, PluginRepository.class, ctx);
		return repository;
	}

	@Override
	public String getExtension() {
		return Constants.TECHNOLOGIES_WINDOW_EXTENSION;
	}
	
	
}
