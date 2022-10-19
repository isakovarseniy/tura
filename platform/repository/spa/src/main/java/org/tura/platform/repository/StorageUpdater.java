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

package org.tura.platform.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Instantiator;
import org.tura.platform.repository.core.Mapper;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.ObjectGraph;
import org.tura.platform.repository.core.PathHelper;
import org.tura.platform.repository.core.ProxyFactory;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.core.RepositoryObjectLoader;
import org.tura.platform.repository.core.StorageCommandProcessor;
import org.tura.platform.repository.operation.CpaChangeStatusOperation;
import org.tura.platform.repository.operation.CpaUnloadObject;
import org.tura.platform.repository.persistence.LinkProcessor;
import org.tura.platform.repository.spa.CRUDProvider;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryData;
import org.tura.platform.repository.spa.priority.LinkControl;
import org.tura.platform.repository.spa.priority.PriorityManager;
import org.tura.platform.repository.spa.priority.RelationNode;

public class StorageUpdater implements StorageCommandProcessor, Serializable {

	private static final long serialVersionUID = -1689224604816572773L;
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private SpaRepositoryData spaRepositoryData;

	public void setRegistry(SpaObjectRegistry spaRegistry, Registry registry) {
		this.spaRegistry = spaRegistry;
		this.registry = registry;
	}

	public void setSpaRepositoryData(SpaRepositoryData spaRepositoryData) {
		this.spaRepositoryData = spaRepositoryData;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List process(SpaRepositoryData spaRepositoryData) throws Exception {
		this.spaRepositoryData = spaRepositoryData;
		ProxyFactory factory = findProxyFactory();
		factory.getStackProvider().get().clear();
		persistCachedObjects(factory);
		return factory.getStackProvider().get().getListOfCommand();
	}

	private void persistCachedObjects(ProxyFactory factory) throws Exception {
		List<SpaControl> preparedObjects = getListOfPreparedObjects();

		List<SpaControl> nopOperations = fiindNopOperations(preparedObjects);
		preparedObjects.removeAll(nopOperations);

		PriorityManager pm = new PriorityManager();
		preparedObjects = pm.buildTree(preparedObjects);
		pm.attachTree(preparedObjects);
		List<RelationNode> nodes = pm.sort();

		List<SpaControl> processedCommand = processRelationNode(nodes, factory, preparedObjects);

		preparedObjects.removeAll(processedCommand);

		for (SpaControl control : preparedObjects) {
			completeCommand(control, factory);
		}

		for (SpaControl control : nopOperations) {
			completeNopCommand(control, factory);
		}
	}

	private void completeNopCommand(SpaControl control, ProxyFactory factory) throws Exception {
		RepositoryHelper helper = new RepositoryHelper(registry);
		Class<?> repositoryClass = helper.findRepositoryClassNoException(control.getType());

		RepositoryObjectLoader loader = new RepositoryObjectLoader(registry, spaRepositoryData);
		loader.setOrderCriteria(new ArrayList<OrderCriteria>());
		loader.setSearchCriteria(new ArrayList<SearchCriteria>());
		loader.setContext(new HashMap<>());

		Map<Object, SpaControl>  cache  =  spaRepositoryData.getCache().get(control.getType());
		if( cache != null) {
			Object  obj = cache.get(control.getKey());
			if (  obj != null) {
				return;
			}
		}
		Object object = control.getObject();
		object = loader.loader(object, control.getKey(), repositoryClass, new ObjectGraph(), null);
		ObjectControl oc = (ObjectControl) factory.load(object, repositoryClass);

		addCorrectionCommand(control.getLevel(), oc, factory);
	}

	private List<SpaControl> fiindNopOperations(List<SpaControl> preparedObjects) {
		List<SpaControl> nopOperations = new ArrayList<>();
		for (SpaControl sc : preparedObjects) {
			if (OperationLevel.NOP.equals(sc.getLevel())) {
				nopOperations.add(sc);
			}
		}
		return nopOperations;
	}

	private ProxyFactory findProxyFactory() {
		Instantiator inst = registry.findInstantiator(ProxyFactory.class);
		ProxyFactory repository = inst.newInstance(ProxyFactory.class);
		return repository;
	}

	private List<SpaControl> processRelationNode(List<RelationNode> nodes, ProxyFactory factory,
			List<SpaControl> commands) throws Exception {

		Map<String, SpaControl> cmdHash = new HashMap<>();
		for (SpaControl control : commands) {
			if (control.getLevel().equals(OperationLevel.INSERT) || control.getLevel().equals(OperationLevel.UPDATE)) {
				cmdHash.put(PriorityManager.getKey(control), control);
			}
		}

		List<SpaControl> processedCommand = new ArrayList<SpaControl>();
		for (RelationNode node : nodes) {
			SpaControl control = node.getCommand();
			if (control == null) {
				continue;
			}
			completeCommand(control, factory);
			Collection<LinkControl> links = node.getLinks();

			for (LinkControl lnk : links) {
				if (lnk.getRelation() instanceof LinkProcessor) {
					executeNonLinkedUpdate(lnk, cmdHash, factory);
				} else {
					executeUpdate(lnk, cmdHash);
				}
			}
			processedCommand.add(control);
		}
		return processedCommand;
	}

	private void executeNonLinkedUpdate(LinkControl lnk, Map<String, SpaControl> cmdHash, ProxyFactory factory)
			throws Exception {

		String masterkey = PriorityManager.getLinkedKey(lnk.getMasterType(), lnk.getMasterPk().toString());
		String detailkey = PriorityManager.getLinkedKey(lnk.getDetailType(), lnk.getDetailPk().toString());

		SpaControl masterControl = cmdHash.get(masterkey);
		SpaControl detailControl = cmdHash.get(detailkey);

		RepositoryHelper helper = new RepositoryHelper(registry);
		Class<?> repositoryClass = helper.findRepositoryClass(detailControl.getType());

		RepositoryObjectLoader loader = new RepositoryObjectLoader(registry, spaRepositoryData);
		loader.setOrderCriteria(new ArrayList<OrderCriteria>());
		loader.setSearchCriteria(new ArrayList<SearchCriteria>());
		loader.setContext(new HashMap<>());

		Object object = detailControl.getObject();
		object = loader.loader(object, detailControl.getKey(), repositoryClass, new ObjectGraph(), null);
		ObjectControl oc = (ObjectControl) factory.load(object, repositoryClass);

		Object extendedPersistanceMasterObject = getExtendedObject(lnk.getExtendedMasterPk(),
				masterControl.getObject());
		Object extendedPersistanceDetailObject = getExtendedObject(lnk.getExtendedDetailPk(), oc);

		lnk.getRelation().connect(extendedPersistanceMasterObject, extendedPersistanceDetailObject);

		extendedPersistanceDetailObject = getExtendedObject(lnk.getExtendedDetailPk(), detailControl.getObject());

		lnk.getRelation().connect(extendedPersistanceMasterObject, extendedPersistanceDetailObject);

	}

	private void executeUpdate(LinkControl lnk, Map<String, SpaControl> cmdHash) throws Exception {
		String masterkey = PriorityManager.getLinkedKey(lnk.getMasterType(), lnk.getMasterPk().toString());
		String detailkey = PriorityManager.getLinkedKey(lnk.getDetailType(), lnk.getDetailPk().toString());

		SpaControl masterControl = cmdHash.get(masterkey);
		SpaControl detailControl = cmdHash.get(detailkey);

		Object extendedPersistanceMasterObject = getExtendedObject(lnk.getExtendedMasterPk(),
				masterControl.getObject());
		Object extendedPersistanceDetailObject = getExtendedObject(lnk.getExtendedDetailPk(),
				detailControl.getObject());

		if (lnk.isOposit()) {
			lnk.getRelation().connect(extendedPersistanceDetailObject, extendedPersistanceMasterObject);
		} else {
			lnk.getRelation().connect(extendedPersistanceMasterObject, extendedPersistanceDetailObject);
		}
	}

	private void completeCommand(SpaControl control, ProxyFactory factory) throws Exception {
		CRUDProvider provider = findCRUDProvider(control);
		RepositoryHelper helper = new RepositoryHelper(registry);
		Class<?> repositoryClass = helper.findRepositoryClassNoException(control.getType());

		OperationLevel level = control.getLevel();
		RepositoryObjectLoader loader = new RepositoryObjectLoader(registry, spaRepositoryData);
		loader.setOrderCriteria(new ArrayList<OrderCriteria>());
		loader.setSearchCriteria(new ArrayList<SearchCriteria>());
		loader.setContext(new HashMap<>());

		Object object = control.getObject();
		if ( control.getOriginalObject()  != null) {
			object = control.getOriginalObject();
			repositoryClass = helper.findRepositoryClassNoException(control.getOriginalObject().getClass().getName());
		}
		object = loader.loader(object, control.getKey(), repositoryClass, new ObjectGraph(), null);
		ObjectControl oc = (ObjectControl) factory.load(object, repositoryClass);

		provider.setFactory(factory);
		provider.execute(control);

		if ( ( (OperationLevel.INSERT.equals(level)  ||   OperationLevel.UPDATE.equals(level)) && repositoryClass != null)) {
			Mapper mapper = helper.findMapper(repositoryClass);
			mapper.setProxyFactory(factory);
			mapper.copyPKFromPersistence2Repository(control.getObject(), oc);
			Object objPk = mapper.getPrimaryKeyFromRepositoryObject(oc);
			Map<Object, Object> context = new HashMap<>();
			mapper.put(context, objPk, control.getObject());
			if ( control.getDiffirentiator() == null) {
			   mapper.differentiator(control.getObject(), oc, context);
			}else {
				control.getDiffirentiator().differentiator(control.getObject(), oc, context);
			}
		}

		addCorrectionCommand(control.getLevel(), oc, factory);
	}

	private CRUDProvider findCRUDProvider(SpaControl obj) throws Exception {
		Class<?> clazz = Class.forName(obj.getType());
		CRUDProvider provider = spaRegistry.getRegistry(obj.getRegistryName()).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		provider.setKeyMapper(spaRepositoryData.getKeyMapper());

		return provider;
	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();

		for (String h : spaRepositoryData.getCache().keySet()) {
			Map<Object, SpaControl> typedList = spaRepositoryData.getCache().get(h);
			list.addAll(typedList.values());
		}
		list.addAll(spaRepositoryData.getNomergeRules());

		Collections.sort(list, new Comparator<SpaControl>() {

			@Override
			public int compare(SpaControl o1, SpaControl o2) {
				return o1.compareTo(o2);
			}
		});
		return list;
	}

	protected Object getExtendedObject(RepoKeyPath extendedPk, Object persistanceObject) throws Exception {
		return PathHelper.getPathValue(extendedPk, 1, persistanceObject);
	}

	private void addCorrectionCommand(OperationLevel level, ObjectControl oc, ProxyFactory factory) throws Exception {
		if (OperationLevel.INSERT.equals(level) || OperationLevel.UPDATE.equals(level)
				|| OperationLevel.CONNECT.equals(level) || OperationLevel.DISCONNECT.equals(level)
				|| OperationLevel.NOP.equals(level) || OperationLevel.OPERATION.equals(level)) {
			CpaChangeStatusOperation command = new CpaChangeStatusOperation();
			command.setProxy(oc);
			command.setStackProvider(factory.getStackProvider());
			command.prepare();
			return;
		}
		if (OperationLevel.DELETE.equals(level)) {
			CpaUnloadObject command = new CpaUnloadObject();
			command.setProxy(oc);
			command.setStackProvider(factory.getStackProvider());
			command.prepare();
			return;
		}
	}




}
