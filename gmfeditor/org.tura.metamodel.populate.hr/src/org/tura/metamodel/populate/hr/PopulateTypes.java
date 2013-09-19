package org.tura.metamodel.populate.hr;

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.tura.metamodel.commons.initdiagram.InitDiagram;

public class PopulateTypes {

	public void execute(domain.Domain model, Resource resource) {

		domain.TypesRepository typeRepository = InitDiagram
				.initTypesRepositoryDiagram();
		model.getDomainTypes().setTypesrepository(typeRepository);
		resource.getContents().add(typeRepository);
        populateBasePackage(model, resource);
        populateHRPackage(model, resource);
		
	}


	private void populateBasePackage(domain.Domain model, Resource resource) {
		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName("Base package");
		pkg.setUid(UUID.randomUUID().toString());
		resource.getContents().add(pkg);

		model.getDomainTypes().getTypesrepository().getTypeDefinition()
				.getPackages().add(pkg);

		domain.TypeDefinition td = domain.DomainFactory.eINSTANCE
				.createTypeDefinition();
		resource.getContents().add(td);
		td.setUid(UUID.randomUUID().toString());
		pkg.setTypedefinition(td);

		domain.Type baseType = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(baseType);
		td.getTypes().add(baseType);
		baseType.setName("BaseType");
		baseType.setUid(UUID.randomUUID().toString());

		domain.Attribute attr = domain.DomainFactory.eINSTANCE
				.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setName("objId");
		attr.setPk(true);
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("parentId");
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objType");
		attr.setPackageName("Primitives");
		attr.setTypeName("String");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("objStatus");
		attr.setPackageName("Primitives");
		attr.setTypeName("String");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("createDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("updateDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("activeDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		baseType.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("expiredDate");
		attr.setPackageName("Primitives");
		attr.setTypeName("Date");
		attr.setUid(UUID.randomUUID().toString());

	}

	private void populateHRPackage(domain.Domain model, Resource resource) {
		domain.Package pkg = domain.DomainFactory.eINSTANCE.createPackage();
		pkg.setName("HR package");
		pkg.setUid(UUID.randomUUID().toString());
		resource.getContents().add(pkg);

		model.getDomainTypes().getTypesrepository().getTypeDefinition()
				.getPackages().add(pkg);

		populateDepartmentTypes(pkg, resource);
	}
	
	private void populateDepartmentTypes(domain.Package pkg,Resource resource){
		domain.TypeDefinition  td = domain.DomainFactory.eINSTANCE.createTypeDefinition();
		resource.getContents().add(td);
		td.setUid(UUID.randomUUID().toString());
		pkg.setTypedefinition(td);

		domain.Type department = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(department);
		td.getTypes().add(department);
		department.setName("Department Type");
		department.setUid(UUID.randomUUID().toString());

		domain.TypeExtension ext = domain.DomainFactory.eINSTANCE
				.createTypeExtension();
		department.setExtension(ext);

		domain.TypeReference typeRef = domain.DomainFactory.eINSTANCE
				.createTypeReference();
		td.getTypes().add(typeRef);
		ext.setTarget(typeRef);
		ext.setSource(department);
		typeRef.setPackageName("Base package");
		typeRef.setTypeName("BaseType");
		typeRef.setUid(UUID.randomUUID().toString());

		domain.Attribute attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("departmentId");
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("departmentName");
		attr.setPackageName("Primitives");
		attr.setTypeName("String");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("managerId");
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		attr = domain.DomainFactory.eINSTANCE.createAttribute();
		department.getAttributes().add(attr);
		attr.setPk(false);
		attr.setName("locationId");
		attr.setPackageName("Primitives");
		attr.setTypeName("Long");
		attr.setUid(UUID.randomUUID().toString());

		
		domain.Type departmentsList = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(departmentsList);
		td.getTypes().add(departmentsList);
		departmentsList.setName("List of Departments");
		departmentsList.setUid(UUID.randomUUID().toString());

		domain.Type departmentsSearchCriteria = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(departmentsSearchCriteria);
		td.getTypes().add(departmentsSearchCriteria);
		departmentsSearchCriteria.setName("Search criterias for Departments");
		departmentsSearchCriteria.setUid(UUID.randomUUID().toString());
		
		domain.Type departmentsOrderByCriteria = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(departmentsOrderByCriteria);
		td.getTypes().add(departmentsOrderByCriteria);
		departmentsOrderByCriteria.setName("OrderBy criterias for Departments");
		departmentsOrderByCriteria.setUid(UUID.randomUUID().toString());
		
		domain.Type departmentsService = domain.DomainFactory.eINSTANCE.createType();
		resource.getContents().add(departmentsService);
		td.getTypes().add(departmentsService);
		departmentsService.setName("Departments query service");
		departmentsService.setUid(UUID.randomUUID().toString());
		
		domain.Operation opr = domain.DomainFactory.eINSTANCE.createOperation();
		departmentsService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("create");
		
		domain.ReturnValue ret = domain.DomainFactory.eINSTANCE.createReturnValue();
		opr.setReturnValue(ret);
		ret.setUid(UUID.randomUUID().toString());
		ret.setPackageName("HR package");
		ret.setTypeName("Department Type");
		
		opr = domain.DomainFactory.eINSTANCE.createOperation();
		departmentsService.getOperations().add(opr);
		opr.setUid(UUID.randomUUID().toString());
		opr.setName("find");
		
         domain.Parameter param = domain.DomainFactory.eINSTANCE.createParameter();
         opr.getParameters().add(param);
         param.setName("search");
         param.setPackageName("HR package");
         param.setTypeName("Search criterias for Departments");
		
         param = domain.DomainFactory.eINSTANCE.createParameter();
         opr.getParameters().add(param);
         param.setName("order");
         param.setPackageName("HR package");
         param.setTypeName("OrderBy criterias for Departments");
		
         param = domain.DomainFactory.eINSTANCE.createParameter();
         opr.getParameters().add(param);
         param.setName("startIndex");
         param.setPackageName("Primitives");
         param.setTypeName("Integer");
		
         param = domain.DomainFactory.eINSTANCE.createParameter();
         opr.getParameters().add(param);
         param.setName("endIndex");
         param.setPackageName("Primitives");
         param.setTypeName("Integer");
		
         param = domain.DomainFactory.eINSTANCE.createParameter();
         opr.getParameters().add(param);
         param.setName("className");
         param.setPackageName("Primitives");
         param.setTypeName("String");
         
 		opr = domain.DomainFactory.eINSTANCE.createOperation();
 		departmentsService.getOperations().add(opr);
 		opr.setUid(UUID.randomUUID().toString());
 		opr.setName("insert");
        
        param = domain.DomainFactory.eINSTANCE.createParameter();
        opr.getParameters().add(param);
        param.setName("obj");
        param.setPackageName("HR package");
        param.setTypeName("Department Type");

 		opr = domain.DomainFactory.eINSTANCE.createOperation();
 		departmentsService.getOperations().add(opr);
 		opr.setUid(UUID.randomUUID().toString());
 		opr.setName("update");
        
        param = domain.DomainFactory.eINSTANCE.createParameter();
        opr.getParameters().add(param);
        param.setName("obj");
        param.setPackageName("HR package");
        param.setTypeName("Department Type");
		
 		opr = domain.DomainFactory.eINSTANCE.createOperation();
 		departmentsService.getOperations().add(opr);
 		opr.setUid(UUID.randomUUID().toString());
 		opr.setName("remove");
        
        param = domain.DomainFactory.eINSTANCE.createParameter();
        opr.getParameters().add(param);
        param.setName("obj");
        param.setPackageName("HR package");
        param.setTypeName("Department Type");
		
	}
}
