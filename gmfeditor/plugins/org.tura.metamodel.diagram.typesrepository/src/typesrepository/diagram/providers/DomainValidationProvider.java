/*
 * 
 */
package typesrepository.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.part.DomainDiagramEditorPlugin;
import typesrepository.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				DomainDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& TypesRepositoryEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

}
