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

package org.tura.model.designer.profiles;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.tura.model.designer.repository.neoj4.mapper.JavaMapper;
import org.tura.model.designer.repository.neoj4.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.neoj4.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.proxy.MetamodelMapper;
import org.tura.platform.repository.core.AllowEverythingProfile;
import org.tura.platform.repository.core.ObjectGraphProfile;

public class GraphAwareProfile extends ObjectGraphProfile {

	private static Map<String, Class<? extends ObjectGraphProfile>> hash = new HashMap<>();
	private ObjectGraphProfile profile;

	private static final long serialVersionUID = 1L;

	public boolean skipRelation(Object repositoryObject, Method method) {
		if (profile == null) {
			initProfile();
		}
		return profile.skipRelation(repositoryObject, method);
	}

	public boolean acceptRelation(Object repositoryObject, Method method) {
		if (profile == null) {
			initProfile();
		}
		return profile.acceptRelation(repositoryObject, method);
	}

	private void initProfile() {
		Class<? extends ObjectGraphProfile> clazz = hash.get(rootObject.getClass().getName());
		if (clazz == null) {
			profile = new AllowEverythingProfile();
		} else {
			try {
				profile = clazz.getConstructor().newInstance();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	static {
		hash.put(JavaMapper.class.getName(), JavaMapperGraphProfile.class);
		hash.put(JavaPackageMapper.class.getName(), JavaPackageMapperGraphProfile.class);
		hash.put(JavaScriptMapper.class.getName(), JavaScriptMapperGraphProfile.class);
		hash.put(MetamodelMapper.class.getName(), MetamodelMapperGraphProfile.class);
		
	}

}
