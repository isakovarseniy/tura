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
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.josql.Query;
import org.josql.QueryResults;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.ObjectGraph;
import org.tura.platform.repository.core.PathHelper;
import org.tura.platform.repository.core.RelationType;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.cpa.operation.NotificationObjectControl.NotificationType;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.proxy.CpaStorageEventListener;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class CpaStorage implements Serializable {

	private static final long serialVersionUID = 6777242421337680079L;
	private static final int THRESHOLD = 10;
	private static final String MASTER_OBJECT = "MASTER_OBJECT";
	private static final String MASTER_TYPE = "MASTER_TYPE";
	private static final String DETAIL_OBJECT = "DETAIL_OBJECT";
	private static final String DETAIL_TYPE = "DETAIL_TYPE";
	private static final String RELATION_NAME = "RELATION_NAME";
	private static final String OBJECT_MAPPER = "OBJECT_MAPPER";

	private static final String BEGIN_TIME_STAMP = "beginTimeStamp";
	private static final String END_TIME_STAMP = "endTimeStamp";
	private static final String STATUS_NAME = "status";

	private static final String CPAID = "cpaid";

	public static String SELECT_OBJECTS_SORTED_ASC = "SELECT * FROM org.tura.platform.repository.cpa.storage.StorageControl  WHERE status  IN  (:status)  and timeStamp >= :beginTimeStamp  and timeStamp < :endTimeStamp ORDER BY timeStamp ASC";

	public static String SELECT_OBJECTREF = "SELECT * FROM org.tura.platform.repository.cpa.storage.ObjectRef  WHERE cpaId  = :cpaId";

	private ProxyCommadStackProvider commadStackProvider;
	private String id;
	private Map<String, CpaStorageEventListener> listeners = new HashMap<>();
	private transient Map<String, LockData> lockKeeper = new HashMap<>();
	private transient ReferenceQueue<? super ObjectControl> reaped = new ReferenceQueue<>();
	private transient Map<Reference<ObjectControl>, RepoKeyPath> lockMap = new HashMap<>();
	private  transient Map<String,  String>   internalCpaIdMapping  =  new  HashMap<>();

	public CpaStorage() {
	}

	public void addCpaStorageEventListener(String id, CpaStorageEventListener listener) {
		if (!listeners.containsKey(id)) {
			listeners.put(id, listener);
		}
	}

	public void CpaStorageEventListener(String id) {
		listeners.remove(id);
	}

	public CpaStorage(String id) {
		this.id = id;
	}

	public ProxyCommadStackProvider getCommadStackProvider() {
		return commadStackProvider;
	}

	public void setCommadStackProvider(ProxyCommadStackProvider commadStackProvider) {
		this.commadStackProvider = commadStackProvider;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void notifyCreatedEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectCreated(type, dcSource);
		}
	}

	public void notifyInsertEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectInserted(type, dcSource);
		}
	}

	public void notifyDeleteEvent(Class<?> type, String dcSource) throws Exception {
		if (dcSource == null) {
			return;
		}
		for (CpaStorageEventListener listener : listeners.values()) {
			listener.objectDelited(type, dcSource);
		}
	}

	protected StorageData getStorageData() throws Exception {
		if (commadStackProvider.get().getData(getId()) == null) {
			commadStackProvider.get().addData(getId(), new StorageData());
		}
		return (StorageData) commadStackProvider.get().getData(getId());
	}

	public void create(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = new StorageControl(object, type, getNextTimeStamp(type));
		sc.setMapper(mapper);
		sc.setStatus(ObjectStatus.Created);
		String cpaid = mapper.getCpaId(object);
		getStorageData().getDb().add(pk, cpaid, type, sc);
	}

	public void load(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = new StorageControl(object, type, getNextTimeStamp(type));
		sc.setMapper(mapper);
		sc.setStatus(ObjectStatus.Loaded);
		String cpaid = mapper.getCpaId(object);
		long session = getStorageData().getSession();
		sc.setSession(session);
		getStorageData().getDb().add(pk, cpaid, type, sc);
	}

	public void unload(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = findByPrimaryKey(pk, type);
		String cpaId = findCpaIdByPrimaryKey(pk, type);
		getStorageData().getDb().remove(pk, cpaId, type, sc);
	}

	@SuppressWarnings("unchecked")
	public void unloadObjects(Class<?> type) throws Exception {
		unlockQueue();		
		Collection<StorageControl> array = getStorageData().getDb().getObjectsByType(type);
		if (array == null) {
			return;
		}
		if (array.size() < THRESHOLD) {
			return;
		}

		List<List<Object>> toCleanUp = new ArrayList<>();
		for (StorageControl sc : array) {
			List<Map<String, Object>> objectToRemove = new ArrayList<>();
			List<Map<String, Object>> relationToRemove = new ArrayList<Map<String, Object>>();
			boolean isLocked = isLocked(sc, new ObjectGraph(), new ArrayList<>(), objectToRemove, relationToRemove,
					LockOperation.Unload);
			if (!isLocked) {
				List<Object> ls = new ArrayList<>();
				ls.add(objectToRemove);
				ls.add(relationToRemove);
				toCleanUp.add(ls);
			}
		}

		for (List<Object> ls : toCleanUp) {
			List<Map<String, Object>> objectToRemove = (List<Map<String, Object>>) ls.get(0);
			List<Map<String, Object>> relationToRemove = (List<Map<String, Object>>) ls.get(1);
			unloadObjects(objectToRemove, relationToRemove);
		}
	}

	public void unloadObjects(List<Map<String, Object>> objectToRemove, List<Map<String, Object>> relationToRemove)
			throws Exception {
		for (Map<String, Object> relDesc : relationToRemove) {
			disconnect(relDesc, RelationType.Direct);
			disconnect(relDesc, RelationType.Opposite);
		}
		for (Map<String, Object> objDesc : objectToRemove) {
			remove(objDesc);
		}
	}

	public RepoKeyPath getInternalPath(String cpaid) throws Exception {
		return getStorageData().getDb().findInternalPath(cpaid);
	}

	public void catalogObject(Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		String cpaid = mapper.getCpaId(object);
		StorageControl sc = findByCpaId(cpaid, type);
		getStorageData().getDb().cleanCatalogInternalObjects(cpaid, sc);
		getStorageData().getDb().catalogInternalObjects(cpaid, sc);

	}

	public Map<Object, Map<Object, String>> collectCpaIds(List<Map<String, Object>> objects) throws Exception {
		Map<Object, Map<Object, String>> collected = new HashMap<>();
		for (Map<String, Object> mp : objects) {
			CpaMapper cpaMapper = (CpaMapper) mp.get(OBJECT_MAPPER);
			Object cpaId = mp.get(MASTER_OBJECT);
			Class<?> type = (Class<?>) mp.get(MASTER_TYPE);
			StorageControl sc = findByCpaId(cpaId, type);
			Object obj = sc.getObject();
			Map<Object, String> keys = new HashMap<>();
			cpaMapper.collectCpaIds(obj, keys);
			collected.put(cpaMapper.getPath(obj).toString(), keys);
		}
		return collected;
	}

	public void insert(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = findByPrimaryKey(pk, type);
		CpaMapper cpaMapper = (CpaMapper) mapper;
		if (sc == null) {
			sc = new StorageControl(object, type, getNextTimeStamp(type));
			sc.setStatus(ObjectStatus.Inserted);
			sc.setObject(object);
			sc.setMapper(mapper);
			long session = getStorageData().getSession();
			sc.setSession(session);
			String cpaid = mapper.getCpaId(object);

			if (cpaMapper.isComplex()) {
				getStorageData().getDb().catalogInternalObjects(mapper.getCpaId(sc.getObject()), sc);
			}
			getStorageData().getDb().add(pk, cpaid, type, sc);

		} else {
			Map<Object, String> keyMap = new HashMap<Object, String>();
			keyMap.put(pk, mapper.getCpaId(sc.getObject()));
			cpaMapper.replaceCpaIds(object, keyMap);

			if (cpaMapper.isComplex()) {
				getStorageData().getDb().cleanCatalogInternalObjects(mapper.getCpaId(sc.getObject()), sc);
			}
			sc.setObject(object);
			if (cpaMapper.isComplex()) {
				getStorageData().getDb().catalogInternalObjects(mapper.getCpaId(sc.getObject()), sc);
			}

			sc.setStatus(ObjectStatus.Inserted);
			sc.setTimeStamp(getNextTimeStamp(type));
		}

	}

	public void remove(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = findByPrimaryKey(pk, type);
		CpaMapper cpaMapper = (CpaMapper) mapper;
		if (sc != null) {
			if (cpaMapper.isComplex()) {
				getStorageData().getDb().cleanCatalogInternalObjects(mapper.getCpaId(sc.getObject()), sc);
			}
			sc.setObject(null);
			sc.setStatus(ObjectStatus.Removed);
			sc.setTimeStamp(getNextTimeStamp(type));
		} else {
			sc = new StorageControl(null, type, getNextTimeStamp(type));
			sc.setStatus(ObjectStatus.Removed);
			sc.setMapper(mapper);
			getStorageData().getDb().add(pk, null, type, sc);
		}
	}

	public void update(Object pk, Object object, Class<?> type, PersistanceMapper mapper) throws Exception {
		Object newPk = ((Mapper) mapper).getPrimaryKey(object);
		StorageControl sc = findByPrimaryKey(pk, type);

		if (sc == null) {
			throw new RepositoryException("Object does  not  exists");
		}

		if (sc != null && ObjectStatus.Removed.equals(sc.getStatus())) {
			throw new RepositoryException("Removed object cannot be connected");
		}

		sc.setObject(object);
		if (!newPk.equals(pk)) {
			this.replacePk(mapper.getCpaId(object), pk, newPk, type);
		}
		if (ObjectStatus.Loaded.equals(sc.getStatus())) {
			sc.setStatus(ObjectStatus.Updated);
			sc.setTimeStamp(getNextTimeStamp(type));
		}

	}

	public void connect(Object masterPk, Class<?> masterType, PersistanceMapper mapperMaster, String property,
			Object detailPk, Class<?> detailType, PersistanceMapper mapperDetail, RelationType cpaRelationType,
			Object masterExtObject, PersistanceMapper mapperMasterExt, Object detailExtObject,
			PersistanceMapper mapperDetailExt, boolean lazy) throws Exception {
		StorageControl masterSc = findByPrimaryKey(masterPk, masterType);

		String masterCpaId = mapperMaster.getCpaId(masterSc.getObject());
		String masterExtId = mapperMasterExt.getCpaId(masterExtObject);

		StorageControl detailSc = findByPrimaryKey(detailPk, detailType);

		if (detailSc != null && ObjectStatus.Removed.equals(detailSc.getStatus())) {
			throw new RepositoryException("Removed object cannot be connected");
		}

		String detailCpaId = mapperDetail.getCpaId(detailSc.getObject());
		String detailExtId = mapperDetailExt.getCpaId(detailExtObject);

		RelationControl control = new RelationControl(property, lazy);
		List<Ref> dependencies = getDependentCpaId(masterCpaId, masterExtId, control);
		Ref ref = new Ref(detailCpaId, detailExtId, detailType, cpaRelationType);

		if (dependencies != null && dependencies.contains(ref)) {
			return;
		}
		addDependentCpaId(masterCpaId, masterExtId, control, ref);

		if (ObjectStatus.Loaded.equals(masterSc.getStatus())) {
			masterSc.setStatus(ObjectStatus.Updated);
			masterSc.setTimeStamp(getNextTimeStamp(masterType));
		}

	}

	public void disconnect(Object masterPk, Class<?> masterType, PersistanceMapper mapperMaster, String property,
			Object detailPk, Class<?> detailType, PersistanceMapper mapperDetail, RelationType cpaRelationType,
			Object masterExtObject, PersistanceMapper mapperMasterExt, Object detailExtObject,
			PersistanceMapper mapperDetailExt

	) throws Exception {
		StorageControl masterSc = findByPrimaryKey(masterPk, masterType);

		String masterCpaId = mapperMaster.getCpaId(masterSc.getObject());
		String masterExtId = mapperMasterExt.getCpaId(masterExtObject);

		StorageControl detailSc = findByPrimaryKey(detailPk, detailType);
		if (detailSc != null && ObjectStatus.Removed.equals(detailSc.getStatus())) {
			throw new RepositoryException("Removed object cannot be disconnected");
		}

		String detailCpaId = mapperDetail.getCpaId(detailSc.getObject());
		String detailExtId = mapperDetailExt.getCpaId(detailExtObject);

		disconnect(masterCpaId, masterExtId, detailCpaId, detailExtId, detailType, property, cpaRelationType, false);

		if (ObjectStatus.Loaded.equals(masterSc.getStatus())) {
			masterSc.setStatus(ObjectStatus.Updated);
			masterSc.setTimeStamp(getNextTimeStamp(masterType));
		}
	}

	private long getNextTimeStamp(Class<?> type) throws Exception {
		long currentTimeStamp = getStorageData().getCurrentTimeStemp(type);
		long nextTimeStamp = currentTimeStamp + 1L;
		getStorageData().setCurrentTymeStemp(nextTimeStamp, type);
		return nextTimeStamp;
	}

	@SuppressWarnings("unchecked")
	public List<StorageControl> find(Class<?> type, long startTimeStamp, long endTimeStamp, List<String> status)
			throws Exception {

		Query query = new Query();
		query.parse(SELECT_OBJECTS_SORTED_ASC);
		query.setVariable(BEGIN_TIME_STAMP, startTimeStamp);
		query.setVariable(END_TIME_STAMP, endTimeStamp);
		query.setVariable(STATUS_NAME, status);

		Collection<StorageControl> array = getStorageData().getDb().getObjectsByType(type);
		if (array == null) {
			return new ArrayList<>();
		}
		QueryResults result = query.execute(array);

		return result.getResults();

	}

	public List<StorageControl> findAny(Class<?> type, long startTimeStamp, long endTimeStamp) throws Exception {

		String[] statuses = new String[] { ObjectStatus.Loaded.name(), ObjectStatus.Created.name(),
				ObjectStatus.Inserted.name(), ObjectStatus.Updated.name(), ObjectStatus.Removed.name() };

		return this.find(type, startTimeStamp, endTimeStamp, Arrays.asList(statuses));
	}

	private List<StorageControl> findDependencies(String masterCpaId, String extId, String property,
			RelationType cpaRelationType) throws Exception {
		RelationControl control = new RelationControl(property);
		List<Ref> dependencies = getDependentCpaId(masterCpaId, extId, control);
		List<StorageControl> result = new ArrayList<>();
		if (dependencies == null) {
			return result;
		}
		for (Ref ref : dependencies) {
			if (RelationType.Any.equals(cpaRelationType) || ref.getCpaRelationType().equals(cpaRelationType)) {
				result.add(wrap(ref));
			}
		}
		return result;
	}

	public List<StorageControl> findDependencies(RepoKeyPath path, String property, RelationType cpaRelationType)
			throws Exception {
		String masterCpaId = getMasterId(path);
		String extCpaId = getExtId(path);
		return findDependencies(masterCpaId, extCpaId, property, cpaRelationType);
	}

	@SuppressWarnings("unchecked")
	public List<StorageControl> findDependencies(RepoKeyPath path, String property, long startTimeStamp,
			long endTimeStamp, List<String> status, RelationType cpaRelationType) throws Exception {

		List<StorageControl> dependency = findDependencies(path, property, cpaRelationType);

		Query query = new Query();
		query.parse(SELECT_OBJECTS_SORTED_ASC);
		query.setVariable(BEGIN_TIME_STAMP, startTimeStamp);
		query.setVariable(END_TIME_STAMP, endTimeStamp);
		query.setVariable(STATUS_NAME, status);

		QueryResults result = query.execute(dependency);

		return result.getResults();
	}

	private StorageControl wrap(Ref ref) throws Exception {
		StorageControl sc = findByCpaId(ref.getPk(), ref.getType());
		if (sc == null) {
			return null;
		}
		RepoKeyPath path = getStorageData().getDb().findInternalPath((String) ref.getExtPk());
		if  ( !ref.getExtPk().equals(ref.getPk()) && path  == null) {
			throw  new RepositoryException("Detail  object not found");
		}
		if (path != null) {
			StorageControlWrapper scw = new StorageControlWrapper(sc, path);
			return scw;
		}
		return sc;
	}

	public <T> void replacePk(String cpaid, Object oldPk, Object newPk, Class<T> type) throws Exception {
		getStorageData().getDb().replacePk(cpaid, oldPk, newPk, type);
	}

	public StorageControl findByPrimaryKey(Object pk, Class<?> type) throws Exception {
		return getStorageData().getDb().findByPrimaryKey(pk, type);
	}

	private String findCpaIdByPrimaryKey(Object pk, Class<?> type) throws Exception {
		return getStorageData().getDb().findCpaIdByPrimaryKey(pk, type);
	}

	public StorageControl findByCpaId(Object cpaId, Class<?> type) throws Exception {
		return getStorageData().getDb().findByCpaId((String) cpaId, type);
	}

	public <T> void correctCreatedObjects(Object detailObj, Class<T> detailType, PersistanceMapper detailMapper,
			PersistanceMapper masterMapper, Object masterObject) throws Exception {
		String masterCpaId = masterMapper.getCpaId(masterObject);
		String detailCpaid = detailMapper.getCpaId(detailObj);

		LockData masterLock = lockKeeper.get(masterCpaId);
		if (masterLock == null) {
			throw new RuntimeException("Master object is not locked");
		}

		LockData detailLock = lockKeeper.get(detailCpaid);
		if (detailLock == null) {
			throw new RuntimeException("Detail object is not locked");
		}
		masterLock.increment(detailLock.getLock());
		lockKeeper.remove(detailCpaid);
		internalCpaIdMapping.put(detailCpaid, masterCpaId);

		getStorageData().getDb().correctCpaId(detailCpaid, detailType);

	}

	@SuppressWarnings("unchecked")
	public <T> T getObject(RepoKeyPath path) throws RepositoryException {
		try {
			String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
			String className = path.getPath().get(0).getType();
			Class<?> clazz = Class.forName(className);
			StorageControl obj = this.findByCpaId(cpaid, clazz);
			if (obj == null || ObjectStatus.Removed.equals(obj.getStatus())) {
				return null;
			}
			T t = (T) getExtendedObject(path, obj.getObject());

			return t;
		} catch (Exception e) {

		}
		return null;
	}

	public void lock(ObjectControl oc) throws Exception {
		RepoKeyPath path = oc.getCpaPath();
		Reference<ObjectControl> ref = new WeakReference<ObjectControl>(oc, reaped);
		lockMap.put(ref, path);
		lock(path);
	}

	@SuppressWarnings("unchecked")
	public void unlockQueue() throws Exception {
		Reference<ObjectControl> rf = (Reference<ObjectControl>) reaped.poll();
		while (rf != null) {
			RepoKeyPath path = lockMap.get(rf);
			lockMap.remove(rf);
			unlock(path);
			rf = (Reference<ObjectControl>) reaped.poll();
		}
	}

	private void lock(RepoKeyPath path) {
		String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
		LockData lock = this.lockKeeper.get(cpaid);
		if (lock == null) {
			lock = new LockData(cpaid);
			this.lockKeeper.put(cpaid, lock);
		}
		lock.increment();
	}

	private void unlock(RepoKeyPath path) {
		String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
		LockData lock = this.lockKeeper.get(cpaid);
		if (lock == null) {
			String maserCpaId = internalCpaIdMapping.get(cpaid);
			if ( maserCpaId == null  ) {
				throw new RuntimeException("Object is not locked");
			}
			lock = this.lockKeeper.get(maserCpaId);
			if (lock == null) {
				throw new RuntimeException("Object is not locked");
			}
		}
		lock.decrement();
		if (lock.getLock() == 0) {
			this.lockKeeper.remove(cpaid);
		}
	}

	public boolean isLocked(String cpaid) {
		LockData lock = this.lockKeeper.get(cpaid);
		if (lock == null || lock.getLock() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public StorageControl getStorageControl(RepoKeyPath path) throws RepositoryException {
		try {
			String cpaid = path.getPath().get(0).getKey().iterator().next().getValue();
			String className = path.getPath().get(0).getType();
			Class<?> clazz = Class.forName(className);
			StorageControl obj = this.findByCpaId(cpaid, clazz);
			return obj;
		} catch (Exception e) {

		}
		return null;
	}

	protected Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
	}

	public boolean isLocked(StorageControl masterScl, ObjectGraph graph, List<Object> loadedObjects,
			List<Map<String, Object>> objectToRemove, List<Map<String, Object>> relationToRemove,
			LockOperation lockOperation) throws Exception {

		if (lockOperation.equals(LockOperation.Unload)) {
			if (masterScl.isUpdatable()) {
				String masterCpaId = masterScl.getMapper().getCpaId(masterScl.getObject());
				if (isLocked(masterCpaId)) {
					return true;
				}
			}else {
				return true;
			}
		}

		if (lockOperation.equals(LockOperation.Update)) {
			if (!masterScl.isUpdatable()) {
				return true;
			}
		}
		
		String masterCpaId = masterScl.getMapper().getCpaId(masterScl.getObject());
		Class<?> clazz = masterScl.getType();

		if (loadedObjects.contains(masterCpaId)) {
			return false;
		} else {
			loadedObjects.add(masterCpaId);
			Map<String, Object> object = new HashMap<>();
			object.put(MASTER_OBJECT, masterCpaId);
			object.put(MASTER_TYPE, clazz);
			object.put(OBJECT_MAPPER, masterScl.getMapper());

			objectToRemove.add(object);
			return isLocked(masterCpaId, clazz, graph, loadedObjects, objectToRemove, relationToRemove, lockOperation);
		}
	}

	public List<Object> buldPkList(List<Map<String, Object>> objectToRemove) throws Exception {
		List<Object> removedPk = new ArrayList<>();
		for (Map<String, Object> h : objectToRemove) {
			String cpaid = (String) h.get(MASTER_OBJECT);
			Class<?> clazz = (Class<?>) h.get(MASTER_TYPE);
			StorageControl sc = findByCpaId(cpaid, clazz);
			PersistanceMapper mp = (PersistanceMapper) h.get(OBJECT_MAPPER);
			Object pk = mp.getPrimaryKeyFromRepositoryObject(sc.getObject());
			removedPk.add(pk);
		}
		return removedPk;
	}

	private boolean isLocked(String masterCpaId, Class<?> type, ObjectGraph graph, List<Object> loadedObjects,
			List<Map<String, Object>> objectToRemove, List<Map<String, Object>> relationToRemove,
			LockOperation lockOperation) throws Exception {

		Map<ObjectRef, Map<RelationControl, List<Ref>>> filteredConnections = findRelations(masterCpaId);
		for (ObjectRef ref : filteredConnections.keySet()) {
			Map<RelationControl, List<Ref>> relations = filteredConnections.get(ref);
			for (RelationControl rc : relations.keySet()) {
				if (!graph.addBranch(rc.getRelation())) {
					continue;
				}
				if (rc.isLazy()) {
					continue;
				}

				List<StorageControl> dependentObjects = findDependencies(ref.getCpaId(), ref.getExtCpaId(),
						rc.getRelation(), RelationType.Any);
				for (StorageControl sc : dependentObjects) {
					Map<String, Object> relDesc = new HashMap<>();
					relDesc.put(MASTER_OBJECT, masterCpaId);
					relDesc.put(MASTER_TYPE, type);
					relDesc.put(DETAIL_OBJECT, sc.getMapper().getCpaId(sc.getObject()));
					relDesc.put(DETAIL_TYPE, sc.getType());
					relDesc.put(RELATION_NAME, rc.getRelation());
					relationToRemove.add(relDesc);
				}

				for (StorageControl sc : dependentObjects) {
					boolean isLocked = isLocked(sc, graph, loadedObjects, objectToRemove, relationToRemove,
							lockOperation);
					if (isLocked) {
						graph.removeLastBranch(rc.getRelation());
						return true;
					}
				}
				graph.removeLastBranch(rc.getRelation());
			}
		}

		return false;
	}

	// Used only for check lock
	public Map<ObjectRef, Map<RelationControl, List<Ref>>> findRelations(String masterId) throws Exception {
		Map<ObjectRef, Map<RelationControl, List<Ref>>> connections = getStorageData().getConnections();
//Find all reletions Working for  internal objects

		Query query = new Query();
		query.parse(SELECT_OBJECTREF);
		query.setVariable(CPAID, masterId);
		QueryResults result = query.execute(connections.keySet());

		Map<ObjectRef, Map<RelationControl, List<Ref>>> filteredConnection = new HashMap<>();
		for (Object obj : result.getResults()) {
			ObjectRef ref = (ObjectRef) obj;
			filteredConnection.put(ref, connections.get(ref));
		}
		return filteredConnection;
	}

	@SuppressWarnings("unused")
	private StorageControl getMasterStorageControl(RepoKeyPath path) throws Exception {
		String masterCpaId = getMasterId(path);
		Class<?> clazz = getMasterClass(path);
		StorageControl sc = this.findByCpaId(masterCpaId, clazz);
		if (sc == null) {
			throw new RepositoryException("Cannot find  object");
		}
		return sc;
	}

	private String getMasterId(RepoKeyPath path) {
		RepoObjectKey masterKey = path.getPath().get(0);
		String masterCpaId = masterKey.getKey().get(0).getValue();
		return masterCpaId;
	}

	private String getExtId(RepoKeyPath path) {
		RepoObjectKey key = path.getPath().get(path.getPath().size() - 1);
		String extCpaId = key.getKey().get(0).getValue();
		return extCpaId;
	}

	private Class<?> getMasterClass(RepoKeyPath path) throws Exception {
		String type = getMasterType(path);
		Class<?> clazz = Class.forName(type);
		return clazz;
	}

	private String getMasterType(RepoKeyPath path) throws Exception {
		RepoObjectKey masterKey = path.getPath().get(0);
		String type = masterKey.getKey().get(0).getType();
		return type;
	}

	private List<Ref> getDependentCpaId(String masterId, String extId, RelationControl rc) throws Exception {
		Map<ObjectRef, Map<RelationControl, List<Ref>>> connections = getStorageData().getConnections();
		ObjectRef oref = new ObjectRef(masterId, extId);
		Map<RelationControl, List<Ref>> relations = connections.get(oref);
		if (relations == null) {
			return null;
		}
		List<Ref> list = relations.get(rc);
		return list;
	}

	private void addDependentCpaId(String masterId, String extId, RelationControl rc, Ref ref) throws Exception {
		Map<ObjectRef, Map<RelationControl, List<Ref>>> connections = getStorageData().getConnections();
		ObjectRef oref = new ObjectRef(masterId, extId);
		Map<RelationControl, List<Ref>> relations = connections.get(oref);
		if (relations == null) {
			relations = new HashMap<>();
			connections.put(oref, relations);
		}
		List<Ref> list = relations.get(rc);
		if (list == null) {
			list = new ArrayList<>();
			relations.put(rc, list);
		}
		list.add(ref);
	}

	private void removeDependentCpaId(String masterId, String extId, RelationControl rc, Ref ref, boolean quietly)
			throws Exception {
		Map<ObjectRef, Map<RelationControl, List<Ref>>> connections = getStorageData().getConnections();
		ObjectRef oref = new ObjectRef(masterId, extId);
		Map<RelationControl, List<Ref>> relations = connections.get(oref);
		if (relations == null && !quietly) {
			throw new RepositoryException("Connection does not exists");
		}
		if (relations == null && quietly) {
			return;
		}

		List<Ref> list = relations.get(rc);
		if (list == null && !quietly) {
			throw new RepositoryException("Connection does not exists");
		}
		if (list == null && quietly) {
			return;
		}

		list.remove(ref);
	}

	private void disconnect(Map<String, Object> relDesc, RelationType cpaRelationType) throws Exception {
		String masterCpaId = (String) relDesc.get(MASTER_OBJECT);
		String detailCpaId = (String) relDesc.get(DETAIL_OBJECT);
		Class<?> detailType = (Class<?>) relDesc.get(DETAIL_TYPE);
		String property = (String) relDesc.get(RELATION_NAME);
		disconnect(masterCpaId, masterCpaId, detailCpaId, detailCpaId, detailType, property, cpaRelationType, true);
	}

	private void disconnect(String masterCpaId, String masterExtId, String detailCpaId, String detailExtId,
			Class<?> detailType, String property, RelationType cpaRelationType, boolean quietly) throws Exception {
		RelationControl control = new RelationControl(property);
		Ref ref = new Ref(detailCpaId, detailExtId, detailType, cpaRelationType);
		removeDependentCpaId(masterCpaId, masterExtId, control, ref, quietly);
	}

	private void remove(Map<String, Object> objDesc) throws Exception {
		String masterCpaId = (String) objDesc.get(MASTER_OBJECT);
		Class<?> masterType = (Class<?>) objDesc.get(MASTER_TYPE);
		StorageControl sc = this.getStorageData().getDb().findByCpaId(masterCpaId, masterType);
		if (sc == null) {
			return;
		}
		remove(masterCpaId, masterType);
	}

	private void remove(String masterCpaId, Class<?> masterType) throws Exception {
		StorageControl sc = this.getStorageData().getDb().findByCpaId(masterCpaId, masterType);
		Object pk = sc.getMapper().getPrimaryKeyFromRepositoryObject(sc.getObject());
		this.getStorageData().getDb().remove(pk, masterCpaId, masterType, sc);
	}

	public void updateStatus(Object pk, String value, Class<?> type, PersistanceMapper mapper) throws Exception {
		StorageControl sc = findByPrimaryKey(pk, type);
		ObjectStatus status = ObjectStatus.valueOf(value);
		sc.setStatus(status);
	}

	public Map<ObjectRef, Map<RelationControl, List<Ref>>> getConnections() throws Exception {
		return getStorageData().getConnections();
	}

	public long getCurrentSession() throws Exception {
		return getStorageData().getSession();
	}

	public void nextSession() throws Exception {
		long session = getStorageData().getSession();
		getStorageData().setSession(++session);
	}

	public void notifyListners(Object notificationSourceObject, NotificationType notificationType, String sourceId)
			throws Exception {
		if (NotificationType.INSERT.equals(notificationType)) {
			notifyInsertEvent(notificationSourceObject.getClass(), sourceId);
		}
		if (NotificationType.DELETE.equals(notificationType)) {
			notifyDeleteEvent(notificationSourceObject.getClass(), sourceId);
		}

	}

	
    private void readObject(java.io.ObjectInputStream aInputStream) throws ClassNotFoundException, java.io.IOException {
		aInputStream.defaultReadObject();
		lockKeeper = new HashMap<>();
		reaped = new ReferenceQueue<>();
		lockMap = new HashMap<>();
		internalCpaIdMapping  =  new  HashMap<>();
	}
	
	public enum LockOperation {
		Update, Unload
	}

}