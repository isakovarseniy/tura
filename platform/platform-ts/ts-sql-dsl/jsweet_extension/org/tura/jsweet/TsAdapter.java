package org.tura.jsweet;

import javax.lang.model.element.TypeElement;

import org.jsweet.transpiler.ModuleImportDescriptor;
import org.jsweet.transpiler.extension.PrinterAdapter;
import org.jsweet.transpiler.model.CompilationUnitElement;


public class TsAdapter extends PrinterAdapter {

	
	
	
	public TsAdapter(PrinterAdapter parentAdapter) {
		super(parentAdapter);
	}
	
	public ModuleImportDescriptor getModuleImportDescriptor(CompilationUnitElement currentCompilationUnit,
			String importedName, TypeElement importedClass) {
		return null;
	}	
	
	
}
