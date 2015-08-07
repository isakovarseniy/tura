/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.StylesPackage#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.StylesPackage#getName <em>Name</em>}</li>
 *   <li>{@link domain.StylesPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.StylesPackage#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getStylesPackage()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,196,176'"
 * @generated
 */
public interface StylesPackage extends EObject {
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
	 * @see domain.DomainPackage#getStylesPackage_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.StylesPackage#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see domain.DomainPackage#getStylesPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.StylesPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.ApplicationStyle#getStylesPackage <em>Styles Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ApplicationStyle)
	 * @see domain.DomainPackage#getStylesPackage_Parent()
	 * @see domain.ApplicationStyle#getStylesPackage
	 * @model opposite="stylesPackage" transient="false"
	 * @generated
	 */
	ApplicationStyle getParent();

	/**
	 * Sets the value of the '{@link domain.StylesPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ApplicationStyle value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.Styles#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference.
	 * @see #setStyles(Styles)
	 * @see domain.DomainPackage#getStylesPackage_Styles()
	 * @see domain.Styles#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	Styles getStyles();

	/**
	 * Sets the value of the '{@link domain.StylesPackage#getStyles <em>Styles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles</em>' reference.
	 * @see #getStyles()
	 * @generated
	 */
	void setStyles(Styles value);

} // StylesPackage
