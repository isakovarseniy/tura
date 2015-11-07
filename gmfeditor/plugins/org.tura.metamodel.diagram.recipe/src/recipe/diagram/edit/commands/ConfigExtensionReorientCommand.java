/*
 * 
 */
package recipe.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import recipe.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;
import domain.ConfigExtension;
import domain.Configuration;
import domain.Recipes;

/**
 * @generated
 */
public class ConfigExtensionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConfigExtensionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ConfigExtension) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Configuration && newEnd instanceof Configuration)) {
			return false;
		}
		Configuration target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Recipes)) {
			return false;
		}
		Recipes container = (Recipes) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConfigExtension_304014(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Configuration && newEnd instanceof Configuration)) {
			return false;
		}
		Configuration source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Recipes)) {
			return false;
		}
		Recipes container = (Recipes) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConfigExtension_304014(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ConfigExtension getLink() {
		return (ConfigExtension) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Configuration getOldSource() {
		return (Configuration) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Configuration getNewSource() {
		return (Configuration) newEnd;
	}

	/**
	 * @generated
	 */
	protected Configuration getOldTarget() {
		return (Configuration) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Configuration getNewTarget() {
		return (Configuration) newEnd;
	}
}
