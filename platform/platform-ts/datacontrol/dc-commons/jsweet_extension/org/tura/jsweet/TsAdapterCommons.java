package org.tura.jsweet;

import javax.lang.model.element.TypeElement;

import org.jsweet.transpiler.ModuleImportDescriptor;
import org.jsweet.transpiler.extension.PrinterAdapter;
import org.jsweet.transpiler.model.CompilationUnitElement;

public class TsAdapterCommons extends PrinterAdapter {

	public TsAdapterCommons(PrinterAdapter parentAdapter) {
		super(parentAdapter);
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
		addTypeMapping("java.util.AbstractList", "java.util.AbstractList");
		
		
	}

	public ModuleImportDescriptor getModuleImportDescriptor(CompilationUnitElement currentCompilationUnit,
			String importedName, TypeElement importedClass) {
			
		if ( currentCompilationUnit.getSourceFilePath().contains("ConditionConverter")){
			addHeader("Query", "import  {Query} from \"sql-dsl/ts-sql-dsl\";\n");
			addHeader("SelectQuery","import {SelectQuery} from \"sql-dsl/ts-sql-dsl\";\n");
			addHeader("Operator","import {Operator} from \"sql-dsl/ts-sql-dsl\";\n");
			
		}
		
		return null;
	}

}
