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

import java.util.HashMap;

import javax.transaction.TransactionManager;

import org.elsoft.platform.PlatformConfig;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.ELResolver;
import org.elsoft.platform.datacontrol.FactoryDataControl;
import org.elsoft.platform.datacontrol.RootModeSwitch;
import org.elsoft.platform.datacontrol.StructureControl;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.suite.DomainServiceDC;
import org.elsoft.platform.metamodel.context.MetadataStructureControl;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.types.TypeMappingHandler;
import org.elsoft.platform.metamodel.types.transformation.ArtifactTypeHandler;
import org.elsoft.platform.persistence.TransactionManagerImpl;

public class RepositoryFactory {

	private StructureControl sc = null;
	private DomainServiceDC domainService;
	private TypeDefinitionHandler typeDefinition;
	private TypeMappingHandler typeMapping;
	private ArtifactTypeHandler artifactType;

	public RepositoryFactory() throws Exception {
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
		domainService = (DomainServiceDC) factory
				.newRootInstance(DomainServiceDC.class);

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

	public HashMap<PlatformPrimetiveTypes, TypeDAO> createPrimitiveTypes() {
		TypeDefinitionHandler tdh = getTypeDefinitionHandler();
		TypeMappingHandler tmph = getTypeMappingHandler();
		HashMap<PlatformPrimetiveTypes, TypeDAO> h = new HashMap<PlatformPrimetiveTypes, TypeDAO>();

		TypeDAO tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.String);
		h.put(PlatformPrimetiveTypes.String, tpdao);
		TypeMappingDAO tmpdao = tmph.addTypeMapping(tpdao,
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("String");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Boolean);
		h.put(PlatformPrimetiveTypes.Boolean, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Boolean");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Decimal);
		h.put(PlatformPrimetiveTypes.Decimal, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("BigDecimal");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Float);
		h.put(PlatformPrimetiveTypes.Float, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Float");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Double);
		h.put(PlatformPrimetiveTypes.Double, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Double");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.DateTime);
		h.put(PlatformPrimetiveTypes.DateTime, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.util");
		tmpdao.setResTypeName("Date");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Date);
		h.put(PlatformPrimetiveTypes.Date, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.util");
		tmpdao.setResTypeName("Date");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Integer);
		h.put(PlatformPrimetiveTypes.Integer, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Integer");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Long);
		h.put(PlatformPrimetiveTypes.Long, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Long");


		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.HexBinary);
		h.put(PlatformPrimetiveTypes.HexBinary, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name(),
				PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("");
		tmpdao.setResTypeName("byte[]");
		
		
		return h;

	}

	public void populateArtifacts() {

		ArtifactTypeHandler ah = getArtifactTypeHandler();

		if (ah.cleanSearch().getObject() != null)
			return;

		ah.addArtifactType(MetamodelArtifactType.DataControlFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/dataControl.xml");

		ah.addArtifactType(MetamodelArtifactType.FactoryBeanFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/factoryBean.xml");

		ah.addArtifactType(MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"JSF", "GlassFishV3/j2ee/jsfV2/transactionManager.xml");

		ah.addArtifactType(MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"JSF-JPA-SERVICE",
				"GlassFishV3/j2ee/jsfV2/JPA-SERVICE/transactionManagerBuilderImpl.xml");

		ah.addArtifactType(MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"WS-EJB-JERSEY",
				"GlassFishV3/j2ee/jsfV2/WS-EJB-JERSEY/transactionManagerBuilderImpl.xml");

		ah.addArtifactType(MetamodelArtifactType.JSPXFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/jspxPageCreator.xml");

		ah.addArtifactType(MetamodelArtifactType.WEBXMLFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/mainWEBXML.xml");

		ah.addArtifactType(MetamodelArtifactType.FACESCONFIGFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/FACESCONFIGFile.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOMFile.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/mainPOMXML.xml");

		ah.addArtifactType(MetamodelArtifactType.HelperClasses.name(), "JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/mainHELPERClasses.xml");

		ah.addArtifactType(MetamodelArtifactType.LIFERAY_DISPLAY.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/liferay_display.xml");

		ah.addArtifactType(MetamodelArtifactType.LIFERAY_PORTLET.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/liferay_portlet.xml");

		ah.addArtifactType(MetamodelArtifactType.PORTLET.name(),
				"LIFERAY-PORTLET-JSF", "GlassFishV3/j2ee/Portal/portlet.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOMFile.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/mainPOMXML.xml");

		ah.addArtifactType(MetamodelArtifactType.ENTITY.name(), "WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/entityObject.xml");

		ah.addArtifactType(MetamodelArtifactType.SESSIONBEAN.name(), "WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/sessionBean.xml");

		ah.addArtifactType(MetamodelArtifactType.REMOTEINTERFACE.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/sessionBeanRemoteInterface.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOM_JAR.name(), "WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/mainEjbPom.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOM_EAR.name(), "WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/mainEarPom.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOM_HIGHLAVEL.name(),
				"WS-EJB", "GlassFishV3/j2ee/ejb_ws/mainPom.xml");

		ah.addArtifactType(MetamodelArtifactType.PERSISTENCEXML.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/Hibernate/mainPersistence.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOMFile.name(),
				"WS-EJB-Client", "GlassFishV3/j2ee/ejb_ws/mainPOMWSProxy.xml");

		ah.addArtifactType(MetamodelArtifactType.ENTITY.name(), "JPA",
				"GlassFishV3/j2ee/jpa/entityObject.xml");

		ah.addArtifactType(MetamodelArtifactType.SESSIONBEAN.name(), "JPA",
				"GlassFishV3/j2ee/jpa/serviceBean.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOMFile.name(), "JPA",
				"GlassFishV3/j2ee/jpa/mainPom.xml");

		ah.addArtifactType(MetamodelArtifactType.JPAObject.name(), "JPA",
				"GlassFishV3/j2ee/jpa/jpaObject.xml");

		ah.addArtifactType(MetamodelArtifactType.DBConnection.name(),
				"JSF-JPA-HIBERNATE",
				"GlassFishV3/j2ee/jsfV2/Connection/Hibernate/mainHibernateCfg.xml");

		ah.addArtifactType(MetamodelArtifactType.MAVENPOMFile.name(),
				"JSF-HIBERNATE",
				"GlassFishV3/j2ee/jsfV2/JSF-HIBERNATE/mainPOMXML.xml");
	
	
	
	}

}
