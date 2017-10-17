package org.tura.jsweet;

import java.lang.reflect.Modifier;

import javax.lang.model.element.TypeElement;
import javax.lang.model.type.ArrayType;

import org.jsweet.transpiler.ModuleImportDescriptor;
import org.jsweet.transpiler.extension.PrinterAdapter;
import org.jsweet.transpiler.model.CompilationUnitElement;
import org.jsweet.transpiler.model.ExtendedElement;
import org.jsweet.transpiler.model.MethodInvocationElement;

public class TsAdapter extends PrinterAdapter {

	public TsAdapter(PrinterAdapter parentAdapter) {
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
		
	}

	public ModuleImportDescriptor getModuleImportDescriptor(CompilationUnitElement currentCompilationUnit,
			String importedName, TypeElement importedClass) {
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

			case "java.util.Arrays":
				switch (targetMethodName) {
				case "asList":
					print("java.util.Arrays.asList(");
					if (invocation.getMethod().isVarArgs()){
						print("..."+invocation.getArguments().get(0));
					}else{
						printArgList(invocation.getArguments());
					}
					print(")");
					return true;
				}
				break;
			}
		}
		return super.substituteMethodInvocation(invocation);
	}

}
