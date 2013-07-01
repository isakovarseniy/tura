/*
 * 
 */
package businessobjects.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;
import businessobjects.diagram.part.BusinessobjectsVisualIDRegistry;

/**
 * @generated
 */
public class BusinessobjectsValidationProvider {

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
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
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
				BusinessobjectsDiagramEditorPlugin.getInstance().logError(
						"Validation failed", e); //$NON-NLS-1$
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
					&& BusinessObjectsEditPart.MODEL_ID
							.equals(BusinessobjectsVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

}
