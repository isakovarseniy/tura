/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.core;

import java.util.Map;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

public class KeyMapperHelper {
	
	protected RepositoryHelper helper;
	private Map<String, BidiMap> keyMapper;
	
	public KeyMapperHelper(RepositoryHelper helper,Map<String, BidiMap> keyMapper) {
		this.helper = helper;
		this.keyMapper = keyMapper;
	}

	public Object mapPk(String type, Object obj, Object oldPk) throws RepositoryException {
		Class<?> repositoryClass = helper.findRepositoryClass(type);
		Mapper mapper = helper.findMapper(repositoryClass.getName());
		Object newPk = mapper.getPrimaryKey(obj);
		if (oldPk.equals(newPk) ) {
			return oldPk;
		}

		BidiMap hash = this.keyMapper.get(type);
		if (hash == null) {
			hash = new DualHashBidiMap();
			this.keyMapper.put(type, hash);
		}
		hash.put(oldPk, newPk);

		return newPk;
	}

	public Object findPK(Object oldPK, String type) {
		BidiMap hash = keyMapper.get(type);
		if (hash == null) {
			return oldPK;
		}
		Object pk = hash.get(oldPK);
		if (pk == null) {
			return oldPK;
		} else {
			return pk;
		}

	}
	
	public Object findReversePK(Object newPK, String type) {
		BidiMap hash = keyMapper.get(type);
		if (hash == null) {
			return newPK;
		}
		Object pk = hash.inverseBidiMap().get(newPK);
		if (pk == null) {
			return newPK;
		} else {
			return pk;
		}

	}
	


}
