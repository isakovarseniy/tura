/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;

public class ObjectDataBase implements Serializable {

	private static final long serialVersionUID = -6479305329730871148L;

	private Map<Class<?>, Map<Object, StorageControl>> db = new HashMap<>();
	private Map<Class<?>, BidiMap> cpaid2KeyMapper = new HashMap<>();
	private Map<String, RepoKeyPath> internalObjectRepoKeyPath = new HashMap<>();
	private Map<String, List<String>> internalObjectRegistry = new HashMap<>();

	public ObjectDataBase() {

	}

	@SuppressWarnings("unchecked")
	public ObjectDataBase(ObjectDataBase odb) throws Exception {
		for (Class<?> clazz : odb.db.keySet()) {
			Map<Object, StorageControl> mp = new HashMap<>();
			this.db.put(clazz, mp);
			for (Object key : odb.db.get(clazz).keySet()) {
				StorageControl sc = odb.db.get(clazz).get(key);
				mp.put(key, new StorageControl(sc));
			}
		}

		for (Class<?> clazz : odb.cpaid2KeyMapper.keySet()) {
			BidiMap mp = new DualHashBidiMap();
			this.cpaid2KeyMapper.put(clazz, mp);
			mp.putAll(odb.cpaid2KeyMapper.get(clazz));
		}
		for (String key : odb.internalObjectRepoKeyPath.keySet()) {
			RepoKeyPath path = odb.internalObjectRepoKeyPath.get(key);
			this.internalObjectRepoKeyPath.put(key, path.clone());
		}
		for (String key : odb.internalObjectRegistry.keySet()) {
			List<String> registry = odb.internalObjectRegistry.get(key);
			List<String> r = new ArrayList<>();
			r.addAll(registry);
			this.internalObjectRegistry.put(key, r);
		}
	}

	public void catalogInternalObjects(String cpaid, StorageControl sc) throws RepositoryException {
		CpaMapper mapper = (CpaMapper) sc.getMapper();
		RepoKeyPath path = new RepoKeyPath();
		Map<String, RepoKeyPath> h = new HashMap<>();
		List<String> reg = new ArrayList<>();
		mapper.buildRepPathTree(path, sc.getObject(), h, null, reg);
		internalObjectRegistry.put(cpaid, reg);
		internalObjectRepoKeyPath.putAll(h);
	}

	public void cleanCatalogInternalObjects(String cpaid, StorageControl sc) {
		List<String> registry = internalObjectRegistry.get(cpaid);
		for (String key : registry) {
			internalObjectRepoKeyPath.remove(key);
		}
		internalObjectRegistry.remove(cpaid);
	}

	public RepoKeyPath findInternalPath(String cpaid) {
		return internalObjectRepoKeyPath.get(cpaid);
	}

	public void add(Object pk, String cpaid, Class<?> type, StorageControl sc) throws RepositoryException {
		addTypeDb(type, pk, sc);
		addTypeKeyMapperDb(type,cpaid, pk);
	}

	public void remove(Object pk, String cpaid, Class<?> type, StorageControl sc) throws RepositoryException {
		BidiMap typeKeyMapperDb = getTypeKeyMapperDb(type);
		if (typeKeyMapperDb.get(cpaid) == null) {
			throw new RepositoryException("Object already removed");
		}

		removeTypeDb(type, pk);
		removeTypeKeyMapperDb(type,cpaid);
	}

	public <T> void correctCpaId(String cpaid, Class<T> type) {
		BidiMap typeKeyMapperDb = getTypeKeyMapperDb(type);
		Object pk = typeKeyMapperDb.get(cpaid);
		if (removeTypeDb(type, pk) == null) {
			throw new RuntimeException("Correction error");
		}
		if (removeTypeKeyMapperDb(type,cpaid) == null) {
			throw new RuntimeException("Correction error");
		}
	}

	public <T> void replacePk(String cpaid, Object oldPk, Object newPk, Class<T> type) {
		Map<Object, StorageControl> typeDb = getTypeDb(type);

		StorageControl sc = typeDb.get(oldPk);

		removeTypeDb(type, oldPk);
		addTypeDb(type, newPk, sc);
		removeTypeKeyMapperDb(type, cpaid );
		addTypeKeyMapperDb(type,cpaid, newPk);
	}

	public StorageControl findByPrimaryKey(Object pk, Class<?> type) {
		Map<Object, StorageControl> typeDb = getTypeDb(type);
		if ( typeDb == null) {
			return null;
		}
		return typeDb.get(pk);
	}

	public StorageControl findByCpaId(String cpaid, Class<?> type) {
		Map<Object, StorageControl> typeDb = getTypeDb(type);
		if ( typeDb == null) {
			return null;
		}
		BidiMap typeKeyMapperDb = getTypeKeyMapperDb(type);
		if ( typeKeyMapperDb == null) {
			return null;
		}
		Object pk = typeKeyMapperDb.get(cpaid);
		return typeDb.get(pk);
	}

	public Collection<StorageControl> getObjectsByType(Class<?> type) {
		Map<Object, StorageControl> typeDb = getTypeDb(type);
		if ( typeDb == null) {
			return null;
		}
		return typeDb.values();
	}

	private Map<Object, StorageControl> getTypeDb(Class<?> type) {
		Map<Object, StorageControl> typeDb = db.get(type);
		return typeDb;
	}

	private void addTypeDb(Class<?> type, Object pk, StorageControl sc) {
		Map<Object, StorageControl> typeDb = db.get(type);
		if (typeDb != null && typeDb.get(pk) != null) {
			throw new RuntimeException("Object already exists");
		}
		if (typeDb == null) {
			typeDb = new HashMap<>();
			db.put(type, typeDb);
		}
		typeDb.put(pk, sc);
	}

	private Object removeTypeDb(Class<?> type, Object pk) {
		Map<Object, StorageControl> typeDb = db.get(type);
		if (typeDb == null || typeDb.get(pk) == null) {
			throw new RuntimeException("Object already removed");
		}
		Object obj =  typeDb.remove(pk);
		if ( typeDb.size() == 0) {
			db.remove(type);
		}
		return obj;
	}

	private BidiMap getTypeKeyMapperDb(Class<?> type) {
		BidiMap typeKeyMapperDb = cpaid2KeyMapper.get(type);
		return typeKeyMapperDb;
	}

	private void addTypeKeyMapperDb(Class<?> type, String cpaid, Object pk) {
		BidiMap typeKeyMapperDb = cpaid2KeyMapper.get(type);
		if (typeKeyMapperDb !=  null  && typeKeyMapperDb.get(pk) != null) {
			throw new RuntimeException("Object already exists");
		}
		if (typeKeyMapperDb == null) {
			typeKeyMapperDb = new DualHashBidiMap();
			cpaid2KeyMapper.put(type, typeKeyMapperDb);
		}
		typeKeyMapperDb.put(cpaid, pk);
	}
	
	private Object removeTypeKeyMapperDb(Class<?> type, String cpaid) {
		BidiMap typeKeyMapperDb = cpaid2KeyMapper.get(type);
		if (typeKeyMapperDb == null  || typeKeyMapperDb.get(cpaid) == null) {
			throw new RuntimeException("Object already removed");
		}
		Object obj  = typeKeyMapperDb.remove(cpaid);
		if ( typeKeyMapperDb.size() == 0) {
			cpaid2KeyMapper.remove(type);
		}
		return obj;
	}
	
	
	public String findCpaIdByPrimaryKey(Object pk, Class<?> type) {
		BidiMap typeKeyMapperDb = cpaid2KeyMapper.get(type);
		return (String) typeKeyMapperDb.inverseBidiMap().get(pk);
	}

}
