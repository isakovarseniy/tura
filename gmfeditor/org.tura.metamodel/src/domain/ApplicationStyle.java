/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ApplicationStyle#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationStyle#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationStyle#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationStyle#getStylesPackage <em>Styles Package</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getApplicationStyle()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationStyle extends HTMLLayerHolder
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
	 * @see domain.DomainPackage#getApplicationStyle_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.ApplicationStyle#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getApplicationStyle_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.ApplicationStyle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Application#getApplicationStyle <em>Application Style</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Application)
	 * @see domain.DomainPackage#getApplicationStyle_Parent()
	 * @see domain.Application#getApplicationStyle
	 * @model opposite="applicationStyle" transient="false"
	 * @generated
	 */
  Application getParent();

  /**
	 * Sets the value of the '{@link domain.ApplicationStyle#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(Application value);

  /**
	 * Returns the value of the '<em><b>Styles Package</b></em>' containment reference list.
	 * The list contents are of type {@link domain.StylesPackage}.
	 * It is bidirectional and its opposite is '{@link domain.StylesPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles Package</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles Package</em>' containment reference list.
	 * @see domain.DomainPackage#getApplicationStyle_StylesPackage()
	 * @see domain.StylesPackage#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
  EList<StylesPackage> getStylesPackage();

} // ApplicationStyle
