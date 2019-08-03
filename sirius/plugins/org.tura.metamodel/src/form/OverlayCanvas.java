/**
 */
package form;

import artifact.Categorized;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.OverlayCanvas#isModal <em>Modal</em>}</li>
 *   <li>{@link form.OverlayCanvas#getSourceTarget <em>Source Target</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getOverlayCanvas()
 * @model
 * @generated
 */
public interface OverlayCanvas extends CanvasFrame, ViewPortHolder, DefaultCavas, MultiLangLabel, Categorized, FlexFields, NickNamed {

	/**
	 * Returns the value of the '<em><b>Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modal</em>' attribute.
	 * @see #setModal(boolean)
	 * @see form.FormPackage#getOverlayCanvas_Modal()
	 * @model
	 * @generated
	 */
	boolean isModal();

	/**
	 * Sets the value of the '{@link form.OverlayCanvas#isModal <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modal</em>' attribute.
	 * @see #isModal()
	 * @generated
	 */
	void setModal(boolean value);

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
	 * @see form.FormPackage#getOverlayCanvas_SourceTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getSourceTarget();
} // OverlayCanvas
