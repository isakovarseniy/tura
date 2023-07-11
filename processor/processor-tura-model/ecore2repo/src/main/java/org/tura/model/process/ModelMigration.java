/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.process;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.flock.FlockModule;
import org.h2.tools.Server;
import org.hibernate.cfg.Configuration;
import org.tura.convert.trg.TrgModelLoader;
import org.tura.epsilon.model.TuraModel;
import org.tura.epsilon.model.TypeResolver;
import org.tura.metamode.emf.EmfInstantiator;
import org.tura.metamode.tura.MeamodelTypeResolver;
import org.tura.metamode.tura.TuraInstantiator;
import org.tura.platform.datacontrol.commons.IdDeserializationProblemHandler;
import org.tura.platform.datacontrol.commons.ObjectMapperBuilder;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.repository.core.Repository;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchResult;
import org.tura.platform.repository.core.UpdateRequest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import domain.DomainPackage;

public class ModelMigration extends EmfInstantiator {

	private static TuraInstantiator repositoryProducer;
	private static Server server;

	public static void main(String[] args) {
		try {
			ModelMigration mig = new ModelMigration();
		    mig.migrate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			server.stop();
		}

	}

	public void migrate() throws Exception {
		FlockModule module = new FlockModule();

		String modelFile = TrgModelLoader.class.getResource("hr.domain").toURI().toString();
		EmfModel srcModel = createEmfModelByURI("src", modelFile, DomainPackage.eINSTANCE.getNsURI(), true, false);
		module.getContext().setOriginalModel(srcModel);

		TuraModel trgModel = createTuraModel();
		TypeResolver typeResolver = new MeamodelTypeResolver();
		trgModel.setName("trg");
		trgModel.setTypeResolver(typeResolver);
		module.getContext().setMigratedModel(trgModel);

		module.parse("");
		module.execute();

		System.out.println("before commit");
		trgModel.store();

		System.out.println("Done");
	}

	private TuraModel createTuraModel() throws Exception {

		server = Server.createTcpServer().start();		
		repositoryProducer = new TuraInstantiator();
		
		Configuration config = new Configuration();
		config.addResource("META-INF/persistence.xml");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Metamodel", config.getProperties());
		EntityManager em = emf.createEntityManager();
		TuraModel model = repositoryProducer.createTuraModel(em);
		return model;
	}

	
	public class ToFileRepository implements Repository {

		private static final long serialVersionUID = -6182437872768784440L;

		Repository transport;

		public ToFileRepository(Repository transport) {
			this.transport = transport;
		}

		@Override
		public <T> T create(Class<T> objectClass) throws RepositoryException {
			return transport.create(objectClass);
		}

		@Override
		public <T> SearchResult<T> find(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria,
				Integer startIndex, Integer endIndex, Class<T> objectClass) throws RepositoryException {
			return transport.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
		}

		@Override
		public <T> T find(Object pk, Class<T> objectClass) throws RepositoryException {
			return transport.find(pk, objectClass);
		}

		@Override
		public <T> void insert(Object obj, Class<T> objectClass) throws RepositoryException {
			transport.insert(obj, objectClass);
		}

		@Override
		public <T> void remove(Object obj, Class<T> objectClass) throws RepositoryException {
			transport.remove(obj, objectClass);

		}

		@SuppressWarnings("deprecation")
		@Override
		public List<Object> applyChanges(List<Object> changes) throws RepositoryException {
			ObjectMapper mapper = ObjectMapperBuilder.getObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);
			mapper.addHandler(new IdDeserializationProblemHandler());

			UpdateRequest request = new UpdateRequest();
			request.setChange(changes);
			try {
				byte[] str = mapper.writeValueAsBytes(request);
				Path filePath = Paths.get("/Users/arseniy", "text.json");
				Files.writeString(filePath, new String(str), StandardOpenOption.CREATE);
			} catch (Exception e) {
				throw new RepositoryException(e);
			}
			return null;
		}

	}

}
