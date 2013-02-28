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

import java.util.HashMap;

import org.elsoft.platform.metamodel.MetamodelTypeOfTypes;
import org.elsoft.platform.metamodel.PlatformPrimetiveTypes;
import org.elsoft.platform.metamodel.objects.type.MethodDAO;
import org.elsoft.platform.metamodel.objects.type.ParameterDAO;
import org.elsoft.platform.metamodel.objects.type.PropertyDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.types.MethodHandler;
import org.elsoft.platform.metamodel.types.ParameterHandler;
import org.elsoft.platform.metamodel.types.PropertyHandler;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.types.TypeMappingHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateType {

	public void execute(RepositoryFactory rf) {
		HashMap<PlatformPrimetiveTypes, TypeDAO> h = createPrimitiveTypes(rf);
		createDomainTypes(rf, h);
		createFunctionalDomainTypes(rf, h);
		createApplicationTypes(rf, h);
		createUIContainerTypes(rf, h);

		createBusinessObjectTypes(rf, h);
		createMethodTypes(rf, h);
		createMethodReferenceTypes(rf, h);
		createParameterTypes(rf, h);
		createPropertyTypes(rf, h);
		createTypeDefinitionTypes(rf, h);
		createTypeMappingTypes(rf, h);
		createArtifactTypeTypes(rf, h);
		createApplicationRoleTypes(rf, h);
		createGlobalRoleTypes(rf, h);
		
		createIngredientTypes(rf, h);
		createModelMappingTypes(rf, h);
		createPacketTypes(rf, h);
		createRecipeTypes(rf, h);
		createServerClasterTypes(rf, h);
		createServerGridTypes(rf, h);
		createServerZoneTypes(rf, h);
		createOptionTypes(rf, h);
		
		createFormTriggers(rf);
		
	}

	private HashMap<PlatformPrimetiveTypes, TypeDAO> createPrimitiveTypes(
			RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeMappingHandler tmph = rf.getTypeMappingHandler();
		HashMap<PlatformPrimetiveTypes, TypeDAO> h = new HashMap<PlatformPrimetiveTypes, TypeDAO>();

		TypeDAO tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.String);
		h.put(PlatformPrimetiveTypes.String, tpdao);
		TypeMappingDAO tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("String");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Boolean);
		h.put(PlatformPrimetiveTypes.Boolean, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Boolean");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Decimal);
		h.put(PlatformPrimetiveTypes.Decimal, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("BigDecimal");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Float);
		h.put(PlatformPrimetiveTypes.Float, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Float");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Double);
		h.put(PlatformPrimetiveTypes.Double, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Double");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.DateTime);
		h.put(PlatformPrimetiveTypes.DateTime, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.util");
		tmpdao.setResTypeName("Date");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Date);
		h.put(PlatformPrimetiveTypes.Date, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.util");
		tmpdao.setResTypeName("Date");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Integer);
		h.put(PlatformPrimetiveTypes.Integer, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Integer");

		tpdao = tdh.addPrimitiveType(PlatformPrimetiveTypes.Long);
		h.put(PlatformPrimetiveTypes.Long, tpdao);
		tmpdao = tmph.addTypeMapping(tpdao, PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name(), PlatformPrimetiveTypes.NA.name());
		tmpdao.setTargetLayer(PlatformPrimetiveTypes.NA.name());
		tmpdao.setResPackageName("java.lang");
		tmpdao.setResTypeName("Long");

		return h;

	}

	private void createDomainTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO domain = tdh.addType("ELsoft", "Platform",
				"Metarepository", "domain");
		domain.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("name");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO domainList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "domainList");
		domainList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "domainSearchCriteria");
		domainSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "domainOrderByCriteria");
		domainOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "domainService");
		domainService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(domain.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.DomainDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(domainList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(domainSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(domainOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.DomainDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(domain.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(domain.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(domain.getObjId());
	}

	private void createFunctionalDomainTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO functionalDomain = tdh.addType("ELsoft", "Platform",
				"Metarepository", "functionalDomain");
		functionalDomain.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("name");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO functionalDomainList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "functionalDomainList");
		functionalDomainList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainSearchCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "functionalDomainSearchCriteria");
		functionalDomainSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainOrderByCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "functionalDomainOrderByCriteria");
		functionalDomainOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainService = tdh.addType("ELsoft",
				"Platform", "Metarepository", "functionalDomainService");
		functionalDomainService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(functionalDomain.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(functionalDomainList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(functionalDomainSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(functionalDomainOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(functionalDomain.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(functionalDomain.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(functionalDomain.getObjId());

	}

	private void createApplicationTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO application = tdh.addType("ELsoft", "Platform",
				"Metarepository", "application");
		application.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("name");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO applicationList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationList");
		applicationList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationSearchCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "applicationSearchCriteria");
		applicationSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationOrderByCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "applicationOrderByCriteria");
		applicationOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationService");
		applicationService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(application.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.ApplicationDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(applicationList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(applicationSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(applicationOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.suite.ApplicationDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(application.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(application.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(application.getObjId());

	}

	private void createUIContainerTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO UIContainer = tdh.addType("ELsoft", "Platform",
				"Metarepository", "uiContainer");
		UIContainer.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("name");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO UIContainerList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "uiContainerList");
		UIContainerList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerSearchCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "uiContainerSearchCriteria");
		UIContainerSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerOrderByCriteria = tdh.addType("ELsoft",
				"Platform", "Metarepository", "uiContainerOrderByCriteria");
		UIContainerOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "uiContainerService");
		UIContainerService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(UIContainer.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.ui.UIContainerDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(UIContainerList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(UIContainerSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(UIContainerOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.ui.UIContainerDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(UIContainer.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(UIContainer.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(UIContainer.getObjId());

	}

	private void createBusinessObjectTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO businessObject = tdh.addType("ELsoft", "Platform",
				"Metarepository", "businessObject");
		businessObject.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("businessObjectTypeName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("refMntType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		TypeDAO businessObjectList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "businessObjectList");
		businessObjectList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO businessObjectSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "businessObjectSearchCriteria");
		businessObjectSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO businessObjectOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "businessObjectOrderByCriteria");
		businessObjectOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO businessObjectService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "businessObjectService");
		businessObjectService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(businessObject.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(businessObjectList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(businessObjectSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(businessObjectOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.BusinessObjectDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(businessObject.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(businessObject.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(businessObject.getObjId());
	}


	private void createMethodTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO method = tdh.addType("ELsoft", "Platform",
				"Metarepository", "method");
		method.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("method");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("returnType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		TypeDAO methodList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodList");
		methodList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodSearchCriteria");
		methodSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodOrderByCriteria");
		methodOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodService");
		methodService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(method.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.MethodDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(methodList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(methodSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(methodOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.MethodDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(method.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(method.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(method.getObjId());
	}

	private void createMethodReferenceTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO methodReference = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodReference");
		methodReference.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("refMethod");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		prop = ph.addProperty("methodType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO methodReferenceList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodReferenceList");
		methodReferenceList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodReferenceSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodReferenceSearchCriteria");
		methodReferenceSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodReferenceOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodReferenceOrderByCriteria");
		methodReferenceOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO methodReferenceService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "methodReferenceService");
		methodReferenceService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(methodReference.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(methodReferenceList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(methodReferenceSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(methodReferenceOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.MethodReferenceDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(methodReference.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(methodReference.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(methodReference.getObjId());
	}


	private void createParameterTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO parameter = tdh.addType("ELsoft", "Platform",
				"Metarepository", "parameter");
		parameter.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("parameterType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		prop = ph.addProperty("parameterName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("defaultValue");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("defaultExpression");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("overwritten");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO parameterList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "parameterList");
		parameterList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO parameterSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "parameterSearchCriteria");
		parameterSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO parameterOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "parameterOrderByCriteria");
		parameterOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO parameterService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "parameterService");
		parameterService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(parameter.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.ParameterDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(parameterList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(parameterSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(parameterOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.ParameterDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(parameter.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(parameter.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(parameter.getObjId());
	}
	
	private void createPropertyTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO property = tdh.addType("ELsoft", "Platform",
				"Metarepository", "property");
		property.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("propertyType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		prop = ph.addProperty("propertyName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("primaryKey");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Boolean).getObjId());

		prop = ph.addProperty("optLock");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Boolean).getObjId());
		
		TypeDAO propertyList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "propertyList");
		propertyList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO propertySearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "propertySearchCriteria");
		propertySearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO propertyOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "propertyOrderByCriteria");
		propertyOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO propertyService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "propertyService");
		propertyService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(property.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.PropertyDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(propertyList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(propertySearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(propertyOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.PropertyDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(property.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(property.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(property.getObjId());
	}

	private void createTypeDefinitionTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO typeDefinition = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeDefinition");
		typeDefinition.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("domain");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("functionalDomain");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("application");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("typeName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("typeOfType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("genericType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		TypeDAO typeDefinitionList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeDefinitionList");
		typeDefinitionList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeDefinitionSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeDefinitionSearchCriteria");
		typeDefinitionSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeDefinitionOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeDefinitionOrderByCriteria");
		typeDefinitionOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeDefinitionService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeDefinitionService");
		typeDefinitionService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(typeDefinition.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.TypeDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(typeDefinitionList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(typeDefinitionSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(typeDefinitionOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.TypeDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeDefinition.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeDefinition.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeDefinition.getObjId());
	}
	
	
	private void createTypeMappingTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO typeMapping = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeMapping");
		typeMapping.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("typeReference");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		
		prop = ph.addProperty("targetDomain");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("targetFunctionalDomain");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("targetApplication");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("targetLayer");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("resPackageName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("resTypeName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("artifactName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("groupName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("artifactVersion");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("technology");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		
		TypeDAO typeMappingList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeMappingList");
		typeMappingList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeMappingSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeMappingSearchCriteria");
		typeMappingSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeMappingOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeMappingOrderByCriteria");
		typeMappingOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO typeMappingService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "typeMappingService");
		typeMappingService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(typeMapping.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.TypeMappingDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(typeMappingList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(typeMappingSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(typeMappingOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.type.TypeMappingDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeMapping.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeMapping.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(typeMapping.getObjId());
	}

	private void createArtifactTypeTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO artifactType = tdh.addType("ELsoft", "Platform",
				"Metarepository", "artifactType");
		artifactType.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("artifactType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("technology");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("templatePath");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO artifactTypeList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "artifactTypeList");
		artifactTypeList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO artifactTypeSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "artifactTypeSearchCriteria");
		artifactTypeSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO artifactTypeOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "artifactTypeOrderByCriteria");
		artifactTypeOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO artifactTypeService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "artifactTypeService");
		artifactTypeService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(artifactType.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.transformation.ArtifactTypeDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(artifactTypeList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(artifactTypeSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(artifactTypeOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.transformation.ArtifactTypeDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(artifactType.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(artifactType.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(artifactType.getObjId());
	}
	
	private void createApplicationRoleTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO applicationRole = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationRole");
		applicationRole.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("roleName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO applicationRoleList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationRoleList");
		applicationRoleList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationRoleSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationRoleSearchCriteria");
		applicationRoleSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationRoleOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationRoleOrderByCriteria");
		applicationRoleOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationRoleService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "applicationRoleService");
		applicationRoleService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(applicationRole.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(applicationRoleList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(applicationRoleSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(applicationRoleOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.security.ApplicationRoleDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(applicationRole.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(applicationRole.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(applicationRole.getObjId());
	}

	private void createGlobalRoleTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO globalRole = tdh.addType("ELsoft", "Platform",
				"Metarepository", "globalRole");
		globalRole.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("roleName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO globalRoleList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "globalRoleList");
		globalRoleList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO globalRoleSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "globalRoleSearchCriteria");
		globalRoleSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO globalRoleOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "globalRoleOrderByCriteria");
		globalRoleOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO globalRoleService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "globalRoleService");
		globalRoleService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(globalRole.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(globalRoleList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(globalRoleSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(globalRoleOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.security.GlobalRoleDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(globalRole.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(globalRole.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(globalRole.getObjId());
	}

	private void createIngredientTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO ingredient = tdh.addType("ELsoft", "Platform",
				"Metarepository", "ingredient");
		ingredient.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("ingradientName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("numId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prop = ph.addProperty("level");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		
		TypeDAO ingredientList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "ingredientList");
		ingredientList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO ingredientSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "ingredientSearchCriteria");
		ingredientSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO ingredientOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "ingredientOrderByCriteria");
		ingredientOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO ingredientService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "ingredientService");
		ingredientService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(ingredient.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.IngredientDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(ingredientList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(ingredientSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(ingredientOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.IngredientDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(ingredient.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(ingredient.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(ingredient.getObjId());
	}
	

	private void createModelMappingTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO modelMapping = tdh.addType("ELsoft", "Platform",
				"Metarepository", "modelMapping");
		modelMapping.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("modelName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("programRef");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("artifactCalculator");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO modelMappingList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "modelMappingList");
		modelMappingList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO modelMappingSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "modelMappingSearchCriteria");
		modelMappingSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO modelMappingOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "modelMappingOrderByCriteria");
		modelMappingOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO modelMappingService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "modelMappingService");
		modelMappingService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(modelMapping.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(modelMappingList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(modelMappingSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(modelMappingOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.ModelMappingDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(modelMapping.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(modelMapping.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(modelMapping.getObjId());
	}
	
	private void createPacketTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO packet = tdh.addType("ELsoft", "Platform",
				"Metarepository", "packet");
		packet.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("packetName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("buildScript");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("deploymentScript");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO packetList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "packetList");
		packetList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO packetSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "packetSearchCriteria");
		packetSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO packetOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "packetOrderByCriteria");
		packetOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO packetService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "packetService");
		packetService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(packet.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.PacketDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(packetList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(packetSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(packetOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.PacketDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(packet.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(packet.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(packet.getObjId());
	}

	
	private void createRecipeTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO recipe = tdh.addType("ELsoft", "Platform",
				"Metarepository", "recipe");
		recipe.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("recipeName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO recipeList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "recipeList");
		recipeList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO recipeSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "recipeSearchCriteria");
		recipeSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO recipeOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "recipeOrderByCriteria");
		recipeOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO recipeService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "recipeService");
		recipeService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(recipe.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.RecipeDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(recipeList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(recipeSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(recipeOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.recipe.RecipeDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(recipe.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(recipe.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(recipe.getObjId());
	}
		

	private void createServerZoneTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO serverZone = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverZone");
		serverZone.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("zoneName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("zoneType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		
		TypeDAO serverZoneList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverZoneList");
		serverZoneList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverZoneSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverZoneSearchCriteria");
		serverZoneSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverZoneOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverZoneOrderByCriteria");
		serverZoneOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverZoneService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverZoneService");
		serverZoneService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(serverZone.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(serverZoneList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(serverZoneSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(serverZoneOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerZoneDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverZone.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverZone.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverZone.getObjId());
	}
	
	private void createServerGridTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO serverGrid = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverGrid");
		serverGrid.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("gridName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("location");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		
		TypeDAO serverGridList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverGridList");
		serverGridList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverGridSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverGridSearchCriteria");
		serverGridSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverGridOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverGridOrderByCriteria");
		serverGridOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverGridService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverGridService");
		serverGridService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(serverGrid.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(serverGridList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(serverGridSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(serverGridOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerGridDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverGrid.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverGrid.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverGrid.getObjId());
	}
	
	private void createServerClasterTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO serverClaster = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverClaster");
		serverClaster.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("parentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("objType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("clasterName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("clasterType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("lavel");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		
		TypeDAO serverClasterList = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverClasterList");
		serverClasterList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverClasterSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverClasterSearchCriteria");
		serverClasterSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverClasterOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverClasterOrderByCriteria");
		serverClasterOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO serverClasterService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "serverClasterService");
		serverClasterService.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(serverClaster.getObjId());
		ParameterDAO prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO");
		prm.setOverwritten(false);

		met = mh.addMethod("find");
		met.setReturnType(serverClasterList.getObjId());

		prm = prh.addParameter("search");
		prm.setParameterType(serverClasterSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(serverClasterOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		prm.setDefaultValue("org.elsoft.platform.metamodel.objects.infrastructure.ServerClasterDAO");
		prm.setOverwritten(false);
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverClaster.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverClaster.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(serverClaster.getObjId());
	}
	
	private void createOptionTypes(RepositoryFactory rf,HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO options = tdh.addType("ELsoft", "Platform", "Metarepository",
				"options");
		options.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("setName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("optionName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("optionValue");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		
		TypeDAO optionsList = tdh.addType("ELsoft", "Platform", "Metarepository",
				"optionsList");
		optionsList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO optionsSearchCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "optionsSearchCriteria");
		optionsSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO optionsOrderByCriteria = tdh.addType("ELsoft", "Platform",
				"Metarepository", "optionsOrderByCriteria");
		optionsOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO optionsService = tdh.addType("ELsoft", "Platform",
				"Metarepository", "optionsService");
		optionsService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		optionsService.setGenericType(options.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(options.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(optionsList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(optionsSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(optionsOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(options.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(options.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(options.getObjId());

	}

	
	private void createFormTriggers(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO triggersService = tdh.addType("ELsoft", "Platform",
				"Metarepository"
				, "MetamodelAdminTrigger");
		triggersService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		
		MethodHandler mh = tdh.getMethodHandler();

		mh.addMethod("postQueryMethod");
		mh.addMethod("postQueryPropertyLnk");
		mh.addMethod("postQueryParameterLnk");
		mh.addMethod("postQueryTypeMappinglnk");
		mh.addMethod("postQueryBusinessObjectlnk");
		mh.addMethod("viewPortAController");
		mh.addMethod("postQueryTypeDefinitionHelperlnk");
				
	}	
	
}
