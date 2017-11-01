package org.tura.jsweet;

import javax.lang.model.element.TypeElement;

import org.jsweet.transpiler.ModuleImportDescriptor;
import org.jsweet.transpiler.extension.PrinterAdapter;
import org.jsweet.transpiler.model.CompilationUnitElement;

public class TsAdapterCore extends PrinterAdapter {

	public TsAdapterCore(PrinterAdapter parentAdapter) {
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
			
		if ( currentCompilationUnit.getSourceFilePath().contains("DomainObject")){
	 		   addHeader("jdk", "import \"jdk/bundle\";\n");
	 		   addHeader("SearchCriteria","import {SearchCriteria} from \"dc-commons/commons\";\n");
	 		   addHeader("OrderCriteria" , "import {OrderCriteria} from \"dc-commons/commons\";\n");
		}
		
		return null;
	}

}
