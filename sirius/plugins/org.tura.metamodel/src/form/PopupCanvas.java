/**
 */
package form;

import artifact.Categorized;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popup Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.PopupCanvas#isModal <em>Modal</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getPopupCanvas()
 * @model
 * @generated
 */
public interface PopupCanvas extends CanvasFrame, ViewPortHolder, DefaultCavas, MultiLangLabel, Categorized, FlexFields {
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
	 * @see form.FormPackage#getPopupCanvas_Modal()
	 * @model
	 * @generated
	 */
	boolean isModal();

	/**
	 * Sets the value of the '{@link form.PopupCanvas#isModal <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modal</em>' attribute.
	 * @see #isModal()
	 * @generated
	 */
	void setModal(boolean value);

} // PopupCanvas
