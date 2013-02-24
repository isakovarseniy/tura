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
import org.elsoft.platform.datacontrol.StructureControl;
import org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.suite.FunctionalDomainHandler;
import org.elsoft.platform.metamodel.types.BusinessObjectHandler;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateBusinessType {

	
	public void execute(RepositoryFactory rf, FunctionalDomainHandler fd) {
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
		createOptionsBusinessObject(fd,rf);
		
	}
	
	private void createOptionsBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO options = bh.addBusinessObject("options");

		TypeDAO refDropdowntest = (TypeDAO) tdh.cleanSearch()
				.search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "options").getObject();

		options.setRefMntType(refDropdowntest.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "optionsService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "create").getObject();
		MethodReferenceDAO refMeth =  bh.getMethodReferenceHandler().addMethodReference(method);
		refMeth.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "find").getObject();
		refMeth = bh.getMethodReferenceHandler().addMethodReference(method);
		refMeth.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "insert").getObject();
		refMeth = bh.getMethodReferenceHandler().addMethodReference(method);
		refMeth.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "update").getObject();
		refMeth = bh.getMethodReferenceHandler().addMethodReference(method);
		refMeth.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "remove").getObject();
		refMeth = bh.getMethodReferenceHandler().addMethodReference(method);
		refMeth.setMethodType(DCMetaInfo.RemoveTrigger.name());

		StructureControl st = bh.getMode().getStControl();
		st.toString();
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

		BusinessObjectDAO UIContainer = bh.addBusinessObject("uiContainer");

		TypeDAO refUIContainer = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainer").getObject();

		UIContainer.setRefMntType(refUIContainer.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "uiContainerService").getObject();

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

		BusinessObjectDAO BusinessObject = bh.addBusinessObject("businessObject");

		TypeDAO refBusinessObject = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObject").getObject();

		BusinessObject.setRefMntType(refBusinessObject.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "businessObjectService").getObject();

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

		BusinessObjectDAO Method = bh.addBusinessObject("method");

		TypeDAO refMethod = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "method").getObject();

		Method.setRefMntType(refMethod.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodService").getObject();

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

		BusinessObjectDAO MethodReference = bh.addBusinessObject("methodReference");

		TypeDAO refMethodReference = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReference").getObject();

		MethodReference.setRefMntType(refMethodReference.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "methodReferenceService").getObject();

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

		BusinessObjectDAO Parameter = bh.addBusinessObject("parameter");

		TypeDAO refParameter = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameter").getObject();

		Parameter.setRefMntType(refParameter.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "parameterService").getObject();

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

		BusinessObjectDAO Property = bh.addBusinessObject("property");

		TypeDAO refProperty = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "property").getObject();

		Property.setRefMntType(refProperty.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "propertyService").getObject();

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

		BusinessObjectDAO TypeDefinition = bh.addBusinessObject("typeDefinition");

		TypeDAO refTypeDefinition = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinition").getObject();

		TypeDefinition.setRefMntType(refTypeDefinition.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeDefinitionService").getObject();

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

		BusinessObjectDAO TypeMapping = bh.addBusinessObject("typeMapping");

		TypeDAO refTypeMapping = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMapping").getObject();

		TypeMapping.setRefMntType(refTypeMapping.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "typeMappingService").getObject();

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

		BusinessObjectDAO ArtifactType = bh.addBusinessObject("artifactType");

		TypeDAO refArtifactType = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactType").getObject();

		ArtifactType.setRefMntType(refArtifactType.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "artifactTypeService").getObject();

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

		BusinessObjectDAO ApplicationRole = bh.addBusinessObject("applicationRole");

		TypeDAO refApplicationRole = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRole").getObject();

		ApplicationRole.setRefMntType(refApplicationRole.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationRoleService").getObject();

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

		BusinessObjectDAO GlobalRole = bh.addBusinessObject("globalRole");

		TypeDAO refGlobalRole = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRole").getObject();

		GlobalRole.setRefMntType(refGlobalRole.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "globalRoleService").getObject();

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

		BusinessObjectDAO Ingredient = bh.addBusinessObject("ingredient");

		TypeDAO refIngredient = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredient").getObject();

		Ingredient.setRefMntType(refIngredient.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "ingredientService").getObject();

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

		BusinessObjectDAO ModelMapping = bh.addBusinessObject("modelMapping");

		TypeDAO refModelMapping = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMapping").getObject();

		ModelMapping.setRefMntType(refModelMapping.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "modelMappingService").getObject();

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

		BusinessObjectDAO Packet = bh.addBusinessObject("packet");

		TypeDAO refPacket = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packet").getObject();

		Packet.setRefMntType(refPacket.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "packetService").getObject();

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

		BusinessObjectDAO Recipe = bh.addBusinessObject("recipe");

		TypeDAO refRecipe = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipe").getObject();

		Recipe.setRefMntType(refRecipe.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "recipeService").getObject();

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

		BusinessObjectDAO ServerClaster = bh.addBusinessObject("serverClaster");

		TypeDAO refServerClaster = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClaster").getObject();

		ServerClaster.setRefMntType(refServerClaster.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverClasterService").getObject();

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

		BusinessObjectDAO ServerGrid = bh.addBusinessObject("serverGrid");

		TypeDAO refServerGrid = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGrid").getObject();

		ServerGrid.setRefMntType(refServerGrid.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverGridService").getObject();

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

		BusinessObjectDAO ServerZone = bh.addBusinessObject("serverZone");

		TypeDAO refServerZone = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZone").getObject();

		ServerZone.setRefMntType(refServerZone.getObjId());

		tdh.cleanSearch().search("domain", String.class, "ELsoft")
				.searchString("functionalDomain", "Platform")
				.searchString("application", "Metarepository")
				.searchString("typeName", "serverZoneService").getObject();

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
