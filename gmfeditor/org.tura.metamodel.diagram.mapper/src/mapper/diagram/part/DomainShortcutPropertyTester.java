/*
* 
*/
package mapper.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;

import mapper.diagram.edit.parts.MappersEditPart;

/**
 * @generated
 */
public class DomainShortcutPropertyTester extends PropertyTester {

	/**
	* @generated
	*/
	protected static final String SHORTCUT_PROPERTY = "isShortcut"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof View) {
			return false;
		}
		View view = (View) receiver;
		if (SHORTCUT_PROPERTY.equals(method)) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return MappersEditPart.MODEL_ID.equals(annotation.getDetails().get("modelID")); //$NON-NLS-1$
			}
		}
		return false;
	}

}
