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
package org.elsoft.platform.form;

import org.elsoft.platform.metamodel.MetamodelArtifactType;
import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.types.transformation.ArtifactTypeHandler;

public class PopulateArtifactType {

	public void execute(RepositoryFactory rf) {

		ArtifactTypeHandler ah = rf.getArtifactTypeHandler();

		ah.addArtifactType(
				MetamodelArtifactType.DataControlFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/dataControl.xml");

		ah.addArtifactType(
				MetamodelArtifactType.FactoryBeanFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/factoryBean.xml");

		ah.addArtifactType(
				MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/transactionManager.xml");

		ah.addArtifactType(
				MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"JSF-JPA-SERVICE",
				"GlassFishV3/j2ee/jsfV2/JPA-SERVICE/transactionManagerBuilderImpl.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.TRANSACTIONMANAGER.name(),
				"WS-EJB-JERSEY",
				"GlassFishV3/j2ee/jsfV2/WS-EJB-JERSEY/transactionManagerBuilderImpl.xml");

		ah.addArtifactType(
				MetamodelArtifactType.JSPXFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/jspxPageCreator.xml");

		ah.addArtifactType(
				MetamodelArtifactType.WEBXMLFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/mainWEBXML.xml");

		ah.addArtifactType(
				MetamodelArtifactType.FACESCONFIGFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/FACESCONFIGFile.xml");
	
		
		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOMFile.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/mainPOMXML.xml");

		ah.addArtifactType(
				MetamodelArtifactType.HelperClasses.name(),
				"JSF",
				"GlassFishV3/j2ee/jsfV2/Primefaces/mainHELPERClasses.xml");


		ah.addArtifactType(
				MetamodelArtifactType.LIFERAY_DISPLAY.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/liferay_display.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.LIFERAY_PORTLET.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/liferay_portlet.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.PORTLET.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/portlet.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOMFile.name(),
				"LIFERAY-PORTLET-JSF",
				"GlassFishV3/j2ee/Portal/Liferay/mainPOMXML.xml");

		
		ah.addArtifactType(
				MetamodelArtifactType.ENTITY.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/entityObject.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.SESSIONBEAN.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/sessionBean.xml");

		ah.addArtifactType(
				MetamodelArtifactType.REMOTEINTERFACE.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/sessionBeanRemoteInterface.xml");

		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOM_JAR.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/mainEjbPom.xml");
		

		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOM_EAR.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/mainEarPom.xml");
	
		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOM_HIGHLAVEL.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/mainPom.xml");

		ah.addArtifactType(
				MetamodelArtifactType.PERSISTENCEXML.name(),
				"WS-EJB",
				"GlassFishV3/j2ee/ejb_ws/Hibernate/mainPersistence.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOMFile.name(),
				"WS-EJB-Client",
				"GlassFishV3/j2ee/ejb_ws/mainPOMWSProxy.xml");


		ah.addArtifactType(
				MetamodelArtifactType.ENTITY.name(),
				"JPA",
				"GlassFishV3/j2ee/jpa/entityObject.xml");
		
		ah.addArtifactType(
				MetamodelArtifactType.SESSIONBEAN.name(),
				"JPA",
				"GlassFishV3/j2ee/jpa/serviceBean.xml");
	
		ah.addArtifactType(
				MetamodelArtifactType.MAVENPOMFile.name(),
				"JPA",
				"GlassFishV3/j2ee/jpa/mainPom.xml");
	
		ah.addArtifactType(
				MetamodelArtifactType.JPAObject.name(),
				"JPA",
				"GlassFishV3/j2ee/jpa/jpaObject.xml");

		ah.addArtifactType(
				MetamodelArtifactType.DBConnection.name(),
				"JSF-JPA-HIBERNATE",
				"GlassFishV3/j2ee/jsfV2/Connection/Hibernate/mainHibernateCfg.xml");
		
		
	}
}
