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
import domain.Type;
import domain.TypeElement;
import domain.TypeExtension;

/**
 * @generated
 */
public class TypeExtensionReorientCommand extends EditElementCommand {

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
	public TypeExtensionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TypeExtension) {
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
		if (!(getLink().eContainer() instanceof Type)) {
			return false;
		}
		Type container = (Type) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTypeExtension_104001(container, getLink(),
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
		if (!(getLink().eContainer() instanceof Type)) {
			return false;
		}
		Type container = (Type) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTypeExtension_104001(container, getLink(), source,
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
	protected TypeExtension getLink() {
		return (TypeExtension) getElementToEdit();
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
