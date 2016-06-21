/**
 */
package style;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link style.Styles#getUid <em>Uid</em>}</li>
 *   <li>{@link style.Styles#getLibraries <em>Libraries</em>}</li>
 * </ul>
 *
 * @see style.StylePackage#getStyles()
 * @model
 * @generated
 */
public interface Styles extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see style.StylePackage#getStyles_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link style.Styles#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link style.StyleLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see style.StylePackage#getStyles_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleLibrary> getLibraries();

} // Styles
