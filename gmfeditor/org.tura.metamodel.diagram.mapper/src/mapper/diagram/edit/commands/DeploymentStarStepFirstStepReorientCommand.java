/*
 * 
 */
package mapper.diagram.edit.commands;

import mapper.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import domain.DeploymentComponent;
import domain.DeploymentStarStep;

/**
 * @generated
 */
public class DeploymentStarStepFirstStepReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public DeploymentStarStepFirstStepReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof DeploymentStarStep) {
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
		if (!(oldEnd instanceof DeploymentComponent && newEnd instanceof DeploymentStarStep)) {
			return false;
		}
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDeploymentStarStepFirstStep_404009(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DeploymentComponent && newEnd instanceof DeploymentComponent)) {
			return false;
		}
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDeploymentStarStepFirstStep_404009(getOldSource(),
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
		getOldSource().setFirstStep(null);
		getNewSource().setFirstStep(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setFirstStep(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected DeploymentStarStep getOldSource() {
		return (DeploymentStarStep) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected DeploymentStarStep getNewSource() {
		return (DeploymentStarStep) newEnd;
	}

	/**
	 * @generated
	 */
	protected DeploymentComponent getOldTarget() {
		return (DeploymentComponent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DeploymentComponent getNewTarget() {
		return (DeploymentComponent) newEnd;
	}
}
