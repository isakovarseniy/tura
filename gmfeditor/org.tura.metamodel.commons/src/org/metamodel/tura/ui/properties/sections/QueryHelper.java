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
				.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
						+ eObject.getDomainArtifact()
						+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
						+ eObject.getArtifactName()
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
				if (sp.getName().equals(ms.getName()))
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
					if (sp.getName().equals(ms.getName()))
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
				.createQuery("domain::DomainArtifact.allInstances()->select(r|r.oclAsType(domain::DomainArtifact).name='"
						+ eObject.getDomainArtifact()
						+ "').oclAsType(domain::DomainArtifact).artifact.artifacts->select(r|r.oclIsKindOf(domain::Artifact) and  r.oclAsType(domain::Artifact).name ='"
						+ eObject.getArtifactName()
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
				if (sp.getName().equals(ms.getName()))
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
					if (sp.getName().equals(ms.getName()))
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

	public Set<String> findAvailableMappersForRecipe(domain.Recipe recipe) {

		HashSet<String> mappers = new HashSet<String>();
		try {

			List<domain.ApplicationMapper> appMapperLst = recipe.getParent()
					.getParent().getParent().getParent()
					.getApplicationMappers().getMappers();

			for (Iterator<domain.ApplicationMapper> itr = appMapperLst
					.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = itr.next();
				mappers.add(mapper.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mappers;
	}

	public Set<String> findAvailableMappersForIngredient(domain.Ingredient ingr) {

		HashSet<String> mappers = new HashSet<String>();
		try {

			List<domain.ApplicationMapper> appMapperLst = ingr.getParent()
					.getParent().getParent().getParent().getParent()
					.getApplicationMappers().getMappers();

			List<String> recipeLs = ingr.getParent().getMappers();

			for (Iterator<domain.ApplicationMapper> itr = appMapperLst
					.iterator(); itr.hasNext();) {
				domain.ApplicationMapper mapper = itr.next();
				if (!recipeLs.contains(mapper.getName()))
					mappers.add(mapper.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mappers;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<String> removeMappersForRecipe(domain.Recipe eObject) {
		ArrayList<String> removeMappers = new ArrayList<String>();

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		List<String> map = eObject.getMappers();

		List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
				.getParent().getParent().getApplicationMappers().getMappers();

		for (Iterator<String> itr1 = map.iterator(); itr1.hasNext();) {
			String ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.ApplicationMapper sp = itr2.next();
				if (sp.getName().equals(ms))
					isRemove = false;
			}
			if (isRemove)
				removeMappers.add(ms);
		}
		return removeMappers;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<String> removeMappersForIngredient(domain.Ingredient eObject) {
		ArrayList<String> removeMappers = new ArrayList<String>();

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		List<String> map = eObject.getMappers();

		List<domain.ApplicationMapper> map1 = eObject.getParent().getParent()
				.getParent().getParent().getParent().getApplicationMappers()
				.getMappers();

		List<String> recipeLs = eObject.getParent().getMappers();

		for (Iterator<String> itr1 = map.iterator(); itr1.hasNext();) {
			String ms = itr1.next();
			boolean isRemove = true;
			for (Iterator<domain.ApplicationMapper> itr2 = map1.iterator(); itr2
					.hasNext();) {
				domain.ApplicationMapper sp = itr2.next();
				if (sp.getName().equals(ms))
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
