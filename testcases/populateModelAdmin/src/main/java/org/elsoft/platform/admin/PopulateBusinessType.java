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
package org.elsoft.platform.admin;

import org.elsoft.platform.datacontrol.DCMetaInfo;
import org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.types.BusinessObjectHandler;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateBusinessType {

	
	public void executeCommons(RepositoryFactory rf, FunctionalDomainHandler fd) {
		createDomainBusinessObject(fd, rf);
		createFunctionalDomainBusinessObject(fd, rf);
		createApplicationBusinessObject(fd, rf);
		createUIContainerBusinessObject(fd, rf);

		createBusinessObjectBusinessObject(fd, rf);
		createMethodBusinessObject(fd, rf);
		createMethodReferenceBusinessObject(fd, rf);
		createParameterBusinessObject(fd, rf);
		createPropertyBusinessObject(fd, rf);
		createTypeDefinitionBusinessObject(fd, rf);
		createTypeMappingBusinessObject(fd, rf);
		createArtifactTypeBusinessObject(fd, rf);
		createApplicationRoleBusinessObject(fd, rf);
		createGlobalRoleBusinessObject(fd, rf);
		
		createIngredientBusinessObject(fd, rf);
		createModelMappingBusinessObject(fd, rf);
		createPacketBusinessObject(fd, rf);
		createRecipeBusinessObject(fd, rf);
		createServerClasterBusinessObject(fd, rf);
		createServerGridBusinessObject(fd, rf);
		createServerZoneBusinessObject(fd, rf);
		
	}
	

	private void createDomainBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO domain = bh.addBusinessObject("domain");

		TypeDAO refDomain = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domain").getObject();

		domain.setRefMntType(refDomain.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createFunctionalDomainBusinessObject(
			FunctionalDomainHandler fd, RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO functionalDomain = bh
				.addBusinessObject("functionalDomain");

		TypeDAO refFunctionalDomain = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomain").getObject();

		functionalDomain.setRefMntType(refFunctionalDomain.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainService")
				.getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createApplicationBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO application = bh.addBusinessObject("application");

		TypeDAO refApplication = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "application").getObject();

		application.setRefMntType(refApplication.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createUIContainerBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO UIContainer = bh.addBusinessObject("UIContainer");

		TypeDAO refUIContainer = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainer").getObject();

		UIContainer.setRefMntType(refUIContainer.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createBusinessObjectBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO BusinessObject = bh.addBusinessObject("BusinessObject");

		TypeDAO refBusinessObject = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "BusinessObject").getObject();

		BusinessObject.setRefMntType(refBusinessObject.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "BusinessObjectService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createMethodBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Method = bh.addBusinessObject("Method");

		TypeDAO refMethod = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Method").getObject();

		Method.setRefMntType(refMethod.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "MethodService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createMethodReferenceBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO MethodReference = bh.addBusinessObject("MethodReference");

		TypeDAO refMethodReference = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "MethodReference").getObject();

		MethodReference.setRefMntType(refMethodReference.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "MethodReferenceService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createParameterBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Parameter = bh.addBusinessObject("Parameter");

		TypeDAO refParameter = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Parameter").getObject();

		Parameter.setRefMntType(refParameter.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ParameterService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	
	private void createPropertyBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Property = bh.addBusinessObject("Property");

		TypeDAO refProperty = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Property").getObject();

		Property.setRefMntType(refProperty.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "PropertyService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	
	private void createTypeDefinitionBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO TypeDefinition = bh.addBusinessObject("TypeDefinition");

		TypeDAO refTypeDefinition = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "TypeDefinition").getObject();

		TypeDefinition.setRefMntType(refTypeDefinition.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "TypeDefinitionService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createTypeMappingBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO TypeMapping = bh.addBusinessObject("TypeMapping");

		TypeDAO refTypeMapping = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "TypeMapping").getObject();

		TypeMapping.setRefMntType(refTypeMapping.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "TypeMappingService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createArtifactTypeBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ArtifactType = bh.addBusinessObject("ArtifactType");

		TypeDAO refArtifactType = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ArtifactType").getObject();

		ArtifactType.setRefMntType(refArtifactType.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ArtifactTypeService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createApplicationRoleBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ApplicationRole = bh.addBusinessObject("ApplicationRole");

		TypeDAO refApplicationRole = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ApplicationRole").getObject();

		ApplicationRole.setRefMntType(refApplicationRole.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ApplicationRoleService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	
	private void createGlobalRoleBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO GlobalRole = bh.addBusinessObject("GlobalRole");

		TypeDAO refGlobalRole = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "GlobalRole").getObject();

		GlobalRole.setRefMntType(refGlobalRole.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "GlobalRoleService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createIngredientBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Ingredient = bh.addBusinessObject("Ingredient");

		TypeDAO refIngredient = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Ingredient").getObject();

		Ingredient.setRefMntType(refIngredient.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "IngredientService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	
	
	private void createModelMappingBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ModelMapping = bh.addBusinessObject("ModelMapping");

		TypeDAO refModelMapping = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ModelMapping").getObject();

		ModelMapping.setRefMntType(refModelMapping.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ModelMappingService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createPacketBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Packet = bh.addBusinessObject("Packet");

		TypeDAO refPacket = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Packet").getObject();

		Packet.setRefMntType(refPacket.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "PacketService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}
	private void createRecipeBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO Recipe = bh.addBusinessObject("Recipe");

		TypeDAO refRecipe = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "Recipe").getObject();

		Recipe.setRefMntType(refRecipe.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "RecipeService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createServerClasterBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ServerClaster = bh.addBusinessObject("ServerClaster");

		TypeDAO refServerClaster = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerClaster").getObject();

		ServerClaster.setRefMntType(refServerClaster.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerClasterService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createServerGridBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ServerGrid = bh.addBusinessObject("ServerGrid");

		TypeDAO refServerGrid = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerGrid").getObject();

		ServerGrid.setRefMntType(refServerGrid.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerGridService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createServerZoneBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO ServerZone = bh.addBusinessObject("ServerZone");

		TypeDAO refServerZone = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerZone").getObject();

		ServerZone.setRefMntType(refServerZone.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ServerZoneService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	
}
