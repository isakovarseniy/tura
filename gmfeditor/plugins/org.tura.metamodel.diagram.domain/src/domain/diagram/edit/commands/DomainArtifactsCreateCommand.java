/*
 * 
 */
package domain.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import domain.Domain;
import domain.DomainArtifacts;
import domain.DomainFactory;

/**
 * @generated
 */
public class DomainArtifactsCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	public DomainArtifactsCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	* FIXME: replace with setElementToEdit()
	* @generated
	*/
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		Domain container = (Domain) getElementToEdit();
		if (container.getDomainArtifacts() != null) {
			return false;
		}
		return true;

	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		DomainArtifacts newElement = DomainFactory.eINSTANCE.createDomainArtifacts();

		Domain owner = (Domain) getElementToEdit();
		owner.setDomainArtifacts(newElement);

		newElement.setUid(java.util.UUID.randomUUID().toString());

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	* @generated
	*/
	protected void doConfigure(DomainArtifacts newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
