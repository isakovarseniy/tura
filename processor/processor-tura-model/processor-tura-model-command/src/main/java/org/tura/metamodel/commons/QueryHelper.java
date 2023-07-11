/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.commons;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.felix.gogo.jline.utils.LogUtil;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.epsilon.eol.tools.EolSystem;
import org.eclipse.epsilon.eol.types.AbstractToolNativeTypeDelegate;
import org.tura.metamode.tura.TuraInstantiator;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;
import org.tura.model.designer.repository.serialized.mapper.MappingLayer;
import org.tura.model.designer.repository.serialized.application.Application;
import org.tura.model.designer.repository.serialized.application.ApplicationMappers;
import org.tura.model.designer.repository.serialized.application.ApplicationUILayer;
import org.tura.model.designer.repository.serialized.artifact.GenerationHint;
import org.tura.model.designer.repository.serialized.artifact.QueryParameter;
import org.tura.model.designer.repository.serialized.artifact.TechLeaf;
import org.tura.model.designer.repository.serialized.artifact.Technology;
import org.tura.model.designer.repository.serialized.domain.Domain;
import org.tura.model.designer.repository.serialized.domain.DomainApplications;
import org.tura.model.designer.repository.serialized.domain.DomainArtifacts;
import org.tura.model.designer.repository.serialized.domain.DomainTypes;
import org.tura.model.designer.repository.serialized.form.AreaRef;
import org.tura.model.designer.repository.serialized.form.CanvasFrame;
import org.tura.model.designer.repository.serialized.form.Controls;
import org.tura.model.designer.repository.serialized.form.DataControl;
import org.tura.model.designer.repository.serialized.form.DataScroller;
import org.tura.model.designer.repository.serialized.form.Form;
import org.tura.model.designer.repository.serialized.form.LayerHolder;
import org.tura.model.designer.repository.serialized.form.MenuDefinition;
import org.tura.model.designer.repository.serialized.form.MenuExtensionRef;
import org.tura.model.designer.repository.serialized.form.MenuFolder;
import org.tura.model.designer.repository.serialized.form.MenuItem;
import org.tura.model.designer.repository.serialized.form.NickNamed;
import org.tura.model.designer.repository.serialized.form.Relation;
import org.tura.model.designer.repository.serialized.form.Uielement;
import org.tura.model.designer.repository.serialized.form.ViewArea;
import org.tura.model.designer.repository.serialized.form.Views;
import org.tura.model.designer.repository.serialized.form.Window;
import org.tura.model.designer.repository.serialized.mapper.Mapper;
import org.tura.model.designer.repository.serialized.mapper.Version;
import org.tura.model.designer.repository.serialized.objectmapper.AttributeConnector;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.serialized.objectmapper.ObjectMapperGroup;
import org.tura.model.designer.repository.serialized.objectmapper.OmRelation;
import org.tura.model.designer.repository.serialized.objectmapper.OperationConnector;
import org.tura.model.designer.repository.serialized.objectmapper.ProcessingStage;
import org.tura.model.designer.repository.serialized.recipe.Component;
import org.tura.model.designer.repository.serialized.recipe.ConfigExtension;
import org.tura.model.designer.repository.serialized.recipe.Configuration;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure;
import org.tura.model.designer.repository.serialized.recipe.Infrastructure2Configuration;
import org.tura.model.designer.repository.serialized.recipe.Ingredient;
import org.tura.model.designer.repository.serialized.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.serialized.recipe.ModelMapper;
import org.tura.model.designer.repository.serialized.recipe.QueryVariable;
import org.tura.model.designer.repository.serialized.recipe.Recipe;
import org.tura.model.designer.repository.serialized.recipe.Recipe2Infrastructure;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.TypeGroup;
import org.tura.model.designer.repository.serialized.type.TypeProxy;
import org.tura.model.designer.repository.serialized.type.TypeReference;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.cpa.CpaRepository;

import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.repository.serialized.type.Assosiation;
import org.tura.model.designer.repository.serialized.type.Generalization;
import org.tura.model.designer.repository.serialized.type.Primitive;
import org.tura.model.designer.repository.serialized.type.Attribute;

public class QueryHelper {

	private static String BASE_REPOSITORY = "Base Repository";
	private static String MODEL_PACKAGE = "Model types";
	private static String MESSAGE_TYPE = "Message";
	private static String DATA_CONTROL = "Data control";
	private static String TREE_DATA_CONTROL = "Tree data control";
	private static String STYLE_TYPE = "Style";
	private static String GROUP_TYPE = "Group";
	private static String ROLE_TYPE = "Role";
	private static String ICON_TYPE = "Icon";
	private static String BASE_TYPE = "Base type";
	private static String ANY_TYPE = "Any type";
	private static String GENERATION_HINT_TYPE = "Generation hint";
	private Model model = null;

	private HintHelper hintHelper = new HintHelper();

	private IEolModule module;

	public QueryHelper(Model model) {
		this.model = model;
	}

	public QueryHelper() {
	}

	private IEolModule createModule() throws Exception {
		return new EolModule();
	}

	@SuppressWarnings("unchecked")
	private void addVariables(IEolContext context, Map<String, ?>... variableMaps) {
		for (Map<String, ?> variableMap : variableMaps) {
			for (String key : variableMap.keySet()) {
				module.getContext().getFrameStack().put(Variable.createReadOnlyVariable(key, variableMap.get(key)));
			}
		}
	}

	private Model getModel() {
		return model;
	}

	private Object internalEvaluate(final String expression) throws Exception {
		Model m = getModel();
		return internalEvaluate(m, expression);
	}

	private Object internalEvaluate(Object obj, final String expression) throws Exception {
		ObjectControl oc = (ObjectControl) obj;
		TuraInstantiator turaInstantiator = new TuraInstantiator();
		Model m = turaInstantiator.createTuraModel((CpaRepository) oc.getRepository());
		return internalEvaluate(m, expression);
	}

	private Object internalEvaluate(Object obj, final String expression,Map<String, Object> variable) throws Exception {
		ObjectControl oc = (ObjectControl) obj;
		TuraInstantiator turaInstantiator = new TuraInstantiator();
		Model m = turaInstantiator.createTuraModel((CpaRepository) oc.getRepository());
		return internalEvaluate(m, expression,variable);
	}	
	
	private Object internalEvaluate(Model model, final String expression) throws Exception {
		return internalEvaluate(model, expression, new HashMap<>());
	}

	private Object internalEvaluate(Model model, final String expression, Map<String, Object> variables)
			throws Exception {
		parseModule(expression);
		configureModule(variables);
		module.getContext().getModelRepository().addModel(model);
		return module.execute();
	}

	@SuppressWarnings("unchecked")
	private AbstractToolNativeTypeDelegate getDeligate() throws Exception {
		Class<AbstractToolNativeTypeDelegate> clazz = null;
		try {
			clazz = (Class<AbstractToolNativeTypeDelegate>) Class
					.forName("org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate");
		} catch (Exception e) {
			clazz = (Class<AbstractToolNativeTypeDelegate>) Class
					.forName("org.eclipse.epsilon.eol.types.EolClasspathNativeTypeDelegate");
		}
		return clazz.getConstructor().newInstance();

	}

	@SuppressWarnings("unused")
	private void parseModule(URI uri) throws Exception {
		module = createModule();
		module.parse(uri);

		if (module.getParseProblems().size() > 0) {
			for (ParseProblem problem : module.getParseProblems()) {
				LogUtil.logInfo(problem);
			}
			throw new Exception("Parsing problem");
		}
	}

	private void parseModule(String expression) throws Exception {
		module = createModule();
		module.parse(expression);

		if (module.getParseProblems().size() > 0) {
			for (ParseProblem problem : module.getParseProblems()) {
				LogUtil.logInfo(problem);
			}
			throw new Exception("Parsing problem");
		}
	}

	@SuppressWarnings("unchecked")
	protected void configureModule(Map<String, Object> variables) throws Exception {

		EolSystem system = new EolSystem();
		system.setContext(module.getContext());
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("System", system));
		module.getContext().getFrameStack().put(Variable.createReadOnlyVariable("null", null));
		module.getContext().getNativeTypeDelegates().add(getDeligate());

		addVariables(module.getContext(), variables);

	}

	public Form getForm(DataControl dc) {
		return (Form) Util.getContainer(Util.getContainer(dc));
	}

	public List<Version> getVersions(Mapper object) {
		Mapper mapper = (Mapper) object;
		ApplicationMappers obj = (ApplicationMappers) Util.getContainer(Util.getContainer(Util.getContainer(mapper)));
		if (obj.getVersions() == null) {
			return new ArrayList<Version>();
		}
		return obj.getVersions();
	}

	public List<Version> getVersions(Component object) {
		Component jc = (Component) object;
		Application app = (Application) Util.getContainer(
				Util.getContainer(Util.getContainer(Util.getContainer(Util.getContainer(Util.getContainer(jc))))));
		if (app.getApplicationMappers() == null || app.getApplicationMappers().getVersions() == null) {
			return new ArrayList<Version>();
		}
		return app.getApplicationMappers().getVersions();
	}

	@SuppressWarnings({ "unchecked" })
	public void getTreeLeafs(List<Object> ls, DataControl root) throws Exception {
		String query = "var r = form::Relation.allInstances()->select(r|r.isTree=true and r.master.uid ='"
				+ root.getUid() + "')->collect(r|r.detail); return r;";

		ls.add(root);
		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(query);

		for (DataControl dc : map) {
			if (!ls.contains(dc)) {
				getTreeLeafs(ls, dc);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Infrastructure getInfrastructure(Recipe recipe) throws Exception {
		String query = "var r = recipe::Recipe2Infrastructure.allInstances()->select(r|r.source.uid ='"
				+ recipe.getUid() + "'); return r;";

		Collection<Recipe2Infrastructure> map = (Collection<Recipe2Infrastructure>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getTarget();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public Recipe getRecipe(Infrastructure infra) throws Exception {
		String query = "var r = recipe::Recipe2Infrastructure.allInstances()->select(r|r.target.uid ='" + infra.getUid()
				+ "');  return r;";

		Collection<Recipe2Infrastructure> map = (Collection<Recipe2Infrastructure>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getSource();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Recipe getRecipe(String uid) throws Exception {
		String query = "var r =  recipe::Recipe.allInstances()->select(r|r.uid ='" + uid + "');  return r;";

		Collection<Recipe> map = (Collection<Recipe>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Ingredient getIngredient(String uid) throws Exception {

		String query = "var r = recipe::Ingredient.allInstances()->select(r|r.uid ='" + uid + "');  return r;";

		Collection<Ingredient> map = (Collection<Ingredient>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public Component getComponent(String uid) throws Exception {

		String query = "var r = recipe::Component.allInstances()->select(r|r.uid ='" + uid + "'); return r;";

		Collection<Component> map = (Collection<Component>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public ModelMapper getModelMapper(String uid) throws Exception {

		String query = "var r = recipe::ModelMapper.allInstances()->select(r|r.uid ='" + uid + "'); return r;";

		Collection<ModelMapper> map = (Collection<ModelMapper>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public Collection<Recipe> getRecipes(Object obj) throws Exception {
		String query = "var r = recipe::Recipe.allInstances(); return r;";

		Collection<Recipe> map = (Collection<Recipe>) internalEvaluate(query);
		return map;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfiguration(Infrastructure infra) throws Exception {
		String query = "var r = recipe::Infrastructure2Configuration.allInstances()->select(r|r.source.uid ='"
				+ infra.getUid() + "'); return r;";

		Collection<Infrastructure2Configuration> map = (Collection<Infrastructure2Configuration>) internalEvaluate(
				query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getTarget();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfiguration(String uid) throws Exception {
		String query = "var r = recipe::Infrastructure2Configuration.allInstances()->select(r|r.source.uid ='" + uid
				+ "'); return r;";

		Collection<Infrastructure2Configuration> map = (Collection<Infrastructure2Configuration>) internalEvaluate(
				query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getTarget();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfigExtensionUp(Configuration config) throws Exception {

		if (getConfigExtensionGard(config)) {
			throw new Exception("Configuration cannot be sources for more then 1 configuration tree");
		}

		String query = "var r = recipe::ConfigExtension.allInstances()->select(r|r.source.uid ='" + config.getUid()
				+ "'); return r;";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getTarget();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfigExtensionDown(Configuration config) throws Exception {

		if (getConfigExtensionGard(config)) {
			return null;
		}

		String query = "var r =  recipe::ConfigExtension.allInstances()->select(r|r.target.uid ='" + config.getUid()
				+ "'); return r;";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getSource();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public boolean getConfigExtensionGard(Configuration config) throws Exception {

		String query = "var r =recipe::ConfigExtension.allInstances()->select(r|r.source.uid='" + config.getUid()
				+ "'); return r;";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(query);
		if ((map != null) && (map.size() > 1)) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public Infrastructure findInfrastructure(Configuration config) throws Exception {

		String query = "var r =recipe::Infrastructure2Configuration.allInstances()->select(r|r.target.uid='"
				+ config.getUid() + "'); return  r;";

		Collection<Infrastructure2Configuration> map = (Collection<Infrastructure2Configuration>) internalEvaluate(
				query);
		if ((map != null) && (map.size() != 0)) {
			Object obj = map.iterator().next().getSource();
			if (obj instanceof Infrastructure) {
				return (Infrastructure) obj;
			} else {
				return null;
			}
		} else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Recipe findRecipe(Infrastructure infra) throws Exception {

		String query = "var r =recipe::Recipe2Infrastructure.allInstances()->select(r|r.target.uid='" + infra.getUid()
				+ "'); return r;";

		Collection<Recipe2Infrastructure> map = (Collection<Recipe2Infrastructure>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0)) {
			Recipe recipe = ((Recipe2Infrastructure) (map.iterator().next())).getSource();
			return recipe;
		} else
			return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> getControlsList(Form frm) throws Exception {

		ArrayList ls = new ArrayList();

		TreeRootDataControlHolder th = new TreeRootDataControlHolder();
		th.getControls().addAll(findTreeRootControls(frm));
		ls.add(th);

		DataControlHolder dh = new DataControlHolder();
		dh.getControls().addAll(findMasterControls(frm));
		dh.getControls().addAll(findDetailAndDependencyControls(frm));
		ls.add(dh);

		return ls;

	}

	@SuppressWarnings("unchecked")
	public Object getDomainApplications(Object root) throws Exception {
		String query = "var r = domain::DomainApplications.allInstances(); return r;";

		Collection<DomainApplications> map = (Collection<DomainApplications>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0)) {
			DomainApplications domainApplications = ((DomainApplications) (map.iterator().next()));
			return domainApplications;
		} else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Collection<TreeDataControl> findTreeRootControls(Form frm) throws Exception {

		Controls controls = frm.getDatacontrols();
		HashMap<String, Object> var = new HashMap<>();
		var.put("controls", controls);
		
		String query = "var r = controls.relations->select(r|r.isTree=true)->collect(w|w.master)->reject(q|controls.relations->select(r|r.isTree=true)->collect(w|w.detail)->includes(q)); return r;";

		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(frm,query,var);

		// Remove duplication
		HashMap<String, DataControl> hash = new HashMap<>();
		for (DataControl dc : map) {
			hash.put(dc.getUid(), dc);
		}

		query = "var r =controls.relations->select(r|r.isTree=true and r.master=r.detail )->collect(w|w.master)->reject(q|controls.relations->select(r|r.isTree=true and r.master <> r.detail )->collect(w|w.detail)->includes(q)); return r;";

		Collection<DataControl> map1 = (Collection<DataControl>) internalEvaluate(frm,query,var);

		ArrayList<TreeDataControl> ls = new ArrayList<>();
		for (DataControl dc : hash.values()) {
			ls.add(new TreeDataControl(dc));
		}
		for (DataControl dc : map1) {
			ls.add(new TreeDataControl(dc));
		}

		return ls;

	}

	@SuppressWarnings("unchecked")
	public Collection<DataControl> findMasterControls(Form frm) throws Exception {

		String query = "var r =form::DataControl.allInstances()->select(r|r.eContainer().uid= '"
				+ frm.getDatacontrols().getUid()
				+ "')->reject(q|form::Relation.allInstances()->select(r|r.eContainer().uid= '"
				+ frm.getDatacontrols().getUid() + "' )->collect(w|w.detail)->includes(q)); return r; ";

		Collection<DataControl> map = ((Collection<DataControl>) internalEvaluate(query));

		for (TreeDataControl obj : findTreeRootControls(frm)) {
			map.remove(obj.getDc());
		}

		return map;

	}

	@SuppressWarnings("unchecked")
	public Collection<DataControl> findDetailAndDependencyControls(Form frm) throws Exception {

		String query = "var r = form::Relation.allInstances()->select(r|r.isTree=false and r.eContainer().uid = '"
				+ frm.getDatacontrols().getUid() + "')->collect(w|w.detail); return r;";

		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(query);

		for (TreeDataControl obj : findTreeRootControls(frm)) {
			map.remove(obj.getDc());
		}

		return map;

	}

	@SuppressWarnings("unchecked")
	public Object[] findMappingTechnologies(ModelMapper eObject, Object obj) throws Exception {

		Object[] result = new Object[2];

		Collection<MappingTecnologiy> map = eObject.getTechnologies();
		String query = "var r =artifact::Artifact.allInstances()->select(r|r.uid='" + eObject.getArtifactRef().getUid()
				+ "').first().technologies; return  r;";

		Collection<Technology> map1 = (Collection<Technology>) internalEvaluate(query);

		ArrayList<MappingTecnologiy> removeSpecifiers = new ArrayList<MappingTecnologiy>();
		for (MappingTecnologiy ms : map) {
			boolean isRemove = true;
			for (Technology sp : map1) {
				if ((ms.getTechRef() != null) && (sp.getUid().equals(ms.getTechRef().getUid())))
					isRemove = false;
			}
			if (isRemove) {
				removeSpecifiers.add(ms);
			}
		}

		ArrayList<Technology> addSpecifiers = new ArrayList<Technology>();
		for (Technology ms : map1) {
			boolean isAdd = false;
			if (map.size() == 0) {
				isAdd = true;
			} else {
				isAdd = true;
				for (MappingTecnologiy sp : map) {
					if ((sp.getTechRef() != null) && (sp.getTechRef().getUid().equals(ms.getUid())))
						isAdd = false;
				}
			}
			if (isAdd)
				addSpecifiers.add(ms);
		}

		result[0] = addSpecifiers;
		result[1] = removeSpecifiers;
		return result;
	}

	public Object[] findMappingVariable(org.tura.model.designer.repository.serialized.recipe.Query eObject, Object obj)
			throws Exception {

		ArrayList<QueryParameter> addVariables = new ArrayList<QueryParameter>();
		ArrayList<QueryVariable> removeVariables = new ArrayList<QueryVariable>();

		if (eObject.getQueryRef() != null) {

			Collection<QueryParameter> map1 = eObject.getQueryRef().getParameters();
			Collection<QueryVariable> map = eObject.getVariables();

			for (QueryVariable ms : map) {
				boolean isRemove = true;
				for (QueryParameter sp : map1) {
					if ((ms.getQueryParamRef() != null) && (sp.getUid().equals(ms.getQueryParamRef().getUid()))) {
						isRemove = false;
					}
				}
				if (isRemove) {
					removeVariables.add(ms);
				}
			}

			for (QueryVariable ms : map) {
				boolean isRemove = true;
				for (QueryParameter sp : map1) {
					if ((ms.getQueryParamRef() != null) && (sp.getUid().equals(ms.getQueryParamRef().getUid()))) {
						isRemove = false;
					}
				}
				if (isRemove) {
					removeVariables.add(ms);
				}
			}

			for (QueryParameter ms : map1) {
				boolean isAdd = false;
				if (map.size() == 0) {
					isAdd = true;
				} else {
					isAdd = true;
					for (QueryVariable sp : map) {
						if ((sp.getQueryParamRef() != null) && (sp.getQueryParamRef().getUid().equals(ms.getUid()))) {
							isAdd = false;
						}
					}
				}
				if (isAdd) {
					addVariables.add(ms);
				}
			}
		}
		Object[] result = new Object[2];
		result[0] = addVariables;
		result[1] = removeVariables;
		return result;
	}

	@SuppressWarnings("unchecked")
	public DomainTypes getTypesRepository(Object obj) throws Exception {

		Collection<DomainTypes> map = (Collection<DomainTypes>) internalEvaluate(
				"var r  =  domain::DomainTypes.allInstances();  return  r;");

		if ((map != null) && (map.size() != 0)) {
			DomainTypes domainTypes = ((DomainTypes) (map.iterator().next()));
			return domainTypes;
		} else
			return null;
	}

	public MappersRoot getMappers(Object obj) throws Exception {

		Ingredient ingredient = (Ingredient) Util.getContainer(obj);
		Recipe recipe = (Recipe) Util.getContainer(ingredient);

		MappersRoot root = new MappersRoot();

		root.getChildren().addAll(recipe.getMappers());
		root.getChildren().addAll(ingredient.getMappers());

		return root;
	}

	@SuppressWarnings("unchecked")
	private TypeElement findModelType(Object context, String typeRepositoryName, String packageName, String typeName)
			throws Exception {

		String query = "var r =domain::DomainTypes.allInstances().first().typesRepository->select(r|r.name='"
				+ typeRepositoryName + "').first().repositoryPackages->select(p|p.name='" + packageName
				+ "').first().types->select(t|t.name='" + typeName + "'); return r;";

		Collection<TypeElement> map = (Collection<TypeElement>) internalEvaluate(query);

		if ((map != null) && (map.size() != 0)) {
			TypeElement type = ((TypeElement) (map.iterator().next()));
			return type;
		} else
			return null;

	}

	@SuppressWarnings("unchecked")
	private Primitive findPrimitive(Object context, String typeName) throws Exception {
		String query = "var r =domain::Domain.allInstances();  return r;";
		Collection<Domain> map = (Collection<Domain>) internalEvaluate(query);
		if ((map != null) && (map.size() != 0)) {
			query = "var r =type::Primitive.allInstances()->select(r|r.name='" + typeName + "'); return r;";

			Collection<Primitive> map1 = (Collection<Primitive>) internalEvaluate(query);
			if ((map1 != null) && (map1.size() != 0)) {
				Primitive type = ((Primitive) (map1.iterator().next()));
				return type;
			} else
				return null;
		} else
			return null;

	}

	public TypeElement findMessageType(Object obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, MESSAGE_TYPE);
	}

	public TypeElement findStyleType(Object obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, STYLE_TYPE);
	}

	public TypeElement findRoleType(Object obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, ROLE_TYPE);
	}

	public TypeElement findGroupType(Object obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, GROUP_TYPE);
	}

	public TypeElement findIconType(Object obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, ICON_TYPE);
	}

	@SuppressWarnings("unchecked")
	public DomainArtifacts getDomainArtifact(Object obj) throws Exception {

		Collection<DomainArtifacts> map = (Collection<DomainArtifacts>) internalEvaluate(
				"var r =  domain::DomainArtifacts.allInstances(); return r;");

		if (map != null && map.size() != 0) {
			return (DomainArtifacts) map.toArray()[0];
		}
		return null;

	}

	@SuppressWarnings("unchecked")
	public void getInheritTypes(List<Type> typesTree, Type type) {
		try {

			String query = "var r =type::Generalization.allInstances()->select(r|r.target.isKindOf(type::Type) and "
					+ "r.target.uid ='" + type.getUid() + "'); return  r;";

			Collection<Generalization> map = (Collection<Generalization>) internalEvaluate(query);

			query = "var r = type::Generalization.allInstances()->select(r|r.target.isKindOf(type::TypeReference)"
					+ " and r.target.typeRef.uid= '" + type.getUid() + "'); return  r;";

			Collection<Generalization> map1 = (Collection<Generalization>) internalEvaluate(query);

			HashMap<String, TypeElement> joinmap = new HashMap<String, TypeElement>();

			if (map != null) {
				for (Iterator<Generalization> itr = map.iterator(); itr.hasNext();) {
					TypeElement el = itr.next().getSource();
					joinmap.put(el.getUid(), el);
				}
			}

			if (map1 != null) {
				for (Iterator<Generalization> itr = map1.iterator(); itr.hasNext();) {
					TypeElement el = itr.next().getSource();
					joinmap.put(el.getUid(), el);
				}
			}

			for (TypeElement t : joinmap.values()) {
				typesTree.add((Type) t);
				getInheritTypes(typesTree, (Type) t);
			}

		} catch (Exception e) {
			LogUtil.log(e);
		}

	}

	public TypeElement findNullType(Object obj) {
		try {
			return findPrimitive(obj, "Null");
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findSearchCriteriaType(Object obj) {
		throw new RuntimeException();
	}

	public TypeElement findStringType(Object obj) {
		throw new RuntimeException();
	}

	public TypeElement findIntegerType(Object obj) {
		throw new RuntimeException();
	}

	public TypeElement findBooleanType(Object obj) {
		try {
			return findPrimitive(obj, "Boolean");
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public TypeElement findBaseType(Object obj) {
		try {
			return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, BASE_TYPE);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findAnyObjectType(Object obj) {
		try {
			return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, ANY_TYPE);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findDataControlType(Object obj) {
		try {
			return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, DATA_CONTROL);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findGenerationHintType(Object obj) {
		try {
			return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, GENERATION_HINT_TYPE);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findTreeDataControlType(Object obj) {
		try {
			return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, TREE_DATA_CONTROL);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<NickNamed> collectRefreshedAeas(Views views) throws Exception {

		Object[] array = (Object[]) findRefreshedAeas(views, views);
		return (List<NickNamed>) array[0];
	}

	public Object[] findRefreshedAeas(MenuItem obj) throws Exception {

		Object root = obj;
		do {
			root = Util.getContainer(obj);
			if (root == null) {
				throw new Exception("UI element container is null");
			}
		} while (!(root instanceof MenuDefinition));

		Views views = (Views) Util.getContainer(root);
		return findRefreshedAeas(views, obj);

	}

	public Object[] findRefreshedAeas(Window obj) throws Exception {

		Object root = obj;
		Views views = (Views) Util.getContainer(root);

		return findRefreshedAeas(views, obj);

	}

	public Object[] findRefreshedAeas(Uielement obj) throws Exception {

		Object root = obj;
		do {
			root = Util.getContainer(obj);
			if (root == null) {
				throw new Exception("UI element container is null");
			}
		} while (!(root instanceof ViewArea));

		Views views = (Views) Util.getContainer(Util.getContainer(root));

		return findRefreshedAeas(views, obj);

	}

	@SuppressWarnings("unchecked")
	public Object[] findRefreshedAeas(Views views, Object obj) throws Exception {
		try {
			
			String query = "var r =views.canvases->select(c|c.isKindOf(form::ViewPortHolder))->collect(v|v.viewElement).flatten()->select(q|q.isKindOf(form::ViewArea)); return r;";

			HashMap<String, Object> var = new HashMap<>();
			var.put("views", views);
			Collection<ViewArea> map = (Collection<ViewArea>) internalEvaluate(views,query,var);

			query = "var r = views.canvases->select(c|c.isKindOf(form::ViewPortHolder))->collect(v|v.viewElement).flatten()->"
					+ "select(q|q.isKindOf(form::NickNamed) and q.nickname <> null and q.nickname <> ''); return r;";

			Collection<NickNamed> map1 = (Collection<NickNamed>) internalEvaluate(views,query,var);

			ArrayList<NickNamed> nickNamed = new ArrayList<NickNamed>();
			ArrayList<AreaRef> remove = new ArrayList<AreaRef>();

			if (map.size() != 0) {
				for (ViewArea viewarea : map) {
					if (viewarea.getBaseCanvas() != null) {
						findNick(nickNamed, viewarea.getBaseCanvas(), obj);
					}
				}
			}
			nickNamed.addAll(map1);

			List<AreaRef> list = new ArrayList<>();
			if (obj instanceof Uielement) {
				list = ((Uielement) obj).getRefreshAreas();
			}

			if (obj instanceof MenuItem) {
				list = ((MenuItem) obj).getRefreshAreas();
			}
			for (AreaRef ref : list) {
				if (ref.getArea() == null) {
					remove.add(ref);
				}
			}
			return new Object[] { nickNamed, remove };

		} catch (Exception e) {
			LogUtil.log(e);
			return new Object[] { null, null };
		}

	}

	private void findNick(List<NickNamed> list, LayerHolder holder, Object exception) {

		String uuid = null;
		if (exception instanceof Uielement) {
			uuid = ((Uielement) exception).getUid();
		}

		if (exception instanceof MenuItem) {
			uuid = ((MenuItem) exception).getUid();
		}

		if (holder.getNickname() != null && !"".equals(holder.getNickname())) {
			if (exception != null && uuid != holder.getUid())
				list.add(holder);
			if (exception == null)
				list.add(holder);
		}

		for (Uielement el : holder.getChildren()) {
			if (el instanceof LayerHolder) {
				findNick(list, (LayerHolder) el, exception);
				continue;
			}

			if (el.getNickname() != null && !"".equals(el.getNickname())) {
				if (exception != null && uuid != el.getUid())
					list.add(el);
				if (exception == null)
					list.add(el);
			}
		}
	}

	private void findUIElement(List<Uielement> list, LayerHolder holder) {
		list.add(holder);

		for (Iterator<Uielement> itr = holder.getChildren().iterator(); itr.hasNext();) {

			Uielement el = itr.next();

			if (el instanceof DataScroller) {
				DataScroller scroller = (DataScroller) el;
				for (Uielement uel : scroller.getChildren()) {
					if (uel instanceof LayerHolder) {
						findUIElement(list, (LayerHolder) uel);
						continue;
					} else {
						list.add(uel);
					}
				}
			}

			if (el instanceof LayerHolder) {
				findUIElement(list, (LayerHolder) el);
				continue;
			} else {
				list.add(el);
			}

		}
	}

	public List<MenuFolder> findMenus(Form frm) {

		ApplicationUILayer app = (ApplicationUILayer) Util.getContainer(Util.getContainer(frm));

		try {

			String query = "var r = application::ApplicationUILayer.allInstances()->select(q|q.uid='" + app.getUid()
					+ "').first().applicationUIPackages->collect(w|w.forms)->collect(f|f.view.menus).flatten()->collect(fl|fl.menuFolders).flatten()->select(mf|mf.isKindOf(form::MenuFolder))"
					+ ".excludingAll(application::ApplicationUILayer.allInstances()->select(q|q.uid='" + app.getUid()
					+ "').first().applicationUIPackages->collect(w|w.forms)->collect(f|f.view.menus).flatten()->collect(fl|fl.toSubMenu).flatten()->collect(mf|mf.target)); return r;";

			@SuppressWarnings("unchecked")
			Collection<MenuFolder> map = (Collection<MenuFolder>) internalEvaluate(query);

			ArrayList<MenuFolder> list = new ArrayList<MenuFolder>();

			if (map.size() != 0) {
				for (MenuFolder point : map) {
					if (point.getName() != null && !point.getName().trim().equals(""))
						list.add(point);
				}
			}
			return list;

		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<MenuFolder>();
		}

	}

	public List<MenuFolder> findExtensionPoints(MenuExtensionRef ref) {

		Views views = (Views) Util.getContainer(Util.getContainer(Util.getContainer(ref)));
		Form frm = (Form) Util.getContainer(views);
		ApplicationUILayer app = (ApplicationUILayer) Util.getContainer(Util.getContainer(frm));

		String query = "var r = application::ApplicationUILayer.allInstances()->select(q|q.uid='" + app.getUid()
				+ "').first().applicationUIPackages->collect(w|w.forms)->collect(f|f.view.menus).flatten()->collect(fl|fl.menuFolders).flatten()->select(mf|mf.extensionPoint);  return r;";

		try {

			@SuppressWarnings("unchecked")
			Collection<MenuFolder> map = (Collection<MenuFolder>) internalEvaluate(query);

			ArrayList<MenuFolder> list = new ArrayList<MenuFolder>();

			if (map.size() != 0) {
				for (MenuFolder point : map) {
					if (point.getName() != null && !point.getName().trim().equals(""))
						list.add(point);
				}
			}
			return list;
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<MenuFolder>();
		}

	}

	public List<Uielement> findUIElementsForPage(CanvasFrame canvasFrame) {

		try {

			String query = "var r = canvasFrame.viewElement->select(q|q.isKindOf(form::ViewArea)); return  r;";

			HashMap<String, Object> var = new HashMap<>();
			var.put("canvasFrame", canvasFrame);
			
			
			@SuppressWarnings("unchecked")
			Collection<ViewArea> map = (Collection<ViewArea>) internalEvaluate(canvasFrame,query,var);

			ArrayList<Uielement> list = new ArrayList<Uielement>();

			if (map.size() != 0) {
				for (ViewArea viewarea : map) {
					if (viewarea.getBaseCanvas() != null)
						findUIElement(list, viewarea.getBaseCanvas());
				}
			}
			return list;
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<Uielement>();
		}

	}

	public Collection<Generalization> getTypeExtension(Type type) {
		try {

			TypeGroup pkg = (TypeGroup) ((TypeProxy) type).eContainer();
			String query = "var r = pkg.relationships->select(r|r.isTypeOf(type::Generalization) and  r.source.uid ='"
					+ type.getUid() + "'); return r;";
			
			HashMap<String, Object> var = new HashMap<>();
			var.put("pkg", pkg);

			@SuppressWarnings("unchecked")
			Collection<Generalization> list = (Collection<Generalization>) internalEvaluate(type, query,var);

			return list;
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<Generalization>();
		}

	}

	@SuppressWarnings({ "unchecked" })
	public Assosiation getAssosiation(Type typeMaster, Type typeDetail) {
		try {

			String query = "var r = type::Assosiation.allInstances()->select(r|r.source.uid ='" + typeMaster.getUid()
					+ "' and  r.target.uid ='" + typeDetail.getUid() + "'); return r;";

			Collection<Assosiation> list1 = (Collection<Assosiation>) internalEvaluate(query);
			if (list1.iterator().hasNext()) {
				return list1.iterator().next();
			} else {
				return null;
			}
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	@SuppressWarnings({ "unchecked" })
	public Collection<Assosiation>[] getAssosiation(Type type) {
		try {

			String query = "var r =type::Assosiation.allInstances()->select(r|r.source.uid ='" + type.getUid()
					+ "' and (  r.containment = type::Containment#Non or r.containment  = type::Containment#Source )); return r;";

			Collection<Assosiation> list1 = (Collection<Assosiation>) internalEvaluate(type, query);

			query = "var r = type::Assosiation.allInstances()->select(r|r.target.uid ='" + type.getUid()
					+ "' and (  r.containment = type::Containment#Non or r.containment  = type::Containment#Target )); return r;";

			Collection<Assosiation> list2 = (Collection<Assosiation>) internalEvaluate(type, query);

			return new Collection[] { list1, list2 };
		} catch (Exception e) {
			LogUtil.log(e);
			return new Collection[] { new ArrayList<Assosiation>(), new ArrayList<Assosiation>() };
		}

	}

	public TechLeaf findTech(Object obj, int level, String... hints) {
		try {
			if (hints.length == 0)
				return null;

			if (level == hints.length) {
				return (TechLeaf) obj;
			}

			String query = null;
			if (level == 0) {
				query = "var r =  domain::DomainArtifacts.allInstances().first().techLeafs->select(q|q.name='"
						+ hints[level] + "'); return r;";
			} else {
				query = "var r = artifact::TechLeaf.allInstances()->select(q|q.uid='" + ((TechLeaf) obj).getUid()
						+ "').first().techLeafs->select(q|q.name='" + hints[level] + "'); return r;";
			}

			@SuppressWarnings("unchecked")
			Collection<Object> list = (Collection<Object>) internalEvaluate(query);
			if (list == null || list.size() == 0) {
				return null;
			}
			if (level == hints.length - 1) {
				TechLeaf leaf = (TechLeaf) list.iterator().next();
				return leaf;
			}

			for (Iterator<Object> itr = list.iterator(); itr.hasNext();) {
				Object obj1 = itr.next();
				TechLeaf leaf = findTech(obj1, ++level, hints);
				if (leaf != null) {
					return leaf;
				}
			}
			return null;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	private String findHint(Object obj, int level, String... hints) {
		try {
			if (hints.length == 0)
				return null;

			if (level == hints.length) {
				return ((TechLeaf) obj).getUid();
			}

			String query = null;
			if (level == 0) {
				query = "var r = domain::DomainArtifacts.allInstances().first().techLeafs->select(q|q.name='"
						+ hints[level] + "');  return r;";
			} else {
				if (level == hints.length - 1) {
					query = "var r = artifact::TechLeaf.allInstances()->select(q|q.uid='" + ((TechLeaf) obj).getUid()
							+ "').first().hints->select(q|q.name='" + hints[level] + "'); return r;";
				} else {
					query = "var r = artifact::TechLeaf.allInstances()->select(q|q.uid='" + ((TechLeaf) obj).getUid()
							+ "').first().techLeafs->select(q|q.name='" + hints[level] + "'); return  r;";
				}
			}

			@SuppressWarnings("unchecked")
			Collection<Object> list = (Collection<Object>) internalEvaluate(query);
			if (list == null || list.size() == 0) {
				return null;
			}
			if (level == hints.length - 1) {
				GenerationHint hint = (GenerationHint) list.iterator().next();
				return hint.getUid();
			}

			for (Iterator<Object> itr = list.iterator(); itr.hasNext();) {
				Object obj1 = itr.next();
				String hint = findHint(obj1, ++level, hints);
				if (hint != null) {
					return hint;
				}
			}
			return null;

		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Type> queryTypesByHint(Object obj, String key) {
		String[] hints = hintHelper.get(key);
		String hint = findHint((Object) obj, 0, hints);
		if (hint == null) {
			return new ArrayList<Type>();
		}
		try {
			String query = "var r = type::Type.allInstances()->select(r|r.classifiers->select(c|c.hint.uid='" + hint
					+ "')->size()>0); return r;";
			Collection<Object> list = (Collection<Object>) internalEvaluate(query);
			if (list == null || list.size() == 0) {
				return null;
			}
			ArrayList<Type> array = new ArrayList<Type>();
			for (Object o : list) {
				array.add((Type) o);
			}

			return array;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public DataControl findDataControlForRelation(DataControl dataControl) {
		try {
			String query = "var r = form::DataControl.allInstances()->select(r|r.relationMappers.size()<>0 and r.relationMappers ->select(q|q.dataControlRef<>null  and q.dataControlRef.uid='"
					+ dataControl.getUid() + "').size()<>0 ); return r;";

			Collection<Object> list = (Collection<Object>) internalEvaluate(query);
			if (list == null || list.size() == 0) {
				return null;
			}

			return (DataControl) list.iterator().next();
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}
	}

	public List<MappingLayer> findApplicationLayers(Object object) {
		if (object instanceof ApplicationMappers) {
			ApplicationMappers appMappers = (ApplicationMappers) object;
			return appMappers.getAppLayers();
		}
		if (object instanceof Application) {
			Application app = (Application) object;
			return app.getApplicationMappers().getAppLayers();
		}

		Object container = Util.getContainer(object);
		if (container == null) {
			return new ArrayList<MappingLayer>();
		}
		return findApplicationLayers(container);
	}

	@SuppressWarnings("unchecked")
	public List<Relation> findRelation(DataControl dataControl) throws Exception {
		String query = "var r = form::Relation.allInstances()->select(r|r.master.uid ='" + dataControl.getUid()
				+ "'); return r;";
		Collection<Relation> list1 = (Collection<Relation>) internalEvaluate(query);

		query = "var r = form::Relation.allInstances()->select(r|r.detail.uid ='" + dataControl.getUid()
				+ "'  and r.detail.uid <> r.master.uid );  return r;";
		Collection<Relation> list2 = (Collection<Relation>) internalEvaluate(query);

		ArrayList<Relation> relations = new ArrayList<Relation>();
		relations.addAll(list1);
		relations.addAll(list2);

		return relations;
	}

	@SuppressWarnings("unchecked")
	public List<OperationConnector> findOperationConnectorByTarget(AttributeConnector attributeConnector) {
		ObjectMapper mp = (ObjectMapper) Util.getContainer(attributeConnector.getTarget());

		try {
			String query = "var r = objectmapper::OperationConnector.allInstances()->select(r|r.target.uid ='"
					+ mp.getUid() + "'); return r;";
			Collection<OperationConnector> list1 = (Collection<OperationConnector>) internalEvaluate(query);

			ArrayList<OperationConnector> relations = new ArrayList<OperationConnector>();
			relations.addAll(list1);

			return relations;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	public List<OperationConnector> findOperationConnectorByTarget(OperationConnector operationConnector) {
		ObjectMapper mp = (ObjectMapper) operationConnector.getTarget();

		try {
			ArrayList<OperationConnector> relations = new ArrayList<OperationConnector>();

			relations.addAll(findOperationConnectorByTarget(mp));
			relations.remove(operationConnector);

			return relations;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<OperationConnector> findOperationConnectorByTarget(ObjectMapper mp) {

		try {
			String query = "var r = objectmapper::OmRelation.allInstances()->select(r|r.objectMapperRef <> null and r.objectMapperRef.uid ='"
					+ mp.getUid() + "');  return r;";
			Collection<OmRelation> list1 = (Collection<OmRelation>) internalEvaluate(query);
			ArrayList<OperationConnector> relations = new ArrayList<OperationConnector>();
			if (list1.size() != 0) {
				OmRelation or = list1.iterator().next();
				relations.addAll(findOperationConnectorByTarget((ObjectMapper) Util.getContainer(or)));
			}
			query = "var r = objectmapper::OperationConnector.allInstances()->select(r|r.target.uid ='" + mp.getUid()
					+ "');  return r;";
			Collection<OperationConnector> list2 = (Collection<OperationConnector>) internalEvaluate(query);
			relations.addAll(list2);
			return relations;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	public List<OmRelation> getOmRelation(ObjectMapperGroup group) {
		List<OmRelation> array = new ArrayList<>();
		for (ObjectMapper mp : group.getObjectMappers()) {
			array.addAll(mp.getRelations());
		}
		return array;

	}

	public List<ProcessingStage> getProcessingStage2ProcessingStageRelationship(ObjectMapperGroup group) {
		List<ProcessingStage> array = new ArrayList<>();
		for (ProcessingStage ps : group.getStages()) {
			if (ps.getNextStage() != null) {
				array.add(ps);
			}
		}
		return array;
	}

	public List<ObjectMapper> getProcessingStage2ObjectMapperRelationship(ObjectMapperGroup group) {
		List<ObjectMapper> array = new ArrayList<>();
		for (ObjectMapper ps : group.getObjectMappers()) {
			if (ps.getStage() != null) {
				array.add(ps);
			}
		}
		return array;
	}

	public List<Attribute> getAttributesForType(Type type) {
		List<Attribute> attrs = new ArrayList<>();

		Collection<Generalization> ls = new QueryHelper(model).getTypeExtension(type);

		if (ls.size() != 0) {
			for (Generalization ext : ls) {
				TypeElement typeElement = ext.getTarget();
				if (typeElement instanceof Type)
					attrs.addAll(getAttributesForType((Type) typeElement));

				if (typeElement instanceof TypeReference)
					attrs.addAll(getAttributesForType((Type) ((TypeReference) typeElement).getTypeRef()));
			}
		}
		attrs.addAll(type.getAttributes());
		return attrs;
	}

	public Object executeQuery(String strQuery) throws Exception {
		return internalEvaluate(strQuery);
	}

}
