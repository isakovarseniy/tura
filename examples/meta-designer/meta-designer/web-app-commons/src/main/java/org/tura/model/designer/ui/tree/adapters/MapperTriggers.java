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

package org.tura.model.designer.ui.tree.adapters;

import java.util.Map;

import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.mapper.CSSMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper;
import org.tura.model.designer.repository.serialized.type.Primitive;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.TypeGroupProxy;
import org.tura.model.designer.repository.serialized.type.TypeProxy;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

public class MapperTriggers implements OnChangeArtificialFieldTrigger {

	private static final long serialVersionUID = 1L;

	@Inject
	ELResolver elResolver;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return false;
	}
	

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		String name = "";

		if ( obj instanceof JavaMapper) {
			JavaMapper mapper = (JavaMapper) obj;
			name = "JavaMapper";
			String packageName ="";
			String typeName = "";
			TypeElement typeElement = mapper.getTypeRef();
			if (typeElement instanceof Primitive ) {
				typeName = mapper.getTypeRef().getName();
				packageName = "Primitives";
			}else {
				typeName = mapper.getTypeRef().getName();
				TypeGroupProxy typeGroup = (TypeGroupProxy) ((TypeProxy)((mapper.getTypeRef()))).eContainer();
				packageName = typeGroup.getName();
			}
			name = name +"--"+ packageName + "-- "+typeName+"--"+getLayers(mapper);
		}
		if ( obj instanceof JavaScriptMapper) {
			name = "JavaScriptMapper";
			JavaScriptMapper mapper = (JavaScriptMapper) obj;
			String typeName = mapper.getTypeRef().getName();
			TypeGroupProxy typeGroup = (TypeGroupProxy) ((TypeProxy)((mapper.getTypeRef()))).eContainer();
			String packageName = typeGroup.getName();

			name = name +"--"+ packageName + "-- "+typeName+"--" + getLayers(mapper);
		}
		if ( obj instanceof JavaPackageMapper) {
			name = "JavaPackageMapper";
			JavaPackageMapper mapper = (JavaPackageMapper) obj;
			String packageName = mapper.getPackageRef().getName();
			name = name +"--"+ packageName + "-- "+packageName+"--"+ getLayers(mapper);
		}
		
		if ( obj instanceof CSSMapper) {
			name = "CSSMapper";
			CSSMapper mapper = (CSSMapper) obj;
			String packageName = mapper.getStyleLibrary().getName();
			name = name +"--"+ packageName + "-- "+packageName+"--"+getLayers(mapper);
		}

		if ( obj instanceof MetamodelPackageMapper) {
			name = "MetamodelPackageMapper";
			MetamodelPackageMapper mapper = (MetamodelPackageMapper) obj;
			String packageName = mapper.getPackageRef().getName();
			name = name +"--"+ packageName + "-- "+packageName+"--"+getLayers(mapper);
		}
		
		return new Object[] { name };
	}

	
	
	protected String getLayers(Mapper maper) {
		String layers = "";
		for ( MappingLayer layer : maper.getLayers()) {
			layers = layers + layer.getName();
		}
		return layers;
	}
}
