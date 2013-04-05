package org.elsoft.platform.admin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;

import org.elsoft.platform.ComparatorType;
import org.elsoft.platform.OrderCriteria;
import org.elsoft.platform.Reflection;
import org.elsoft.platform.SearchCriteria;
import org.elsoft.platform.datacontrol.DataControl;
import org.elsoft.platform.datacontrol.ELResolver;
import org.elsoft.platform.datacontrol.extender.Handler;
import org.elsoft.platform.metamodel.objects.suite.ApplicationDAO;
import org.elsoft.platform.metamodel.objects.suite.DomainDAO;
import org.elsoft.platform.metamodel.objects.suite.FunctionalDomainDAO;
import org.elsoft.platform.metamodel.objects.type.TypeDAO;
import org.primefaces.model.TreeNode;

public class MetamodelAdminTrigger {

	public void postCreateTypeDefinition(Object obj) {
		Handler domainHandler = (Handler) FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding.currentDomainLnk}",
						Object.class);

		Handler functionalDomain = (Handler) FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(
						FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding.currentFunctionalDomainLnk}",
						Object.class);

		Handler application = (Handler) FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(
						FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding.currentApplicationLnk}",
						Object.class);

		((TypeDAO) obj).setDomain(((DomainDAO) domainHandler.getMode().getControl().getCurrentObject()).getName());
		((TypeDAO) obj).setFunctionalDomain(((FunctionalDomainDAO) functionalDomain.getMode().getControl().getCurrentObject()).getName());
		((TypeDAO) obj).setApplication(((ApplicationDAO)application.getMode().getControl().getCurrentObject()).getName());

	}

	public boolean disableModelChoserButton() {
		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);

		Object modelMappingHandl = Reflection.call(bindFactory,
				"getCurrentModelMapping");

		Object currentRow = Reflection.call(modelMappingHandl,
				"getGridCurrentRow");

		String artifactCalculator = (String) Reflection.call(currentRow,
				"getArtifactCalculator");

		if ((artifactCalculator != null)
				&& (artifactCalculator
						.equals("org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBArtifactCalculator"))) {

			return false;
		}

		return true;
	}

	public void preQueryModelMapping(DataControl<?> dc,
			List<SearchCriteria> search, List<OrderCriteria> order) {

		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);

		Object recipeHandl = Reflection
				.call(bindFactory, "getCurrentRecipelnk");

		Object obj = Reflection.call(recipeHandl, "getTreeCurrentRow");

		SearchCriteria sc = new SearchCriteria();
		sc.setName("parentId");
		sc.setComparator(ComparatorType.EQ.name());
		sc.setValue(((Long) Reflection.call(obj, "getObjId")).toString());
		sc.setClassName(Long.class.getName());
		search.add(sc);
	}

	public void postQueryReceipeLnk(Object obj) {
		Object name = Reflection.call(obj, "getRecipeName");
		Reflection.call(obj, "setName", name);
	}

	public void postQueryIngredient(Object obj) {
		Object name = Reflection.call(obj, "getIngradientName");
		Reflection.call(obj, "setName", name);

	}

	public void postQueryPacket(Object obj) {
		Object name = Reflection.call(obj, "getPacketName");
		Reflection.call(obj, "setName", name);

	}

	public void vewPortProgrammChooser(Object obj) {
		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);

		Object modelMappingHandl = Reflection.call(bindFactory,
				"getCurrentModelMapping");

		Object currentRow = Reflection.call(modelMappingHandl,
				"getGridCurrentRow");

		if (currentRow == null)
			return;

		String artifactCalculator = (String) Reflection.call(currentRow,
				"getArtifactCalculator");

		if ((artifactCalculator != null)
				&& (artifactCalculator
						.equals("org.elsoft.platform.metamodel.processor.artifactcalculator.WSEJBArtifactCalculator"))) {

			Reflection
					.call(bindFactory, "setVewPortProgrammChooser",
							"/Metarepository/MetarepositoryInterface/ChooserOfDataSource.xhtml");

		}

		/*
		 * if (artifactCalculator.equals(anObject)){
		 * 
		 * Reflection .call(bindFactory, "setVewPortProgrammChooser",
		 * "/Metarepository/MetarepositoryInterface/ChooserOfUIElement.xhtml");
		 * 
		 * }
		 */

	}

	public void recipeViewPortController(Object obj) {
		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);

		Object recipeHandl = Reflection
				.call(bindFactory, "getCurrentRecipelnk");
		TreeNode currTreeNode = (TreeNode) Reflection.call(recipeHandl,
				"getSelectedNode");
		if (currTreeNode == null)
			return;

		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.recipe.RecipeDAO")) {
			Reflection
					.call(bindFactory, "setRecipeViewPort",
							"/Metarepository/MetarepositoryInterface/RecipeCanvas.xhtml");

		}

		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.recipe.IngredientDAO")) {
			Reflection
					.call(bindFactory, "setRecipeViewPort",
							"/Metarepository/MetarepositoryInterface/IngredientCanvas.xhtml");

		}

		if (currTreeNode
				.getData()
				.getClass()
				.getCanonicalName()
				.contains(
						"org.elsoft.platform.metamodel.objects.recipe.PacketDAO")) {

			Reflection
					.call(bindFactory, "setRecipeViewPort",
							"/Metarepository/MetarepositoryInterface/PacketCanvas.xhtml");

		}

	}

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
		String typeName = (String) Reflection.call(obj, "getTypeName") + "."
				+ (String) Reflection.call(obj, "getApplication") + "."
				+ (String) Reflection.call(obj, "getFunctionalDomain") + "."
				+ (String) Reflection.call(obj, "getDomain");
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
		Handler methodHandl = (Handler) Reflection.call(bindFactory,
				"getCurrentMethodHelper2");

		methodHandl = (Handler) methodHandl.cleanSearch();
		methodHandl = (Handler) methodHandl.searchLong("objId", refMethod);
		Object methodObj = methodHandl.getObject();
		Long refType = (Long) Reflection.call(methodObj, "getParentId");
		refMethodCalculation(refType, obj);

		String method = (String) Reflection.call(methodObj, "getMethod");
		Reflection.call(obj, "setRefArtMethodName", method);
		Reflection.call(obj, "setRefArtTypeId", refType);

	}

	public void preFormTrigger(ELResolver el) {

		ArrayList<Class<?>> clazzes = new ArrayList<Class<?>>();
		clazzes.add(org.elsoft.platform.metamodel.objects.command.datasource.CreateDataSourceDAO.class);
		el.setValue("clazzes", clazzes);
	}

	@SuppressWarnings("rawtypes")
	public void postQueryDataSource(Object obj) {

		Long refDs = (Long) Reflection.call(obj, "getObjId");

		Object bindFactory = FacesContext
				.getCurrentInstance()
				.getApplication()
				.evaluateExpressionGet(FacesContext.getCurrentInstance(),
						"#{MetarepositoryInterfacebinding}", Object.class);
		Handler dsHandl = (Handler) Reflection.call(bindFactory,
				"getCurrentDataSourcesCommand");

		dsHandl = (Handler) dsHandl.cleanSearch();
		dsHandl = (Handler) dsHandl.searchLong("parentId", refDs);
		Object dscmd = dsHandl.getObject();

		Long refType = (Long) Reflection.call(dscmd, "getRefType");
		refMethodCalculation(refType, obj);

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
					+ decode((String) Reflection
							.call(typeObj, "getApplication"))
					+ decode((String) Reflection.call(typeObj,
							"getFunctionalDomain"))
					+ decode((String) Reflection.call(typeObj, "getDomain"));
			Reflection.call(obj, "setRefArtType", typeName);
		}

	}

	public static String decode(String value) {
		return value != null ? "." + value : "";
	}

}
