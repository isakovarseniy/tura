package org.tura.metamodel.commons;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
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

			if ((((ui << 1) + s) & ingr) != 0)
				return true;
		}
		return false;
	}

	public static domain.Mapper mapType(Set<domain.Mapper> mappers,
			domain.Ingredient ingredient, domain.TypeElement typeElement)
			throws Exception {

		for (Iterator<domain.Mapper> itr = mappers.iterator(); itr.hasNext();) {
			domain.Mapper mapper = itr.next();

			int ui = mapper.isUiLayer() ? 1 : 0;
			int s = mapper.isServiceLayer() ? 1 : 0;
			int ingr = ingredient.getLayer().getValue();

			if (((((ui << 2) + s) & ingr) != 0)
					&& (mapper.getTypeRef().getUid() == typeElement.getUid())) {
				return mapper;
			}
		}
		return null;
	}

	public static Object runQuery(domain.Query query, EObject eobj)
			throws Exception {
		String strQuery = query.getQueryRef().getQuery();
		for (Iterator<domain.QueryVariable> itrVar = query.getVariables()
				.iterator(); itrVar.hasNext();) {
			domain.QueryVariable var = itrVar.next();
			strQuery = strQuery.replaceAll("\\$\\{"
					+ var.getQueryParamRef().getName() + "\\}", var.getValue());
		}
		return executeQuery(strQuery, eobj);
	}

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<?> runQuery( domain.ModelMapper mapper, String queryName,EObject eobj) throws Exception{
    	ArrayList result = new ArrayList<>();
    	for (Iterator<domain.Query> itr = mapper.getQueries().iterator();itr.hasNext();){
    		domain.Query query = itr.next();
    		if (query.getQueryRef().getName() .equals(queryName)){
    			 Collection<?> ls = (Collection<?>) runQuery(query, eobj);
    			 result.addAll(ls);
    		}
    	}
    	
    	return result;
    	
    }
	
	public static GroupBy runQueryWithGrouping( domain.ModelMapper mapper, String queryName,EObject eobj) throws Exception{
    	GroupBy result = new GroupBy();
    	for (Iterator<domain.Query> itr = mapper.getQueries().iterator();itr.hasNext();){
    		domain.Query query = itr.next();
    		if (query.getQueryRef().getName() .equals(queryName)){
    			 Collection<?> ls = (Collection<?>) runQuery(query, eobj);
    			 result.add(query.getGroupCode(), ls);
    		}
    	}
    	return result;
    }
   
    
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Object executeQuery(String strQuery, EObject eobj)
			throws Exception {

		OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		helper.setContext(DomainPackage.eINSTANCE.getEClassifier("Domain"));

		OCLExpression<EClassifier> query = helper.createQuery(strQuery);

		Object obj = (Collection<EObject>) ocl.evaluate(eobj, query);

		return obj;
	}

	public static String mergeAndCapitalize(String name) {
		String[] ls = StringUtils.split(name, " ");
		for (int i = 0; i < ls.length; i++) {
			ls[i] = StringUtils.capitalize(ls[i]);
		}
		return StringUtils.join(ls);
	}

	public static void saveFile(String path, String fileName, String in)
			throws IOException {

		File f = new File(path);
		f.mkdirs();
		
		FileOutputStream out = new FileOutputStream(new File(f,fileName));
		out.write(in.getBytes());
		out.close();
	}

	public static EglTemplate  loadTemplate(String templateFile, HashMap<String, Object> parameters, EglTemplateFactory factory ) throws Exception{

		VelocityContext context = new VelocityContext();
        for (Iterator<String> itr = parameters.keySet().iterator();itr.hasNext(); ){
        	String key = itr.next();
            context.put(key, parameters.get(key));
        }
 
        VelocityEngine ve = new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "class");
        ve.setProperty("class.resource.loader.class", "org.tura.metamodel.commons.VelocityResourceLoader"); 
        ve.init();
  
        Template t = ve.getTemplate(templateFile);
        StringWriter writer = new StringWriter();
        t.merge( context, writer );		
        
		 EglTemplate egltemplate = factory.prepare(writer.toString());
	        for (Iterator<String> itr = parameters.keySet().iterator();itr.hasNext(); ){
	        	String key = itr.next();
	        	egltemplate.populate(key, parameters.get(key));
	        }
		return egltemplate;
	}
	
}
