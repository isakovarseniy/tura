package org.tura.jsweet;

import java.util.HashMap;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

import org.jsweet.transpiler.ModuleImportDescriptor;
import org.jsweet.transpiler.extension.PrinterAdapter;
import org.jsweet.transpiler.model.CompilationUnitElement;
import org.jsweet.transpiler.model.ExtendedElement;
import org.jsweet.transpiler.model.MethodInvocationElement;


public class JUnitAdapter extends PrinterAdapter {

	private final static String IMPORT_CHAI_HEADER = "import_chai";
	private final static String CHAI_HEADER = "import {assert, expect} from \"chai\";";
	private HashMap<String, String> importMapper = new HashMap<>();
	
	
	
	public JUnitAdapter(PrinterAdapter parentAdapter) {
		super(parentAdapter);

		addTypeMapping("org.junit.Assert", "assert");
		addTypeMapping("java.util.List", "java.util.List");
		addTypeMapping("java.util.HashMap", "java.util.HashMap");
		addTypeMapping("java.util.Map", "java.util.Map");
		addTypeMapping("java.util.HashSet", "java.util.HashSet");
		addTypeMapping("java.util.Set", "java.util.Set");
		addTypeMapping("java.util.ArrayList", "java.util.ArrayList");
		addTypeMapping("java.util.LinkedHashMap", "java.util.LinkedHashMap");
		addTypeMapping("java.util.Collection", "java.util.Collection");
		addTypeMapping("java.util.Arrays", "java.util.Arrays");
		addTypeMapping("java.util.Iterator", "java.util.Iterator");		
		
		
		importMapper.put("com.octo.java.sql.query.Query", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.SelectQuery", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.DeleteQuery", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.UpdateQuery", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.BasicQueryOptimizer", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.InsertQuery", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.exp.Operator", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.exp.Nullable", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.query.visitor.OracleQueryBuilder", "sql-dsl/ts-sql-dsl");
		importMapper.put("com.octo.java.sql.exp.Column","sql-dsl/ts-sql-dsl");
		
	}
	
	public ModuleImportDescriptor getModuleImportDescriptor(CompilationUnitElement currentCompilationUnit,
			String importedName, TypeElement importedClass) {
 		   addHeader("jdk", "import \"jdk/bundle\";\n");
		
		ModuleImportDescriptor desc =  super.getModuleImportDescriptor(currentCompilationUnit, importedName, importedClass);
		if (desc != null){
			return desc;
		}
		
		Element parent = importedClass.getEnclosingElement();
		
		String className = importedClass.toString();
		String pathToImportedClass  = importMapper.get(className);
		if (pathToImportedClass != null){
			return new ModuleImportDescriptor((PackageElement) parent, importedName,
					pathToImportedClass);
		}
		return null;
	}	
	
	@Override
	public boolean substituteMethodInvocation(MethodInvocationElement invocation) {
		String targetMethodName = invocation.getMethodName();
		String targetClassName = invocation.getMethod().getEnclosingElement().toString();
		ExtendedElement targetExpression = invocation.getTargetExpression();
		if (targetExpression != null) {
			targetClassName = targetExpression.getTypeAsElement().toString();
		}

		if (targetClassName != null
				&& (targetExpression != null || invocation.getMethod().getModifiers().contains(Modifier.STATIC))) {
			switch (targetClassName) {

			case "org.junit.Assert":
				switch (targetMethodName) {
				case "fail":
					  print("throw new Error(\"fail\");");
					return true;
					
				case "assertNull":
					  addHeader(IMPORT_CHAI_HEADER, CHAI_HEADER);
					  
					  print("assert.isNull (").print(invocation.getArgument(0)).print(")");
					return true;
					
				
				case "assertEquals":
					if ( 
						      (invocation.getArgumentCount() == 2) 
						&& ( invocation.getArgument(0).getTypeAsElement().toString().equals(String.class.getName() ))
						&& ( invocation.getArgument(1).getTypeAsElement().toString().equals(String.class.getName() ))
						) {
						  addHeader(IMPORT_CHAI_HEADER, CHAI_HEADER);
							  
						  print("assert.equal (").print(invocation.getArgument(0)).print(",").
						  print(invocation.getArgument(1)).print(")");
						return true;
					}
					if ( 
						      (invocation.getArgumentCount() == 2) 
						&& ( 
								   ( invocation.getArgument(0).getTypeAsElement().toString().equals(Integer.class.getName() ))
							  ||  ( invocation.getArgument(0).getTypeAsElement().toString().equals(int.class.getName() ))
							  ||  ( invocation.getArgument(0).getTypeAsElement().toString().equals(Long.class.getName() ))
							  ||  ( invocation.getArgument(0).getTypeAsElement().toString().equals(long.class.getName() ))
							  )
						&& ( 
								   ( invocation.getArgument(1).getTypeAsElement().toString().equals(Integer.class.getName() ))
							  ||  ( invocation.getArgument(1).getTypeAsElement().toString().equals(int.class.getName() ))
							  ||  ( invocation.getArgument(1).getTypeAsElement().toString().equals(Long.class.getName() ))
							  ||  ( invocation.getArgument(1).getTypeAsElement().toString().equals(long.class.getName() ))
							  )
						) {
						  addHeader(IMPORT_CHAI_HEADER, CHAI_HEADER);
						  print("expect(").print(invocation.getArgument(0)).print(").to.equals(").
						  print(invocation.getArgument(1)).print(")");
						return true;
					}
					
				}
				break;
			}
		}
		return super.substituteMethodInvocation(invocation);
	}
	
	@Override
	public void afterType(TypeElement type) {
		super.afterType(type);
		
		ExecutableElement before = null;
		ExecutableElement after = null;
		
		for (Element e : type.getEnclosedElements()) {
			if (e instanceof ExecutableElement && hasAnnotationType(e, "org.junit.Before"))   {
				before = (ExecutableElement) e;
			}
			
			if (e instanceof ExecutableElement && hasAnnotationType(e, "org.junit.After"))   {
				after = (ExecutableElement) e;
			}
			
		}		
		
		for (Element e : type.getEnclosedElements()) {
			if (e instanceof ExecutableElement && hasAnnotationType(e, "org.junit.Test"))   {
				ExecutableElement method = (ExecutableElement) e;
				printIndent().print("describe('"+method.getSimpleName().toString() + "', () => {").println();
				printIndent().printIndent().print("let t:"+type.getSimpleName()+" = new "+type.getSimpleName()+"();").println();

				if (before != null){
					printIndent().printIndent().print("t."+before.getSimpleName().toString()+"();").println();
				}
				printIndent().printIndent().print(" t."+method.getSimpleName().toString()+"();").println();

				if (after != null){
					printIndent().printIndent().print("t."+after.getSimpleName().toString()+"();").println();
				}
				printIndent().print("});").println();
			}
		}
		
		
	}
	
}
