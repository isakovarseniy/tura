/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel;

import javax.transaction.TransactionManager;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.ELResolver;
import org.elsoft.platform.datacontrol.RootModeSwitch;
import org.elsoft.platform.datacontrol.StructureControl;
import org.elsoft.platform.datacontrol.annotations.FactoryDataControl;
import org.elsoft.platform.metamodel.suite.DomainServiceDC;
import org.elsoft.platform.metamodel.context.MetadataStructureControl;
import org.elsoft.platform.metamodel.general.TransactionManagerImpl;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.types.TypeMappingHandler;
import org.elsoft.platform.metamodel.types.transformation.ArtifactTypeHandler;

public class RepositoryFactory {

	private StructureControl sc = null;
	private DomainServiceDC domainService;
	private TypeDefinitionHandler typeDefinition;
	private TypeMappingHandler typeMapping;
	private ArtifactTypeHandler artifactType;

	public RepositoryFactory() throws Exception{
		TransactionManager trx = (TransactionManagerImpl) Class.forName(
				PlatformConfig.TRANSACTION_SERVICE).newInstance();
		init(trx);
	}

	public RepositoryFactory(String transactionService) throws Exception {
		TransactionManager trx = (TransactionManagerImpl) Class.forName(
				transactionService).newInstance();
		init(trx);
	}

	public RepositoryFactory(TransactionManager trx) throws Exception {
		init(trx);
	}
	
	
	public void init(TransactionManager trx) throws Exception {

			sc = new StructureControl();
			StructureControl metasc = (StructureControl) MetadataStructureControl
					.newInstance();

			MetadataStructureControl w = (MetadataStructureControl) Reflection
					.call(metasc, "getWrapper");
			w.setObj(sc);

			sc.setTrx(trx);

			ELResolver elResolver = new ELResolverImpl();
			RootModeSwitch root = new RootModeSwitch();

			FactoryDataControl factory = new FactoryDataControl();
			factory.setElResolver(elResolver);
			factory.setStructureControl(metasc);
			factory.setRoot(root);
			domainService = (DomainServiceDC) factory.newRootInstance(DomainServiceDC.class);

			typeDefinition = (TypeDefinitionHandler) factory
					.newRootInstance(TypeDefinitionHandler.class);

			typeMapping = (TypeMappingHandler) factory
					.newRootInstance(TypeMappingHandler.class);

			artifactType = (ArtifactTypeHandler) factory
					.newRootInstance(ArtifactTypeHandler.class);


	}

	public DomainServiceDC getRoot() {
		return domainService;
	}

	public TypeDefinitionHandler getTypeDefinitionHandler() {
		return typeDefinition;
	}

	public TypeMappingHandler getTypeMappingHandler() {
		return typeMapping;
	}

	public ArtifactTypeHandler getArtifactTypeHandler() {
		return artifactType;
	}

	public void saveModel() throws Exception {
		sc.commitCommand();
	}

}
