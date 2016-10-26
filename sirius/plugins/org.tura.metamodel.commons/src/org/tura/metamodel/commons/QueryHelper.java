package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;

import application.Application;
import application.ApplicationUILayer;
import artifact.GenerationHint;
import artifact.QueryParameter;
import artifact.TechLeaf;
import artifact.Technology;
import domain.Domain;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainTypes;
import form.AreaRef;
import form.CanvasFrame;
import form.ContextParameter;
import form.ContextParameters;
import form.ContextValue;
import form.Controls;
import form.DataControl;
import form.Form;
import form.FormFactory;
import form.FormPackage;
import form.LayerHolder;
import form.MenuDefinition;
import form.MenuExtensionRef;
import form.MenuFolder;
import form.MenuItem;
import form.NickNamed;
import form.Uielement;
import form.ViewArea;
import form.Views;
import recipe.ConfigExtension;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.Infrastructure2Configuration;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.QueryVariable;
import recipe.Recipe;
import recipe.Recipe2Infrastructure;
import recipe.impl.Infrastructure2ConfigurationImpl;
import type.Generalization;
import type.Operation;
import type.Parameter;
import type.Primitive;
import type.PrimitivesGroup;
import type.Type;
import type.TypeElement;
import type.TypePackage;

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

	private HintHelper hintHelper = new HintHelper();

	/** The OCL object. */
	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;

	/** The OCL helper. */
	private OCLHelper<EClassifier, ?, ?, Constraint> helper;

	public OCLHelper<EClassifier, ?, ?, Constraint> getOCLHelper() {
		if (helper == null) {
			helper = getOCL().createOCLHelper();
		}
		return helper;
	}

	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> getOCL() {
		if (ocl == null) {
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		}
		return ocl;
	}

	private Object internalEvaluate(final EObject context, final String expression) throws ParserException {
		getOCLHelper().setContext(context.eClass());

		final OCLExpression<EClassifier> query = getOCLHelper().createQuery(expression);
		final Query<EClassifier, EClass, EObject> eval = getOCL().createQuery(query);

		return eval.evaluate(context);

	}

	private Object internalEvaluate(final EObject context, final EClass eclass, final String expression)
			throws ParserException {
		getOCLHelper().setContext(eclass);

		final OCLExpression<EClassifier> query = getOCLHelper().createQuery(expression);
		final Query<EClassifier, EClass, EObject> eval = getOCL().createQuery(query);

		return eval.evaluate(context);

	}

	public Object getApplicationRoles(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationRole() != null) {
			return app.getApplicationRole();
		}
		return null;
	}

	//
	public Object getMessages(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationMessages() != null) {
			return app.getApplicationMessages().getMessageLibraries();
		}
		return null;
	}

	//
	public Object getApplicationStyle(DiagramImpl root) {
		Form frm = getForm(root);

		Application app = ((Application) (frm.eContainer().eContainer().eContainer()));
		if (app.getApplicationStyle() != null) {
			return app.getApplicationStyle();
		}
		return null;
	}

	public Form getForm(DataControl dc) {
		return (Form) dc.eContainer().eContainer();
	}

	public Form getForm(DiagramImpl root) {
		Form frm = null;

		DSemanticDecorator element = (DSemanticDecorator) root.getElement();
		EObject obj = element.getTarget();

		if (obj instanceof Views) {
			frm = (Form) ((Views) obj).eContainer();
		}

		if (obj instanceof ViewArea) {
			frm = (Form) ((ViewArea) obj).eContainer().eContainer().eContainer();
		}

		if (obj instanceof Controls) {
			frm = (Form) ((Controls) obj).eContainer();
		}

		if (obj instanceof MenuDefinition) {
			Views views = (Views) (((MenuDefinition) obj).eContainer());
			frm = (Form) views.eContainer();
		}
		//
		// if (root.getElement() instanceof domain.CanvasView) {
		//
		// domain.Views views = (Views) (((domain.CanvasView) root
		// .getElement()).getParent().eContainer().eContainer());
		//
		// frm = (domain.Form) (views.getParent().eContainer());
		//
		// }
		//
		// if (root.getElement() instanceof domain.Views) {
		// domain.Views views = (Views) root.getElement();
		// frm = (domain.Form) (views.getParent().eContainer());
		// }

		return frm;
	}

	@SuppressWarnings({ "unchecked" })
	public void getTreeLeafs(List<Object> ls, DataControl root) throws Exception {
		String query = "form::Relation.allInstances()->select(r|r.isTree=true and r.master.uid ='" + root.getUid()
				+ "')->collect(r|r.detail)";

		ls.add(root);
		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(root, query);

		for (DataControl dc : map) {
			if (!ls.contains(dc)) {
				getTreeLeafs(ls, dc);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Recipe getRecipe(Infrastructure infra) throws Exception {
		String query = "recipe::Recipe2Infrastructure.allInstances()->select(r|r.target.uid ='" + infra.getUid() + "')";

		Collection<Recipe2Infrastructure> map = (Collection<Recipe2Infrastructure>) internalEvaluate(infra, query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getSource();
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfiguration(Infrastructure infra) throws Exception {
		String query = "recipe::Infrastructure2Configuration.allInstances()->select(r|r.source.uid ='" + infra.getUid()
				+ "')";

		Collection<Infrastructure2Configuration> map = (Collection<Infrastructure2Configuration>) internalEvaluate(
				infra, query);
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

		String query = "recipe::ConfigExtension.allInstances()->select(r|r.source.uid ='" + config.getUid() + "')";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(config, query);
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

		String query = "recipe::ConfigExtension.allInstances()->select(r|r.target.uid ='" + config.getUid() + "')";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(config, query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getSource();
		else
			return null;

	}

	@SuppressWarnings("unchecked")
	public boolean getConfigExtensionGard(Configuration config) throws Exception {

		String query = "recipe::ConfigExtension.allInstances()->select(r|r.source.uid='" + config.getUid() + "')";

		Collection<ConfigExtension> map = (Collection<ConfigExtension>) internalEvaluate(config, query);
		if ((map != null) && (map.size() > 1)) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public Infrastructure findInfrastructure(Configuration config) throws Exception {

		String query = "recipe::Infrastructure2Configuration.allInstances()->select(r|r.target.uid='" + config.getUid()
				+ "')";

		Collection<Infrastructure2ConfigurationImpl> map = (Collection<Infrastructure2ConfigurationImpl>) internalEvaluate(
				config, query);
		if ((map != null) && (map.size() != 0)) {
			EObject obj = map.iterator().next().getSource();
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

		String query = "recipe::Recipe2Infrastructure.allInstances()->select(r|r.target.uid='" + infra.getUid() + "')";

		Collection<Recipe2Infrastructure> map = (Collection<Recipe2Infrastructure>) internalEvaluate(infra, query);
		if ((map != null) && (map.size() != 0)) {
			Recipe recipe = ((Recipe2Infrastructure) (map.iterator().next())).getSource();
			return recipe;
		} else
			return null;
	}

	public List<?> getControlsList(DiagramImpl root) throws Exception {

		Form frm = getForm(root);
		return getControlsList(frm);
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

	public Object getRootControl(DiagramImpl root) throws Exception {
		Form frm = getForm(root);
		return frm.getDatacontrols().getRoot();
	}

	public Object getDomainApplications(DiagramImpl root) {
		// domain.Form frm = getForm(root);
		// domain.UIPackage pkg = (UIPackage) frm.eContainer();
		// return
		// pkg.getParent().getParent().getParent().getParent().getParent();
		throw new RuntimeException();
	}

	@SuppressWarnings("unchecked")
	public Object getDomainApplications(EObject root) throws Exception {
		String query = "domain::DomainApplications.allInstances()";

		Collection<DomainApplications> map = (Collection<DomainApplications>) internalEvaluate(root, query);
		if ((map != null) && (map.size() != 0)) {
			DomainApplications domainApplications = ((DomainApplications) (map.iterator().next()));
			return domainApplications;
		} else
			return null;
	}

	@SuppressWarnings("unchecked")
	public Collection<TreeDataControl> findTreeRootControls(Form frm) throws Exception {

		String query = "form::Relation.allInstances()->select(r|r.isTree=true and r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid()
				+ "')->collect(w|w.master)->reject(q|form::Relation.allInstances()->select(r|r.isTree=true and r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid() + "')->collect(w|w.detail)->includes(q))";

		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(frm, query);

		// Remove duplication
		HashMap<String, DataControl> hash = new HashMap<>();
		for (DataControl dc : map) {
			hash.put(dc.getUid(), dc);
		}

		query = "form::Relation.allInstances()->select(r|r.isTree=true and r.master=r.detail and r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid()
				+ "')->collect(w|w.master)->reject(q|form::Relation.allInstances()->select(r|r.isTree=true and r.master <> r.detail and r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid() + "')->collect(w|w.detail)->includes(q))";

		Collection<DataControl> map1 = (Collection<DataControl>) internalEvaluate(frm, query);

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

		String query = "form::DataControl.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid()
				+ "')->reject(q|form::Relation.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid= '"
				+ frm.getDatacontrols().getUid() + "' )->collect(w|w.detail)->includes(q))";

		Collection<DataControl> map = ((Collection<DataControl>) internalEvaluate(frm, query));

		for (TreeDataControl obj : findTreeRootControls(frm)) {
			map.remove(obj.getDc());
		}

		return map;

	}

	@SuppressWarnings("unchecked")
	public Collection<DataControl> findDetailAndDependencyControls(Form frm) throws Exception {

		String query = "form::Relation.allInstances()->select(r|r.isTree=false and r.oclAsType(ecore::EObject).eContainer().oclAsType(form::Controls).uid = '"
				+ frm.getDatacontrols().getUid() + "')->collect(w|w.detail)";

		Collection<DataControl> map = (Collection<DataControl>) internalEvaluate(frm, query);

		for (TreeDataControl obj : findTreeRootControls(frm)) {
			map.remove(obj.getDc());
		}

		return map;

	}

	public Object[] findMappingTechnologies(ModelMapper eObject, EObject types) throws Exception {

		Object[] result = new Object[2];

		Collection<MappingTecnologiy> map = eObject.getTechnologies();
		String query = "artifact::Artifact.allInstances()->select(r|r.uid='" + eObject.getArtifactRef().getUid()
				+ "').oclAsType(artifact::Artifact).technologies";

		@SuppressWarnings("unchecked")
		Collection<Technology> map1 = (Collection<Technology>) internalEvaluate(eObject, query);

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

	public Object[] findMappingVariable(recipe.Query eObject, EObject types) throws Exception {

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

	// public Set<ApplicationMapper> findAvailableMappersForRecipe(Recipe
	// recipe) {
	// throw new RuntimeException();

	// HashSet<domain.ApplicationMapper> mappers = new
	// HashSet<domain.ApplicationMapper>();
	// try {
	//
	// List<domain.ApplicationMapper> appMapperLst = recipe.getParent()
	// .getParent().getParent().getParent()
	// .getApplicationMappers().getMappers();
	//
	// for (Iterator<domain.ApplicationMapper> itr = appMapperLst
	// .iterator(); itr.hasNext();) {
	// domain.ApplicationMapper mapper = itr.next();
	// mappers.add(mapper);
	// }
	//
	// } catch (Exception e) {
	// LogUtil.log(e);
	// }
	// return mappers;
	// }

	// public Set<domain.ApplicationMapper> findAvailableMappersForIngredient(
	// domain.Ingredient ingr) {
	//
	// HashSet<domain.ApplicationMapper> mappers = new
	// HashSet<domain.ApplicationMapper>();
	// try {
	//
	// List<domain.ApplicationMapper> appMapperLst = ingr.getParent()
	// .getParent().getParent().getParent().getParent()
	// .getApplicationMappers().getMappers();
	//
	// List<domain.ApplicationMapper> recipeLs = ingr.getParent()
	// .getMappers();
	//
	// for (Iterator<domain.ApplicationMapper> itr = appMapperLst
	// .iterator(); itr.hasNext();) {
	// domain.ApplicationMapper mapper = itr.next();
	// if (!recipeLs.contains(mapper))
	// mappers.add(mapper);
	// }
	//
	// } catch (Exception e) {
	// LogUtil.log(e);
	// }
	// return mappers;
	// }
	//
	// @SuppressWarnings({ "rawtypes", "unchecked" })
	// public List<domain.ApplicationMapper> removeMappersForRecipe(
	// domain.Recipe eObject) {
	// ArrayList<domain.ApplicationMapper> removeMappers = new
	// ArrayList<domain.ApplicationMapper>();
	// if (eObject.getMappers() == null || eObject.getMappers().size() == 0)
	// return removeMappers;
	//
	// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
	// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
	//
	// List<domain.ApplicationMapper> map = eObject.getMappers();
	//
	// List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
	// .getParent().getParent().getApplicationMappers().getMappers();
	//
	// for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1
	// .hasNext();) {
	// domain.ApplicationMapper ms = itr1.next();
	// boolean isRemove = true;
	// for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
	// .hasNext();) {
	// domain.ApplicationMapper sp = itr2.next();
	// if (sp.getUid().equals(ms.getUid()))
	// isRemove = false;
	// }
	// if (isRemove)
	// removeMappers.add(ms);
	// }
	// return removeMappers;
	//
	// }
	//
	// @SuppressWarnings({ "rawtypes", "unchecked" })
	// public List<domain.ApplicationMapper> removeMappersForIngredient(
	// domain.Ingredient eObject) {
	// ArrayList<domain.ApplicationMapper> removeMappers = new
	// ArrayList<domain.ApplicationMapper>();
	//
	// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
	// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
	//
	// List<domain.ApplicationMapper> map = eObject.getMappers();
	//
	// List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
	// .getParent().getParent().getParent().getApplicationMappers()
	// .getMappers();
	//
	// List<domain.ApplicationMapper> recipeLs = eObject.getParent()
	// .getMappers();
	//
	// for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1
	// .hasNext();) {
	// domain.ApplicationMapper ms = itr1.next();
	// boolean isRemove = true;
	// for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
	// .hasNext();) {
	// domain.ApplicationMapper sp = itr2.next();
	// if (sp.getUid().equals(ms.getUid()))
	// isRemove = false;
	// if (recipeLs.contains(ms))
	// isRemove = true;
	// }
	// if (isRemove)
	// removeMappers.add(ms);
	// }
	// return removeMappers;
	//
	// }
	//
	public List<Object> findTriggerParameters(Operation method, ContextParameters trg, EObject types,
			EditingDomain editingDomain) throws Exception {

		ArrayList<ContextParameter> removeParameters = new ArrayList<ContextParameter>();
		ArrayList<ContextParameter> addParameters = new ArrayList<ContextParameter>();

		Collection<Parameter> map = method.getParameters();

		ArrayList<Parameter> parameters = new ArrayList<Parameter>();
		parameters.addAll(map);

		Collections.sort(parameters, new ParameterComparator());

		ArrayList<ContextParameter> trgParameters = new ArrayList<ContextParameter>();
		trgParameters.addAll(trg.getParameters());

		Collections.sort(trgParameters, new ContextParameterComparator());

		boolean renewParameters = false;
		if (trgParameters.size() != parameters.size()) {
			removeParameters.addAll(trgParameters);
			renewParameters = true;
		} else {

			for (int i = 0; i < trgParameters.size(); i++) {
				ContextParameter trgParam = trgParameters.get(i);
				Parameter param = parameters.get(i);
				if (trgParam.getRefObj() == null
						|| !((Parameter) trgParam.getRefObj()).getUid().equals(param.getUid())) {
					removeParameters.addAll(trgParameters);
					renewParameters = true;
					break;
				}
			}
		}
		if (renewParameters) {
			for (int i = 0; i < parameters.size(); i++) {
				ContextParameter trgParam = FormFactory.eINSTANCE.createContextParameter();
				trgParam.setRefObj(parameters.get(i));
				trgParam.setUid(UUID.randomUUID().toString());
				addParameters.add(trgParam);
				ContextValue value = FormFactory.eINSTANCE.createContextValue();
				value.setUid(UUID.randomUUID().toString());
				trgParam.setValue(value);
			}
		}
		if (removeParameters.size() != 0) {
			editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, trg,
					FormPackage.eINSTANCE.getContextParameters_Parameters(), removeParameters));
		}

		if (addParameters.size() != 0) {
			editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, trg,
					FormPackage.eINSTANCE.getContextParameters_Parameters(), addParameters));
		}

		trgParameters = new ArrayList<ContextParameter>();
		trgParameters.addAll(trg.getParameters());

		Collections.sort(trgParameters, new ContextParameterComparator());

		ArrayList<Object> rows = new ArrayList<>();
		rows.addAll(trgParameters);
		return rows;
	}

	@SuppressWarnings("unchecked")
	public DomainTypes getTypesRepository(EObject obj) throws Exception {

		Collection<DomainTypes> map = (Collection<DomainTypes>) internalEvaluate(obj,
				"domain::DomainTypes.allInstances()");

		if ((map != null) && (map.size() != 0)) {
			DomainTypes domainTypes = ((DomainTypes) (map.iterator().next()));
			return domainTypes;
		} else
			return null;
	}

	@SuppressWarnings("unchecked")
	private TypeElement findModelType(EObject context, String typeRepositoryName, String packageName, String typeName)
			throws Exception {
		String query = "domain::DomainTypes.allInstances().typesRepository->select(r|r.name='" + typeRepositoryName
				+ "').repositoryPackages->select(p|p.name='" + packageName + "').types->select(t|t.name='" + typeName
				+ "')";

		Collection<TypeElement> map = (Collection<TypeElement>) internalEvaluate(context, query);

		if ((map != null) && (map.size() != 0)) {
			TypeElement type = ((TypeElement) (map.iterator().next()));
			return type;
		} else
			return null;

	}

	@SuppressWarnings("unchecked")
	private Primitive findPrimitive(EObject context, String typeName) throws Exception {
		String query = "domain::Domain.allInstances()";
		Collection<Domain> map = (Collection<Domain>) internalEvaluate(context, query);
		if ((map != null) && (map.size() != 0)) {
			Domain domain = ((Domain) (map.iterator().next()));
			PrimitivesGroup grp = domain.getDomainTypes().getPrimitives();

			query = "type::Primitive.allInstances()->select(r|r.name='" + typeName + "')";

			Collection<Primitive> map1 = (Collection<Primitive>) internalEvaluate(grp, query);

			if ((map1 != null) && (map1.size() != 0)) {
				Primitive type = ((Primitive) (map1.iterator().next()));
				return type;
			} else
				return null;
		} else
			return null;

	}

	public TypeElement findMessageType(EObject obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, MESSAGE_TYPE);
	}

	public TypeElement findStyleType(EObject obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, STYLE_TYPE);
	}

	public TypeElement findRoleType(EObject obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, ROLE_TYPE);
	}

	public TypeElement findGroupType(EObject obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, GROUP_TYPE);
	}

	public TypeElement findIconType(EObject obj) throws Exception {
		return findModelType(obj, BASE_REPOSITORY, MODEL_PACKAGE, ICON_TYPE);
	}

	@SuppressWarnings("unchecked")
	public DomainArtifacts getDomainArtifact(EObject obj) throws Exception {

		Collection<DomainArtifacts> map = (Collection<DomainArtifacts>) internalEvaluate(obj,
				"domain::DomainArtifacts.allInstances()");

		if (map != null && map.size() != 0) {
			return (DomainArtifacts) map.toArray()[0];
		}
		return null;

	}

	class ParameterComparator implements Comparator<Parameter> {
		@Override
		public int compare(Parameter o1, Parameter o2) {
			return new Integer(o1.getOrder()).compareTo(new Integer(o2.getOrder()));
		}
	}

	class ContextParameterComparator implements Comparator<ContextParameter> {

		@Override
		public int compare(ContextParameter o1, ContextParameter o2) {
			if (o1.getRefObj() == null || o2.getRefObj() == null)
				return -1;
			return new Integer(((Parameter) o1.getRefObj()).getOrder())
					.compareTo(new Integer(((Parameter) o2.getRefObj()).getOrder()));
		}

	}

	@SuppressWarnings("unchecked")
	public void getInheritTypes(List<Type> typesTree, Type type) {
		try {

			String query = "type::Generalization.allInstances()->select(r|r.oclAsType(type::Generalization).target.oclIsKindOf(type::Type) and "
					+ "r.oclAsType(type::Generalization).target.uid ='" + type.getUid() + "')";

			Collection<Generalization> map = (Collection<Generalization>) internalEvaluate(type, query);

			query = "type::Generalization.allInstances()->select(r|r.oclAsType(type::Generalization).target.oclIsKindOf(type::TypeReference)"
					+ " and r.oclAsType(type::Generalization).target.oclAsType(type::TypeReference).typeRef.uid= '"
					+ type.getUid() + "')";

			Collection<Generalization> map1 = (Collection<Generalization>) internalEvaluate(type, query);

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
			return findPrimitive((EObject) obj, "Null");
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findSearchCriteriaType(Object obj) {
		throw new RuntimeException();

		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
		// + InitDiagram.BASE_PACKAGE
		// + "').oclAsType(domain::Package)."
		// + "typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and
		// r.oclAsType(domain::Type).name = 'Search criterias') )");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
		// .evaluate(obj, query);
		//
		// if (map.size() != 0)
		// return map.iterator().next();
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// }
		// return null;

	}

	public TypeElement findStringType(Object obj) {
		throw new RuntimeException();

		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Primitive.allInstances()->select(r|r.oclAsType(domain::Primitive).name
		// = 'String' and r.oclAsType(domain::Primitive).parent.parent.name ='"
		// + InitDiagram.PRIVATE_PACKAGE + "')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
		// .evaluate(obj, query);
		//
		// if (map.size() != 0)
		// return map.iterator().next();
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// }
		// return null;

	}

	public TypeElement findIntegerType(Object obj) {
		throw new RuntimeException();

		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Primitive.allInstances()->select(r|r.oclAsType(domain::Primitive).name
		// = 'Integer' and r.oclAsType(domain::Primitive).parent.parent.name ='"
		// + InitDiagram.PRIVATE_PACKAGE + "')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
		// .evaluate(obj, query);
		//
		// if (map.size() != 0)
		// return map.iterator().next();
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// }
		// return null;

	}

	public TypeElement findBooleanType(Object obj) {
		try {
			return findPrimitive((EObject) obj, "Boolean");
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public TypeElement findBaseType(Object obj) {
		try {
			return findModelType((EObject) obj, BASE_REPOSITORY, MODEL_PACKAGE, BASE_TYPE);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findDataControlType(Object obj) {
		try {
			return findModelType((EObject) obj, BASE_REPOSITORY, MODEL_PACKAGE, DATA_CONTROL);
		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public TypeElement findTreeDataControlType(Object obj) {
		try {
			return findModelType((EObject) obj, BASE_REPOSITORY, MODEL_PACKAGE, TREE_DATA_CONTROL);
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

		EObject root = obj;
		do {
			root = root.eContainer();
			if (root == null) {
				throw new Exception("UI element container is null");
			}
		} while (!(root instanceof MenuDefinition));

		Views views = (Views) ((MenuDefinition) root).eContainer();
		return findRefreshedAeas(views, obj);

	}

	public Object[] findRefreshedAeas(Uielement obj) throws Exception {

		EObject root = obj;
		do {
			root = root.eContainer();
			if (root == null) {
				throw new Exception("UI element container is null");
			}
		} while (!(root instanceof ViewArea));

		Views views = (Views) ((ViewArea) root).eContainer().eContainer();

		return findRefreshedAeas(views, obj);

	}

	@SuppressWarnings("unchecked")
	public Object[] findRefreshedAeas(Views views, EObject obj) throws Exception {
		try {
			String query = "form::Views.allInstances()->select(r|r.oclAsType(form::Views).uid = '" + views.getUid()
					+ "').canvases->select(c|c.oclIsKindOf(form::ViewPortHolder))->collect(v|v.oclAsType(form::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(form::ViewArea))";

			Collection<ViewArea> map = (Collection<ViewArea>) internalEvaluate(obj, query);

			query = "form::Views.allInstances()->select(r|r.oclAsType(form::Views).uid = '" + views.getUid()
					+ "').canvases->select(c|c.oclIsKindOf(form::ViewPortHolder))->collect(v|v.oclAsType(form::ViewPortHolder).viewElement)->"
					+ "select(q|q.oclIsKindOf(form::NickNamed) and q.oclAsType(form::NickNamed).nickname <> null and q.oclAsType(form::NickNamed).nickname <> '')";

			Collection<NickNamed> map1 = (Collection<NickNamed>) internalEvaluate(obj, query);

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
				if (ref.getArea() == null || ref.getArea().getNickname() == null
						|| "".equals(ref.getArea().getNickname())) {
					remove.add(ref);
				}
			}
			return new Object[] { nickNamed, remove };

		} catch (Exception e) {
			LogUtil.log(e);
			return new Object[] { null, null };
		}

	}

	private void findNick(List<NickNamed> list, LayerHolder holder, EObject exception) {

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
			if (el instanceof LayerHolder) {
				findUIElement(list, (LayerHolder) el);
				continue;
			} else {
				list.add(el);
			}

		}
	}

	public List<MenuFolder> findMenus(Form frm) {

		ApplicationUILayer app = (ApplicationUILayer) frm.eContainer().eContainer();

		try {

			String query = "application::ApplicationUILayer.allInstances()->select(q|q.uid='" + app.getUid() + "')"
					+ "->collect(v|v.oclAsType(application::ApplicationUILayer).applicationUIPackages"
					+ "->collect(w|w.oclAsType(application::ApplicationUIPackage).forms"
					+ " ->collect(f|f.oclAsType(form::Form).view.menus)->collect(fl|fl.oclAsType(form::MenuDefinition).menuFolders "
					+ "->select(mf|mf.oclIsKindOf(form::MenuFolder)))))->reject(qwe|application::ApplicationUILayer.allInstances()"
					+ "->select(q|q.uid='" + app.getUid()
					+ "')->collect(v|v.oclAsType(application::ApplicationUILayer).applicationUIPackages"
					+ "->collect(w|w.oclAsType(application::ApplicationUIPackage).forms ->collect(f|f.oclAsType(form::Form).view.menus)"
					+ "->collect(fl|fl.oclAsType(form::MenuDefinition).toSubMenu ->collect(mf|mf.oclAsType(form::ToSubmenu).target ))))"
					+ "->includes(qwe))";

			@SuppressWarnings("unchecked")
			Collection<MenuFolder> map = (Collection<MenuFolder>) internalEvaluate(app, query);

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

		Views views = (Views) (((MenuDefinition) (ref.eContainer().eContainer())).eContainer());
		Form frm = (Form) ((Views) views).eContainer();
		ApplicationUILayer app = (ApplicationUILayer) frm.eContainer().eContainer();

		String query = "application::ApplicationUILayer.allInstances()->select(q|q.uid='" + app.getUid() + "')"
				+ "->collect(v|v.oclAsType(application::ApplicationUILayer).applicationUIPackages->"
				+ "collect(w|w.oclAsType(application::ApplicationUIPackage).forms "
				+ "->collect(f|f.oclAsType(form::Form).view.menus)"
				+ "->collect(fl|fl.oclAsType(form::MenuDefinition).menuFolders"
				+ "->collect(mf|mf.oclAsType(form::MenuFolder)->select(e|e.extensionPoint)))))";

		try {

			@SuppressWarnings("unchecked")
			Collection<MenuFolder> map = (Collection<MenuFolder>) internalEvaluate(app, query);

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

			String query = "form::CanvasFrame.allInstances()->select(r|r.oclAsType(form::CanvasFrame).uid='"
					+ canvasFrame.getUid()
					+ "')->collect(v|v.oclAsType(form::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(form::ViewArea))";

			@SuppressWarnings("unchecked")
			Collection<ViewArea> map = (Collection<ViewArea>) internalEvaluate(canvasFrame, query);

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

			String query = "type::Generalization.allInstances()->select(r|r.oclAsType(type::Generalization).source.uid ='"
					+ type.getUid() + "')";

			@SuppressWarnings("unchecked")
			Collection<Generalization> list = (Collection<Generalization>) internalEvaluate(type, query);

			return list;
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<Generalization>();
		}

	}

	private String findHint(EObject obj, int level, String... hints) {
		try {
			if (hints.length == 0)
				return null;

			if (level == hints.length) {
				return ((TechLeaf) obj).getUid();
			}

			String query = null;
			if (level == 0) {
				query = "domain::DomainArtifacts.allInstances().techLeafs->select(q|q.name='" + hints[level] + "')";
			} else {
				if (level == hints.length - 1) {
					query = "artifact::TechLeaf.allInstances()->select(q|q.uid='" + ((TechLeaf) obj).getUid()
							+ "').oclAsType(artifact::TechLeaf).hints->select(q|q.name='" + hints[level] + "')";
				} else {
					query = "artifact::TechLeaf.allInstances()->select(q|q.uid='" + ((TechLeaf) obj).getUid()
							+ "').oclAsType(artifact::TechLeaf).techLeafs->select(q|q.name='" + hints[level] + "')";
				}
			}

			@SuppressWarnings("unchecked")
			Collection<EObject> list = (Collection<EObject>) internalEvaluate(obj, query);
			if (list == null || list.size() == 0) {
				return null;
			}
			if (level == hints.length - 1) {
				GenerationHint hint = (GenerationHint) list.iterator().next();
				return hint.getUid();
			}

			for (Iterator<EObject> itr = list.iterator(); itr.hasNext();) {
				EObject obj1 = itr.next();
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
		String hint = findHint((EObject) obj, 0, hints);
		if (hint == null) {
			return new ArrayList<Type>();
		}
		try {
			String query = "type::Type.allInstances()->select(r|r.oclAsType(type::Type).classifiers->select(c|c.hint.uid='"
					+ hint + "')->size()>0)";
			Collection<EObject> list = (Collection<EObject>) internalEvaluate((EObject) obj, TypePackage.Literals.TYPE,
					query);
			if (list == null || list.size() == 0) {
				return null;
			}
			ArrayList<Type> array = new ArrayList<Type>();
			array.addAll((Collection<? extends Type>) list);

			return array;
		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	public Object executeQuery(String strQuery, EObject eobj) throws ParserException {
		return internalEvaluate(eobj, strQuery);
	}

}
