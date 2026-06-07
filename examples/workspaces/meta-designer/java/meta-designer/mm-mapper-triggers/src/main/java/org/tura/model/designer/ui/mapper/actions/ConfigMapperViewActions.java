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

package org.tura.model.designer.ui.mapper.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.inject.Inject;

import org.tura.model.designer.actions.LayerHelper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.repository.cdi.ClientProxyRepo;
import org.tura.platform.repository.cpa.CpaRepository;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;

public class ConfigMapperViewActions {

	@Inject
	ResponseState responseState;

	@Inject
	@ClientProxyRepo("mmdesigner.shared")
	private CpaRepository repository;

	@Inject
	ELResolver elResolver;

	@Inject
	IBeanFactory bf;

	private transient Logger logger = Logger.getLogger(ConfigMapperViewActions.class.getName());

	public void createVersion() {
		try {
			bf.getVersion().createObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}

	}

	public void createLayer() {
		try {
			bf.getMappingLayer().createObject();

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void removeVersion() {
		try {
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void removeLayer() {
		try {
			bf.getMappingLayer().removeObject();
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void layerUp() {
		try {
			DataControl dc = (DataControl) bf.getMappingLayer();
			MappingLayer current = (MappingLayer) dc.getCurrentObject();

			List<MappingLayer> scroler = dc.getScroller();
			List<MappingLayer> array = new ArrayList<MappingLayer>();

			for (MappingLayer obj : scroler) {
				array.add(obj);
			}

			LayerHelper.shiftUp(array, current);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void layerDown() {
		try {
			DataControl dc = (DataControl) bf.getMappingLayer();
			MappingLayer current = (MappingLayer) dc.getCurrentObject();

			List<MappingLayer> scroler = dc.getScroller();
			List<MappingLayer> array = new ArrayList<MappingLayer>();

			for (MappingLayer obj : scroler) {
				array.add(obj);
			}

			LayerHelper.shiftDown(array, current);

		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

	public void saveApplication() {
		try {
			repository.getStackProvider().get().commit();
//			addInfomessage(responseState, "DATA_PERSISTED",elResolver,IBeanFactory.MESSAGES);
		} catch (Exception e) {
//			addInfomessage(responseState, "ERROR_DURING_PERSISTING",elResolver,IBeanFactory.MESSAGES);
//			logger.log(Level.INFO, e.getMessage(), e);
		}
	}

}
