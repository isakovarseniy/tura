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
		createDropdownTestTypes(rf, h);
		createCountriesTypes(rf, h);
		createDepartmentsTypes(rf, h);
		createEmployeesTypes(rf, h);
		createDomainTypes(rf, h);
		createFunctionalDomainTypes(rf, h);
		createApplicationTypes(rf, h);
		createUIContainerTypes(rf, h);
		createHRFeaturesTypes(rf, h);
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

	private void createDropdownTestTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO dropdowntest = tdh.addType("Manufacturing", "BackOffice", "HR",
				"dropdowntest");
		dropdowntest.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("departmentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("employeeId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		TypeDAO dropdowntestList = tdh.addType("Manufacturing", "BackOffice",
				"HR", "dropdowntestList");
		dropdowntestList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO dropdowntestSearchCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "dropdowntestSearchCriteria");
		dropdowntestSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO dropdowntestOrderByCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "dropdowntestOrderByCriteria");
		dropdowntestOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO dropdowntestService = tdh.addType("Manufacturing",
				"BackOffice", "HR", "dropdowntestService");
		dropdowntestService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		dropdowntestService.setGenericType(dropdowntest.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(dropdowntest.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(dropdowntestList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(dropdowntestSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(dropdowntestOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(dropdowntest.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(dropdowntest.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(dropdowntest.getObjId());

	}

	private void createCountriesTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO countries = tdh.addType("Manufacturing", "BackOffice", "HR",
				"countries");
		countries.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();

		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("countryId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("countryName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("regionId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		TypeDAO countriesList = tdh.addType("Manufacturing", "BackOffice",
				"HR", "countriesList");
		countriesList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO countriesSearchCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "countriesSearchCriteria");
		countriesSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO countriesOrderByCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "countriesOrderByCriteria");
		countriesOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO countriesService = tdh.addType("Manufacturing", "BackOffice",
				"HR", "countriesService");
		countriesService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		countriesService.setGenericType(countries.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(countries.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(countriesList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(countriesSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(countriesOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());

		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(countries.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(countries.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(countries.getObjId());

	}

	private void createDepartmentsTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO departments = tdh.addType("Manufacturing", "BackOffice", "HR",
				"departments");
		departments.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("departmentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("departmentName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("managerId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("locationId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		TypeDAO departmentsList = tdh.addType("Manufacturing", "BackOffice",
				"HR", "departmentsList");
		departmentsList.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		TypeDAO departmentsSearchCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "departmentsSearchCriteria");
		departmentsSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		TypeDAO departmentsOrderByCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "departmentsOrderByCriteria");
		departmentsOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.Service.name());

		TypeDAO departmentsService = tdh.addType("Manufacturing", "BackOffice",
				"HR", "departmentsService");
		departmentsService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		departmentsService.setGenericType(departments.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(departments.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(departmentsList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(departmentsSearchCriteria.getObjId());
		prm = prh.addParameter("order");
		prm.setParameterType(departmentsOrderByCriteria.getObjId());
		
		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		
		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(departments.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(departments.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(departments.getObjId());

	}

	private void createEmployeesTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO employees = tdh.addType("Manufacturing", "BackOffice", "HR",
				"employees");
		employees.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();

		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("employeeId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("firstName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("lastName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("email");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("phoneNumber");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("hireDate");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Date).getObjId());

		prop = ph.addProperty("jobId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("salary");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Float).getObjId());

		prop = ph.addProperty("commissionPct");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Float).getObjId());

		prop = ph.addProperty("managerId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("departmentId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		TypeDAO employeesList = tdh.addType("Manufacturing", "BackOffice",
				"HR", "employeesList");
		employeesList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO employeesSearchCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "employeesSearchCriteria");
		employeesSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO employeesOrderByCriteria = tdh.addType("Manufacturing",
				"BackOffice", "HR", "employeesOrderByCriteria");
		employeesOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO employeesService = tdh.addType("Manufacturing", "BackOffice",
				"HR", "employeesService");

		employeesService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		employeesService.setGenericType(employees.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(employees.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(employeesList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(employeesSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(employeesOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(employees.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(employees.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(employees.getObjId());

	}

	private void createDomainTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO domain = tdh.addType("Manufacturing", "Commons",
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
		
		
		TypeDAO domainList = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "domainList");
		domainList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainSearchCriteria = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "domainSearchCriteria");
		domainSearchCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainOrderByCriteria = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "domainOrderByCriteria");
		domainOrderByCriteria.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO domainService = tdh.addType("Manufacturing", "Commons",
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
		TypeDAO functionalDomain = tdh.addType("Manufacturing", "Commons",
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
		
		
		TypeDAO functionalDomainList = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "functionalDomainList");
		functionalDomainList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainSearchCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "functionalDomainSearchCriteria");
		functionalDomainSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainOrderByCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "functionalDomainOrderByCriteria");
		functionalDomainOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO functionalDomainService = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "functionalDomainService");
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
		TypeDAO application = tdh.addType("Manufacturing", "Commons",
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
		
		
		TypeDAO applicationList = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "applicationList");
		applicationList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationSearchCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "applicationSearchCriteria");
		applicationSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationOrderByCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "applicationOrderByCriteria");
		applicationOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO applicationService = tdh.addType("Manufacturing", "Commons",
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
		TypeDAO UIContainer = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "UIContainer");
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
		
		
		TypeDAO UIContainerList = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "UIContainerList");
		UIContainerList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerSearchCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "UIContainerSearchCriteria");
		UIContainerSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerOrderByCriteria = tdh.addType("Manufacturing",
				"Commons", "Metarepository", "UIContainerOrderByCriteria");
		UIContainerOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO UIContainerService = tdh.addType("Manufacturing", "Commons",
				"Metarepository", "UIContainerService");
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

	
	private void createHRFeaturesTypes(RepositoryFactory rf,
			HashMap<PlatformPrimetiveTypes, TypeDAO> h) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO hrFeatures = tdh.addType("Manufacturing", "BackOffice", "HR",
				"hrFeatures");
		hrFeatures.setTypeOfType(MetamodelTypeOfTypes.Entity.name());

		PropertyHandler ph = tdh.getPropertyHandler();
		PropertyDAO prop = ph.addProperty("objId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());
		prop.setPrimaryKey(true);

		prop = ph.addProperty("version");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Integer).getObjId());
		prop.setOptLock(true);

		prop = ph.addProperty("locationId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("featureId");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.Long).getObjId());

		prop = ph.addProperty("linkType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("linkStatus");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("featureGroup");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("featureName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("featureVersion");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		prop = ph.addProperty("description");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());

		prop = ph.addProperty("nikName");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		//Type is java package of flash application for CMS
		prop = ph.addProperty("featureType");
		prop.setPropertyType(h.get(PlatformPrimetiveTypes.String).getObjId());
		
		TypeDAO hrFeaturesList = tdh.addType("Manufacturing", "BackOffice", "HR",
				"hrFeaturesList");
		hrFeaturesList.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO hrFeaturesSearchCriteria = tdh.addType("Manufacturing", "BackOffice", "HR", "hrFeaturesSearchCriteria");
		hrFeaturesSearchCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO hrFeaturesOrderByCriteria = tdh.addType("Manufacturing", "BackOffice", "HR", "hrFeaturesOrderByCriteria");
		hrFeaturesOrderByCriteria
				.setTypeOfType(MetamodelTypeOfTypes.JavaObject.name());

		TypeDAO hrFeaturesService = tdh.addType("Manufacturing", "BackOffice", "HR", "hrFeaturesService");
		hrFeaturesService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		hrFeaturesService.setGenericType(hrFeatures.getObjId());

		MethodHandler mh = tdh.getMethodHandler();
		ParameterHandler prh = mh.getParameterHandler();

		MethodDAO met = mh.addMethod("create");
		met.setReturnType(hrFeatures.getObjId());

		met = mh.addMethod("find");
		met.setReturnType(hrFeaturesList.getObjId());

		ParameterDAO prm = prh.addParameter("search");
		prm.setParameterType(hrFeaturesSearchCriteria.getObjId());

		prm = prh.addParameter("order");
		prm.setParameterType(hrFeaturesOrderByCriteria.getObjId());

		prm = prh.addParameter("startIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("endIndex");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.Integer).getObjId());

		prm = prh.addParameter("clazzName");
		prm.setParameterType(h.get(PlatformPrimetiveTypes.String).getObjId());

		met = mh.addMethod("update");
		prm = prh.addParameter("obj");
		prm.setParameterType(hrFeatures.getObjId());

		met = mh.addMethod("remove");
		prm = prh.addParameter("obj");
		prm.setParameterType(hrFeatures.getObjId());

		met = mh.addMethod("insert");
		prm = prh.addParameter("obj");
		prm.setParameterType(hrFeatures.getObjId());

	}
	
	private void createFormTriggers(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();
		TypeDAO triggersService = tdh.addType("Manufacturing", "BackOffice", "HR"
				, "TestFormTriggersService");
		triggersService.setTypeOfType(MetamodelTypeOfTypes.Service.name());
		
		MethodHandler mh = tdh.getMethodHandler();

		mh.addMethod("onDropTrigger");
		
	}
	

}
