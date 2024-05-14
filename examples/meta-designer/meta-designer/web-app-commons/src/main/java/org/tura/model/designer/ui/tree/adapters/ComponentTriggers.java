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

import org.tura.model.designer.repository.serialized.mapper.JavaMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.serialized.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.recipe.JavaComponent;
import org.tura.model.designer.repository.serialized.recipe.JavaScriptComponent;
import org.tura.model.designer.ui.tree.Crud;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.ObjectControl;

public class ComponentTriggers implements OnChangeArtificialFieldTrigger, Crud {

	private static final long serialVersionUID = 1L;

	@Inject
	ELResolver elResolver;

	@Override
	public boolean onSet(Object obj, Map<String, Object> attributes, String field, Object value) throws TuraException {
		if ("NAME".equals(field)) {
			if (obj instanceof JavaComponent) {
				((JavaComponent) obj).setName((String) value);
				return true;
			}
			if (obj instanceof JavaScriptComponent) {
				((JavaScriptComponent) obj).setName((String) value);
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] onGet(Object obj, Map<String, Object> attributes, String field) throws TuraException {
		if ("NAME".equals(field)) {
			String name = null;
			if (obj instanceof JavaComponent) {
				name = ((JavaComponent) obj).getName();
				if (name == null) {
					name = (String) elResolver.getValue("#{Recipe['JAVA_COMPONENT_NULL']}");
				}
			}
			if (obj instanceof JavaScriptComponent) {
				name = ((JavaScriptComponent) obj).getName();
				if (name == null) {
					name = (String) elResolver.getValue("#{Recipe['JAVA_SCRIPT_COMPONENT_NULL']}");
				}
			}
			return new Object[] { name };
		}

		if ("VERSIONREFNAME".equals(field)) {
			String version = null;
			Version ver = null;
			if (obj instanceof JavaComponent) {
				ver = ((JavaComponent) obj).getVersionRef();
			}
			if (obj instanceof JavaScriptComponent) {
				ver = ((JavaScriptComponent) obj).getVersionRef();
			}
			if (ver != null) {
				version = ver.getName();
			}
			return new Object[] { version };
		}

		if ("MAPPERREFNAME".equals(field)) {
			String mapper = null;
			if (obj instanceof JavaComponent) {
				Mapper m = ((JavaComponent) obj).getMapperRef();
				if (m instanceof JavaMapper) {
					JavaMapper jm = (JavaMapper) m;
					mapper = jm.getGroupId() + ":" + jm.getArtifactId();
				}
				if (m instanceof JavaPackageMapper) {
					JavaPackageMapper jp = (JavaPackageMapper) m;
					mapper = jp.getGroupId() + ":" + jp.getArtifactId();
				}
			}
			if (obj instanceof JavaScriptComponent) {
				JavaScriptMapper jsm = (JavaScriptMapper) ((JavaScriptComponent) obj).getMapperRef();
				if (jsm != null) {
					mapper = jsm.getJsPackageName();
				}
			}
			return new Object[] { mapper };
		}

		return new Object[] { null };

	}

	@Override
	public boolean isEditable(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc) {
		return true;
	}

	@Override
	public boolean isEnableToCreateChildren(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc) {
		return true;
	}

	@Override
	public void createChildren(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc, String childType)
			throws TuraException {
		String rel = "component2modelMapper";
		tdc.createChildObject(rel);
	}

	@Override
	public boolean isEnableToDelete(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc) {
		return isEditable(tdc, dc, oc);
	}

	@Override
	public void delete(TreeDataControl tdc, DataControl<?> dc, ObjectControl oc) throws TuraException {
		try {
			tdc.removeObject();
		} catch (Exception e) {
			throw new TuraException(e);
		}
	}

}
