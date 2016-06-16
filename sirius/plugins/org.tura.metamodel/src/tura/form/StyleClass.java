/**
 */
package tura.form;

import tura.common.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.StyleClass#getClassifier <em>Classifier</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getStyleClass()
 * @model
 * @generated
 */
public interface StyleClass extends ContextValue {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference.
	 * @see #setClassifier(Classifier)
	 * @see tura.form.FormPackage#getStyleClass_Classifier()
	 * @model containment="true"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link tura.form.StyleClass#getClassifier <em>Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' containment reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

} // StyleClass
