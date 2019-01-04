/**
 */
package form;

import artifact.Categorized;

import common.HTMLLayerHolder;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.BlockUI#getSourceTarget <em>Source Target</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getBlockUI()
 * @model
 * @generated
 */
public interface BlockUI extends Uielement, ChildrenHolder, HTMLLayerHolder {
	/**
	 * Returns the value of the '<em><b>Source Target</b></em>' containment reference list.
	 * The list contents are of type {@link form.AreaRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Target</em>' containment reference list.
	 * @see form.FormPackage#getBlockUI_SourceTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getSourceTarget();

} // BlockUI
