package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;

import artifact.QueryParameter;
import artifact.Technology;
import domain.DomainApplications;
import domain.DomainArtifacts;
import domain.DomainTypes;
import form.CanvasFrame;
import form.ContextParameter;
import form.ContextParameters;
import form.ContextValue;
import form.DataControl;
import form.Form;
import form.FormFactory;
import form.FormPackage;
import form.MenuExtensionRef;
import form.MenuFolder;
import form.MenuItem;
import form.NickNamed;
import form.Uielement;
import form.Views;
import recipe.ConfigExtension;
import recipe.Configuration;
import recipe.Infrastructure;
import recipe.MappingTecnologiy;
import recipe.ModelMapper;
import recipe.QueryVariable;
import recipe.Recipe;
import recipe.Recipe2Infrastructure;
import recipe.impl.Infrastructure2ConfigurationImpl;
import type.Generalization;
import type.Operation;
import type.Parameter;
import type.Type;
import type.TypeElement;

public class QueryHelper {

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

	public Object getApplicationRoles(DiagramImpl root) {
		throw new RuntimeException();
		
//		Collection<DomainArtifacts> map = (Collection<DomainArtifacts>) internalEvaluate(obj,
//				"domain::DomainArtifacts.allInstances()");
//
//		if (map != null && map.size() != 0) {
//			return (DomainArtifacts) map.toArray()[0];
//		}
//		return null;
	}

	//
	public Object getMessages(DiagramImpl root) {
		// domain.Form frm = getForm(root);
		//
		// domain.Application app = ((domain.UIPackage) (frm.eContainer()))
		// .getParent().getParent().getParent();
		// if (app.getApplicationMessages() != null)
		// return app.getApplicationMessages().getMessages();
		//
		// return null;
		throw new RuntimeException();
	}

	//
	public Object getApplicationStyle(DiagramImpl root) {
		// domain.Form frm = getForm(root);
		//
		// domain.Application app = ((domain.UIPackage) (frm.eContainer()))
		// .getParent().getParent().getParent();
		// if (app.getApplicationStyle() != null)
		// return app.getApplicationStyle();
		//
		// return null;
		throw new RuntimeException();
	}

	public Form getForm(DataControl dc) {
		// return (Form) dc.getParent().getParent().eContainer();
		throw new RuntimeException();
	}

	public Form getForm(DiagramImpl root) {
		throw new RuntimeException();
		// domain.Form frm = null;
		//
		// if (root.getElement() instanceof domain.Controls) {
		// frm = (Form) ((domain.Controls) root.getElement()).getParent()
		// .eContainer();
		// }
		//
		// if (root.getElement() instanceof domain.MenuView) {
		// domain.Views views = (Views) (((domain.MenuView) root.getElement())
		// .getParent().eContainer());
		// frm = (domain.Form) (views.getParent().eContainer());
		//
		// }
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
		//
		// return frm;
	}

	// @SuppressWarnings({ "unchecked", "rawtypes" })
	public void getTreeLeafs(List<Object> ls, DataControl root) throws Exception {
		throw new RuntimeException();

		// ls.add(root);
		//
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// OCLHelper<EClassifier, ?, ?, Constraint> helper =
		// ocl.createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Relation.allInstances()->select(r|r.isTree=true
		// and r.master.uid ='"
		// + root.getUid() + "')->collect(r|r.detail)");
		//
		// Collection<domain.DataControl> map = (Collection<domain.DataControl>)
		// ocl
		// .evaluate(root, query);
		//
		// for (domain.DataControl dc : map) {
		// if (!ls.contains(dc)) {
		// getTreeLeafs(ls, dc);
		// }
		// }
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfigExtensionUp(Configuration config) throws Exception {
		
		 if (getConfigExtensionGard(config)) {
			 throw new Exception("Configuration cannot be sources for more then 1 configuration tree");
		 }
		
		 String query = "recipe::ConfigExtension.allInstances()->select(r|r.source.uid ='"+ config.getUid() + "')";
		 
		 Collection<ConfigExtension> map =(Collection<ConfigExtension>) internalEvaluate(config, query);
		 if ((map != null) && (map.size() != 0))
		      return map.iterator().next().getTarget();
		 else
		    return null;
	}

	@SuppressWarnings("unchecked")
	public Configuration getConfigExtensionDown(Configuration config) throws Exception {
		
		 if (getConfigExtensionGard(config)){
			    return null;
			 }
			
		 String query = "recipe::ConfigExtension.allInstances()->select(r|r.target.uid ='"+ config.getUid() + "')";

		 Collection<ConfigExtension> map =(Collection<ConfigExtension>) internalEvaluate(config, query);
		 if ((map != null) && (map.size() != 0))
		      return map.iterator().next().getSource();
		 else
		    return null;

	}

	@SuppressWarnings("unchecked")
	public boolean getConfigExtensionGard(Configuration config) throws Exception {

		 String query = "recipe::ConfigExtension.allInstances()->select(r|r.source.uid='"+ config.getUid() + "')";
		
		 Collection<ConfigExtension> map =(Collection<ConfigExtension>) internalEvaluate (config, query);
		 if ((map != null) && (map.size() > 1)){
		    return true;
		 }else {
		    return false;
		 }
	}

	@SuppressWarnings("unchecked")
	public Infrastructure findInfrastructure(Configuration config) throws Exception {

		 String query = "recipe::Infrastructure2Configuration.allInstances()->select(r|r.target.uid='"+ config.getUid() + "')";

		 Collection<Infrastructure2ConfigurationImpl> map =(Collection<Infrastructure2ConfigurationImpl>) internalEvaluate(config, query);
		 if ((map != null) && (map.size() != 0)){
			 EObject obj = map.iterator().next().getSource();
			 if (obj instanceof Infrastructure){
				 return (Infrastructure) obj;
			 }else{
				 return null;
			 }
		 }
		 else
		    return null;
	}
	
	@SuppressWarnings("unchecked")
	public Recipe findRecipe(Infrastructure infra) throws Exception {

		 String query = "recipe::Recipe2Infrastructure.allInstances()->select(r|r.target.uid='"+ infra.getUid() + "')";

		 Collection<Recipe2Infrastructure> map =(Collection<Recipe2Infrastructure>) internalEvaluate(infra, query);
		 if ((map != null) && (map.size() != 0)){
			 Recipe recipe = ((Recipe2Infrastructure) (map.iterator().next())).getSource();
			 return recipe;
		 }
		 else
		    return null;
	}
	
	
	
	public List<?> getControlsList(DiagramImpl root) throws Exception {

		// Form frm = getForm(root);
		//
		// return getControlsList(frm);

		throw new RuntimeException();

	}

	public List<?> getControlsList(Form frm) throws Exception {
		throw new RuntimeException();

		// ArrayList ls = new ArrayList();
		//
		// TreeRootDataControlHolder th = new TreeRootDataControlHolder();
		// th.getControls().addAll(findTreeRootControls(frm));
		// ls.add(th);
		//
		// DataControlHolder dh = new DataControlHolder();
		// dh.getControls().addAll(findMasterControls(frm));
		// dh.getControls().addAll(findDetailAndDependencyControls(frm));
		// ls.add(dh);
		//
		// return ls;

	}

	public Object getRootControl(DiagramImpl root) throws Exception {
		// domain.Form frm = getForm(root);
		// return frm.getDatacontrols().getFormControl().getRoot();
		throw new RuntimeException();
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

		 Collection<DomainApplications> map =(Collection<DomainApplications>) internalEvaluate(root, query);
		 if ((map != null) && (map.size() != 0)){
			 DomainApplications domainApplications = ((DomainApplications) (map.iterator().next()));
			 return domainApplications;
		 }
		 else
		    return null;
	}
	
	
	public Collection<TreeDataControl> findTreeRootControls(Form frm) throws Exception {

		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// OCLHelper<EClassifier, ?, ?, Constraint> helper =
		// ocl.createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Relation.allInstances()->select(r|r.isTree=true
		// and
		// r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// +
		// "')->collect(w|w.master)->reject(q|domain::Relation.allInstances()->select(r|r.isTree=true
		// and
		// r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// + "')->collect(w|w.detail)->includes(q))");
		//
		// Collection<domain.DataControl> map = (Collection<domain.DataControl>)
		// ocl
		// .evaluate(frm, query);
		//
		// // Remove duplication
		// HashMap<String, domain.DataControl> hash = new HashMap<>();
		// for (domain.DataControl dc : map)
		// hash.put(dc.getUid(), dc);
		//
		// query = helper
		// .createQuery("domain::Relation.allInstances()->select(r|r.isTree=true
		// and r.master=r.detail and
		// r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// +
		// "')->collect(w|w.master)->reject(q|domain::Relation.allInstances()->select(r|r.isTree=true
		// and r.master <> r.detail and
		// r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// + "')->collect(w|w.detail)->includes(q))");
		//
		// Collection<domain.DataControl> map1 =
		// (Collection<domain.DataControl>) ocl
		// .evaluate(frm, query);
		//
		// ArrayList<TreeDataControl> ls = new ArrayList<>();
		// for (domain.DataControl dc : hash.values())
		// ls.add(new TreeDataControl(dc));
		// for (domain.DataControl dc : map1)
		// ls.add(new TreeDataControl(dc));
		//
		// return ls;
		throw new RuntimeException();

	}

	public Collection<DataControl> findMasterControls(Form frm) throws Exception {
		throw new RuntimeException();

		//
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// OCLHelper<EClassifier, ?, ?, Constraint> helper =
		// ocl.createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::DataControl.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// + "'
		// )->reject(q|domain::Relation.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// + "' )->collect(w|w.detail)->includes(q))");
		//
		// Collection<domain.DataControl> map =
		// ((Collection<domain.DataControl>) ocl
		// .evaluate(frm, query));
		//
		// for (TreeDataControl obj : findTreeRootControls(frm))
		// map.remove(obj.getDc());
		//
		// return map;

	}

	public Collection<DataControl> findDetailAndDependencyControls(Form frm) throws Exception {

		throw new RuntimeException();

		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// OCLHelper<EClassifier, ?, ?, Constraint> helper =
		// ocl.createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Relation.allInstances()->select(r|r.isTree=false
		// and
		// r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid
		// = '"
		// + frm.getDatacontrols().getFormControl().getUid()
		// + "')->collect(w|w.detail)");
		//
		// Collection<domain.DataControl> map = (Collection<domain.DataControl>)
		// ocl
		// .evaluate(frm, query);
		//
		// for (TreeDataControl obj : findTreeRootControls(frm))
		// map.remove(obj.getDc());
		//
		// return map;

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
		 
		 if ( eObject.getQueryRef() != null ){
			 
			 Collection<QueryParameter> map1 = eObject.getQueryRef().getParameters();
			 Collection<QueryVariable> map =  eObject.getVariables();
			 
			 for (QueryVariable ms :  map) {
				 boolean isRemove = true;
				 for (QueryParameter sp : map1) {
				    if ((ms.getQueryParamRef() != null)&& (sp.getUid().equals(ms.getQueryParamRef().getUid()))){
				        isRemove = false;
				    }
				 }
				 if (isRemove){
				     removeVariables.add(ms);
				 }
			 }
		 
		 for (QueryVariable ms : map) {
		    boolean isRemove = true;
		    for (QueryParameter sp : map1) {
		      if ((ms.getQueryParamRef() != null)&& (sp.getUid().equals(ms.getQueryParamRef().getUid()))){
		 		 isRemove = false;
		      }
		    }
			if (isRemove){
			      removeVariables.add(ms);
			}
		 }
		
		 for (QueryParameter ms : map1) {
		    boolean isAdd = false;
		    if (map.size() == 0){
		    	isAdd = true;
		    }else {
		     isAdd = true;
		      for (QueryVariable sp : map) {
		          if ((sp.getQueryParamRef() != null)&& (sp.getQueryParamRef().getUid().equals(ms.getUid()))){
		             isAdd = false;
		          }
		      }
		    }
		    if (isAdd){
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
		
		Collection<DomainTypes> map = (Collection<DomainTypes>) internalEvaluate(obj, "domain::DomainTypes.allInstances()");
		
		 if ((map != null) && (map.size() != 0)){
			 DomainTypes domainTypes = ((DomainTypes) (map.iterator().next()));
			 return domainTypes;
		 }
		 else
		    return null;
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

	public void getInheritTypes(List<Type> typesTree, Type type) {
		throw new RuntimeException();

		//
		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::TypeExtension.allInstances()->select(r|r.oclAsType(domain::TypeExtension).target.oclIsKindOf(domain::Type)
		// and "
		// + "r.oclAsType(domain::TypeExtension).target.uid ='"
		// + type.getUid() + "')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.TypeExtension> map =
		// (Collection<domain.TypeExtension>) ocl
		// .evaluate(type, query);
		//
		// query = helper
		// .createQuery("domain::TypeExtension.allInstances()->select(r|r.oclAsType(domain::TypeExtension).target.oclIsKindOf(domain::TypeReference)
		// "
		// + "and "
		// +
		// "r.oclAsType(domain::TypeExtension).target.oclAsType(domain::TypeReference).typeRef.uid
		// = '"
		// + type.getUid() + "')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.TypeExtension> map1 =
		// (Collection<domain.TypeExtension>) ocl
		// .evaluate(type, query);
		//
		// HashMap<String, domain.TypeElement> joinmap = new HashMap<String,
		// domain.TypeElement>();
		//
		// if (map != null) {
		// for (Iterator<domain.TypeExtension> itr = map.iterator(); itr
		// .hasNext();) {
		// domain.TypeElement el = itr.next().getSource();
		// joinmap.put(el.getUid(), el);
		// }
		// }
		//
		// if (map1 != null) {
		// for (Iterator<domain.TypeExtension> itr = map1.iterator(); itr
		// .hasNext();) {
		// domain.TypeElement el = itr.next().getSource();
		// joinmap.put(el.getUid(), el);
		// }
		// }
		//
		// for (Iterator<domain.TypeElement> itr = joinmap.values().iterator();
		// itr
		// .hasNext();) {
		// domain.TypeElement t = itr.next();
		// typesTree.add((Type) t);
		// getInheritTypes(typesTree, (Type) t);
		// }
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// }
		//
	}

	public TypeElement findNullType(Object obj) {
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
		// = 'Null' and r.oclAsType(domain::Primitive).parent.parent.name ='"
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
		// = 'Boolean' and r.oclAsType(domain::Primitive).parent.parent.name ='"
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

	public TypeElement findBaseType(Object obj) {
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
		// r.oclAsType(domain::Type).name = 'BaseType') )");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.TypeElement> map = (Collection<domain.TypeElement>)
		// ocl
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

	public TypeElement findDataControlType(Object obj) {
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
		// r.oclAsType(domain::Type).name = 'Data control') )");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.TypeElement> map = (Collection<domain.TypeElement>)
		// ocl
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

	public TypeElement findTreeDataControlType(Object obj) {
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
		// r.oclAsType(domain::Type).name = 'Tree data control') )");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.TypeElement> map = (Collection<domain.TypeElement>)
		// ocl
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

	public List<NickNamed> collectRefreshedAeas(Views views) throws Exception {

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
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
		// .evaluate(views, query);
		//
		// query = helper
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::NickNamed)
		// and q.oclAsType(domain::NickNamed).nickname <> null and
		// q.oclAsType(domain::NickNamed).nickname <> '')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.NickNamed> map1 = (Collection<domain.NickNamed>)
		// ocl
		// .evaluate(views, query);
		//
		// ArrayList<domain.NickNamed> nickNamed = new
		// ArrayList<domain.NickNamed>();
		//
		// if (map.size() != 0) {
		// for (Iterator<domain.ViewArea> itr = map.iterator(); itr
		// .hasNext();) {
		// domain.ViewArea viewarea = itr.next();
		// if (viewarea.getCanvasView() != null)
		// findNick(nickNamed, viewarea.getCanvasView()
		// .getBaseCanvas(), null);
		// }
		// }
		// nickNamed.addAll(map1);
		//
		// return nickNamed;
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return null;
		// }
		//
	}

	public Object[] findRefreshedAeas(MenuItem obj) throws Exception {

		throw new RuntimeException();

		// EObject root = obj;
		// do {
		// root = root.eContainer();
		// if (root == null)
		// throw new Exception("UI element container is null");
		// } while (!(root instanceof domain.MenuView));
		//
		// domain.Views views = (Views) ((domain.MenuView) root).getParent()
		// .eContainer();
		//
		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
		// .evaluate(obj, query);
		//
		// query = helper
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::NickNamed)
		// and q.oclAsType(domain::NickNamed).nickname <> null and
		// q.oclAsType(domain::NickNamed).nickname <> '')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.NickNamed> map1 = (Collection<domain.NickNamed>)
		// ocl
		// .evaluate(obj, query);
		//
		// ArrayList<domain.NickNamed> nickNamed = new
		// ArrayList<domain.NickNamed>();
		// ArrayList<domain.AreaRef> remove = new ArrayList<domain.AreaRef>();
		//
		// if (map.size() != 0) {
		// for (Iterator<domain.ViewArea> itr = map.iterator(); itr
		// .hasNext();) {
		// domain.ViewArea viewarea = itr.next();
		// if (viewarea.getCanvasView() != null)
		// findNick(nickNamed, viewarea.getCanvasView()
		// .getBaseCanvas(), null);
		// }
		// }
		// nickNamed.addAll(map1);
		//
		// for (domain.AreaRef ref : obj.getRefreshAreas()) {
		//
		// if (ref.getArea() == null
		// || ref.getArea().getNickname() == null
		// || "".equals(ref.getArea().getNickname()))
		// remove.add(ref);
		// }
		// return new Object[] { nickNamed, remove };
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return new Object[] { null, null };
		// }
		//
		//
	}

	public Object[] findRefreshedAeas(Uielement obj) throws Exception {
		throw new RuntimeException();

		// EObject root = obj;
		// do {
		// root = root.eContainer();
		// if (root == null)
		// throw new Exception("UI element container is null");
		// } while (!(root instanceof domain.CanvasView));
		//
		// domain.Views views = (Views) ((domain.CanvasView) root).getParent()
		// .eContainer().eContainer();
		//
		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
		// .evaluate(obj, query);
		//
		// query = helper
		// .createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid
		// = '"
		// + views.getUid()
		// +
		// "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::NickNamed)
		// and q.oclAsType(domain::NickNamed).nickname <> null and
		// q.oclAsType(domain::NickNamed).nickname <> '')");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.NickNamed> map1 = (Collection<domain.NickNamed>)
		// ocl
		// .evaluate(obj, query);
		//
		// ArrayList<domain.NickNamed> nickNamed = new
		// ArrayList<domain.NickNamed>();
		// ArrayList<domain.AreaRef> remove = new ArrayList<domain.AreaRef>();
		//
		// if (map.size() != 0) {
		// for (Iterator<domain.ViewArea> itr = map.iterator(); itr
		// .hasNext();) {
		// domain.ViewArea viewarea = itr.next();
		// if (viewarea.getCanvasView() != null)
		// findNick(nickNamed, viewarea.getCanvasView()
		// .getBaseCanvas(), obj);
		// }
		// }
		// nickNamed.addAll(map1);
		//
		// for (domain.AreaRef ref : obj.getRefreshAreas()) {
		//
		// if (ref.getArea() == null
		// || ref.getArea().getNickname() == null
		// || "".equals(ref.getArea().getNickname()))
		// remove.add(ref);
		// }
		// return new Object[] { nickNamed, remove };
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return new Object[] { null, null };
		// }
		//
	}

	// private void findNick(List<domain.NickNamed> list,
	// domain.LayerHolder holder, domain.Uielement exception) {
	//
	// if (holder.getNickname() != null && !"".equals(holder.getNickname())) {
	// if (exception != null && exception.getUid() != holder.getUid())
	// list.add(holder);
	// if (exception == null)
	// list.add(holder);
	// }
	//
	// for (Iterator<domain.Uielement> itr = holder.getChildren().iterator();
	// itr
	// .hasNext();) {
	//
	// domain.Uielement el = itr.next();
	// if (el instanceof domain.LayerHolder) {
	// findNick(list, (domain.LayerHolder) el, exception);
	// continue;
	// }
	//
	// if (el.getNickname() != null && !"".equals(el.getNickname())) {
	// if (exception != null && exception.getUid() != el.getUid())
	// list.add(el);
	// if (exception == null)
	// list.add(el);
	// }
	// }
	// }
	//
	// private void findUIElement(List<domain.Uielement> list,
	// domain.LayerHolder holder) {
	// list.add(holder);
	//
	// for (Iterator<domain.Uielement> itr = holder.getChildren().iterator();
	// itr
	// .hasNext();) {
	//
	// domain.Uielement el = itr.next();
	// if (el instanceof domain.LayerHolder) {
	// findUIElement(list, (domain.LayerHolder) el);
	// continue;
	// } else {
	// list.add(el);
	// }
	//
	// }
	// }
	//
	//
	//
	public List<MenuFolder> findMenus(Form frm) {
		throw new RuntimeException();

		// domain.ApplicationUILayer app = ((domain.UIPackage)
		// (frm.eContainer()))
		// .getParent().getParent();
		//
		// try {
		//
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::ApplicationUILayer.allInstances()->select(q|q.uid='"+app.getUid()+"')"
		// + "
		// ->collect(v|v.oclAsType(domain::ApplicationUILayer).applicationUIPackages"
		// + "
		// ->collect(w|w.oclAsType(domain::ApplicationUIPackage).uipackage.forms"
		// + " ->collect(f|f.oclAsType(domain::Form).view.view.menus)"
		// + "
		// ->collect(fl|fl.oclAsType(domain::MenuDefinition).menuView.menuFolders"
		// + " ->select(mf|mf.oclIsKindOf(domain::MenuFolder)))))"
		// + "
		// ->reject(qwe|domain::ApplicationUILayer.allInstances()->select(q|q.uid='"+app.getUid()+"')"
		// + "
		// ->collect(v|v.oclAsType(domain::ApplicationUILayer).applicationUIPackages"
		// + "
		// ->collect(w|w.oclAsType(domain::ApplicationUIPackage).uipackage.forms"
		// + " ->collect(f|f.oclAsType(domain::Form).view.view.menus)"
		// + "
		// ->collect(fl|fl.oclAsType(domain::MenuDefinition).menuView.menuFolders"
		// + " ->collect(mf|mf.oclAsType(domain::MenuFolder).menuElements"
		// + " ->select(e|e.oclIsKindOf(domain::SubMenu) and
		// e.oclAsType(domain::SubMenu).toSubmenu <> null )"
		// + " ->collect(e|e.oclAsType(domain::SubMenu).toSubmenu ) ))))"
		// + " ->includes(qwe))");
		//
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.MenuFolder> map = (Collection<domain.MenuFolder>)
		// ocl
		// .evaluate(frm, query);
		//
		// ArrayList<domain.MenuFolder> list = new
		// ArrayList<domain.MenuFolder>();
		//
		// if (map.size() != 0) {
		// for (domain.MenuFolder point : map) {
		// if (point.getName() != null && !point.getName().trim().equals(""))
		// list.add(point);
		// }
		// }
		// return list;
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return new ArrayList<domain.MenuFolder>();
		// }
		//
		//
		//
	}

	public List<MenuFolder> findExtensionPoints(MenuExtensionRef ref) {
		throw new RuntimeException();

		// domain.Views views = (Views) (((domain.MenuView)
		// (ref.eContainer().eContainer()))
		// .getParent().eContainer());
		// domain.Form frm = (domain.Form) (views.getParent().eContainer());
		// domain.ApplicationUILayer app = ((domain.UIPackage)
		// (frm.eContainer()))
		// .getParent().getParent();
		//
		// try {
		//
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::ApplicationUILayer.allInstances()->select(q|q.uid='"+app.getUid()+"')"
		// + "
		// ->collect(v|v.oclAsType(domain::ApplicationUILayer).applicationUIPackages"
		// + "
		// ->collect(w|w.oclAsType(domain::ApplicationUIPackage).uipackage.forms"
		// + " ->collect(f|f.oclAsType(domain::Form).view.view.menus)"
		// + "
		// ->collect(fl|fl.oclAsType(domain::MenuDefinition).menuView.menuFolders"
		// + "
		// ->collect(mf|mf.oclAsType(domain::MenuFolder)->select(e|e.extensionPoint)
		// ))))");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.MenuFolder> map = (Collection<domain.MenuFolder>)
		// ocl
		// .evaluate(ref, query);
		//
		// ArrayList<domain.MenuFolder> list = new
		// ArrayList<domain.MenuFolder>();
		//
		// if (map.size() != 0) {
		// for (domain.MenuFolder point : map) {
		// if (point.getName() != null && !point.getName().trim().equals(""))
		// list.add(point);
		// }
		// }
		// return list;
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return new ArrayList<domain.MenuFolder>();
		// }
		//
		//
	}

	public List<Uielement> findUIElementsForPage(CanvasFrame canvasFrame) {
		throw new RuntimeException();
		//
		// try {
		// @SuppressWarnings("rawtypes")
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// @SuppressWarnings("unchecked")
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));
		//
		// OCLExpression<EClassifier> query = helper
		// .createQuery("domain::CanvasFrame.allInstances()->select(r|r.oclAsType(domain::CanvasFrame).uid
		// ='"
		// + canvasFrame.getUid()
		// +
		// "')->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");
		//
		// @SuppressWarnings("unchecked")
		// Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
		// .evaluate(canvasFrame, query);
		//
		// ArrayList<domain.Uielement> list = new ArrayList<domain.Uielement>();
		//
		// if (map.size() != 0) {
		// for (Iterator<domain.ViewArea> itr = map.iterator(); itr
		// .hasNext();) {
		// domain.ViewArea viewarea = itr.next();
		// if (viewarea.getCanvasView() != null)
		// findUIElement(list, viewarea.getCanvasView()
		// .getBaseCanvas());
		// }
		// }
		// return list;
		// } catch (Exception e) {
		// LogUtil.log(e);
		// return new ArrayList<domain.Uielement>();
		// }

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

	public List<Type> queryTypesByHint(Object obj, String packageName, String artifactName, String hint,
			String artifactLib) {
		throw new RuntimeException();

		// List<domain.Type> array = new ArrayList<domain.Type>();
		//
		// try {
		// OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		// OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
		// .createOCLHelper();
		// helper.setContext(DomainPackage.eINSTANCE
		// .getEClassifier("Domain"));
		//
		//
		// String
		// query_str="domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='${Package
		// name}').oclAsType(domain::Package).typedefinition.types->select(r|((r.oclIsKindOf(domain::Type
		// ) )
		// )).oclAsType(domain::Categorized).classifiers->select(c|c.hint.name='${Hint}'
		// and
		// c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).name
		// = '${Artifact}' and
		// c.hint.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Artifact).parent.oclAsType(domain::Artifacts).parent.oclAsType(domain::DomainArtifact).name
		// = '${ArtifactLib}'
		// )->collect(c|c.oclAsType(ecore::EObject).eContainer())";
		// query_str = query_str.replaceAll("\\$\\{Package name\\}",
		// packageName).replaceAll("\\$\\{Artifact\\}",
		// artifactName).replaceAll("\\$\\{Hint\\}",
		// hint).replaceAll("\\$\\{ArtifactLib\\}", artifactLib);
		//
		// OCLExpression<EClassifier> query = helper.createQuery(query_str);
		//
		// Collection<domain.Type> map = (Collection<domain.Type>)
		// ocl.evaluate(obj, query);
		//
		// array = new ArrayList<domain.Type>();
		// array.addAll(map);
		//
		// } catch (Exception e) {
		// LogUtil.log(e);
		// }
		// return array;
		//
	}

	public Object executeQuery(String strQuery, EObject eobj) throws ParserException {
		return internalEvaluate(eobj, strQuery);

	}

}
