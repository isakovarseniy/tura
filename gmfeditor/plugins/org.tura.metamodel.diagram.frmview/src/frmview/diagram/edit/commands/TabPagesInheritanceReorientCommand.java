/*
 * 
 */
package frmview.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import domain.TabCanvas;
import domain.TabPage;
import domain.TabPagesInheritance;
import domain.Views;
import frmview.diagram.edit.policies.DomainBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TabPagesInheritanceReorientCommand extends EditElementCommand {

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
	public TabPagesInheritanceReorientCommand(
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
		if (false == getElementToEdit() instanceof TabPagesInheritance) {
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
		if (!(oldEnd instanceof TabCanvas && newEnd instanceof TabCanvas)) {
			return false;
		}
		TabPage target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Views)) {
			return false;
		}
		Views container = (Views) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTabPagesInheritance_1304002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TabPage && newEnd instanceof TabPage)) {
			return false;
		}
		TabCanvas source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Views)) {
			return false;
		}
		Views container = (Views) getLink().eContainer();
		return DomainBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTabPagesInheritance_1304002(container, getLink(),
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
	protected TabPagesInheritance getLink() {
		return (TabPagesInheritance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TabCanvas getOldSource() {
		return (TabCanvas) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TabCanvas getNewSource() {
		return (TabCanvas) newEnd;
	}

	/**
	 * @generated
	 */
	protected TabPage getOldTarget() {
		return (TabPage) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TabPage getNewTarget() {
		return (TabPage) newEnd;
	}
}
