/*
 * 
 */
package typedefinition.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import typedefinition.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;
import domain.References;
import domain.TypeDefinition;
import domain.TypeElement;

/**
 * @generated
 */
public class ReferencesReorientCommand extends EditElementCommand {

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
	public ReferencesReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof References) {
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
		if (!(oldEnd instanceof TypeElement && newEnd instanceof TypeElement)) {
			return false;
		}
		TypeElement target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof TypeDefinition)) {
			return false;
		}
		TypeDefinition container = (TypeDefinition) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistReferences_104006(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TypeElement && newEnd instanceof TypeElement)) {
			return false;
		}
		TypeElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof TypeDefinition)) {
			return false;
		}
		TypeDefinition container = (TypeDefinition) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistReferences_104006(container, getLink(), source,
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
	protected References getLink() {
		return (References) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TypeElement getOldSource() {
		return (TypeElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TypeElement getNewSource() {
		return (TypeElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected TypeElement getOldTarget() {
		return (TypeElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TypeElement getNewTarget() {
		return (TypeElement) newEnd;
	}
}