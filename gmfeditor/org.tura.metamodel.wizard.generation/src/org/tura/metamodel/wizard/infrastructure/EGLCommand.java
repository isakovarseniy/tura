package org.tura.metamodel.wizard.infrastructure;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public class EGLCommand implements Command {

	private EglTemplateFactory factory;
	private EglTemplate template = null;

	public EGLCommand(EglTemplateFactory factory, EglTemplate template) {
		this.factory = factory;
		this.template = template;

	}

	protected ChangeDescription changeDescription;

	public void redo() {
		if (changeDescription != null) {
			changeDescription.applyAndReverse();
		}
	}

	public boolean canExecute() {
		return true;
	}

	public boolean canUndo() {
		return true;
	}

	public Command chain(Command command) {
		return null;
	}

	public void undo() {
		if (changeDescription != null) {
			changeDescription.applyAndReverse();
		}
	}

	@Override
	public void execute() {

		InMemoryEmfModel model = (InMemoryEmfModel) factory.getContext()
				.getModelRepository().getModels().get(0);
		@SuppressWarnings("deprecation")
		ChangeRecorder recorder = new ChangeRecorder(model.getModelImpl()
				.getResourceSet());

		try {
			factory.getContext().getModelRepository().getTransactionSupport()
					.startTransaction();
			template.process();
			factory.getContext().getModelRepository().getTransactionSupport()
					.commitTransaction();
		} catch (EolRuntimeException e) {
			factory.getContext().getModelRepository().getTransactionSupport()
					.rollbackTransaction();
			e.printStackTrace();
		} finally {
			changeDescription = recorder.endRecording();
			// refresher.refresh();
		}
	}

	@Override
	public Collection<?> getResult() {
		return null;
	}

	@Override
	public Collection<?> getAffectedObjects() {
		return Collections.EMPTY_LIST;
	}

	@Override
	public String getLabel() {
		return "Artifact generation";
	}

	@Override
	public String getDescription() {
		return getLabel();
	}

	@Override
	public void dispose() {
		changeDescription = null;
	}

}
