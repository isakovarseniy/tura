package org.tura.metamodel.populate.hr;

import java.util.HashMap;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

public class PopulateTypes {



	public void execute(domain.Domain model, Resource resource) {

		domain.TypesRepository typeRepository = InitDiagram
				.initTypesRepositoryDiagram(resource);
		model.getDomainTypes().setTypesrepository(typeRepository);
		populateHRPackage(model, resource);

	}

	private void populateHRPackage(domain.Domain model, Resource resource) {
		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName(Constants.PACKAGE_HR);
		pkg.setUid(UUID.randomUUID().toString());
		resource.getContents().add(pkg);

		model.getDomainTypes().getTypesrepository().getTypeDefinition()
				.getPackages().add(pkg);
		domain.TypeDefinition td = domain.DomainFactory.eINSTANCE
				.createTypeDefinition();
		resource.getContents().add(td);
		td.setUid(UUID.randomUUID().toString());
		pkg.setTypedefinition(td);

		populateDepartmentTypes(td, resource);
		populateEmployeeTypes(td, resource);
	}

	private void populateDepartmentTypes(domain.TypeDefinition td,
			Resource resource) {

		HashMap<String, domain.TypeElement> typesHash = InitDiagram
				.getTypeElements(resource);

		domain.Type department = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(department);
		td.getTypes().add(department);
		department.setName(Constants.TYPE_DEPARTMENT);
		department.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, department);

		domain.TypeExtension ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		department.getExtension().add(ext);

		domain.TypeReference typeRef = domain.DomainFactory.eINSTANCE
				.createTypeReference();
		td.getTypes().add(typeRef);
		ext.setTarget(typeRef);
		ext.setSource(department);
		typeRef.setPackageRef(typesHash
				.get(InitDiagram.BASE_PACKAGE + "_BaseType").getParent()
				.getParent());
		typeRef.setTypeRef(typesHash
				.get(InitDiagram.BASE_PACKAGE + "_BaseType"));

		typeRef.setUid(UUID.randomUUID().toString());

		domain.Attribute attr = domain.DomainFactory.eINSTANCE
				.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("departmentId");
		attr.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long")
				.getParent().getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("departmentName");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("managerId");
		attr.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long")
				.getParent().getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("locationId");
		attr.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long")
				.getParent().getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		domain.Type departmentsList = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsList);
		td.getTypes().add(departmentsList);
		departmentsList.setName(Constants.TYPE_LIST_OF_DEPARTMENTS);
		departmentsList.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsList);

		domain.Type departmentsSearchCriteria = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsSearchCriteria);
		td.getTypes().add(departmentsSearchCriteria);
		departmentsSearchCriteria
				.setName(Constants.TYPE_SEARCH_CRITERIAS_FOR_DEPARTMENTS);
		departmentsSearchCriteria.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsSearchCriteria);

		
		domain.Type departmentsOrderByCriteria = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsOrderByCriteria);
		td.getTypes().add(departmentsOrderByCriteria);
		departmentsOrderByCriteria
				.setName(Constants.TYPE_ORDERBY_CRITERIAS_FOR_DEPARTMENTS);
		departmentsOrderByCriteria.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsOrderByCriteria);

		domain.Type departmentsService = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsService);
		td.getTypes().add(departmentsService);
		departmentsService.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE);
		departmentsService.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsService);
		departmentserviceStructure(departmentsService,typesHash);


		domain.Type departmentsServiceRemoteInterface = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsServiceRemoteInterface);
		td.getTypes().add(departmentsServiceRemoteInterface);
		departmentsServiceRemoteInterface.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_REMOTE);
		departmentsServiceRemoteInterface.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsServiceRemoteInterface);
		departmentserviceStructure(departmentsServiceRemoteInterface,typesHash);
		
		domain.Type departmentsServiceLocalInterface = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(departmentsServiceLocalInterface);
		td.getTypes().add(departmentsServiceLocalInterface);
		departmentsServiceLocalInterface.setName(Constants.TYPE_DEPARTMENTS_QUERY_SERVICE_LOCAL);
		departmentsServiceLocalInterface.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, departmentsServiceLocalInterface);
		departmentserviceStructure(departmentsServiceLocalInterface,typesHash);
		
		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		departmentsService.getExtension().add(ext);
		ext.setTarget(departmentsServiceRemoteInterface);
		ext.setSource(departmentsService);
		
		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		departmentsService.getExtension().add(ext);
		ext.setTarget(departmentsServiceLocalInterface);
		ext.setSource(departmentsService);

		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		departmentsService.getExtension().add(ext);
		typeRef = domain.DomainFactory.eINSTANCE
				.createTypeReference();
		td.getTypes().add(typeRef);
		typeRef.setPackageRef(typesHash
				.get(InitDiagram.BASE_PACKAGE + "_BaseType").getParent()
				.getParent());
		typeRef.setTypeRef(typesHash.get(InitDiagram.BASE_PACKAGE +"_"+ InitDiagram.EJB_ENTITY_CRAD_SERVICE));
		
		ext.setTarget(typeRef);
		ext.setSource(departmentsService);
		
		
	}

	
	private void departmentserviceStructure(domain.Type employeesService,HashMap<String, domain.TypeElement> typesHash ){

		domain.Operation opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("create");

		domain.ReturnValue ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT)
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" +Constants. TYPE_DEPARTMENT));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("find");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_DEPARTMENTS)
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_DEPARTMENTS));
		
		domain.Parameter param = domain.DomainFactory.eINSTANCE
				.createParameter();
		opr.getParameters().add(param);
		param.setName("search");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_DEPARTMENTS)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_DEPARTMENTS));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("order");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_DEPARTMENTS)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_DEPARTMENTS));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("startIndex");
		param.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer")
				.getParent().getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer"));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("endIndex");
		param.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer")
				.getParent().getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer"));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("className");
		param.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String")
				.getParent().getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("insert");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));
		
		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("update");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));

		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" +Constants. TYPE_DEPARTMENT)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("remove");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));
		
		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_DEPARTMENT));

	}
	
	private void populateEmployeeTypes(domain.TypeDefinition td,
			Resource resource) {

		HashMap<String, domain.TypeElement> typesHash = InitDiagram
				.getTypeElements(resource);
		
		domain.Type employee = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(employee);
		td.getTypes().add(employee);
		employee.setName(Constants.TYPE_EMPLOYEE);
		employee.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employee);

		
		domain.TypeExtension ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		employee.getExtension().add(ext);

		domain.TypeReference typeRef = domain.DomainFactory.eINSTANCE
				.createTypeReference();
		td.getTypes().add(typeRef);
		ext.setTarget(typeRef);
		ext.setSource(employee);
		typeRef.setPackageRef(typesHash
				.get(InitDiagram.BASE_PACKAGE + "_BaseType").getParent()
				.getParent());
		typeRef.setTypeRef(typesHash.get(InitDiagram.BASE_PACKAGE + "_BaseType"));

		
		typeRef.setUid(UUID.randomUUID().toString());

		domain.Attribute attr = domain.DomainFactory.eINSTANCE
				.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("employeeId");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Long").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("firstName");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("lastName");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("email");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("phoneNumber");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("hireDate");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Date").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Date"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("salary");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Float").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Float"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("commissionPct");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Float").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Float"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("managerId");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Long").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		employee.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("departmentId");
		attr.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Long").getParent()
				.getParent());
		attr.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Long"));
		attr.setUid(UUID.randomUUID().toString());

		domain.Type employeesList = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(employeesList);
		td.getTypes().add(employeesList);
		employeesList.setName(Constants.TYPE_LIST_OF_EMPLOYEES);
		employeesList.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesList);

		domain.Type employeesSearchCriteria = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(employeesSearchCriteria);
		td.getTypes().add(employeesSearchCriteria);
		employeesSearchCriteria.setName(Constants.TYPE_SEARCH_CRITERIAS_FOR_EMPLOYEES);
		employeesSearchCriteria.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesSearchCriteria);

		domain.Type employeesOrderByCriteria = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(employeesOrderByCriteria);
		td.getTypes().add(employeesOrderByCriteria);
		employeesOrderByCriteria.setName(Constants.TYPE_ORDERBY_CRITERIAS_FOR_EMPLOYEES);
		employeesOrderByCriteria.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesOrderByCriteria);

		domain.Type employeesService = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(employeesService);
		td.getTypes().add(employeesService);
		employeesService.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE);
		employeesService.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesService);

		employeeserviceStructure(employeesService,typesHash);
		
		
		domain.Type employeesServiceLocalInterface = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(employeesServiceLocalInterface);
		td.getTypes().add(employeesServiceLocalInterface);
		employeesServiceLocalInterface.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_LOCAL);
		employeesServiceLocalInterface.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesServiceLocalInterface);
		employeeserviceStructure(employeesServiceLocalInterface,typesHash);
		
		domain.Type employeesServiceRemotInterface = domain.DomainFactory.eINSTANCE
				.createType();
		resource.getContents().add(employeesServiceRemotInterface);
		td.getTypes().add(employeesServiceRemotInterface);
		employeesServiceRemotInterface.setName(Constants.TYPE_EMPLOYEES_QUERY_SERVICE_REMOTE);
		employeesServiceRemotInterface.setUid(UUID.randomUUID().toString());
		InitDiagram.addType(typesHash, employeesServiceRemotInterface);
		employeeserviceStructure(employeesServiceRemotInterface,typesHash);

		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		employeesService.getExtension().add(ext);
		ext.setTarget(employeesServiceRemotInterface);
		ext.setSource(employeesService);
		
		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		employeesService.getExtension().add(ext);
		ext.setTarget(employeesServiceLocalInterface);
		ext.setSource(employeesService);
		
		ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		employeesService.getExtension().add(ext);
		typeRef = domain.DomainFactory.eINSTANCE
				.createTypeReference();
		td.getTypes().add(typeRef);
		typeRef.setPackageRef(typesHash
				.get(InitDiagram.BASE_PACKAGE + "_BaseType").getParent()
				.getParent());
		typeRef.setTypeRef(typesHash.get(InitDiagram.BASE_PACKAGE + "_"+InitDiagram.EJB_ENTITY_CRAD_SERVICE));
		
		ext.setTarget(typeRef);
		ext.setSource(employeesService);
		
	}
	
	public void employeeserviceStructure( domain.Type employeesService, HashMap<String, domain.TypeElement> typesHash){

		domain.Operation opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("create");

		domain.ReturnValue ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE)
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));
		

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("find");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_EMPLOYEES)
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_LIST_OF_EMPLOYEES));
		
		
		
		domain.Parameter param = domain.DomainFactory.eINSTANCE
				.createParameter();
		opr.getParameters().add(param);
		param.setName("search");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_EMPLOYEES)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_SEARCH_CRITERIAS_FOR_EMPLOYEES));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("order");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_EMPLOYEES)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_ORDERBY_CRITERIAS_FOR_EMPLOYEES));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("startIndex");
		param.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Integer").getParent()
				.getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer"));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("endIndex");
		param.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_Integer").getParent()
				.getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_Integer"));

		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("className");
		param.setPackageRef(typesHash
				.get(InitDiagram.PRIVATE_PACKAGE + "_String").getParent()
				.getParent());
		param.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE + "_String"));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("insert");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));
		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("update");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));
		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));

		opr = domain.DomainFactory.eINSTANCE.createOperation();
		employeesService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("remove");

		ret = domain.DomainFactory.eINSTANCE
				.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void")
				.getParent().getParent());
		ret.setTypeRef(typesHash.get(InitDiagram.PRIVATE_PACKAGE  + "_Void"));
		
		
		param = domain.DomainFactory.eINSTANCE.createParameter();
		opr.getParameters().add(param);
		param.setName("obj");
		param.setPackageRef(typesHash.get(Constants.PACKAGE_HR + "_" +Constants. TYPE_EMPLOYEE)
				.getParent().getParent());
		param.setTypeRef(typesHash.get(Constants.PACKAGE_HR + "_" + Constants.TYPE_EMPLOYEE));
		
	}

}
