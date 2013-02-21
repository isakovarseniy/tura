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
		Object domainHandl = Reflection.call(bindFactory, "getCurrentDomainLnk");
		TreeNode currTreeNode =(TreeNode) Reflection.call(domainHandl,"getSelectedNode");
		if (currTreeNode == null) return;
		if(currTreeNode.getData().getClass().getCanonicalName().contains("org.elsoft.platform.metamodel.objects.suite.DomainDAO")){
			Reflection.call(bindFactory, "setViewPortA","/Metarepository/MetarepositoryInterface/DomainCanvas.xhtml");
			
			
		}

		if(currTreeNode.getData().getClass().getCanonicalName().contains("org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO")){
			Reflection.call(bindFactory, "setViewPortA","/Metarepository/MetarepositoryInterface/FunctionalDomainCanvas.xhtml");
			
		}
	
		if(currTreeNode.getData().getClass().getCanonicalName().contains("org.elsoft.platform.metamodel.objects.suite.ApplicationDAO")){
			
			Reflection.call(bindFactory, "setViewPortA","/Metarepository/MetarepositoryInterface/ApplicationCanvas.xhtml");
			
		}
		
		
	}
	
	public void postQueryTypeMappinglnk(Object obj) {
		Long returnType = (Long) Reflection.call(obj, "getTypeReference");
		refMethodCalculation(returnType, obj);
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
			String typeName = (String) Reflection.call(typeObj, "getDomain") + "."
					+ (String) Reflection.call(typeObj, "getFunctionalDomain")
					+ "." + (String) Reflection.call(typeObj, "getApplication")
					+ "." + (String) Reflection.call(typeObj, "getTypeName");
			Reflection.call(obj, "setRefArtType", typeName);
		}

	}
}
