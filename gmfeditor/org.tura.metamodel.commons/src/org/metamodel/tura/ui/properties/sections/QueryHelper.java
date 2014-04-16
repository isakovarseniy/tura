package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.ContextValue;
import domain.DomainFactory;
import domain.DomainPackage;
import domain.Parameter;
import domain.TriggerParameter;
import domain.Types;

public class QueryHelper {

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
			e.printStackTrace();
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
			e.printStackTrace();
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
	public List<Object> findTriggerParameters(domain.Trigger trg,
			EObject types, EditingDomain editingDomain) throws ParserException {

		ArrayList<domain.TriggerParameter> removeParameters = new ArrayList<domain.TriggerParameter>();
		ArrayList<domain.TriggerParameter> addParameters = new ArrayList<domain.TriggerParameter>();

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Operation.allInstances()->select(r|r.oclAsType(domain::Operation).uid ='"
						+ trg.getMethodRef().getUid()
						+ "').oclAsType(domain::Operation).parameters");

		Collection<domain.Parameter> map = (Collection<Parameter>) ocl
				.evaluate(types, query);

		ArrayList<domain.Parameter> parameters = new ArrayList<domain.Parameter>();
		for (Iterator<domain.Parameter> i = map.iterator(); i.hasNext();) {
			domain.Parameter p = i.next();
			parameters.add(p);
		}
		Collections.sort(parameters,new ParameterComparator());

		ArrayList<domain.TriggerParameter> trgParameters = new ArrayList<domain.TriggerParameter>();
		for (Iterator<domain.TriggerParameter> i = trg.getParameters().iterator(); i.hasNext();) {
			domain.TriggerParameter p = i.next();
			trgParameters.add(p);
		}

		Collections.sort(trgParameters,new TriggerParameterComparator());
		
		
		boolean renewParameters = false;
		if (trgParameters.size() != parameters.size()){
			removeParameters.addAll(trgParameters);
			renewParameters = true;
		}
		else {

			for (int i = 0; i < trgParameters.size(); i++) {
				TriggerParameter trgParam = trgParameters.get(i);
				domain.Parameter param = parameters.get(i);
				if (trgParam.getParameter() == null || !trgParam.getParameter().getUid().equals(param.getUid())) {
					removeParameters.addAll(trgParameters);
					renewParameters = true;
					break;
				}
			}
		}
		if (renewParameters) {
			for (int i = 0; i < parameters.size(); i++) {
				TriggerParameter trgParam = DomainFactory.eINSTANCE
						.createTriggerParameter();
				trgParam.setParameter(parameters.get(i));
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
							DomainPackage.eINSTANCE.getTrigger_Parameters(),
							removeParameters));
		}

		if (addParameters.size() != 0) {
			editingDomain.getCommandStack().execute(
					AddCommand.create(editingDomain, trg,
							DomainPackage.eINSTANCE.getTrigger_Parameters(),
							addParameters));
		}

		trgParameters = new ArrayList<domain.TriggerParameter>();
		for (Iterator<domain.TriggerParameter> i = trg.getParameters().iterator(); i.hasNext();) {
			domain.TriggerParameter p = i.next();
			trgParameters.add(p);
		}
		Collections.sort(trgParameters,new TriggerParameterComparator());
		
		ArrayList<Object> rows = new ArrayList<>();
		rows.addAll(trgParameters);
		return rows;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public domain.Types getTypesRepository(EObject obj) throws Exception{
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::Types.allInstances()");

		Collection<domain.Types> map = (Collection<domain.Types>) ocl
				.evaluate(obj, query);
		if (map != null && map.size() != 0)
			return (Types) map.toArray()[0];
		
		return null;
		
	}
	
	class ParameterComparator implements Comparator<domain.Parameter>{

		@Override
		public int compare(Parameter o1, Parameter o2) {
			return new Integer(o1.getOrder()).compareTo(new Integer(o2.getOrder()));
		}
		
	}
	
	class TriggerParameterComparator implements Comparator<domain.TriggerParameter>{

		@Override
		public int compare(TriggerParameter o1, TriggerParameter o2) {
			if (o1.getParameter() == null || o2.getParameter() == null)
				return -1;
			return new Integer(o1.getParameter().getOrder()).compareTo(new Integer(o2.getParameter().getOrder()));
		}
		
	}
	
	
}
