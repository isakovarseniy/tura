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

	public void executeHR(RepositoryFactory rf, FunctionalDomainHandler fd) {
		createDropdowntestBusinessObject(fd, rf);
		createCountriesBusinessObject(fd, rf);
		createDepartmentsBusinessObject(fd, rf);
		createEmployeesBusinessObject(fd, rf);
		createhrFeaturesBusinessObject(fd,rf);
	}
	
	public void executeCommons(RepositoryFactory rf, FunctionalDomainHandler fd) {
		createDomainBusinessObject(fd, rf);
		createFunctionalDomainBusinessObject(fd, rf);
		createApplicationBusinessObject(fd, rf);
		createUIContainerBusinessObject(fd, rf);
//		createUIElementBusinessObject(fd, rf);
	}
	
	private void createDropdowntestBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO dropdowntest = bh.addBusinessObject("dropdowntest");

		TypeDAO refDropdowntest = (TypeDAO) tdh.cleanSearch()
				.search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntest").getObject();

		dropdowntest.setRefMntType(refDropdowntest.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "dropdowntestService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.cleanSearch().searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		
		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());
		
		StructureControl st =  bh.getMode().getStControl();
		st.toString();
	}

	private void createCountriesBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO countries = bh.addBusinessObject("countries");

		TypeDAO refCountries = (TypeDAO) tdh.cleanSearch()
				.search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countries").getObject();

		countries.setRefMntType(refCountries.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "countriesService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createDepartmentsBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO departments = bh.addBusinessObject("departments");

		TypeDAO refDepartments = (TypeDAO) tdh.cleanSearch()
				.search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departments").getObject();

		departments.setRefMntType(refDepartments.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "departmentsService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "create").getObject();
		MethodReferenceDAO metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.CreateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "find").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.SearchTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "insert").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.InsertTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "update").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.UpdateTrigger.name());

		method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "remove").getObject();
		metRef =  bh.getMethodReferenceHandler().addMethodReference(method);
		metRef.setMethodType(DCMetaInfo.RemoveTrigger.name());

	}

	private void createEmployeesBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO employees = bh.addBusinessObject("employees");

		TypeDAO refEmployees = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employees").getObject();

		employees.setRefMntType(refEmployees.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "employeesService").getObject();

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

	private void createDomainBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO domain = bh.addBusinessObject("domain");

		TypeDAO refDomain = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "domain").getObject();

		domain.setRefMntType(refDomain.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
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
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "functionalDomain").getObject();

		functionalDomain.setRefMntType(refFunctionalDomain.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
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
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "application").getObject();

		application.setRefMntType(refApplication.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
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
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIContainer").getObject();

		UIContainer.setRefMntType(refUIContainer.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
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

	@SuppressWarnings("unused")
	private void createUIElementBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO UIElement = bh.addBusinessObject("UIElement");

		TypeDAO refUIContainer = (TypeDAO) tdh
				.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElement").getObject();

		UIElement.setRefMntType(refUIContainer.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "Commons")
				.searchString("application", "Metarepository")
				.searchString("typeName", "UIElementService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler()
				.searchString("method", "create").getObject();
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
	
	private void createhrFeaturesBusinessObject(FunctionalDomainHandler fd,
			RepositoryFactory rf) {

		BusinessObjectHandler bh = fd.getBusinessObjectsHandler();
		TypeDefinitionHandler tdh = rf.getTypeDefinitionHandler();

		BusinessObjectDAO hrFeatures = bh.addBusinessObject("hrFeatures");

		TypeDAO refDropdowntest = (TypeDAO) tdh.cleanSearch()
				.search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeatures").getObject();

		hrFeatures.setRefMntType(refDropdowntest.getObjId());

		tdh.cleanSearch().search("domain", String.class, "Manufacturing")
				.searchString("functionalDomain", "BackOffice")
				.searchString("application", "HR")
				.searchString("typeName", "hrFeaturesService").getObject();

		MethodDAO method = (MethodDAO) tdh.getMethodHandler().cleanSearch()
				.searchString("method", "create").getObject();
		MethodReferenceDAO refMeth =bh.getMethodReferenceHandler().addMethodReference(method);
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
	
	
}
