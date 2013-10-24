package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.internal.modeled.model.validation.Constraint;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.DomainPackage;

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
	public Object[] findMappingVariable(domain.ModelMapper eObject,
			EObject types) throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		Collection<domain.MappingVariable> map = ((domain.ModelMapper) eObject)
				.getVariables();

		OCLExpression<EClassifier> query = helper
				.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).uid='"
						+ eObject.getDomainArtifactRef().getUid()
						+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).uid ='"
						+ eObject.getArtifactRef().getUid()
						+ "').oclAsType(domain::Artifact).modelQuery");

		Collection<domain.Variable> map1 = (Collection<domain.Variable>) ocl
				.evaluate(types, query);

		ArrayList<domain.MappingVariable> removeVariables = new ArrayList<domain.MappingVariable>();
		for (Iterator<domain.MappingVariable> itr1 = map.iterator(); itr1
				.hasNext();) {
			domain.MappingVariable ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.Variable> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.Variable sp = itr2.next();
				if ((ms.getVariableRef() != null)&&(sp.getUid().equals(ms.getVariableRef().getUid())))
					isRemove = false;
			}
			if (isRemove)
				removeVariables.add(ms);
		}

		ArrayList<domain.Variable> addVariables = new ArrayList<domain.Variable>();
		for (Iterator<domain.Variable> itr1 = map1.iterator(); itr1.hasNext();) {
			domain.Variable ms = itr1.next();
			boolean isAdd = false;
			if (map.size() == 0)
				isAdd = true;
			else {
				isAdd = true;
				for (Iterator<domain.MappingVariable> itr2 = map.iterator(); itr2
						.hasNext();) {
					domain.MappingVariable sp = itr2.next();
					if ((sp.getVariableRef() != null) &&(sp.getVariableRef().getUid().equals(ms.getUid())))
						isAdd = false;
				}
			}
			if (isAdd)
				addVariables.add(ms);
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

			List<domain.ApplicationMapper> recipeLs = ingr.getParent().getMappers();

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
	public List<domain.ApplicationMapper> removeMappersForRecipe(domain.Recipe eObject) {
		ArrayList<domain.ApplicationMapper> removeMappers = new ArrayList<domain.ApplicationMapper>();
		if  (eObject.getMappers()  ==  null || eObject.getMappers() .size() == 0)
			return removeMappers;

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		List<domain.ApplicationMapper> map = eObject.getMappers();

		List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
				.getParent().getParent().getApplicationMappers().getMappers();

		for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1.hasNext();) {
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

		List<domain.ApplicationMapper> recipeLs = eObject.getParent().getMappers();

		for (Iterator<domain.ApplicationMapper> itr1 = map.iterator(); itr1.hasNext();) {
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

}
