package org.elsoft.platform.admin;

import javax.faces.context.FacesContext;

import org.elsoft.platform.Reflection;
import org.elsoft.platform.datacontrol.extender.Handler;
import org.primefaces.model.TreeNode;

public class MetamodelAdminTrigger {

	public void viewPortAController(Object obj) {
		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);
		Object domainHandl = Reflection
				.call(bindFactory, "getCurrentDomainLnk");
		TreeNode currTreeNode = (TreeNode) Reflection.call(domainHandl,
				"getSelectedNode");
		if (currTreeNode == null)
			return;
		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.suite.DomainDAO")) {
			Reflection
					.call(bindFactory, "setViewPortA",
							"/Metarepository/MetarepositoryInterface/DomainCanvas.xhtml");

		}

		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO")) {
			Reflection
					.call(bindFactory, "setViewPortA",
							"/Metarepository/MetarepositoryInterface/FunctionalDomainCanvas.xhtml");

		}

		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.suite.ApplicationDAO")) {

			Reflection
					.call(bindFactory, "setViewPortA",
							"/Metarepository/MetarepositoryInterface/ApplicationCanvas.xhtml");

		}

	}

	public void postQueryTypeMappinglnk(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getTypeReference");
		refMethodCalculation(returnType, obj);
	}

	public void postQueryTypeDefinitionHelperlnk(Object obj) {
		String typeName = (String) Reflection.call(obj, "getTypeName")
				+ "." + (String) Reflection.call(obj, "getApplication")
				+ "." + (String) Reflection.call(obj, "getFunctionalDomain")
				+ "." + (String) Reflection.call(obj, "getDomain");
		Reflection.call(obj, "setRefArtType", typeName);
	}

	public void postQueryBusinessObjectlnk(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getRefMntType");
		refMethodCalculation(returnType, obj);
	}

	public void postQueryMethod(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getReturnType");
		refMethodCalculation(returnType, obj);
	}

	public void postQueryPropertyLnk(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getPropertyType");
		refMethodCalculation(returnType, obj);
	}

	@SuppressWarnings("rawtypes")
	public void postQueryBusinessObjectMethodLnk(Object obj) {
		Long refMethod = (Long) Reflection.call(obj, "getRefMethod");

		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);
		Handler methodHandl = (Handler) Reflection
				.call(bindFactory, "getCurrentMethodHelper2");
		
		methodHandl = (Handler) methodHandl.cleanSearch();
		methodHandl = (Handler) methodHandl.searchLong("objId", refMethod);
		Object methodObj = methodHandl.getObject();
		Long refType = (Long) Reflection.call(methodObj, "getParentId");
		refMethodCalculation(refType, obj);
		
		String method = (String) Reflection.call(methodObj, "getMethod");
		Reflection.call(obj, "setRefArtMethodName",method);
		Reflection.call(obj, "setRefArtTypeId",refType);
		
	
	}


	public void postQueryParameterLnk(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getParameterType");
		refMethodCalculation(returnType, obj);
	}
	
	
	
	@SuppressWarnings("rawtypes")
	private void refMethodCalculation(Long returnType, Object obj) {
		if (returnType == null)
			return;

		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);

		Handler typeHelper = (Handler) Reflection.call(bindFactory,
				"getCurrentTypeDefinitionHelper");
		typeHelper = (Handler) typeHelper.cleanSearch();
		typeHelper = (Handler) typeHelper.searchLong("objId", returnType);

		Object typeObj = typeHelper.getObject();
		if (typeObj != null) {
			String typeName = (String) Reflection.call(typeObj, "getTypeName")
					+ decode( (String) Reflection.call(typeObj, "getApplication"))
					+ decode( (String) Reflection.call(typeObj, "getFunctionalDomain"))
					+ decode((String) Reflection.call(typeObj, "getDomain"));
			Reflection.call(obj, "setRefArtType", typeName);
		}

	}
	
	 public static String decode(String value)  
	 {  
	  return value != null ? "." + value: "";  
	 }  

	
}
