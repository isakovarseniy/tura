/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.mapper.CSSMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper;
import org.tura.model.designer.ui.mapper.mmdesigner.mapper.viewmodel.IViewPortHolder;
import org.tura.platform.datacontrol.annotations.CustomCreate;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.CreateTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.cpa.CpaRepository;

@Alternative
@Priority(10)
@Selector("mmdesigner.mapper")
@CustomCreate("mapper")
public class CustomMapperCreateTrigger implements CreateTrigger {

	private static final long serialVersionUID = 1L;
	
	@Inject
	IViewPortHolder viewPortHolder;

	@Override
	public Object execute(CpaRepository repository) throws TuraException {
		try {
			Class<?> clazz = null;
			if (IViewPortHolder.MAPPERSPORT_JAVACLASSMAPPER.equals(viewPortHolder.getMappersPort())) {
				clazz = JavaMapper.class;
			}
			if (IViewPortHolder.MAPPERSPORT_JAVAPACKAGEMAPPER.equals(viewPortHolder.getMappersPort())) {
				clazz = JavaPackageMapper.class;
			}
			if (IViewPortHolder.MAPPERSPORT_CSSMAPPER.equals(viewPortHolder.getMappersPort())) {
				clazz = CSSMapper.class;
			}
			if (IViewPortHolder.MAPPERSPORT_JAVASCRIPTMAPPER.equals(viewPortHolder.getMappersPort())) {
				clazz = JavaScriptMapper.class;
			}
			if (IViewPortHolder.MAPPERSPORT_METAMODELMAPPER.equals(viewPortHolder.getMappersPort())) {
				clazz = MetamodelPackageMapper.class;
			}

			return repository.create(clazz);
			
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
