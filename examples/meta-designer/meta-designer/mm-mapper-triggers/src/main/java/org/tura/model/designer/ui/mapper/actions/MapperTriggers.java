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

import java.util.Map;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.tura.model.designer.repository.serialized.application.ApplicationStyleProxy;
import org.tura.model.designer.repository.serialized.mapper.CSSMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.MetamodelPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.mapper.VersionRef;
import org.tura.model.designer.repository.serialized.style.StyleLibraryProxy;
import org.tura.model.designer.repository.serialized.type.TypeGroupProxy;
import org.tura.model.designer.repository.serialized.type.TypeProxy;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.annotations.ArtificialFieldInterceptor;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;

@Alternative
@Priority(10)
@Selector("mmdesigner.mapper")
@ArtificialFieldInterceptor("mapper")
public class MapperTriggers implements OnChangeArtificialFieldTrigger {

	private static final long serialVersionUID = 1L;
	
	private String MAPPEDOBJECTNAME_FIELD = "mappedObjectName";
	private String MAPPEDLAYERS_FIELD = "mappedLayers";
	private String MAPPEDVERSION_FIELD = "mapperVersion";

	@Inject
	ELResolver elResolver;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		return false;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		String name = null;
		if (field.equals(MAPPEDOBJECTNAME_FIELD.toUpperCase())) {
			name = mappedObjectName(obj, attributes);

		} else if (field.equals(MAPPEDLAYERS_FIELD.toUpperCase())) {
			name = mappedLayers(obj, attributes);
			
		}else if (field.equals(MAPPEDVERSION_FIELD.toUpperCase())) {
			name = mappedVersion(obj, attributes);
		}
		return new Object[] { name };

	}

	private String mappedVersion(Object obj, Map<String, Object> attributes) {
		if ( obj instanceof VersionRef) {
			VersionRef verRef = (VersionRef) obj;
			Version ver =  verRef.getVersionRef();
			if ( ver != null) {
			   return ver.getName()+"-"+ver.getVersion();
			}
		}
		return null;
	}

	private String mappedLayers(Object obj, Map<String, Object> attributes) {
		return (String) elResolver.getValue("#{Mapper['MAPPER_NO_NAME']}");
	}

	private String mappedObjectName(Object obj, Map<String, Object> attributes) {
		if (obj instanceof JavaMapper) {
			TypeProxy type = (TypeProxy) ((JavaMapper) obj).getTypeRef();
			if (type != null) {
				TypeGroupProxy pkg = (TypeGroupProxy) type.eContainer();
				return pkg.getName() + "." + type.getName();
			}
		}
		if (obj instanceof JavaPackageMapper) {
			TypeGroupProxy pkg =  (TypeGroupProxy) ((JavaPackageMapper) obj).getPackageRef();
			if (pkg != null) {
				return pkg.getName();
			}
		}
		if (obj instanceof JavaScriptMapper) {
			TypeProxy type =   (TypeProxy) ((JavaScriptMapper) obj).getTypeRef();
			if (type != null) {
				TypeGroupProxy pkg = (TypeGroupProxy) type.eContainer();
				return pkg.getName() + "." + type.getName();
			}
		}
		if (obj instanceof CSSMapper) {
			StyleLibraryProxy stLib =   (StyleLibraryProxy) ((CSSMapper) obj).getStyleLibrary();
			if (stLib != null) {
				ApplicationStyleProxy pkg = (ApplicationStyleProxy) stLib.eContainer();
				return pkg.getName() + "." + stLib.getName();
			}
		}
		if (obj instanceof MetamodelPackageMapper) {
			TypeGroupProxy pkg =   (TypeGroupProxy) ((MetamodelPackageMapper) obj).getPackageRef();
			if (pkg != null) {
				return pkg.getName();
			}
		}
		
		return (String) elResolver.getValue("#{Mapper['MAPPER_NO_NAME']}");
	}

}
