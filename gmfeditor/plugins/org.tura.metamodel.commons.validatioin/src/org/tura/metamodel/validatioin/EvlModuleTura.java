package org.tura.metamodel.validatioin;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.evl.EvlConstraint;
import org.eclipse.epsilon.evl.EvlConstraintContext;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.EvlOperationFactory;
import org.eclipse.epsilon.evl.execute.context.IEvlContext;

public class EvlModuleTura extends EvlModule {

	public Object execute(EObject eobj) throws EolRuntimeException {

		
		// Initialize the context
		prepareContext(context);
		context.setOperationFactory(new EvlOperationFactory());
		context.getFrameStack().put(
				Variable.createReadOnlyVariable("constraintTrace",
						context.getConstraintTrace()));
		context.getFrameStack().put(
				Variable.createReadOnlyVariable("thisModule", this));

		execute(getPre(), context);

		for (EvlConstraintContext constraintContext : getConstraintContexts()) {
			check(constraintContext, context, eobj);
		}

		if (fixer != null) {
			fixer.fix(this);
		}

		execute(getPost(), context);

		return null;
	}

	public void check(EvlConstraintContext constraintContext,
			IEvlContext context, EObject eobj) throws EolRuntimeException {

		if (constraintContext.appliesTo(eobj, context)) {

			Iterator<EvlConstraint> cit = constraints.values().iterator();
			while (cit.hasNext()) {
				EvlConstraint constraint = cit.next();
				if (!constraint.isLazy(context)
						&& constraint.appliesTo(eobj, context)) {
					constraint.check(eobj, context);
				}
			}

		}

	}

}
