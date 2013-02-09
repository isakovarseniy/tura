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

import org.elsoft.platform.metamodel.MetamodelPlatformLevel;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.elsoft.platform.metamodel.objects.type.TypeMappingDAO;
import org.elsoft.platform.metamodel.types.TypeDefinitionHandler;
import org.elsoft.platform.metamodel.types.TypeMappingHandler;
import org.elsoft.platform.metamodel.RepositoryFactory;

public class PopulateTypeMapping {

	public void execute(RepositoryFactory rf) {
		createDropdowntestMapping(rf);
		createCountriestMapping(rf);
		createDepartmentsMapping(rf);
		createEmployeesMapping(rf);
		createDomainMapping(rf);
		createFunctionalDomainMapping(rf);
		createApplicationMapping(rf);
		createUIContainerMapping(rf);
//		createUIElementMapping(rf);
		createHRFeaturesMapping(rf);
		createFormTriggersMapping(rf);

	}

	private void createDropdowntestMapping(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO dropdowntest = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntest").getObject();

		TypeDAO dropdowntestService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntestService").getObject();

		TypeDAO dropdowntestSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntestSearchCriteria").getObject();

		TypeDAO dropdowntestOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntestOrderByCriteria").getObject();
		
		TypeDAO dropdowntestList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntestList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(dropdowntest, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.dropdowntest");
		mp.setResTypeName("DropdowntestDAO");

		
		mp = tpmh.addTypeMapping(dropdowntestService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.dropdowntest.impl");
		mp.setResTypeName("DropdowntestService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");
		

		mp = tpmh.addTypeMapping(dropdowntest, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.objects");
		mp.setResTypeName("DropdowntestDAO");

		
		mp = tpmh.addTypeMapping(dropdowntestService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.dropdowntest");
		mp.setResTypeName("DropdowntestService");
	

		mp = tpmh.addTypeMapping(dropdowntestSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.SearchCriteria>");


		mp = tpmh.addTypeMapping(dropdowntestSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(dropdowntestOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.OrderCriteria>");


		mp = tpmh.addTypeMapping(dropdowntestOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(dropdowntestList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.DropdowntestDAO>");

		mp = tpmh.addTypeMapping(dropdowntestList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.DropdowntestDAO>");

	}

	private void createCountriestMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO countries = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countries").getObject();

		TypeDAO countriesService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countriesService").getObject();

		TypeDAO countriesSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countriesSearchCriteria").getObject();

		TypeDAO countriesOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countriesOrderByCriteria").getObject();
		
		TypeDAO countriesList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countriesList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(countries, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.countries");
		mp.setResTypeName("CountriesDAO");

		
		mp = tpmh.addTypeMapping(countriesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.countries.impl");
		mp.setResTypeName("CountriesService");
		

		mp = tpmh.addTypeMapping(countries, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.objects");
		mp.setResTypeName("CountriesDAO");

		
		mp = tpmh.addTypeMapping(countriesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.countries");
		mp.setResTypeName("CountriesService");
	

		mp = tpmh.addTypeMapping(countriesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(countriesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(countriesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(countriesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(countriesList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.CountriesDAO>");

	}

	private void createDepartmentsMapping(RepositoryFactory rf) {

		
		
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO departments = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departments").getObject();

		TypeDAO departmentsService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departmentsService").getObject();

		TypeDAO departmentsSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departmentsSearchCriteria").getObject();

		TypeDAO departmentsOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departmentsOrderByCriteria").getObject();
		
		TypeDAO departmentsList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departmentsList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(departments, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.departments");
		mp.setResTypeName("DepartmentsDAO");

		
		mp = tpmh.addTypeMapping(departmentsService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.departments.impl");
		mp.setResTypeName("DepartmentsService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");
		

		mp = tpmh.addTypeMapping(departments, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.objects");
		mp.setResTypeName("DepartmentsDAO");

		
		mp = tpmh.addTypeMapping(departmentsService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.departments");
		mp.setResTypeName("DepartmentsService");
	

		mp = tpmh.addTypeMapping(departmentsSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.SearchCriteria>");


		mp = tpmh.addTypeMapping(departmentsSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(departmentsOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.OrderCriteria>");


		mp = tpmh.addTypeMapping(departmentsOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(departmentsList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.DepartmentsDAO>");
		
		mp = tpmh.addTypeMapping(departmentsList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.DepartmentsDAO>");

		
	}

	private void createEmployeesMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO employees = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employees").getObject();

		TypeDAO employeesService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employeesService").getObject();

		TypeDAO employeesSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employeesSearchCriteria").getObject();

		TypeDAO employeesOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employeesOrderByCriteria").getObject();
		
		TypeDAO employeesList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employeesList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(employees, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.employees");
		mp.setResTypeName("EmployeesDAO");

		
		mp = tpmh.addTypeMapping(employeesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.hr.employees.impl");
		mp.setResTypeName("EmployeesService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");
		

		mp = tpmh.addTypeMapping(employees, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.objects");
		mp.setResTypeName("EmployeesDAO");

		
		mp = tpmh.addTypeMapping(employeesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.hr.employees");
		mp.setResTypeName("EmployeesService");
	

		mp = tpmh.addTypeMapping(employeesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.SearchCriteria>");


		mp = tpmh.addTypeMapping(employeesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(employeesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.OrderCriteria>");


		mp = tpmh.addTypeMapping(employeesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(employeesList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.EmployeesDAO>");
		
		mp = tpmh.addTypeMapping(employeesList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.hr.objects.EmployeesDAO>");

	}

	private void createDomainMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO domain = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domain").getObject();

		TypeDAO domainService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainService").getObject();

		TypeDAO domainSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainSearchCriteria").getObject();

		TypeDAO domainOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainOrderByCriteria").getObject();
		

		TypeDAO domainList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domainList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(domain, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("DomainDAO");

	    mp = tpmh.addTypeMapping(domain, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("DomainDAO");
		
		
		
		mp = tpmh.addTypeMapping(domainService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		
		mp = tpmh.addTypeMapping(domainService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		
		
		mp = tpmh.addTypeMapping(domainSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		
		mp = tpmh.addTypeMapping(domainOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		
		mp = tpmh.addTypeMapping(domainList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(domainList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	
	}

	private void createFunctionalDomainMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO functionalDomain = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomain").getObject();

		TypeDAO functionalDomainService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainService").getObject();

		TypeDAO functionalDomainSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainSearchCriteria").getObject();

		TypeDAO functionalDomainOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainOrderByCriteria").getObject();
		
		TypeDAO functionalDomainList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomainList").getObject();

		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(functionalDomain, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("FunctionalDomainDAO");

		mp = tpmh.addTypeMapping(functionalDomain, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("FunctionalDomainDAO");
		
		
		mp = tpmh.addTypeMapping(functionalDomainService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(functionalDomainService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		
		mp = tpmh.addTypeMapping(functionalDomainSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(functionalDomainOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		
		mp = tpmh.addTypeMapping(functionalDomainList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(functionalDomainList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	
	}

	private void createApplicationMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO application = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "application").getObject();

		TypeDAO applicationService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationService").getObject();

		TypeDAO applicationSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationSearchCriteria").getObject();

		TypeDAO applicationOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationOrderByCriteria").getObject();
		
		TypeDAO applicationList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "applicationList").getObject();

		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(application, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("ApplicationDAO");

		mp = tpmh.addTypeMapping(application, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.objects.suite");
		mp.setResTypeName("ApplicationDAO");

		
		mp = tpmh.addTypeMapping(applicationService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(applicationService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("GeneralService");

		
		mp = tpmh.addTypeMapping(applicationSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(applicationOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		
		mp = tpmh.addTypeMapping(applicationList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(applicationList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
	
	}

	private void createUIContainerMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO UIContainer = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainer").getObject();

		TypeDAO UIContainerService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerService").getObject();

		TypeDAO UIContainerSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerSearchCriteria").getObject();

		TypeDAO UIContainerOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerOrderByCriteria").getObject();
		
		TypeDAO UIContainerList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainerList").getObject();

		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(UIContainer, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general");
		mp.setResTypeName("UiContainerDAO");

		
		mp = tpmh.addTypeMapping(UIContainerService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.general.impl");
		mp.setResTypeName("GeneralService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");

		mp = tpmh.addTypeMapping(UIContainerSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(UIContainerOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		
		mp = tpmh.addTypeMapping(UIContainerList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	@SuppressWarnings("unused")
	private void createUIElementMapping(RepositoryFactory rf) {

		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO UIElement = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElement").getObject();

		TypeDAO UIElementService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElementService").getObject();

		TypeDAO UIElementSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElementSearchCriteria").getObject();

		TypeDAO UIElementOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElementOrderByCriteria").getObject();
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(UIElement, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.uielement");
		mp.setResTypeName("UiElementDAO");

		
		mp = tpmh.addTypeMapping(UIElementService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.metamodel.uielement.impl");
		mp.setResTypeName("UiElementService");

		mp = tpmh.addTypeMapping(UIElementSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

		mp = tpmh.addTypeMapping(UIElementOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");

	}

	private void createHRFeaturesMapping(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO hrFeatures = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeatures").getObject();

		TypeDAO hrFeaturesService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeaturesService").getObject();

		TypeDAO hrFeaturesSearchCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeaturesSearchCriteria").getObject();

		TypeDAO hrFeaturesOrderByCriteria = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeaturesOrderByCriteria").getObject();
		
		TypeDAO hrFeaturesList = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeaturesList").getObject();
		
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(hrFeatures, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("com.jibestream.cms.admin.hrfeatures");
		mp.setResTypeName("HrFeaturesDAO");

		
		mp = tpmh.addTypeMapping(hrFeaturesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("com.jibestream.cms.admin.hrfeatures.impl");
		mp.setResTypeName("HrFeaturesService");
		mp.setGroupName("org.elsoft.platform.Manufacturing.BackOffice");
		mp.setArtifactName("Model-Manufacturing-BackOffice-HR-client");
		mp.setArtifactVersion("1.0");
		mp.setTechnology("WS-EJB-JERSEY");
		

		mp = tpmh.addTypeMapping(hrFeatures, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("com.jibestream.cms.admin.objects");
		mp.setResTypeName("HrFeaturesDAO");

		
		mp = tpmh.addTypeMapping(hrFeaturesService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("com.jibestream.cms.admin.hrfeatures");
		mp.setResTypeName("HrFeaturesService");
	

		mp = tpmh.addTypeMapping(hrFeaturesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.SearchCriteria>");


		mp = tpmh.addTypeMapping(hrFeaturesSearchCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");


		mp = tpmh.addTypeMapping(hrFeaturesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<org.elsoft.platform.OrderCriteria>");


		mp = tpmh.addTypeMapping(hrFeaturesOrderByCriteria, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List");
		

		mp = tpmh.addTypeMapping(hrFeaturesList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<com.jibestream.cms.admin.objects.HrFeaturesDAO>");

		mp = tpmh.addTypeMapping(hrFeaturesList, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.WEB_SERVICES.name());
		mp.setResPackageName("java.util");
		mp.setResTypeName("List<com.jibestream.cms.admin.objects.HrFeaturesDAO>");

	}	
	
	private void createFormTriggersMapping(RepositoryFactory rf) {
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		TypeDAO adminTriggersService = (TypeDAO) tdh
				.cleanSearch()
				.searchString("domain", "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "TestFormTriggersService").getObject();
		
		TypeMappingHandler tpmh = rf.getTypeMappingHandler();

		TypeMappingDAO mp = tpmh.addTypeMapping(adminTriggersService, "Manufacturing",
				"BackOffice", "HR");
		mp.setTargetLayer(MetamodelPlatformLevel.UI_CONTAINER.name());
		mp.setResPackageName("org.elsoft.platform.form.triggers");
		mp.setResTypeName("TestFormTriggers");
		mp.setGroupName("org.elsoft.testForm");
		mp.setArtifactName("trigger");
		mp.setArtifactVersion("1.0");
	
	}

}
