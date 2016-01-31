package org.tura.metamodel.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.tura.metamodel.commons.initdiagram.InitDiagram;
import org.tura.metamodel.commons.properties.selections.adapters.helper.DataControlHolder;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeDataControl;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRootDataControlHolder;

import domain.ContextParameter;
import domain.ContextValue;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Form;
import domain.Parameter;
import domain.Type;
import domain.Types;
import domain.Views;

public class QueryHelper {

	public Object getApplicationRoles(DiagramImpl root) {
		domain.Form frm = getForm(root);
		domain.Application app = ((domain.UIPackage) frm.eContainer())
				.getParent().getParent().getParent();
		if (app.getApplicationRole() != null)
			return app.getApplicationRole().getRoles();
		return null;
	}

	public Object getMessages(DiagramImpl root) {
		domain.Form frm = getForm(root);

		domain.Application app = ((domain.UIPackage) (frm.eContainer()))
				.getParent().getParent().getParent();
		if (app.getApplicationMessages() != null)
			return app.getApplicationMessages().getMessages();

		return null;
	}

	public Object getApplicationStyle(DiagramImpl root) {
		domain.Form frm = getForm(root);

		domain.Application app = ((domain.UIPackage) (frm.eContainer()))
				.getParent().getParent().getParent();
		if (app.getApplicationStyle() != null)
			return app.getApplicationStyle();

		return null;
	}

	public domain.Form getForm(domain.DataControl dc) {
		return (Form) dc.getParent().getParent().eContainer();
	}

	public domain.Form getForm(DiagramImpl root) {
		domain.Form frm = null;

		if (root.getElement() instanceof domain.Controls) {
			frm = (Form) ((domain.Controls) root.getElement()).getParent()
					.eContainer();
		}

		if (root.getElement() instanceof domain.MenuView) {
			domain.Views views = (Views) (((domain.MenuView) root.getElement())
					.getParent().eContainer());
			frm = (domain.Form) (views.getParent().eContainer());

		}

		if (root.getElement() instanceof domain.CanvasView) {

			domain.Views views = (Views) (((domain.CanvasView) root
					.getElement()).getParent().eContainer().eContainer());

			frm = (domain.Form) (views.getParent().eContainer());

		}

		if (root.getElement() instanceof domain.Views) {
			domain.Views views = (Views) root.getElement();
			frm = (domain.Form) (views.getParent().eContainer());
		}

		return frm;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getTreeLeafs(List<Object> ls, domain.DataControl root)
			throws Exception {

		ls.add(root);

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Relation.allInstances()->select(r|r.isTree=true and r.master.uid ='"
						+ root.getUid() + "')->collect(r|r.detail)");

		Collection<domain.DataControl> map = (Collection<domain.DataControl>) ocl
				.evaluate(root, query);

		for (domain.DataControl dc : map) {
			if (!ls.contains(dc)) {
				getTreeLeafs(ls, dc);
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public domain.Configuration getConfigExtensionUp(domain.Configuration config)
			throws Exception {

		if (getConfigExtensionGard(config))
			throw new Exception(
					"Configuration cannot be sources for more then 1 configuration tree");

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::ConfigExtension.allInstances()->select(r|r.source.uid ='"
						+ config.getUid() + "')");

		Collection<domain.ConfigExtension> map = (Collection<domain.ConfigExtension>) ocl
				.evaluate(config, query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getTarget();
		else
			return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public domain.Configuration getConfigExtensionDown(
			domain.Configuration config) throws Exception {

		if (getConfigExtensionGard(config))
			return null;

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::ConfigExtension.allInstances()->select(r|r.target.uid ='"
						+ config.getUid() + "')");

		Collection<domain.ConfigExtension> map = (Collection<domain.ConfigExtension>) ocl
				.evaluate(config, query);
		if ((map != null) && (map.size() != 0))
			return map.iterator().next().getSource();
		else
			return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean getConfigExtensionGard(domain.Configuration config)
			throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::ConfigExtension.allInstances()->select(r|r.source.uid ='"
						+ config.getUid() + "')");

		Collection<domain.ConfigExtension> map = (Collection<domain.ConfigExtension>) ocl
				.evaluate(config, query);
		if ((map != null) && (map.size() > 1))
			return true;
		else
			return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<?> getControlsList(DiagramImpl root) throws Exception {

		domain.Form frm = getForm(root);
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
		domain.Form frm = getForm(root);
		return frm.getDatacontrols().getFormControl().getRoot();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<TreeDataControl> findTreeRootControls(domain.Form frm)
			throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Relation.allInstances()->select(r|r.isTree=true and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "')->collect(w|w.master)->reject(q|domain::Relation.allInstances()->select(r|r.isTree=true and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "')->collect(w|w.detail)->includes(q))");

		Collection<domain.DataControl> map = (Collection<domain.DataControl>) ocl
				.evaluate(frm, query);

		// Remove duplication
		HashMap<String, domain.DataControl> hash = new HashMap<>();
		for (domain.DataControl dc : map)
			hash.put(dc.getUid(), dc);

		query = helper
				.createQuery("domain::Relation.allInstances()->select(r|r.isTree=true and  r.master=r.detail and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "')->collect(w|w.master)->reject(q|domain::Relation.allInstances()->select(r|r.isTree=true and r.master <> r.detail and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "')->collect(w|w.detail)->includes(q))");

		Collection<domain.DataControl> map1 = (Collection<domain.DataControl>) ocl
				.evaluate(frm, query);

		ArrayList<TreeDataControl> ls = new ArrayList<>();
		for (domain.DataControl dc : hash.values())
			ls.add(new TreeDataControl(dc));
		for (domain.DataControl dc : map1)
			ls.add(new TreeDataControl(dc));

		return ls;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<domain.DataControl> findMasterControls(domain.Form frm)
			throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::DataControl.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "' )->reject(q|domain::Relation.allInstances()->select(r|r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "' )->collect(w|w.detail)->includes(q))");

		Collection<domain.DataControl> map = ((Collection<domain.DataControl>) ocl
				.evaluate(frm, query));

		for (TreeDataControl obj : findTreeRootControls(frm))
			map.remove(obj.getDc());

		return map;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Collection<domain.DataControl> findDetailAndDependencyControls(
			domain.Form frm) throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Relation.allInstances()->select(r|r.isTree=false and r.oclAsType(ecore::EObject).eContainer().oclAsType(domain::Controls).uid = '"
						+ frm.getDatacontrols().getFormControl().getUid()
						+ "')->collect(w|w.detail)");

		Collection<domain.DataControl> map = (Collection<domain.DataControl>) ocl
				.evaluate(frm, query);

		for (TreeDataControl obj : findTreeRootControls(frm))
			map.remove(obj.getDc());

		return map;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object[] findMappingSpecifiers(domain.ModelMapper eObject,
			EObject types) throws Exception {

		Object[] result = new Object[2];

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		Collection<domain.MappingSpecifier> map = eObject.getSpecifiers();

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
						+ eObject.getDomainArtifactRef().getUid()
						+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid ='"
						+ eObject.getArtifactRef().getUid()
						+ "').oclAsType(domain::Artifact).specifiers");

		Collection<domain.Specifier> map1 = (Collection<domain.Specifier>) ocl
				.evaluate(types, query);

		ArrayList<domain.MappingSpecifier> removeSpecifiers = new ArrayList<domain.MappingSpecifier>();
		for (Iterator<domain.MappingSpecifier> itr1 = map.iterator(); itr1
				.hasNext();) {
			domain.MappingSpecifier ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.Specifier> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.Specifier sp = itr2.next();
				if ((ms.getSpecifierRef() != null)
						&& (sp.getUid().equals(ms.getSpecifierRef().getUid())))
					isRemove = false;
			}
			if (isRemove)
				removeSpecifiers.add(ms);
		}

		ArrayList<domain.Specifier> addSpecifiers = new ArrayList<domain.Specifier>();
		for (Iterator<domain.Specifier> itr1 = map1.iterator(); itr1.hasNext();) {
			domain.Specifier ms = itr1.next();
			boolean isAdd = false;
			if (map.size() == 0)
				isAdd = true;
			else {
				isAdd = true;
				for (Iterator<domain.MappingSpecifier> itr2 = map.iterator(); itr2
						.hasNext();) {
					domain.MappingSpecifier sp = itr2.next();
					if ((sp.getSpecifierRef() != null)
							&& (sp.getSpecifierRef().getUid().equals(ms
									.getUid())))
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object[] findMappingVariable(domain.Query eObject, EObject types)
			throws Exception {

		ArrayList<domain.QueryParameter> addVariables = new ArrayList<domain.QueryParameter>();
		ArrayList<domain.QueryVariable> removeVariables = new ArrayList<domain.QueryVariable>();
		if ((eObject.getQueryRef() != null)
				&& ((domain.ModelMapper) (((domain.Query) eObject).eContainer()))
						.getDomainArtifactRef() != null
				&& ((domain.ModelMapper) (((domain.Query) eObject).eContainer()))
						.getArtifactRef() != null) {
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			Collection<domain.QueryVariable> map = ((domain.Query) eObject)
					.getVariables();

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
							+ ((domain.ModelMapper) (((domain.Query) eObject)
									.eContainer())).getDomainArtifactRef()
									.getUid()
							+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid ='"
							+ ((domain.ModelMapper) (((domain.Query) eObject)
									.eContainer())).getArtifactRef().getUid()
							+ "').oclAsType(domain::Artifact).modelQuery->select(r|r.oclAsType(domain::ModelQuery).uid= '"
							+ eObject.getQueryRef().getUid() + "').parameters");

			Collection<domain.QueryParameter> map1 = (Collection<domain.QueryParameter>) ocl
					.evaluate(types, query);

			for (Iterator<domain.QueryVariable> itr1 = map.iterator(); itr1
					.hasNext();) {
				domain.QueryVariable ms = itr1.next();
				boolean isRemove = true;
				for (Iterator<domain.QueryParameter> itr2 = map1.iterator(); itr2
						.hasNext();) {
					domain.QueryParameter sp = itr2.next();
					if ((ms.getQueryParamRef() != null)
							&& (sp.getUid().equals(ms.getQueryParamRef()
									.getUid())))
						isRemove = false;
				}
				if (isRemove)
					removeVariables.add(ms);
			}

			for (Iterator<domain.QueryParameter> itr1 = map1.iterator(); itr1
					.hasNext();) {
				domain.QueryParameter ms = itr1.next();
				boolean isAdd = false;
				if (map.size() == 0)
					isAdd = true;
				else {
					isAdd = true;
					for (Iterator<domain.QueryVariable> itr2 = map.iterator(); itr2
							.hasNext();) {
						domain.QueryVariable sp = itr2.next();
						if ((sp.getQueryParamRef() != null)
								&& (sp.getQueryParamRef().getUid().equals(ms
										.getUid())))
							isAdd = false;
					}
				}
				if (isAdd)
					addVariables.add(ms);
			}
		}
		Object[] result = new Object[2];
		result[0] = addVariables;
		result[1] = removeVariables;
		return result;

	}

	public Set<domain.ApplicationMapper> findAvailableMappersForRecipe(
			domain.Recipe recipe) {

		HashSet<domain.ApplicationMapper> mappers = new HashSet<domain.ApplicationMapper>();
		try {

			List<domain.ApplicationMapper> appMapperLst = recipe.getParent()
					.getParent().getParent().getParent()
					.getApplicationMappers().getMappers();

			for (Iterator<domain.ApplicationMapper> itr = appMapperLst
					.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = itr.next();
				mappers.add(mapper);
			}

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return mappers;
	}

	public Set<domain.ApplicationMapper> findAvailableMappersForIngredient(
			domain.Ingredient ingr) {

		HashSet<domain.ApplicationMapper> mappers = new HashSet<domain.ApplicationMapper>();
		try {

			List<domain.ApplicationMapper> appMapperLst = ingr.getParent()
					.getParent().getParent().getParent().getParent()
					.getApplicationMappers().getMappers();

			List<domain.ApplicationMapper> recipeLs = ingr.getParent()
					.getMappers();

			for (Iterator<domain.ApplicationMapper> itr = appMapperLst
					.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = itr.next();
				if (!recipeLs.contains(mapper))
					mappers.add(mapper);
			}

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return mappers;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<domain.ApplicationMapper> removeMappersForRecipe(
			domain.Recipe eObject) {
		ArrayList<domain.ApplicationMapper> removeMappers = new ArrayList<domain.ApplicationMapper>();
		if (eObject.getMappers() == null || eObject.getMappers().size() == 0)
			return removeMappers;

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		List<domain.ApplicationMapper> map = eObject.getMappers();

		List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
				.getParent().getParent().getApplicationMappers().getMappers();

		for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1
				.hasNext();) {
			domain.ApplicationMapper ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.ApplicationMapper sp = itr2.next();
				if (sp.getUid().equals(ms.getUid()))
					isRemove = false;
			}
			if (isRemove)
				removeMappers.add(ms);
		}
		return removeMappers;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<domain.ApplicationMapper> removeMappersForIngredient(
			domain.Ingredient eObject) {
		ArrayList<domain.ApplicationMapper> removeMappers = new ArrayList<domain.ApplicationMapper>();

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		List<domain.ApplicationMapper> map = eObject.getMappers();

		List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
				.getParent().getParent().getParent().getApplicationMappers()
				.getMappers();

		List<domain.ApplicationMapper> recipeLs = eObject.getParent()
				.getMappers();

		for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1
				.hasNext();) {
			domain.ApplicationMapper ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.ApplicationMapper sp = itr2.next();
				if (sp.getUid().equals(ms.getUid()))
					isRemove = false;
				if (recipeLs.contains(ms))
					isRemove = true;
			}
			if (isRemove)
				removeMappers.add(ms);
		}
		return removeMappers;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Object> findTriggerParameters(domain.Operation method,
			domain.ContextParameters trg, EObject types,
			EditingDomain editingDomain) throws ParserException {

		ArrayList<domain.ContextParameter> removeParameters = new ArrayList<domain.ContextParameter>();
		ArrayList<domain.ContextParameter> addParameters = new ArrayList<domain.ContextParameter>();

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Operation.allInstances()->select(r|r.oclAsType(domain::Operation).uid ='"
						+ method.getUid()
						+ "').oclAsType(domain::Operation).parameters");

		Collection<domain.Parameter> map = (Collection<Parameter>) ocl
				.evaluate(types, query);

		ArrayList<domain.Parameter> parameters = new ArrayList<domain.Parameter>();
		for (Iterator<domain.Parameter> i = map.iterator(); i.hasNext();) {
			domain.Parameter p = i.next();
			parameters.add(p);
		}
		Collections.sort(parameters, new ParameterComparator());

		ArrayList<domain.ContextParameter> trgParameters = new ArrayList<domain.ContextParameter>();
		for (Iterator<domain.ContextParameter> i = trg.getParameters()
				.iterator(); i.hasNext();) {
			domain.ContextParameter p = i.next();
			trgParameters.add(p);
		}

		Collections.sort(trgParameters, new ContextParameterComparator());

		boolean renewParameters = false;
		if (trgParameters.size() != parameters.size()) {
			removeParameters.addAll(trgParameters);
			renewParameters = true;
		} else {

			for (int i = 0; i < trgParameters.size(); i++) {
				ContextParameter trgParam = trgParameters.get(i);
				domain.Parameter param = parameters.get(i);
				if (trgParam.getRefObj() == null
						|| !((domain.Parameter) trgParam.getRefObj()).getUid()
								.equals(param.getUid())) {
					removeParameters.addAll(trgParameters);
					renewParameters = true;
					break;
				}
			}
		}
		if (renewParameters) {
			for (int i = 0; i < parameters.size(); i++) {
				ContextParameter trgParam = DomainFactory.eINSTANCE
						.createContextParameter();
				trgParam.setRefObj(parameters.get(i));
				trgParam.setUid(UUID.randomUUID().toString());
				addParameters.add(trgParam);
				ContextValue value = DomainFactory.eINSTANCE
						.createContextValue();
				value.setUid(UUID.randomUUID().toString());
				trgParam.setValue(value);
			}
		}
		if (removeParameters.size() != 0) {
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain, trg,
							DomainPackage.eINSTANCE
									.getContextParameters_Parameters(),
							removeParameters));
		}

		if (addParameters.size() != 0) {
			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain, trg,
							DomainPackage.eINSTANCE
									.getContextParameters_Parameters(),
							addParameters));
		}

		trgParameters = new ArrayList<domain.ContextParameter>();
		for (Iterator<domain.ContextParameter> i = trg.getParameters()
				.iterator(); i.hasNext();) {
			domain.ContextParameter p = i.next();
			trgParameters.add(p);
		}
		Collections.sort(trgParameters, new ContextParameterComparator());

		ArrayList<Object> rows = new ArrayList<>();
		rows.addAll(trgParameters);
		return rows;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public domain.Types getTypesRepository(EObject obj) throws Exception {
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Types.allInstances()");

		Collection<domain.Types> map = (Collection<domain.Types>) ocl.evaluate(
				obj, query);
		if (map != null && map.size() != 0)
			return (Types) map.toArray()[0];

		return null;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public domain.DomainArtifacts getDomainArtifact(EObject obj)
			throws Exception {
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::DomainArtifacts.allInstances()");

		Collection<domain.DomainArtifacts> map = (Collection<domain.DomainArtifacts>) ocl
				.evaluate(obj, query);
		if (map != null && map.size() != 0)
			return (domain.DomainArtifacts) map.toArray()[0];

		return null;

	}

	class ParameterComparator implements Comparator<domain.Parameter> {

		@Override
		public int compare(Parameter o1, Parameter o2) {
			return new Integer(o1.getOrder()).compareTo(new Integer(o2
					.getOrder()));
		}

	}

	class ContextParameterComparator implements
			Comparator<domain.ContextParameter> {

		@Override
		public int compare(ContextParameter o1, ContextParameter o2) {
			if (o1.getRefObj() == null || o2.getRefObj() == null)
				return -1;
			return new Integer(((domain.Parameter) o1.getRefObj()).getOrder())
					.compareTo(new Integer(((domain.Parameter) o2.getRefObj())
							.getOrder()));
		}

	}

	public void getInheritTypes(List<domain.Type> typesTree, domain.Type type) {

		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::TypeExtension.allInstances()->select(r|r.oclAsType(domain::TypeExtension).target.oclIsKindOf(domain::Type) and  "
							+ "r.oclAsType(domain::TypeExtension).target.uid ='"
							+ type.getUid() + "')");

			@SuppressWarnings("unchecked")
			Collection<domain.TypeExtension> map = (Collection<domain.TypeExtension>) ocl
					.evaluate(type, query);

			query = helper
					.createQuery("domain::TypeExtension.allInstances()->select(r|r.oclAsType(domain::TypeExtension).target.oclIsKindOf(domain::TypeReference) "
							+ "and "
							+ "r.oclAsType(domain::TypeExtension).target.oclAsType(domain::TypeReference).typeRef.uid = '"
							+ type.getUid() + "')");

			@SuppressWarnings("unchecked")
			Collection<domain.TypeExtension> map1 = (Collection<domain.TypeExtension>) ocl
					.evaluate(type, query);

			HashMap<String, domain.TypeElement> joinmap = new HashMap<String, domain.TypeElement>();

			if (map != null) {
				for (Iterator<domain.TypeExtension> itr = map.iterator(); itr
						.hasNext();) {
					domain.TypeElement el = itr.next().getSource();
					joinmap.put(el.getUid(), el);
				}
			}

			if (map1 != null) {
				for (Iterator<domain.TypeExtension> itr = map1.iterator(); itr
						.hasNext();) {
					domain.TypeElement el = itr.next().getSource();
					joinmap.put(el.getUid(), el);
				}
			}

			for (Iterator<domain.TypeElement> itr = joinmap.values().iterator(); itr
					.hasNext();) {
				domain.TypeElement t = itr.next();
				typesTree.add((Type) t);
				getInheritTypes(typesTree, (Type) t);
			}

		} catch (Exception e) {
			LogUtil.log(e);
		}

	}

	public domain.TypeElement findSearchCriteriaType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
							+ InitDiagram.BASE_PACKAGE
							+ "').oclAsType(domain::Package)."
							+ "typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = 'Search criterias') )");

			@SuppressWarnings("unchecked")
			Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public domain.TypeElement findStringType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Primitive.allInstances()->select(r|r.oclAsType(domain::Primitive).name = 'String'  and  r.oclAsType(domain::Primitive).parent.parent.name ='"
							+ InitDiagram.PRIVATE_PACKAGE + "')");

			@SuppressWarnings("unchecked")
			Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public domain.TypeElement findIntegerType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Primitive.allInstances()->select(r|r.oclAsType(domain::Primitive).name = 'Integer'  and  r.oclAsType(domain::Primitive).parent.parent.name ='"
							+ InitDiagram.PRIVATE_PACKAGE + "')");

			@SuppressWarnings("unchecked")
			Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public domain.TypeElement findBooleanType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Primitive.allInstances()->select(r|r.oclAsType(domain::Primitive).name = 'Boolean'  and  r.oclAsType(domain::Primitive).parent.parent.name ='"
							+ InitDiagram.PRIVATE_PACKAGE + "')");

			@SuppressWarnings("unchecked")
			Collection<domain.Primitive> map = (Collection<domain.Primitive>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;

	}

	public domain.TypeElement findBaseType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
							+ InitDiagram.BASE_PACKAGE
							+ "').oclAsType(domain::Package)."
							+ "typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = 'BaseType') )");

			@SuppressWarnings("unchecked")
			Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public domain.TypeElement findDataControlType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
							+ InitDiagram.BASE_PACKAGE
							+ "').oclAsType(domain::Package)."
							+ "typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = 'Data control') )");

			@SuppressWarnings("unchecked")
			Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public domain.TypeElement findTreeDataControlType(Object obj) {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Package.allInstances()->select(r|r.oclAsType(domain::Package).name='"
							+ InitDiagram.BASE_PACKAGE
							+ "').oclAsType(domain::Package)."
							+ "typedefinition.types->select(r|(r.oclIsKindOf(domain::Type) and  r.oclAsType(domain::Type).name = 'Tree data control') )");

			@SuppressWarnings("unchecked")
			Collection<domain.TypeElement> map = (Collection<domain.TypeElement>) ocl
					.evaluate(obj, query);

			if (map.size() != 0)
				return map.iterator().next();

		} catch (Exception e) {
			LogUtil.log(e);
		}
		return null;
	}

	public List<domain.NickNamed> collectRefreshedAeas(domain.Views views)
			throws Exception {
		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid = '"
							+ views.getUid()
							+ "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");

			@SuppressWarnings("unchecked")
			Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
					.evaluate(views, query);

			query = helper
					.createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid = '"
							+ views.getUid()
							+ "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::NickNamed) and q.oclAsType(domain::NickNamed).nickname <> null and  q.oclAsType(domain::NickNamed).nickname <> '')");

			@SuppressWarnings("unchecked")
			Collection<domain.NickNamed> map1 = (Collection<domain.NickNamed>) ocl
					.evaluate(views, query);

			ArrayList<domain.NickNamed> nickNamed = new ArrayList<domain.NickNamed>();

			if (map.size() != 0) {
				for (Iterator<domain.ViewArea> itr = map.iterator(); itr
						.hasNext();) {
					domain.ViewArea viewarea = itr.next();
					if (viewarea.getCanvasView() != null)
						findNick(nickNamed, viewarea.getCanvasView()
								.getBaseCanvas(), null);
				}
			}
			nickNamed.addAll(map1);

			return nickNamed;

		} catch (Exception e) {
			LogUtil.log(e);
			return null;
		}

	}

	public Object[] findRefreshedAeas(domain.Uielement obj) throws Exception {

		EObject root = obj;
		do {
			root = root.eContainer();
			if (root == null)
				throw new Exception("UI element container is null");
		} while (!(root instanceof domain.CanvasView));

		domain.Views views = (Views) ((domain.CanvasView) root).getParent()
				.eContainer().eContainer();

		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid = '"
							+ views.getUid()
							+ "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");

			@SuppressWarnings("unchecked")
			Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
					.evaluate(obj, query);

			query = helper
					.createQuery("domain::Views.allInstances()->select(r|r.oclAsType(domain::Views).uid = '"
							+ views.getUid()
							+ "').canvases->select(c|c.oclIsKindOf(domain::ViewPortHolder))->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::NickNamed) and q.oclAsType(domain::NickNamed).nickname <> null and  q.oclAsType(domain::NickNamed).nickname <> '')");

			@SuppressWarnings("unchecked")
			Collection<domain.NickNamed> map1 = (Collection<domain.NickNamed>) ocl
					.evaluate(obj, query);

			ArrayList<domain.NickNamed> nickNamed = new ArrayList<domain.NickNamed>();
			ArrayList<domain.AreaRef> remove = new ArrayList<domain.AreaRef>();

			if (map.size() != 0) {
				for (Iterator<domain.ViewArea> itr = map.iterator(); itr
						.hasNext();) {
					domain.ViewArea viewarea = itr.next();
					if (viewarea.getCanvasView() != null)
						findNick(nickNamed, viewarea.getCanvasView()
								.getBaseCanvas(), obj);
				}
			}
			nickNamed.addAll(map1);

			for (domain.AreaRef ref : obj.getRefreshAreas()) {

				if (ref.getArea() == null
						|| ref.getArea().getNickname() == null
						|| "".equals(ref.getArea().getNickname()))
					remove.add(ref);
			}
			return new Object[] { nickNamed, remove };

		} catch (Exception e) {
			LogUtil.log(e);
			return new Object[] { null, null };
		}

	}

	private void findNick(List<domain.NickNamed> list,
			domain.LayerHolder holder, domain.Uielement exception) {

		if (holder.getNickname() != null && !"".equals(holder.getNickname())) {
			if (exception != null && exception.getUid() != holder.getUid())
				list.add(holder);
			if (exception == null)
				list.add(holder);
		}

		for (Iterator<domain.Uielement> itr = holder.getChildren().iterator(); itr
				.hasNext();) {

			domain.Uielement el = itr.next();
			if (el instanceof domain.LayerHolder) {
				findNick(list, (domain.LayerHolder) el, exception);
				continue;
			}

			if (el.getNickname() != null && !"".equals(el.getNickname())) {
				if (exception != null && exception.getUid() != el.getUid())
					list.add(el);
				if (exception == null)
					list.add(el);
			}
		}
	}

	private void findUIElement(List<domain.Uielement> list,
			domain.LayerHolder holder) {
		list.add(holder);

		for (Iterator<domain.Uielement> itr = holder.getChildren().iterator(); itr
				.hasNext();) {

			domain.Uielement el = itr.next();
			if (el instanceof domain.LayerHolder) {
				findUIElement(list, (domain.LayerHolder) el);
				continue;
			} else {
				list.add(el);
			}

		}
	}

	public List<domain.MenuExtensionPoint> findExtensionPoints(
			domain.MenuExtensionRef ref) {

		try {

			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::ApplicationUILayer.allInstances()->select(q|q.uid='f8d4b412-d69a-46c7-bf26-2ac0ec31117e')"
							+ "          ->collect(v|v.oclAsType(domain::ApplicationUILayer).applicationUIPackages"
							+ "                ->collect(w|w.oclAsType(domain::ApplicationUIPackage).uipackage.forms"
							+ "                  ->collect(f|f.oclAsType(domain::Form).view.view.menus)"
							+ "                     ->collect(fl|fl.oclAsType(domain::MenuDefinition).menuView.menuFolders"
							+ "                       ->collect(mf|mf.oclAsType(domain::MenuFolder).menuElements->select(e|e.oclIsKindOf(domain::MenuExtensionPoint)) ))))");

			@SuppressWarnings("unchecked")
			Collection<domain.MenuExtensionPoint> map = (Collection<domain.MenuExtensionPoint>) ocl
					.evaluate(ref, query);

			ArrayList<domain.MenuExtensionPoint> list = new ArrayList<domain.MenuExtensionPoint>();

			if (map.size() != 0) {
				for (domain.MenuExtensionPoint point :  map) {
					if (point.getName() != null && !point.getName().trim().equals(""))
						list.add(point);
				}
			}
			return list;
			
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<domain.MenuExtensionPoint>();
		}


	}

	public List<domain.Uielement> findUIElementsForPage(
			domain.CanvasFrame canvasFrame) {

		try {
			@SuppressWarnings("rawtypes")
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			@SuppressWarnings("unchecked")
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper
					.createQuery("domain::CanvasFrame.allInstances()->select(r|r.oclAsType(domain::CanvasFrame).uid ='"
							+ canvasFrame.getUid()
							+ "')->collect(v|v.oclAsType(domain::ViewPortHolder).viewElement)->select(q|q.oclIsKindOf(domain::ViewArea))");

			@SuppressWarnings("unchecked")
			Collection<domain.ViewArea> map = (Collection<domain.ViewArea>) ocl
					.evaluate(canvasFrame, query);

			ArrayList<domain.Uielement> list = new ArrayList<domain.Uielement>();

			if (map.size() != 0) {
				for (Iterator<domain.ViewArea> itr = map.iterator(); itr
						.hasNext();) {
					domain.ViewArea viewarea = itr.next();
					if (viewarea.getCanvasView() != null)
						findUIElement(list, viewarea.getCanvasView()
								.getBaseCanvas());
				}
			}
			return list;
		} catch (Exception e) {
			LogUtil.log(e);
			return new ArrayList<domain.Uielement>();
		}

	}

}
