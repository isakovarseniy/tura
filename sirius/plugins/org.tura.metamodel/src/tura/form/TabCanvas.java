/**
 */
package tura.form;

import tura.common.Categorized;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.TabCanvas#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getTabCanvas()
 * @model
 * @generated
 */
public interface TabCanvas extends CanvasFrame, DefaultCavas, MultiLangLabel, Categorized {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link tura.form.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see tura.form.Orientation
	 * @see #setOrientation(Orientation)
	 * @see tura.form.FormPackage#getTabCanvas_Orientation()
	 * @model
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link tura.form.TabCanvas#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see tura.form.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

} // TabCanvas
