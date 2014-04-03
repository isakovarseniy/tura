/*
 * 
 */
package control.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import control.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;
import domain.EnterpriseInfrastructure;
import domain.InfrastructureComponent;
import domain.InfrastructureConnection;

/**
 * @generated
 */
public class InfrastructureConnectionReorientCommand extends EditElementCommand {

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
	public InfrastructureConnectionReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InfrastructureConnection) {
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
		if (!(oldEnd instanceof InfrastructureComponent && newEnd instanceof InfrastructureComponent)) {
			return false;
		}
		InfrastructureComponent target = getLink().getDetail();
		if (!(getLink().eContainer() instanceof EnterpriseInfrastructure)) {
			return false;
		}
		EnterpriseInfrastructure container = (EnterpriseInfrastructure) getLink()
				.eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInfrastructureConnection_1104010(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InfrastructureComponent && newEnd instanceof InfrastructureComponent)) {
			return false;
		}
		InfrastructureComponent source = getLink().getMaster();
		if (!(getLink().eContainer() instanceof EnterpriseInfrastructure)) {
			return false;
		}
		EnterpriseInfrastructure container = (EnterpriseInfrastructure) getLink()
				.eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistInfrastructureConnection_1104010(container, getLink(),
						source, getNewTarget());
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
	protected InfrastructureConnection getLink() {
		return (InfrastructureConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected InfrastructureComponent getOldSource() {
		return (InfrastructureComponent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InfrastructureComponent getNewSource() {
		return (InfrastructureComponent) newEnd;
	}

	/**
	 * @generated
	 */
	protected InfrastructureComponent getOldTarget() {
		return (InfrastructureComponent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InfrastructureComponent getNewTarget() {
		return (InfrastructureComponent) newEnd;
	}
}
