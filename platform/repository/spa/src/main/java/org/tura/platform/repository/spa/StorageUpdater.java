/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.spa;

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
import org.tura.platform.repository.persistence.LinkProcessor;
import org.tura.platform.repository.priority.LinkControl;
import org.tura.platform.repository.priority.PriorityManager;
import org.tura.platform.repository.priority.RelationNode;
import org.tura.platform.repository.proxy.ProxyCommadStackProvider;

public class StorageUpdater implements StorageCommandProcessor, Serializable {

	private static final long serialVersionUID = -1689224604816572773L;
	public static String KEY_PROXY_REPOSITORY = "proxy-repository";
	private SpaObjectRegistry spaRegistry;
	private Registry registry;
	private RequestDataProducer requestDataProducer;


	public void setRegistry(SpaObjectRegistry spaRegistry, Registry registry,RequestDataProducer requestDataProducer) {
		this.spaRegistry = spaRegistry;
		this.registry = registry;
		this.requestDataProducer = requestDataProducer;
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List process() throws Exception {
		persistCachedObjects();
		cleanupCache();
		return requestDataProducer.getCommandStack();
	}

	private void persistCachedObjects() throws Exception {
		List<SpaControl> preparedObjects = getListOfPreparedObjects();

		PriorityManager pm = new PriorityManager();
		preparedObjects = pm.buildTree(preparedObjects);
		pm.attachTree(preparedObjects);
		List<RelationNode> nodes = pm.sort();
		ProxyFactory factory = findProxyFactory();

		List<SpaControl> processedCommand = processRelationNode(nodes, factory, preparedObjects);

		preparedObjects.removeAll(processedCommand);

		for (SpaControl control : preparedObjects) {
			completeCommand(control, factory);
		}
	}

	private ProxyFactory findProxyFactory() {
		Instantiator inst = registry.findInstantiator(KEY_PROXY_REPOSITORY);
		ProxyFactory factory = inst.newInstance(KEY_PROXY_REPOSITORY);
		factory.setStackProvider(new CommadStackProvider());
		return factory;
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

		RepositoryObjectLoader loader = new RepositoryObjectLoader(new ArrayList<SearchCriteria>(),
				new ArrayList<OrderCriteria>(), new HashMap<>(), registry);
		Object object = detailControl.getObject();
		object = loader.loader(object, detailControl.getKey(), repositoryClass, new ObjectGraph(), null);
		ObjectControl oc = (ObjectControl) factory.factory(object, repositoryClass.getName());

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

		ObjectControl oc = null;
		if (control.getLevel().equals(OperationLevel.INSERT) && repositoryClass != null) {
			RepositoryObjectLoader loader = new RepositoryObjectLoader(new ArrayList<SearchCriteria>(),
					new ArrayList<OrderCriteria>(), new HashMap<>(), registry);
			Object object = control.getObject();
			object = loader.loader(object, control.getKey(), repositoryClass, new ObjectGraph(), null);
			oc = (ObjectControl) factory.factory(object, repositoryClass.getName());
		}

		provider.setFactory(factory);
		provider.execute(control);

		if (control.getLevel().equals(OperationLevel.INSERT) && repositoryClass != null) {
			Mapper mapper = helper.findMapper(repositoryClass);
	        mapper.setProxyFactory(factory);
			mapper.copyPKFromPersistence2Repository(control.getObject(), oc );
			Object objPk =  mapper.getPrimaryKeyFromRepositoryObject(oc);
		    Map<Object, Object> context = new HashMap<>();
			mapper.put(context, objPk, control.getObject());
			mapper.differentiator(control.getObject(), oc, context);			
		}

	}

	private CRUDProvider findCRUDProvider(SpaControl obj) throws Exception {
		Class<?> clazz = Class.forName(obj.getType());
		CRUDProvider provider = spaRegistry.getRegistry(obj.getRegistryName()).findCRUDProvider(clazz);
		if (provider == null) {
			throw new RepositoryException("Cannot find CRUDProvider for class " + clazz);
		}
		provider.setKeyMapper(requestDataProducer.getKeyMapper());

		return provider;
	}

	private void cleanupCache() {
		requestDataProducer.getCache().clear();
		requestDataProducer.getNomergeRules().clear();
		requestDataProducer.setSequence(0);
	}

	private List<SpaControl> getListOfPreparedObjects() {
		ArrayList<SpaControl> list = new ArrayList<>();

		for (String h : requestDataProducer.getCache().keySet()) {
			Map<Object, SpaControl> typedList = requestDataProducer.getCache().get(h);
			list.addAll(typedList.values());
		}
		list.addAll(requestDataProducer.getNomergeRules());

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

	class CommadStackProvider implements ProxyCommadStackProvider {

		private static final long serialVersionUID = 1L;

		@Override
		public void addCommand(Object cmd) throws Exception {
			requestDataProducer.getCommandStack().add(cmd);

		}

		@Override
		public List<Object> getListOfCommand() throws Exception {
			return requestDataProducer.getCommandStack();
		}

		@Override
		public void clear() throws Exception {
			requestDataProducer.getCommandStack().clear();

		}

	}

}
