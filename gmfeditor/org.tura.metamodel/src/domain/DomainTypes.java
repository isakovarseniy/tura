/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.DomainTypes#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DomainTypes#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}</li>
 *   <li>{@link domain.DomainTypes#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomainTypes()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface DomainTypes extends EObject
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
	 * @see domain.DomainPackage#getDomainTypes_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.DomainTypes#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getDomainTypes_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.DomainTypes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Typesrepository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.TypesRepository#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typesrepository</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Typesrepository</em>' reference.
	 * @see #setTypesrepository(TypesRepository)
	 * @see domain.DomainPackage#getDomainTypes_Typesrepository()
	 * @see domain.TypesRepository#getParent
	 * @model opposite="parent"
	 * @generated
	 */
  TypesRepository getTypesrepository();

  /**
	 * Sets the value of the '{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typesrepository</em>' reference.
	 * @see #getTypesrepository()
	 * @generated
	 */
  void setTypesrepository(TypesRepository value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Domain#getDomainTypes <em>Domain Types</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Domain)
	 * @see domain.DomainPackage#getDomainTypes_Parent()
	 * @see domain.Domain#getDomainTypes
	 * @model opposite="domainTypes" transient="false"
	 * @generated
	 */
  Domain getParent();

  /**
	 * Sets the value of the '{@link domain.DomainTypes#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(Domain value);

} // DomainTypes
