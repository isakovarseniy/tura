package org.tura.metamodel.validatioin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

public class TuraCompositeEValidator implements EValidator {

	public static int runTime = 0;

	protected Collection<EValidator> delegates = new ArrayList<EValidator>();
	protected Collection<EValidator> runtimeDelegates = new ArrayList<EValidator>();

	public Collection<EValidator> getRuntimeDelegates() {
		return runtimeDelegates;
	}

	public Collection<EValidator> getDelegates() {
		return delegates;
	}

	private Collection<EValidator> getAllValidators() {
		if (runTime == 0)
			return delegates;
		
		ArrayList<EValidator> all = new ArrayList<EValidator>();
		all.addAll(delegates);
		all.addAll(runtimeDelegates);
		
		return all;
	}

	public boolean validate(EObject object, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean validate = true;
		for (EValidator validator : getAllValidators()) {
			if (validate || diagnostics != null) {
				validate &= validator.validate(object, diagnostics, context);
			}
		}
		return validate;
	}

	public boolean validate(EClass class1, EObject object,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean validate = true;
		for (EValidator validator : getAllValidators()) {
			if (validate || diagnostics != null) {
				validate &= validator.validate(class1, object, diagnostics,
						context);
			}
		}
		return validate;
	}

	public boolean validate(EDataType dataType, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean validate = true;
		for (EValidator validator : getAllValidators()) {
			if (validate || diagnostics != null) {
				validate &= validator.validate(dataType, value, diagnostics,
						context);
			}
		}
		return validate;
	}
}
