/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.StyleClass#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.StyleClass#getStylesPackage <em>Styles Package</em>}</li>
 *   <li>{@link domain.StyleClass#getLibrary <em>Library</em>}</li>
 *   <li>{@link domain.StyleClass#getStyleSet <em>Style Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getStyleClass()
 * @model
 * @generated
 */
public interface StyleClass extends EObject
{
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
   * @see domain.DomainPackage#getStyleClass_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.StyleClass#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Styles Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles Package</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles Package</em>' reference.
   * @see #setStylesPackage(StylesPackage)
   * @see domain.DomainPackage#getStyleClass_StylesPackage()
   * @model
   * @generated
   */
  StylesPackage getStylesPackage();

  /**
   * Sets the value of the '{@link domain.StyleClass#getStylesPackage <em>Styles Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Styles Package</em>' reference.
   * @see #getStylesPackage()
   * @generated
   */
  void setStylesPackage(StylesPackage value);

  /**
   * Returns the value of the '<em><b>Library</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Library</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library</em>' reference.
   * @see #setLibrary(StyleLibrary)
   * @see domain.DomainPackage#getStyleClass_Library()
   * @model
   * @generated
   */
  StyleLibrary getLibrary();

  /**
   * Sets the value of the '{@link domain.StyleClass#getLibrary <em>Library</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library</em>' reference.
   * @see #getLibrary()
   * @generated
   */
  void setLibrary(StyleLibrary value);

  /**
   * Returns the value of the '<em><b>Style Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Set</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Set</em>' reference.
   * @see #setStyleSet(StyleSet)
   * @see domain.DomainPackage#getStyleClass_StyleSet()
   * @model
   * @generated
   */
  StyleSet getStyleSet();

  /**
   * Sets the value of the '{@link domain.StyleClass#getStyleSet <em>Style Set</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style Set</em>' reference.
   * @see #getStyleSet()
   * @generated
   */
  void setStyleSet(StyleSet value);

} // StyleClass
