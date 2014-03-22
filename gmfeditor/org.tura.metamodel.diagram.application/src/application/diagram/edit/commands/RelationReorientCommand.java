/*
 * 
 */
package application.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import application.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;
import domain.Controls;
import domain.DataControl;
import domain.Relation;

/**
 * @generated
 */
public class RelationReorientCommand extends EditElementCommand {

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
	public RelationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Relation) {
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
		if (!(oldEnd instanceof DataControl && newEnd instanceof DataControl)) {
			return false;
		}
		DataControl target = getLink().getDetail();
		if (!(getLink().eContainer() instanceof Controls)) {
			return false;
		}
		Controls container = (Controls) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelation_804011(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataControl && newEnd instanceof DataControl)) {
			return false;
		}
		DataControl source = getLink().getMaster();
		if (!(getLink().eContainer() instanceof Controls)) {
			return false;
		}
		Controls container = (Controls) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelation_804011(container, getLink(), source,
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
		getLink().setMaster(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDetail(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Relation getLink() {
		return (Relation) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DataControl getOldSource() {
		return (DataControl) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DataControl getNewSource() {
		return (DataControl) newEnd;
	}

	/**
	 * @generated
	 */
	protected DataControl getOldTarget() {
		return (DataControl) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DataControl getNewTarget() {
		return (DataControl) newEnd;
	}
}
