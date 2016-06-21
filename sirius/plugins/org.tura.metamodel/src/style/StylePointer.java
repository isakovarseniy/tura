/**
 */
package style;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link style.StylePointer#getStyleLibrary <em>Style Library</em>}</li>
 * </ul>
 *
 * @see style.StylePackage#getStylePointer()
 * @model
 * @generated
 */
public interface StylePointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Style Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Library</em>' reference.
	 * @see #setStyleLibrary(StyleLibrary)
	 * @see style.StylePackage#getStylePointer_StyleLibrary()
	 * @model
	 * @generated
	 */
	StyleLibrary getStyleLibrary();

	/**
	 * Sets the value of the '{@link style.StylePointer#getStyleLibrary <em>Style Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Library</em>' reference.
	 * @see #getStyleLibrary()
	 * @generated
	 */
	void setStyleLibrary(StyleLibrary value);

} // StylePointer
