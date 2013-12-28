package org.tura.metamodel.commons;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import domain.DomainPackage;

public class Util {

	public static boolean mapperRecognizer(Set<domain.Mapper> mappers,
			domain.Ingredient ingredient) {

		for (Iterator<domain.Mapper> itr = mappers.iterator(); itr.hasNext();) {
			domain.Mapper mapper = itr.next();

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();
			
			if ((((ui << 2) + s) & ingr) != 0)
				return true;
		}
		return false;
	}

	public static Object runQuery(domain.Query query, EObject eobj) throws Exception{
		  String strQuery = query.getQueryRef().getQuery();
		  for (Iterator<domain.QueryVariable> itrVar = query.getVariables().iterator(); itrVar.hasNext();) {
		  	  domain.QueryVariable var = itrVar.next();
			  strQuery = strQuery.replaceAll("\\$\\{"+var.getQueryParamRef().getName()+"\\}", var.getValue());
		  }
		  
		  return  executeQuery(strQuery, eobj);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Object executeQuery(String strQuery, EObject eobj) throws Exception{
		
			OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();
			helper.setContext(DomainPackage.eINSTANCE
					.getEClassifier("Domain"));

			OCLExpression<EClassifier> query = helper.createQuery(strQuery);

			Object obj = (Collection<EObject>) ocl.evaluate(eobj, query);

			return obj;
	}
	
	
}
