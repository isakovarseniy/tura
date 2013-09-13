package org.metamodel.tura.ui.properties.sections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
	public Object[] findMappingSpecifiers( domain.ModelMapper eObject ,EObject types ) throws Exception{
		
		   Object[] result = new Object[2];
		
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE
					.getEClassifier("Domain"));

			Collection<domain.MappingSpecifier> map =  eObject.getSpecifiers();

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
			for (Iterator<domain.Specifier> itr1 = map1.iterator(); itr1
					.hasNext();) {
				domain.Specifier ms = itr1.next();
				boolean isAdd = false;
				if (map.size() == 0)
					isAdd = true;
				else {
					isAdd = true;
					for (Iterator<domain.MappingSpecifier> itr2 = map
							.iterator(); itr2.hasNext();) {
						domain.MappingSpecifier sp = itr2.next();
						if (sp.getName().equals(ms.getName()))
							isAdd = false;
					}
				}
				if (isAdd)
					addSpecifiers.add(ms);
			}
		
			result[0]= addSpecifiers;
			result[1]=removeSpecifiers; 
			return result;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object[] findMappingVariable( domain.ModelMapper eObject ,EObject types ) throws Exception{
		
		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
				.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE
				.getEClassifier("Domain"));

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
		for (Iterator<domain.Variable> itr1 = map1.iterator(); itr1
				.hasNext();) {
			domain.Variable ms = itr1.next();
			boolean isAdd = false;
			if (map.size() == 0)
				isAdd = true;
			else {
				isAdd = true;
				for (Iterator<domain.MappingVariable> itr2 = map
						.iterator(); itr2.hasNext();) {
					domain.MappingVariable sp = itr2.next();
					if (sp.getName().equals(ms.getName()))
						isAdd = false;
				}
			}
			if (isAdd)
				addVariables.add(ms);
		}
		
		   Object[] result = new Object[2];
		   result[0]=addVariables;
		   result[1]=removeVariables;
		   return result;
		
	}
	
}
